package com.zdmoney.credit.api.lufax.service;

import java.util.Arrays;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.serializer.CustomBigDecimalSerializer;
import com.zdmoney.credit.common.util.Dates;
import com.zdmoney.credit.common.util.DesUtil;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100011Vo;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100013Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100011Service extends LufaxBusinessService {
	
    private static final Log LOGGER = LogFactory.getLog(Lufax100011Service.class);

	@Autowired
    private LufaxProperties lufaxProperties;
	private static final String PRODUCT_TYPE = "1000500010 ";
	private static final String INTERFACE_ID_70 = "200100";
    
    @FuncIdAnnotate(value = "lufax100011", desc = "证大同步还款明细给陆金所", voCls = Lufax100011Vo.class)
    public FuncResult execute(Lufax100011Vo vo) {
        try {
        	String jsonStr = JSON.toJSONString(vo,new CustomBigDecimalSerializer());
        	LOGGER.info("Lufax100011Service-证大同步还款明细给陆金所：" + jsonStr);
        	String encryptStr = DesUtil.encrypt(jsonStr, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
        	JSONObject wrapper = new JSONObject();
    		String str = Dates.getDateTime(new Date(),"yyyyMMddHHmmssSS").substring(0,16)+vo.getInterface_id()+RandomStringUtils.randomNumeric(6);
            wrapper.put("interface_reqser", str); //请求流水 28位
            wrapper.put("iCode", StringUtils.defaultString(vo.getiCode(), ""));//进件接口编号
            wrapper.put("interface_id", StringUtils.defaultString(vo.getInterface_id(), ""));//接口编号
            wrapper.put("channel_code", CHANNEL_CODE);
            wrapper.put("service_company_code", SERVICE_COMPANY_CODE);
            wrapper.put("info_content", encryptStr);
            String wrapperStr = wrapper.toJSONString();
            String fileName = "ZDJR_TO_LUFAX" + DateTime.now().toString("yyyyMMddHHmmssSSS")+RandomStringUtils.randomNumeric(6)+"_"+vo.getInterface_id()+".txt";
            JSONObject json = upload(fileName, wrapperStr);
            if(HttpStatus.SC_OK == Integer.parseInt(json.getString("HttpStatus"))){
            	LOGGER.info("证大同步还款明细给陆金所：文件名【"+fileName+"】上传到iobs服务器，" + json.getString("httpContent"));
                Lufax100013Vo vo13 = new Lufax100013Vo();
                vo13.setFile_name(Arrays.asList(json.getString("fileKey")));//生成的key作为文件名，发送给陆金所
                vo13.setProduct_type(PRODUCT_TYPE);
                
                vo13.setInterfaceId(INTERFACE_ID_70);
                vo13.setiCode("");
                return super.execute(vo13);
            } else{
                throw new PlatformException("上传陆金所IOBS文件失败-->状态：" + json.getString("HttpStatus") + ", 失败原因：" + json.getString("httpContent"));
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return FuncResult.fail(e.getMessage());
        }
    	
    	
    }

}
