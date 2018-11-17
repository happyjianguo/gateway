package com.zdmoney.credit.api.lufax.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pingan.iobs.sdk.auth.AuthException;
import com.pingan.iobs.sdk.auth.Mac;
import com.pingan.iobs.sdk.auth.PutPolicy;
import com.pingan.iobs.sdk.common.Config;
import com.pingan.iobs.sdk.model.Response;
import com.pingan.iobs.sdk.repkg.org.json.JSONException;
import com.pingan.iobs.sdk.service.IobsService;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.callinter.HttpUtils;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.serializer.CustomBigDecimalSerializer;
import com.zdmoney.credit.common.util.Dates;
import com.zdmoney.credit.common.util.DesUtil;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.system.service.HttpUtilService;

/**
 * @ClassName:     LufaxBusinessService.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月18日 下午4:29:33
 */
public class LufaxBusinessService extends BusinessService  {
    
    private static final Log LOGGER = LogFactory.getLog(LufaxBusinessService.class);
    
    /** 产品大类 */
    public static final String CHANNEL_CODE = "XDY_ZDJR";
    
    /** 服务方 */
    public static final String SERVICE_COMPANY_CODE = "ZDJR_SHENZHEN";
    /** 业务类型 证大：1000500010 **/
    public static final String ZDJR_PRODUCT_TYPE = "1000500010";
    /** 文件上传接口id **/
    public static final String INTERFACE_ID_FILE_UPLOAD = "200100";
    @Autowired
    private HttpUtilService httpUtilService;
    
    @Autowired
    private LufaxProperties lufaxProperties;
    
    /**
     * 陆金所文件上传
     * @param fileName
     * @param file
     * @return
     * @throws JSONException
     * @throws AuthException
     * @throws IOException 
     */
    protected JSONObject upload(String fileName, String content) throws JSONException, AuthException, IOException {
        // 初始化AK、sk
        Config.ACCESS_KEY = lufaxProperties.getAccessKey();
        Config.SECRET_KEY = lufaxProperties.getSecretKey();
        // 初始化访问域名
        Config.HOST = lufaxProperties.getIobsUrl();
        // 上传的bucket
        String bucketName = lufaxProperties.getBucketName();
        //生成token
        Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
        PutPolicy putPolicy = new PutPolicy(bucketName);
        putPolicy.scope = bucketName;
        //设置超时时间<单位：秒>（默认且最大为15分钟，小于900有效）
        putPolicy.expires = 900;
        String token = putPolicy.token(mac);    
        LOGGER.info("生成的token：" + token);
        
        String encryptContent = Base64.encodeBase64String(content.getBytes("UTF-8"));
        LOGGER.info("※※※※※※※BASE64处理过后的需上传的报文-->"+encryptContent);
        byte[] buff = encryptContent.getBytes("UTF-8");
        InputStream is = new ByteArrayInputStream(buff);
        
        //String fileKey = UUID.randomUUID().toString();
        String fileKey = fileName;//陆金所-信贷云-证大约定，文件名和key名称相同
        LOGGER.info("生成的key：" + fileKey);
        LOGGER.info("※※※※※※※上传的流字节大小-->"+is.available());
        // 上传（关键方法）
        Response response = new IobsService().uploadStream(bucketName, fileKey, is, fileName, buff.length);
        JSONObject lastObj = new JSONObject();
        LOGGER.info("※※※※※※※isOK()方法返回请求是否成功-->"+response.isOK());
        switch(response.code()){
            case HttpStatus.SC_OK :
                lastObj.put("HttpStatus", HttpStatus.SC_OK);
                lastObj.put("httpContent", "上传成功");
                lastObj.put("fileName", fileName);
                lastObj.put("fileKey", fileKey);
                LOGGER.info("IOBS上传完毕{fileName：" + fileName + ",fileKey:" + fileKey +"}");
                break;
            case HttpStatus.SC_BAD_REQUEST :
                lastObj.put("HttpStatus", HttpStatus.SC_BAD_REQUEST);
                lastObj.put("httpContent", "请求报文格式错误");
                break;
            case HttpStatus.SC_UNAUTHORIZED :
                lastObj.put("HttpStatus", HttpStatus.SC_UNAUTHORIZED);
                lastObj.put("httpContent", "上传凭证无效");
                break;
            case HttpStatus.SC_NOT_FOUND :
                lastObj.put("HttpStatus", HttpStatus.SC_NOT_FOUND);
                lastObj.put("httpContent", "请求资源不存在，一般为bucket错误或者不存在");
                break;
            case 599 :
                lastObj.put("HttpStatus", 599);
                lastObj.put("httpContent", "服务端操作失败[如遇此错误，请将完整错误信息（包括所有HTTP响应头部）通过邮件发送给IOBS项目组]");
                break;
            case 612 :
                lastObj.put("HttpStatus", 612);
                lastObj.put("httpContent", "指定资源不存在或已被删除");
                break;
            default :
                throw new PlatformException("IOBS系统返回了未知的HttpStatus");
        }
        return lastObj;
    }
    
