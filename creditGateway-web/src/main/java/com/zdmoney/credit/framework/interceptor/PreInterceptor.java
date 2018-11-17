package com.zdmoney.credit.framework.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.ForbiddenException;
import com.zdmoney.credit.common.exception.HttpStatusException;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.util.UrlUtil;
import com.zdmoney.credit.common.validator.ValidatorUtil;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.request.RequestWrap;
import com.zdmoney.credit.framework.response.ResponseWrap;
import com.zdmoney.credit.framework.vo.request.BsbRequestVo;
import com.zdmoney.credit.framework.vo.request.HeaderVo;
import com.zdmoney.credit.framework.vo.request.ParamVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;
import com.zdmoney.credit.framework.wrap.DestroyWrap;
import com.zdmoney.credit.framework.wrap.ValidatorWrap;
import com.zdmoney.credit.framework.util.SystemUtil;

/**
 * 收集相关请求参数，做基础校验拦截
 * @author Ivan
 *
 */
public class PreInterceptor implements HandlerInterceptor {

    protected static Log logger = LogFactory.getLog(PreInterceptor.class);

    /** 功能号 Request的Key标识 **/
    private static final String P_FUNC_ID_NAME = "funcId";
    /** 业务参数 Request的Key标识 **/
    private static final String P_PARAMS_NAME = "params";
    /** 双方约定Key Request的Key标识 **/
    private static final String P_KEY_NAME = "key";
    /** 签名信息 Request的Key标识 **/
    private static final String P_SIGN_NAME = "sign";
    
    /** 系统编号 Request的Key标识 **/
    private static final String P_PROJECT_NO_PART = "projectNo";
    /** 请求号 Request的Key标识 **/
    private static final String P_REQUEST_ID_NAME = "requestId";

    /** 会话令牌 RequestHeader的Key标识 **/
    private static final String H_SESSIONTOKEN_NAME = "sessionToken";
    /** 手机端应用版本号 RequestHeader的Key标识 **/
    private static final String H_VERSION_NAME = "version";
    /** IOS提交 RequestHeader的Key标识 **/
    private static final String H_TOKEN_NAME = "token";
    /** 系统的名称 RequestHeader的Key标识 **/
    private static final String H_USERAGENT_NAME = "userAgent";
    /** 机构 RequestHeader的Key标识 **/
    private static final String H_MECHANISM_NAME = "mechanism";
    /** 平台 RequestHeader的Key标识 **/
    private static final String H_PLATFORM_NAME = "platform";
    /** 合作类型 RequestHeader的Key标识 **/
    private static final String H_TOGATHERTYPE_NAME = "togatherType";
    /** 渠道 RequestHeader的Key标识 **/
    private static final String H_OPENCHANNEL_NAME = "openchannel";

    /** 请求头部参数Key **/
    private static final String H_REQHEAD_PART = "reqHeadParam";
    /** 请求业务参数Key **/
    private static final String H_REQPARAM_PART = "reqParam";

    @Autowired
    DestroyWrap destroyWrap;
    
