package com.zdmoney.credit.framework.interceptor;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zdmoney.credit.config.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zdmoney.credit.common.constant.system.LogLevel;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.AesUtil;
import com.zdmoney.credit.common.util.MD5Util;
import com.zdmoney.credit.common.util.RSAUtil;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.util.XXTeaUtil;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.config.ApsProperties;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.config.PicProperties;
import com.zdmoney.credit.config.SystemProperties;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.vo.common.SecretKeyVo;
import com.zdmoney.credit.framework.vo.request.BsbRequestVo;
import com.zdmoney.credit.framework.vo.request.ParamVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;
import com.zdmoney.credit.framework.wrap.PreAdviceWrap;

/**
 * 参数签名校验
 * 
 * @author Ivan
 *
 */
public class SignCheckInterceptor implements HandlerInterceptor {

    protected static Log logger = LogFactory.getLog(SignCheckInterceptor.class);

    @Autowired
    private SystemProperties systemProperties;
    
    @Autowired
    private AbsProperties absProperties;
    
    @Autowired
    private ApsProperties apsProperties;
    
    @Autowired
    private CoreProperties coreProperties;
    
    @Autowired
    private LufaxProperties lufaxProperties;
    
    @Autowired
    private PicProperties picProperties;
    
    @Autowired
    private BsbProperties bsbProperties;

    @Autowired
    private FddProperties fddProperties;

    @Autowired
    private SignatureProperties signatureProperties;

    public SignCheckInterceptor() {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
        ResponseInfo<?> responseInfo = null;
        try {
        	ProjectEnum project = RequestContext.getPreAdviceWrap().getProjectEnum();
        	switch(project){
	        	case ABS:
	        	case APS:
	        	case XDCORE:
                case FDD:
                case XDSIGNATURE:
	        	case PIC:	        		/** 针对业务参数进行解密 **/
	                this.decryptBusinessParam();
	                /** 校验签名信息 **/
	                this.checkSign();
	                break;
	        	case BSB:
	        		BsbRequestVo bsbRequestVo = RequestContext.getPreAdviceWrap().getBsbRequestVo();
	        		String decrypJson = AesUtil.decryptAES(bsbRequestVo.getData(), bsbProperties.getAesKey());
	        		String enStr = decrypJson + "|" + bsbProperties.getMd5SignKey() ;
	        		String sign = DigestUtils.md5Hex(enStr.getBytes("UTF-8"));
	        		if(!sign.equals(bsbRequestVo.getComm().getSigntx())){
	        			throw new PlatformException(ResponseEnum.SIGN_FAIL, "详细信息见后台日志！").applyLogLevel(LogLevel.WARN);
	        		}
	        		break;
	        	default :
            		throw new PlatformException("根据请求报文没有解析到属于哪个系统");
        	}
            return true;
        } catch (PlatformException ex) {
            ex.printStackTraceExt(logger);
            responseInfo = ex.toResponseInfo();
        } catch (Exception ex) {
            logger.error(ex, ex);
            responseInfo = new ResponseInfo(ResponseEnum.DECRYPT_FAIL, "系统忙！详细信息见后台日志！");
        }
        preAdviceWrap.getResponseWrap().write(responseInfo);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    /**
     * 校验请求是否超时
     */
    public void checkRequestTime() {
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();

        /** Key的明文为时间搓 **/
        String decryptKey = preAdviceWrap.getSecretKeyVo().getDecryptKey();
        /** 请求超时 间隔（分钟） **/
        int timeout = systemProperties.getCheckTime();
        Date nowDate = null;
        try {
            nowDate = new Date(Strings.convertValue(decryptKey, Long.class));
        } catch (Exception ex) {
            logger.warn("Key参数无效！");
            throw new PlatformException(ResponseEnum.REQUEST_TIMEOUT, "Key不是有效的时间[" + decryptKey + "]").applyLogLevel(LogLevel.WARN);
        }

        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE, -timeout);
        Date begin = nowTime.getTime();

        nowTime.add(Calendar.MINUTE, timeout * 2);
        Date end = nowTime.getTime();

        if (begin.compareTo(nowDate) <= 0 && end.compareTo(nowDate) >= 0) {
            /** 请求有效 **/
        } else {
            logger.warn("请求校验失败：超时！");
            throw new PlatformException(ResponseEnum.REQUEST_TIMEOUT, "").applyLogLevel(LogLevel.WARN);
        }
    }

    /**
     * 检查公、私钥文件是否配置并且存在
     */
    public void checkPublicPrivateKey() {
        String rsaPrivateFile = systemProperties.getRsaPrivateFile();
        String rsaPublicFile = systemProperties.getRsaPublicFile();
        if (Strings.isEmpty(rsaPrivateFile) || Strings.isEmpty(rsaPublicFile)) {
            throw new PlatformException(ResponseEnum.SIGN_FAIL, "检查system.properties文件 公私钥文件路径是否配置!").applyLogLevel(LogLevel.WARN);
        }
        /** 检查文件是否存在 **/
        File privateFile = new File(rsaPrivateFile);
        File publicFile = new File(rsaPublicFile);
        if (!privateFile.exists() || !privateFile.isFile()) {
            throw new PlatformException(ResponseEnum.DECRYPT_FAIL, "私钥文件" + rsaPrivateFile + "不存在或不是文件!").applyLogLevel(LogLevel.WARN);
        }
        if (!publicFile.exists() || !publicFile.isFile()) {
            throw new PlatformException(ResponseEnum.DECRYPT_FAIL, "公钥文件" + rsaPrivateFile + "不存在或不是文件!").applyLogLevel(LogLevel.WARN);
        }
    }

