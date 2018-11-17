package com.zdmoney.credit.api.xdcore.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.util.DesUtil;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Lufax800060Vo;

/**
 * @ClassName:     Lufax800060Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月26日 下午3:37:02
 */
@Service
public class Lufax800060Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Lufax800060Service.class);

    @Autowired
    private CoreProperties coreProperties;
    
    @Autowired
    private LufaxProperties lufaxProperties;

    /**
     * 文件通知接口（交易核算->证大）
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore800060", desc = "文件通知接口（交易核算->证大）", voCls = Lufax800060Vo.class)
    public FuncResult execute(Lufax800060Vo vo) {
        logger.info("文件通知接口（交易核算->证大）请求报文：" + JSON.toJSONString(vo));
        
        int fileCount = vo.getFile_name().size();
        if(fileCount <= 0){
            return FuncResult.fail("文件通知接口（交易核算->证大）调用异常，文件名集合不能为空！");
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (final String filename:vo.getFile_name()){
            executor.execute(new Runnable(){
                public void run(){
                    try {
                        JSONObject json = download(filename);
                        if(HttpStatus.SC_OK == Integer.parseInt(json.getString("HttpStatus"))){
                            String fileContent = json.getString("file");
                            logger.info("从IOBS系统解析到的报文内容为---->" + fileContent);
                            JSONObject analyJson = JSONObject.parseObject(fileContent);
                            String infoContent = analyJson.getString("info_content");
                            String decryptInfoContent= DesUtil.decrypt(infoContent, "utf-8", 
                                    lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
                            JSONObject jso = JSONObject.parseObject(decryptInfoContent);
                            switch(analyJson.getString("interface_id")){
                                case "800015":
                                    String url15 = coreProperties.getServiceUrl() + "/gateway/overdueCompensatoryNotify";
                                    lufaxExecute(jso, url15);
                                    break;
                                case "800020":
                                    String url20 = coreProperties.getServiceUrl() + "/gateway/deductResultNotify";
                                    lufaxExecute(jso, url20);
                                    break;
                                default :
                                    throw new PlatformException("非法的接口ID：" + analyJson.getString("interface_id") + ", 不予转发。。。");
                            }
                        } else{
                            throw new PlatformException("下载陆金所IOBS文件失败-->状态：" + json.getString("HttpStatus") + ", 失败原因：" + json.getString("httpContent"));
                        }
                    } catch (Exception e) {
                        logger.error(e.getMessage(), e);
                    }
                }
            });
        }
        executor.shutdown();
        JSONObject json = new JSONObject();
        json.put("return_code", "0000");
        json.put("return_msg", "成功");
        return FuncResult.success(json);
    }
}
