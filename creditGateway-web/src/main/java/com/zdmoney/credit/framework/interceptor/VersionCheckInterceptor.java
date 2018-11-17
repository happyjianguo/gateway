package com.zdmoney.credit.framework.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zdmoney.credit.common.constant.system.LogLevel;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.config.SystemProperties;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.vo.request.HeaderVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;
import com.zdmoney.credit.framework.wrap.PreAdviceWrap;
import com.zdmoney.credit.system.service.pub.ISysParamDefineService;

/**
 * App版本号控制
 * 
 * @author Ivan
 *
 */
public class VersionCheckInterceptor implements HandlerInterceptor {

	protected static Log logger = LogFactory.getLog(VersionCheckInterceptor.class);

	@Autowired
	SystemProperties systemProperties;

	@Autowired
	ISysParamDefineService sysParamDefineServiceImpl;

	public VersionCheckInterceptor() {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
		ResponseInfo responseInfo = null;
		try {
			/** 校验App版本号 **/
			appVersionCheck();
			return true;
		} catch (PlatformException ex) {
			ex.printStackTraceExt(logger);
			responseInfo = ex.toResponseInfo();
		} catch (Exception ex) {
			logger.error(ex, ex);
			responseInfo = new ResponseInfo(ResponseEnum.APP_VERSION_FAIL, "系统忙！详细信息见后台日志！");
		}
		preAdviceWrap.getResponseWrap().write(responseInfo);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	/**
	 * 校验App版本号
	 * 
	 * @return
	 */
	private boolean appVersionCheck() {
		String isCheckVersion = systemProperties.getIsCheckVersion();
		if ("true".equals(isCheckVersion)) {
			RequestVo requestVo = RequestContext.getPreAdviceWrap().getRequestVo();
			HeaderVo headerVo = requestVo.getHeaderVo();
			String userAgent = headerVo.getUserAgent();
			String version = headerVo.getVersion();
			if (Strings.isEmpty(userAgent) || Strings.isEmpty(version)) {
				throw new PlatformException(ResponseEnum.APP_VERSION_FAIL, "缺少版本相关参数！").applyLogLevel(LogLevel.WARN);
			}

			String vers[] = version.split("\\.");
			if (vers.length < 3) {
				throw new PlatformException(ResponseEnum.APP_VERSION_FAIL, "App版本参数不正确！").applyLogLevel(LogLevel.WARN);
			}
			/** 终端设备 **/
			String deviceType = "";
			if (userAgent.toUpperCase().indexOf("IOS") >= 0) {
				deviceType = "ios";
			} else if (userAgent.toUpperCase().indexOf("ANDROID") >= 0) {
				deviceType = "android";
			} else if (userAgent.toUpperCase().indexOf("WAP") >= 0) {
				deviceType = "wap";
				return true;
			} else {
				throw new PlatformException(ResponseEnum.APP_VERSION_FAIL, "未知手机平台，请检查userAgent参数！")
						.applyLogLevel(LogLevel.WARN);
			}

			logger.info("*************************版本验证*************************");
			logger.info("服务端苹果版本号：" + sysParamDefineServiceImpl.getSysParamValueCache("appVersion", "ios"));
			logger.info("服务端安卓版本号：" + sysParamDefineServiceImpl.getSysParamValueCache("appVersion", "android"));
			logger.info("APP端平台：" + deviceType);
			logger.info("APP端版本号：" + version);
			/** App端版本号和服务端版本号比较 **/
			String serviceAppVersion = sysParamDefineServiceImpl.getSysParamValueCache("appVersion", deviceType);
			if (Strings.isEmpty(serviceAppVersion)) {
				throw new PlatformException(ResponseEnum.APP_VERSION_FAIL, "服务端版本号获取失败");
			}
			if (Long.parseLong(version.replaceAll("\\.", "")) < Long.parseLong(serviceAppVersion.replaceAll("\\.", ""))) {
				/** 服务端版本高于App端 提示升级 **/
				throw new PlatformException(ResponseEnum.APP_VERSION_LOW, "").applyLogLevel(LogLevel.WARN);
			} else {
				/** 无需升级 **/
				return true;
			}
		} else {
			/** 不校验签名 **/
			logger.warn("系统关闭检查APP版本号开关");
			return true;
		}
	}
}