    @Autowired
    ValidatorWrap validatorWrap;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /** 头部信息 **/
        ResponseInfo<?> responseInfo = null;
        try {
            /** 将请求所有信息丢到本地线程中 **/
            RequestContext.getPreAdviceWrap().setRequestWrap(new RequestWrap(request));
            RequestContext.getPreAdviceWrap().setResponseWrap(new ResponseWrap(response));
            
            /** 参数信息 **/
            ProjectEnum project = SystemUtil.getProjectEnum(request);
            switch(project){
            	case ABS:
            	case APS:
            	case XDCORE:
                case FDD:
                case XDSIGNATURE:
            	case PIC:            		ParamVo paramVo = this.buildParamVoNew(request);
                    RequestContext.getPreAdviceWrap().getSecretKeyVo().setEncryptKey(paramVo.getKey());
                    RequestContext.getPreAdviceWrap().getSecretKeyVo().setSign(paramVo.getSign());
                    RequestVo requestVo = RequestContext.getPreAdviceWrap().getRequestVo();
                    /** 校验请求参数格式 **/
                    ValidatorUtil.valid(requestVo);
                    /** 系统编号存在性校验  **/
                    ValidatorUtil.validateProjectNo(requestVo.getProjectNo());
                    /** 校验参数格式 **/
                    ValidatorUtil.valid(paramVo);
                    /** 白名单校验  **/
                    validatorWrap.validateRequestIp(requestVo);
                    break;
            	case BSB:
            		String requestContent = RequestContext.getPreAdviceWrap().getRequestContent();
            		BsbRequestVo bsbRequestVo = JSON.parse(requestContent, BsbRequestVo.class);
            		bsbRequestVo.setRequestIp(UrlUtil.getIpAddress(request));
            		/** 校验参数格式 **/
                    ValidatorUtil.valid(bsbRequestVo);
                    //放入当前线程
            		RequestContext.getPreAdviceWrap().setBsbRequestVo(bsbRequestVo);
            		/** 白名单校验  **/
                    validatorWrap.validateRequestIp(bsbRequestVo);
            		break;
            	default :
            		throw new PlatformException("根据请求报文没有解析到属于哪个系统");
            }
            return true;
        } catch (PlatformException ex) {
            ex.printStackTraceExt(logger);
            responseInfo = ex.toResponseInfo();
        } catch(ForbiddenException e){
        	RequestContext.getPreAdviceWrap().getResponseWrap().write(responseInfo);
        	logger.error(e.getMessage(), e);
            throw new ForbiddenException("包银ip地址未配置，无权限访问网关系统");
        } catch (Exception ex) {
            logger.error(ex, ex);
            responseInfo = new ResponseInfo(ResponseEnum.SYS_FAILD);
        }
        RequestContext.getPreAdviceWrap().getResponseWrap().write(responseInfo);
        try {

        } finally {
            /** 释放资源、记录相关日志操作 **/
            destroyWrap.destroy();
        }
        return false;
    }

	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        try {

        } finally {
            /** 释放资源、记录相关日志操作 **/
            destroyWrap.destroy();
        }
    }
    
    /**
     * 收集请求参数信息
     * @param request
     * @return
     */
    private ParamVo buildParamVoNew(HttpServletRequest request) {
        ParamVo paramVo = new ParamVo();
        HeaderVo headerVo = new HeaderVo();
        RequestVo requestVo = RequestContext.getPreAdviceWrap().getRequestVo();
        /** 功能号 **/
        String funcId = "";
        /** 双方约定Key **/
        String key = "";
        /** 签名信息 **/
        String sign = "";
        /** 调用方的IP地址 **/
        String requestIp = "";
        /** 调用方系统编号 **/
        String projectNo = "";
        /** 调用方请求Id **/
        String requestId = "";
        /** 获取请求字符串参数 **/
        String requestContent = RequestContext.getPreAdviceWrap().getRequestContent();
        if (Strings.isEmpty(requestContent)) {
            return paramVo;
        }
        try {
            /** 获取调用方的IP地址 **/
            requestIp = UrlUtil.getIpAddress(request);
            /** 请求参数json对象 **/
            //JSONObject jsonObj = JSONObject.parseObject(requestParams);
            JSONObject jsonObj = JSONObject.parseObject(requestContent, Feature.OrderedField/*,Feature.SupportArrayToBean*/);
            /** 功能号 **/
            funcId = UrlUtil.paramDecoder(Strings.convertValue(jsonObj.getString(P_FUNC_ID_NAME), String.class));
            /** 业务参数 **/
            JSONObject params = jsonObj.getJSONObject(P_PARAMS_NAME);
            /** 双方约定Key **/
            key = UrlUtil.paramDecoder(Strings.convertValue(jsonObj.getString(P_KEY_NAME), String.class));
            /** 签名信息 **/
            sign = UrlUtil.paramDecoder(Strings.convertValue(jsonObj.getString(P_SIGN_NAME), String.class));
            /** 获取调用方系统编号 **/
            if (params.containsKey(P_PROJECT_NO_PART)) {
                projectNo = Strings.convertValue(params.getString(P_PROJECT_NO_PART), String.class);
            }
            /** 获取调用系统请求Id **/
            if (params.containsKey(P_REQUEST_ID_NAME)) {
                requestId = Strings.convertValue(params.getString(P_REQUEST_ID_NAME), String.class);
            }
            if (params.containsKey(H_REQHEAD_PART)) {
                /** 获取头部信息 **/
                JSONObject headerJson = params.getJSONObject(H_REQHEAD_PART);
                String sessionToken = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_SESSIONTOKEN_NAME), String.class));
                String version = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_VERSION_NAME),String.class));
                String token = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_TOKEN_NAME),String.class));
                String userAgent = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_USERAGENT_NAME), String.class));
                String mechanism = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_MECHANISM_NAME), String.class));
                String platform = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_PLATFORM_NAME),String.class));
                String togatherType = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_TOGATHERTYPE_NAME), String.class));
                String openchannel = UrlUtil.paramDecoder(Strings.convertValue(headerJson.getString(H_OPENCHANNEL_NAME), String.class));
                headerVo.setSessionToken(sessionToken);
                headerVo.setVersion(version);
                headerVo.setToken(token);
                headerVo.setUserAgent(userAgent);
                headerVo.setMechanism(mechanism);
                headerVo.setPlatform(platform);
                headerVo.setTogatherType(togatherType);
                headerVo.setOpenchannel(openchannel);
            }
            if (params.containsKey(H_REQPARAM_PART)) {
                /** 获取业务参数信息 **/
                JSONObject reqParamJson = params.getJSONObject(H_REQPARAM_PART);
                paramVo.setReqParam(reqParamJson.toJSONString());
            }
            paramVo.setParams(params.toJSONString());
        } catch (Exception e) {
            logger.error(e, e);
        }finally{
            requestVo.setProjectNo(projectNo);
            requestVo.setRequestId(requestId);
            requestVo.setRequestIp(requestIp);
            paramVo.setFuncId(funcId);
            paramVo.setKey(key);
            paramVo.setSign(sign);
            requestVo.setHeaderVo(headerVo);
            requestVo.setParamVo(paramVo);
        }
        return paramVo;
    }
    
}