    /**
     *  {
     *      "interface_reqser":"请求流水",
     *      "iCode":"进件接口编号",
     *      "interface_id":"接口编号",
     *      "info_content":"报文内容",
     *      "channel_code":"产品大类",
     *      "service_company_code":"服务方"
     *  }
     * 
     *  {
     *      "ret": "0",
     *      "msg": "",
     *      "requestId": "1492659822178",
     *      "data": {
     *          "info_content": null,
     *          "interface_reqser": "2017042020721122",
     *          "ret_code": "9999",
     *          "interface_id": "100010",
     *          "ret_msg": "iJyW6IOxwcR+hjzqR4UTd+8Ef/rd1gwAIgEpDW0Y1Ww=\r\n",
     *          "isValidate": true,
     *          "isEnterParam": "2"
     *      }
     *  }
     */
    public FuncResult execute(LufaxBaseParamVo vo) {
        String tokenUrl = lufaxProperties.getTokenUrl() + "?client_id=" + lufaxProperties.getClientId() + "&grant_type=" + lufaxProperties.getGrantType() + "&client_secret=" + lufaxProperties.getClientSecret();
        LOGGER.info("①获取陆金所的最新token请求地址-->" + tokenUrl);
        String wrapperToken = HttpUtils.doGet(tokenUrl);
        LOGGER.info("②获取陆金所的最新token串包装报文：" + wrapperToken);
        JSONObject tokenObj = JSONObject.parseObject(wrapperToken);
        String token = tokenObj.getJSONObject("data").getString("access_token");
        /**                             开始封装请求报文                                                                                                                                          */
        JSONObject wrapper = new JSONObject();
        String str = Dates.getDateTime(new Date(),"yyyyMMddHHmmssSS").substring(0,16)+vo.getInterfaceId()+RandomStringUtils.randomNumeric(6);
        wrapper.put("interface_reqser", str); //请求流水
        wrapper.put("iCode", StringUtils.defaultString(vo.getiCode(), ""));//进件接口编号
        wrapper.put("interface_id", StringUtils.defaultString(vo.getInterfaceId(), ""));//接口编号
        wrapper.put("channel_code", CHANNEL_CODE);
        wrapper.put("service_company_code", SERVICE_COMPANY_CODE);
        if(vo.getInterfaceId().equals("200100")){//针对文件通知接口
            wrapper.put("to_sys_id", "");
            wrapper.put("sys_id", "zd_system");
        }
        if(vo.getInterfaceId().equals("820019")){//针对文件通知接口
            wrapper.put("to_sys_id", "YXD_CORE");
            wrapper.put("sys_id", "zd_system");
        }
        if(vo.getInterfaceId().equals("820040") || vo.getInterfaceId().equals("810010")){
            wrapper.put("sys_id", "zd_system");
        }
        if(vo.getInterfaceId().equals("110090")||vo.getInterfaceId().equals("120040")){//对公虚拟账户充值,提现
            wrapper.put("to_sys_id", "LUFAX");
            wrapper.put("sys_id", "zd_system");
        }
        String infoStr = JSON.toJSONString(vo,new CustomBigDecimalSerializer());
        LOGGER.info("准备DES加密的业务参数 -->" + infoStr);
        try {
            /**                             开始请求陆金所系统                                                                                                                                          */
            String  encryptStr = DesUtil.encrypt(infoStr, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
            wrapper.put("info_content", encryptStr);
            String openUrl = lufaxProperties.getOpenUrl() + "?access_token=" + token + "&request_id=" + System.currentTimeMillis();
            LOGGER.info("③调用陆金所OPEN API地址 -->" + openUrl);
            LOGGER.info("④调用陆金所OPEN API请求报文 -->" + wrapper.toString());
            String result = HttpUtils.doJsonPost(openUrl, wrapper.toJSONString());
            LOGGER.info("⑤陆金所响应报文：" + result);
            result = result.replace("\"{", "{").replace("}\"", "}");
            
            /**                             开始解析响应报文                                                                                                                                          */
            JSONObject resultObj = JSONObject.parseObject(result);
            JSONObject lastObj = new JSONObject();
            if(resultObj.containsKey("data")){
                JSONObject dataObj = resultObj.getJSONObject("data");
                lastObj.put("interface_reqser", dataObj.getString("interface_reqser"));
                lastObj.put("interface_id", dataObj.getString("interface_id"));
                lastObj.put("ret_code", dataObj.getString("ret_code"));                
                lastObj.put("ret_msg", DesUtil.decrypt(dataObj.getString("ret_msg"), "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName()));                  
                if(dataObj.containsKey("info_content")){
                    String infoContent = dataObj.getString("info_content");
                    if(Strings.isNotEmpty(infoContent)){
                        infoContent = DesUtil.decrypt(infoContent, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
                        lastObj.put("info_content", JSONObject.parseObject(infoContent));
                    }
                }
            }
            LOGGER.info("⑥DES解密之后的报文：" + lastObj.toJSONString());
            
            return FuncResult.success("正常", lastObj);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return FuncResult.fail(e.getMessage());
        }
    }
    
    public FuncResult apsExecute(LufaxBaseParamVo vo) {
        String tokenUrl = lufaxProperties.getApsTokenUrl() + "?client_id=" + lufaxProperties.getApsClientId() + "&grant_type=" + lufaxProperties.getApsGrantType() + "&client_secret=" + lufaxProperties.getApsClientSecret();
        LOGGER.info("①获取陆金所的最新token请求地址-->" + tokenUrl);
        String wrapperToken = HttpUtils.doGet(tokenUrl);
        LOGGER.info("②获取陆金所的最新token串包装报文：" + wrapperToken);
        JSONObject tokenObj = JSONObject.parseObject(wrapperToken);
        String token = tokenObj.getJSONObject("data").getString("access_token");
        /**                             开始封装请求报文                                                                                                                                          */
        JSONObject wrapper = new JSONObject();
//        wrapper.put("interface_reqser", DateTime.now().toString("yyyyMMdd") + RandomStringUtils.randomNumeric(8)); //请求流水
        String str = Dates.getDateTime(new Date(),"yyyyMMddHHmmssSS").substring(0,16)+vo.getInterfaceId()+RandomStringUtils.randomNumeric(6);
        wrapper.put("interface_reqser", str); //请求流水
        wrapper.put("iCode", StringUtils.defaultString(vo.getiCode(), ""));//进件接口编号
        wrapper.put("interface_id", StringUtils.defaultString(vo.getInterfaceId(), ""));//接口编号
        wrapper.put("channel_code", CHANNEL_CODE);
        wrapper.put("service_company_code", SERVICE_COMPANY_CODE);
        String infoStr = JSON.toJSONString(vo);
        LOGGER.info("准备DES加密的业务参数 -->" + infoStr);
        try {
            /**                             开始请求陆金所系统                                                                                                                                          */
            String  encryptStr = DesUtil.encrypt(infoStr, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
            wrapper.put("info_content", encryptStr);
            String openUrl = lufaxProperties.getApsOpenUrl() + "?access_token=" + token + "&request_id=" + System.currentTimeMillis();
            LOGGER.info("③调用陆金所OPEN API地址 -->" + openUrl);
            LOGGER.info("④调用陆金所OPEN API请求报文 -->" + wrapper.toString());
            String result = HttpUtils.doJsonPost(openUrl, wrapper.toJSONString());
            LOGGER.info("⑤陆金所响应报文：" + result);
            result = result.replace("\"{", "{").replace("}\"", "}");
            
            /**                             开始解析响应报文                                                                                                                                          */
            JSONObject resultObj = JSONObject.parseObject(result);
            JSONObject lastObj = new JSONObject();
            if(resultObj.containsKey("data")){
                JSONObject dataObj = resultObj.getJSONObject("data");
                lastObj.put("interface_reqser", dataObj.getString("interface_reqser"));
                lastObj.put("interface_id", dataObj.getString("interface_id"));
                lastObj.put("ret_code", dataObj.getString("ret_code"));
                if(dataObj.getString("ret_msg")!=null){
                    lastObj.put("ret_msg", DesUtil.decrypt(dataObj.getString("ret_msg"), "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName()));
                }
                if(dataObj.containsKey("info_content")){
                    String infoContent = dataObj.getString("info_content");
                    if(Strings.isNotEmpty(infoContent)){
                        infoContent = DesUtil.decrypt(infoContent, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
                        lastObj.put("info_content", JSONObject.parseObject(infoContent));
                    }
                }
            }
            LOGGER.info("⑥DES解密之后的报文：" + lastObj.toJSONString());
            
            return FuncResult.success("正常", lastObj);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return FuncResult.fail(e.getMessage());
        }
    }
    
}