    /**
     * 针对业务参数进行解密
     * 
     * @return
     */
    public boolean decryptBusinessParam() {
        /** 业务参数是否解密 **/
        String isNeedDecryptParam = systemProperties.getIsNeedDecryptParam();
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
        ParamVo paramVo = preAdviceWrap.getRequestVo().getParamVo();
        SecretKeyVo secretKeyVo = preAdviceWrap.getSecretKeyVo();
        if (!"true".equals(isNeedDecryptParam)) {
            secretKeyVo.setDecryptKey(paramVo.getKey());
            /** 不解密参数 **/
            logger.warn("系统关闭业务参数解密开关");
            return true;
        }
        try {
            String rsaPublicFile = systemProperties.getRsaPublicFile();
            /** 解密时依赖公私钥，先校验密钥文件 **/
            this.checkPublicPrivateKey();

            /** Key 密文 **/
            String encryptKey = paramVo.getKey();
            /** Key 明文 (已解密) **/
            String decryptKey = RSAUtil.rsaDecrypt(encryptKey, rsaPublicFile);// 解密密文
            secretKeyVo.setDecryptKey(decryptKey);

            /** 业务参数 密文 **/
            String encryptParams = paramVo.getParams();
            /** 获取已解密的业务参数 **/
            String decryptParams = XXTeaUtil.xxteaDecrypt(encryptParams, decryptKey);
            paramVo.setParams(decryptParams);
            return true;
        } catch (PlatformException ex) {
            ex.printStackTraceExt(logger);
            throw ex;
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new PlatformException(ResponseEnum.DECRYPT_FAIL, "解密出现异常！详细信息见后台日志！").applyLogLevel(LogLevel.WARN);
        }
    }

    /**
     * 校验签名信息
     * @return
     */
    public boolean checkSign() {
        /** 是否校验签名 **/
        String isCheckSign = systemProperties.getIsCheckSign();
        if (!"true".equals(isCheckSign)) {
            /** 不校验签名 **/
            logger.warn("系统关闭校验签名开关");
            return true;
        }
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
        RequestVo requestVo = preAdviceWrap.getRequestVo();
        SecretKeyVo secretKeyVo = preAdviceWrap.getSecretKeyVo();
        ParamVo paramVo = preAdviceWrap.getRequestVo().getParamVo();

        /** 从配置文件中获取signKey **/
        //String md5SignKey = systemProperties.getMd5SignKey();
        /** 获取与调用方系统约定的签名秘钥 **/
        String md5SignKey = this.getMd5SignKey(requestVo.getProjectNo());
        /** 功能号(arg0) **/
        String funcId = paramVo.getFuncId();
        /** 业务参数(arg1) **/
        String params = paramVo.getParams();
        /** 解密时用到的Key(arg2) **/
        String key = paramVo.getKey();
        /** 功能号(arg4) **/
        String sign = secretKeyVo.getSign();
        String decryptKey = secretKeyVo.getDecryptKey();

        if (Strings.isEmpty(md5SignKey)) {
            throw new PlatformException(ResponseEnum.SIGN_FAIL, "请检查system.properties文件 配置项sys.md5SignKey！").applyLogLevel(LogLevel.WARN);
        }
        if (Strings.isEmpty(key)) {
            throw new PlatformException(ResponseEnum.SIGN_FAIL, "缺少秘钥(key)参数！").applyLogLevel(LogLevel.WARN);
        }
        if (Strings.isEmpty(sign)) {
            throw new PlatformException(ResponseEnum.SIGN_FAIL, "缺少签名(sign)参数！").applyLogLevel(LogLevel.WARN);
        }
        /** 校验签名规则 funcId + params + decryptKey + md5SignKey组成字符串进行MD5转换 和 sign进行比较 **/
        StringBuffer sourceText = new StringBuffer();
        sourceText.append(funcId);
        sourceText.append(params);
        sourceText.append(decryptKey);
        sourceText.append(md5SignKey);
        /** 生成签名 **/
        String signText = "";
        try {
            signText = MD5Util.md5Hex(sourceText.toString());
        } catch (UnsupportedEncodingException e) {
            logger.error(e, e);
        }
        if (!signText.equals(sign)) {
            /** 校验签名不通过 **/
            throw new PlatformException(ResponseEnum.SIGN_FAIL, "").applyLogLevel(LogLevel.WARN);
            
        }
        /** 校验签名通过 **/
        return true;
    }

    /**
     * 获取与调用方系统约定的签名秘钥
     * @param projectNo
     * @return
     */
    private String getMd5SignKey(String projectNo) {
        String md5SignKey = null;
        if(ProjectEnum.ABS.getProjectNo().equals(projectNo)){
            md5SignKey = absProperties.getMd5SignKey();
        } else if(ProjectEnum.APS.getProjectNo().equals(projectNo)){
            md5SignKey = apsProperties.getMd5SignKey();
        } else if(ProjectEnum.XDCORE.getProjectNo().equals(projectNo)){
            md5SignKey = coreProperties.getMd5SignKey();
        }else if(ProjectEnum.FDD.getProjectNo().equals(projectNo)){
            md5SignKey = fddProperties.getMd5SignKey();
        }else if(ProjectEnum.XDSIGNATURE.getProjectNo().equals(projectNo)){
            md5SignKey = signatureProperties.getMd5SignKey();
        }else if(ProjectEnum.LUFAX.getProjectNo().equals(projectNo)){
            md5SignKey = lufaxProperties.getMd5SignKey();
        }else if(ProjectEnum.PIC.getProjectNo().equals(projectNo)){
            md5SignKey = picProperties.getMd5SignKey();
        }
        return md5SignKey;
    }
}
