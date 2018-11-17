package com.zdmoney.credit.framework.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.json.JSONUtil;
import com.zdmoney.credit.common.util.AesUtil;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.funcid.FuncIdInstance;
import com.zdmoney.credit.framework.funcid.FuncIdMethod;
import com.zdmoney.credit.framework.funcid.FuncIdUtil;
import com.zdmoney.credit.framework.vo.common.BaseParamVo;
import com.zdmoney.credit.framework.vo.request.BsbRequestVo;
import com.zdmoney.credit.framework.vo.request.ParamVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;

/**
 * 校验功能号是否存在或不可用
 * @author Ivan
 *
 */
public class FuncIdCheckInterceptor implements HandlerInterceptor {

    protected static Log logger = LogFactory.getLog(FuncIdCheckInterceptor.class);
    
    @Autowired
    private BsbProperties bsbProperties;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        ResponseInfo<?> responseInfo = null;
        try {
        	/** 功能号 **/
        	String funcId = "";
        	/** 获取功能号业务参数 **/
        	String reqParams = "";
        	ProjectEnum project = RequestContext.getPreAdviceWrap().getProjectEnum();
        	switch(project){
	        	case ABS:
	        	case APS:
	        	case XDCORE:
                case FDD:
                case XDSIGNATURE:
	        	case PIC:	        		RequestVo requestVo = RequestContext.getPreAdviceWrap().getRequestVo();
	                ParamVo paramVo = requestVo.getParamVo();
	                funcId = paramVo.getFuncId();
	                reqParams = paramVo.getReqParam();
	                JSONUtil.checkJSONObject(reqParams);
	                break;
	        	case BSB:
	        		BsbRequestVo bsbRequestVo = RequestContext.getPreAdviceWrap().getBsbRequestVo();
	        		funcId = bsbRequestVo.getComm().getTxncd();
	        		reqParams = AesUtil.decryptAES(bsbRequestVo.getData(), bsbProperties.getAesKey());
	        		break;
	        	default :
            		throw new PlatformException("根据请求报文没有解析到属于哪个系统");
        	}
        	/** 判断功能号是否存在  **/
            FuncIdMethod funcIdMethod = FuncIdUtil.checkFuncIdExists(funcId);
            /** 校验业务Vo数据格式 **/
            BaseParamVo baseParamVo = FuncIdUtil.checkFuncIdParams(funcId, reqParams);
            /** 将功能号对应的方法实例和业务参数实例放到本地线程中 **/
            FuncIdInstance funcIdInstance = new FuncIdInstance();
            funcIdInstance.setFuncIdMethod(funcIdMethod);
            funcIdInstance.setBaseParamVo(baseParamVo);
            RequestContext.getPreAdviceWrap().setFuncIdInstance(funcIdInstance);
            return true;
        } catch (PlatformException ex) {
            ex.printStackTraceExt(logger);
            responseInfo = ex.toResponseInfo();
        } catch (Exception ex) {
            logger.error(ex, ex);
            responseInfo = new ResponseInfo(ResponseEnum.SYS_FAILD, "系统忙");
        }
        RequestContext.getPreAdviceWrap().getResponseWrap().write(responseInfo);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
