package com.zdmoney.credit.api.lufax.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pingan.iobs.sdk.auth.Mac;
import com.pingan.iobs.sdk.auth.PutPolicy;
import com.pingan.iobs.sdk.common.Config;
import com.pingan.iobs.sdk.model.Response;
import com.pingan.iobs.sdk.service.IobsService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.LufaxUploadVo;

/**
 * @ClassName:     LufaxUploadService.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class LufaxUploadService extends LufaxBusinessService {
    
    private static final Log LOGGER = LogFactory.getLog(LufaxUploadService.class);
    
    @Autowired
    private LufaxProperties lufaxProperties;
    
    @FuncIdAnnotate(value = "lufaxupload", desc = "文件上传", voCls = LufaxUploadVo.class)
    public FuncResult execute(LufaxUploadVo vo) {
        // 初始化AK、sk
        Config.ACCESS_KEY = lufaxProperties.getAccessKey();
        Config.SECRET_KEY = lufaxProperties.getSecretKey();
        // 初始化访问域名
        Config.HOST = lufaxProperties.getIobsUrl();
        // 上传的bucket
        String bucketName = lufaxProperties.getBucketName();
        try {
            //生成token
            Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
            PutPolicy putPolicy = new PutPolicy(bucketName);
            putPolicy.scope = bucketName;
            //设置超时时间<单位：秒>（默认且最大为15分钟，小于900有效）
            putPolicy.expires = 900;
            String token = putPolicy.token(mac);    
            LOGGER.info("生成的token：" + token);
            
//            byte[] buff = Base64.decodeBase64(vo.getFileContent());
            byte[] buff =vo.getFileContent();
            InputStream is = new ByteArrayInputStream(buff);
            
            //与核心一致，生成文件名
            String fileName="ZDJR_TO_LUFAX" + DateTime.now().toString("yyyyMMddHHmmssSSS")+RandomStringUtils.randomNumeric(6)+vo.getFileName().substring(vo.getFileName().indexOf("."));
            // 文件key，推荐UUID
            //String key = UUID.randomUUID().toString();
            String key=fileName;//与核心一致，key与文件名相同
            LOGGER.info("生成的key：" + key);
            // 上传（关键方法）
            Response response = new IobsService().uploadStream(bucketName, key, is, fileName, buff.length);
            JSONObject lastObj = new JSONObject();
            lastObj.put("resKey", key); //返回Key作为请件入参
            switch(response.code()){
                case HttpStatus.SC_OK :
                    lastObj.put("HttpStatus", HttpStatus.SC_OK);
                    lastObj.put("httpContent", "上传成功");
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
            return FuncResult.success("正常", lastObj);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return FuncResult.fail(e.getMessage());
        }
    }

}
