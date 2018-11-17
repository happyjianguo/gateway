package com.zdmoney.credit.api.lufax.service;

import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pingan.iobs.sdk.common.Config;
import com.pingan.iobs.sdk.model.Response;
import com.pingan.iobs.sdk.service.IobsService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.LufaxDownloadVo;

/**
 * @ClassName:     LufaxDownloadService.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class LufaxDownloadService extends LufaxBusinessService {
    
    private static final Log LOGGER = LogFactory.getLog(LufaxDownloadService.class);
    
    @Autowired
    private LufaxProperties lufaxProperties;
    
    @FuncIdAnnotate(value = "lufaxdownload", desc = "文件下载", voCls = LufaxDownloadVo.class)
    public FuncResult execute(LufaxDownloadVo vo) {
        // 初始化AK、sk
        Config.ACCESS_KEY = lufaxProperties.getAccessKey();
        Config.SECRET_KEY = lufaxProperties.getSecretKey();
        // 初始化访问域名
        Config.HOST = lufaxProperties.getIobsUrl();
        try {
            // 下载的bucket
            String bucketName = lufaxProperties.getBucketName();
            // 2、下载-获取文件流形式
            Response response = new IobsService().downloadPrivateRs(bucketName, vo.getFileKey());
            
            JSONObject lastObj = new JSONObject();
            switch(response.code()){
                case HttpStatus.SC_OK :
                    InputStream is = response.downloadFileStream();
                    byte[] buff = IOUtils.toByteArray(is);
                    lastObj.put("file", Base64.encodeBase64String(buff));
                    lastObj.put("HttpStatus", HttpStatus.SC_OK);
                    lastObj.put("httpContent", "下载成功");
                    break;
                case HttpStatus.SC_BAD_REQUEST :
                    lastObj.put("HttpStatus", HttpStatus.SC_BAD_REQUEST);
                    lastObj.put("httpContent", "请求报文格式错误");
                    break;
                case HttpStatus.SC_UNAUTHORIZED :
                    lastObj.put("HttpStatus", HttpStatus.SC_UNAUTHORIZED);
                    lastObj.put("httpContent", "下载凭证无效");
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
