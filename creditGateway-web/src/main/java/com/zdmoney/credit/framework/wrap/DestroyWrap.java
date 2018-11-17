package com.zdmoney.credit.framework.wrap;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.util.AesUtil;
import com.zdmoney.credit.common.validator.ValidatorUtil;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.vo.common.SecretKeyVo;
import com.zdmoney.credit.framework.vo.request.BsbRequestVo;
import com.zdmoney.credit.framework.vo.request.ParamVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;
import com.zdmoney.credit.system.domain.AccessLog;
import com.zdmoney.credit.system.service.pub.IAccessLogService;

/**
 * 最后释放资源、记录相关日志操作
 * @author user
 */
@Component
public class DestroyWrap {

    protected static Log logger = LogFactory.getLog(DestroyWrap.class);

    @Autowired
    private IAccessLogService accessLogService;
    
    @Autowired
    private BsbProperties bsbProperties;

    public void destroy() {
        /** 保存日志 **/
        saveAccessLog();
        /** 清空请求信息上下文 **/
        RequestContext.clear();
    }

    /**
     * 保存相关日志信息
     */
    public void saveAccessLog() {
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
        /** 接口出参 **/
        ResponseInfo<?> responseInfo = preAdviceWrap.getResponseWrap().getResponseInfo();
        /** 接口请求时间 **/
        long requestTime = preAdviceWrap.getRequestWrap().getRequestTime();
        /** 接口响应时间 **/
        long responseTime = preAdviceWrap.getResponseWrap().getResponseTime();
        /** 功能号 **/
        String funcId = "";
        /** 接口入参 **/
        String params = "";
        /** 签名 **/
        String sign = "";
        /** 业务参数解密Key*/
        String key = "";
        AccessLog accessLog = new AccessLog();
        try {
            ProjectEnum project = RequestContext.getPreAdviceWrap().getProjectEnum();
        	switch(project){
        		case ABS:
        		case APS:
        		case XDCORE:
                case FDD:
                case XDSIGNATURE:
        		case PIC:        			RequestVo requestVo = preAdviceWrap.getRequestVo();
        	        ParamVo paramVo = requestVo.getParamVo();
        	        SecretKeyVo secretKeyVo = preAdviceWrap.getSecretKeyVo();
        			if (paramVo != null && secretKeyVo!=null) {
                        /** 接口入参 **/
                        funcId = paramVo.getFuncId();
                        params = paramVo.getParams();
                        sign = paramVo.getSign();
                        key = preAdviceWrap.getSecretKeyVo().getDecryptKey();
                    }
                    /** 将请求参数组合 **/
                    JSONObject requestInfo = new JSONObject();
                    requestInfo.put("funcId", funcId);
                    requestInfo.put("params", JSONObject.parseObject(params));
                    requestInfo.put("key", secretKeyVo.getDecryptKey());
                    requestInfo.put("sign", sign);
        			/** 调用接口的请求号 **/
                    accessLog.setReqId(requestVo.getRequestId());
                    /** 调用接口的系统编号、标识调用系统 **/
                    accessLog.setCaller(requestVo.getProjectNo());
                    /** 调用接口的业务功能号、接口的唯一的标识  **/
                    accessLog.setFuncNo(funcId);
                    /** 业务参数 **/
                    accessLog.setParamIn(JSONObject.toJSONString(requestInfo));
                    /** 响应参数 **/
                    if(funcId.equals("bsb100011")){
                    	//因查询协议拿到的200状态的流转换成的字符串长度过长，导致后台记录日志过于庞大，现对于bsb100011进行截取
                    	accessLog.setParamOut(StringUtils.abbreviate(responseInfo.toJSONText(),128));
                    } else{
                    	accessLog.setParamOut(responseInfo.toJSONText());
                    }
                    /** 调用接口的系统IP地址  **/
                    accessLog.setReqIp(requestVo.getRequestIp());
                    break;
        		case BSB:
        			key = bsbProperties.getAesKey();
        			/** 调用接口的请求号 **/
                    accessLog.setReqId(preAdviceWrap.getProjectEnum().getProjectNo()+System.currentTimeMillis());
        			/** 调用接口的系统编号、标识调用系统 **/
                    accessLog.setCaller(preAdviceWrap.getProjectEnum().getProjectNo());
                    /** 调用接口的业务功能号、接口的唯一的标识  **/
            		BsbRequestVo bsbRequestVo = RequestContext.getPreAdviceWrap().getBsbRequestVo();
            		logger.info("bsbRequestVo:" + JSONObject.toJSONString(bsbRequestVo));
            		funcId = bsbRequestVo.getComm().getTxncd();
                    accessLog.setFuncNo(funcId);
                    /** 业务参数 **/
                    params = AesUtil.decryptAES(bsbRequestVo.getData(), bsbProperties.getAesKey());
                    accessLog.setParamIn(params);
                    /** 响应参数 **/
                    accessLog.setParamOut(responseInfo.toJSONText());
                    /** 调用接口的系统IP地址  **/
                    accessLog.setReqIp(bsbRequestVo.getRequestIp());
        			break;
        		default :
            		throw new PlatformException("根据请求报文没有解析到属于哪个系统");
        	}
            
            /** 调用接口的耗时时间，单位毫秒 **/
            accessLog.setUsedTime(responseTime - requestTime);
            /** 调用接口的请求时间 **/
            accessLog.setReqTime(new Date(requestTime));
            /** 调用接口的响应时间 **/
            accessLog.setResTime(new Date(responseTime));
            accessLog.setExt1("");
            accessLog.setExt2("");
            accessLog.setExt3("");
            accessLog.setExt4("");
            accessLog.setCreateTime(new Date());
            accessLog.setUpdateTime(new Date());
            /** 日志数据格式校验 **/
            ValidatorUtil.valid(accessLog);
            /** 将日志写入数据库 **/
            accessLogService.insert(accessLog);
        } catch (PlatformException ex) {
            logger.warn("写入日志表出错：" + JSONObject.toJSONString(ex.toResponseInfo()));
        } catch (Exception ex) {
            logger.warn("写入日志表系统忙", ex);
        }
        logger.info("功能号:" + accessLog.getFuncNo());
        if("lufaxupload".equals(accessLog.getFuncNo())){
        	logger.info("图片上传接口入参前500位:" + accessLog.getParamIn().substring(0, 500));
        }else{
        	logger.info("接口入参:" + accessLog.getParamIn());
        }
//        logger.info("接口入参:" + accessLog.getParamIn());
        logger.info("接口出参:" + accessLog.getParamOut());
        logger.info("业务参数解密Key:" + key);
        logger.info("耗时:" + accessLog.getUsedTime());
    }
    
}
