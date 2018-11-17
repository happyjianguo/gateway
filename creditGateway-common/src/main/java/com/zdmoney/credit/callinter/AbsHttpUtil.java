package com.zdmoney.credit.callinter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.ifre.util.AesUtil;
import com.ifre.util.HttpKit;
import com.ifre.util.SignUtil;
import com.zdmoney.credit.common.constant.Constant;

/**
 * 调用第三方（数信）接口工具类
 * @author 00236640
 *
 */
public class AbsHttpUtil {
    
    protected static Log logger = LogFactory.getLog(AbsHttpUtil.class);
    
    /** 签名秘钥 **/
    //private final static String SIGN_KEY = "1234567890";
    private final static String SIGN_KEY = "123456";
    /** 加密秘钥 **/
    private final static String ENCRYPT_KEY = "1112345abcde12345abcde";
    
    /**
     * 发送请求（无参数加密、无生成签名）
     * @param url
     * @param jsonData
     * @return
     */
    public static String post(String url, String jsonData) {
        String result = "";
        logger.info("调用数信接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        try {
            // 请求地址
            String requestUrl = url;
            // json字符串转换为map集合
            Map<String, Object> map = jsonStringToMap(jsonData);
            map.put("sysSource", Constant.SYS_SOURCE);
            // map集合转换成json字符串
            String jsonDataP = JSONObject.toJSONString(map/*,SerializerFeature.SortField*/);
            logger.info("组装后接口实际发送参数：" + jsonDataP);
            requestUrl = requestUrl + "?jsonData=";
            // 调用数信业务系统的接口
            result = HttpKit.post(requestUrl, jsonDataP, true);
            logger.info("接口返回结果：" + result);
        } catch (Exception e) {
            logger.error("调用数信接口【"+ url +"】异常："+e.getMessage());
        }
        logger.info("调用数信接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 发送请求（无参数加密、有生成签名）
     * @param url
     * @param jsonData
     * @return
     */
    public static String postWithSign(String url, String jsonData) {
        String result = "";
        logger.info("调用数信接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        try {
            // 请求地址
            String requestUrl = url;
            // json字符串转换为map集合
            Map<String, Object> map = jsonStringToMap(jsonData);
            map.put("sysSource", Constant.SYS_SOURCE);
            // 生成MD5签名
            String sign = SignUtil.md5Sign(map, SIGN_KEY);
            map.put("sysSign", sign);
            // map集合转换成json字符串
            String jsonDataP = JSONObject.toJSONString(map);
            logger.info("组装后接口实际发送参数：" + jsonDataP);
            requestUrl = requestUrl + "?jsonData=";
            // 调用数信业务系统的接口
            result = HttpKit.post(requestUrl, jsonDataP, true);
            logger.info("接口返回结果：" + result);
        } catch (Exception e) {
            logger.error("调用数信接口【"+ url +"】异常："+e.getMessage());
        }
        logger.info("调用数信接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 发送请求（有参数加密、有生成签名）
     * @param url
     * @param jsonData
     * @return
     */
    public static String postWithEncryptAndSign(String url, String jsonData) {
        String result = "";
        logger.info("调用数信接口【"+ url +"】开始。。。。。。");
        logger.info("接口接收参数：" + jsonData);
        try {
            // 请求地址
            String requestUrl = url;
            // 参数加密
            String encryptData = AesUtil.base64EncryptCBC(jsonData, ENCRYPT_KEY);
            Map<String, Object> encryptMap = new HashMap<String, Object>();
            encryptMap.put("sysSource", Constant.SYS_SOURCE);
            encryptMap.put("encryptData", encryptData);
            // 密文报文生成MD5签名
            String sign = SignUtil.md5Sign(encryptMap, SIGN_KEY);
            encryptMap.put("sysSign", sign);
            // map集合转换成json字符串
            String jsonDataP = JSONObject.toJSONString(encryptMap);
            logger.info("组装后接口实际发送参数：" + jsonDataP);
            requestUrl = requestUrl + "?jsonData=";
            // 调用数信业务系统的接口
            result = HttpKit.post(requestUrl, jsonDataP, true);
            // 响应结果解密
            result = decrypt(result);
            logger.info("接口返回结果：" + result);
        } catch (Exception e) {
            logger.error("调用数信接口【"+ url +"】异常："+e.getMessage());
        }
        logger.info("调用数信接口【"+ url +"】结束。。。。。。");
        return result;
    }
    
    /**
     * 响应结果解密
     * @param result
     * @return
     */
    public static String decrypt(String result){
        try {
            return AesUtil.decryptCBC(result, ENCRYPT_KEY);
        } catch (Exception e) {
            logger.error("响应结果解密异常："+ e.getMessage());
            return null;
        }
    }
    
    /**
     * json字符串转换为map集合
     * @param jsonString
     * @return
     * @throws Exception
     */
    private static Map<String,Object> jsonStringToMap(String jsonString) throws Exception {
        Map<String,Object> map = new TreeMap<String, Object>();
        //JSONObject json = (JSONObject)JSONObject.parse(jsonString);
        JSONObject json = JSONObject.parseObject(jsonString, Feature.OrderedField);
        Set<String> set = json.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Object value = json.get(key);
            if(null != value && !"".equals(value)){
                map.put(key, value);
            }
        }
        return map;
    }
}

