package com.zdmoney.credit.system.service;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.callinter.AbsHttpUtil;
import com.zdmoney.credit.callinter.HttpUtils;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.util.UrlUtil;
import com.zdmoney.credit.system.service.pub.ISysParamDefineService;

@Service
public class HttpUtilService {
    
    protected static Log logger = LogFactory.getLog(HttpUtilService.class);
    
    @Autowired
    private ISysParamDefineService sysParamDefineService;
    
    /**
     * 数信接口调用通用方法
     * @param url
     * @param jsonData
     * @return
     */
    public String post(String url, String jsonData){
        // 数信接口调用方式
        /*String invokeType = sysParamDefineService.getSysParamValue("abs", "invoke_type");
        if("1".equals(invokeType)){// 无加密无签名调用
            return AbsHttpUtil.post(url, jsonData);
        }else if("2".equals(invokeType)){// 无加密有签名调用
            return AbsHttpUtil.postWithSign(url, jsonData);
        }*/
        // 有加密有签名调用
        return AbsHttpUtil.postWithEncryptAndSign(url, jsonData);
    }
    
    /**
     * 证大信贷核心系统接口调用通用方法
     * @param url
     * @param jsonData
     * @return
     */
    public String postToXdcore(String url, String jsonData) {
        String result = null;
        logger.info("调用核心系统接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        // 证大核心系统接口调用方式
        result = HttpUtils.doJsonPost(url, jsonData);
        logger.info("接口返回结果：" + result);
        logger.info("调用核心系统接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 证大征审系统接口调用通用方法
     * @param url
     * @param jsonData
     * @return
     */
    public String postToAps(String url, String jsonData){
        String result = null;
        logger.info("调用征审系统接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        // 证大征审系统接口调用方式
        result = HttpUtils.doJsonPost(url, jsonData);
        if(Strings.isNotEmpty(result)){
            // 返回结果转码操作 
            result = UrlUtil.paramDecoder(result);
        }
        logger.info("接口返回结果：" + result);
        logger.info("调用征审系统接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 证大征审系统接口调用通用方法
     * @param url
     * @param params
     * @return
     */
    public String postToAps(String url, Map<String,Object> params){
        String result = null;
        logger.info("调用征审系统接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + params.toString());
        // 证大征审系统接口调用方式
        result = HttpUtils.doPost(url, params);
        if(Strings.isNotEmpty(result)){
            // 返回结果转码操作 
            result = UrlUtil.paramDecoder(result);
        }
        logger.info("接口返回结果：" + result);
        logger.info("调用征审系统接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 包银系统接口调用通用方法
     * @param url
     * @param jsonData
     * @return
     */
    public String postToBsb(String url, String jsonData){
        String result = null;
        logger.info("调用包银系统接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        // 包银系统接口调用方式
        result = HttpUtils.doJsonPost(url, jsonData);
        logger.info("接口返回结果：" + result);
        logger.info("调用包银系统接口【"+ url +"】结束。。。。。。");
        return result;
    }
    /**
     * 证大信贷电子签章系统接口调用通用方法
     * @param url
     * @param jsonData
     * @return
     */
    public String postToXdsignature(String url, String jsonData) {
        String result = null;
        logger.info("调用电子签章系统接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        // 证大电子签章系统接口调用方式
        result = HttpUtils.doJsonPost(url, jsonData);
        logger.info("接口返回结果：" + result);
        logger.info("调用电子签章系统接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 证大征审系统陆金所接口调用通用方法
     * @param url
     * @param jsonData
     * @return
     */
    public String postToApsFromLufax(String url, String jsonData){
        String result = null;
        logger.info("调用征审系统接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        // 证大征审系统接口调用方式
        result = HttpUtils.doJsonPost(url, jsonData);
        logger.info("接口返回结果：" + result);
        logger.info("调用征审系统接口【"+ url +"】结束。。。。。。");
        return result;
    }
}
