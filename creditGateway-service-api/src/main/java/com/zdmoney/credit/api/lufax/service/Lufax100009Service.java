package com.zdmoney.credit.api.lufax.service;

import java.util.Arrays;

import org.apache.commons.lang3.RandomStringUtils;
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
import com.zdmoney.credit.common.util.DesUtil;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100009Vo;
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
public class Lufax100009Service extends LufaxBusinessService {
    
    private static final Log LOGGER = LogFactory.getLog(LufaxBusinessService.class);
    
    @Autowired
    private LufaxProperties lufaxProperties;
    
    private static final String PRODUCT_TYPE = "1000500010";
    
    private static final String INTERFACE_ID_10 = "800010";
    private static final String INTERFACE_ID_70 = "200100";
    
    @FuncIdAnnotate(value = "lufax100009", desc = "证大发起一般还款/提前还款指令/逾期回购指令", voCls = Lufax100009Vo.class)
    public FuncResult execute(Lufax100009Vo vo) {
        try {
            String jsonStr = JSON.toJSONString(vo);
            LOGGER.info("证大发起一般还款/提前还款指令/逾期回购指令：" + jsonStr);
            String encryptStr = DesUtil.encrypt(jsonStr, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
            JSONObject wrapper = new JSONObject();
            String interface_reqser = DateTime.now().toString("yyyyMMddHHmmssSS") + vo.getInterface_id() + RandomStringUtils.randomNumeric(6);
            wrapper.put("interface_reqser", interface_reqser); //请求流水
            wrapper.put("interface_id", INTERFACE_ID_10);//接口编号
            wrapper.put("channel_code", CHANNEL_CODE);
            wrapper.put("service_company_code", SERVICE_COMPANY_CODE);
            wrapper.put("info_content", encryptStr);
            String wrapperStr = wrapper.toJSONString();
            String fileName = "ZDJR_TO_LUFAX" + DateTime.now().toString("yyyyMMddHHmmssSSS") + ".txt";
            JSONObject json = upload(fileName, wrapperStr);
            if(HttpStatus.SC_OK == Integer.parseInt(json.getString("HttpStatus"))){
                Lufax100013Vo vo13 = new Lufax100013Vo();
                vo13.setInterfaceId(INTERFACE_ID_70);
                vo13.setFile_name(Arrays.asList(json.getString("fileKey")));
                vo13.setProduct_type(PRODUCT_TYPE);
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
