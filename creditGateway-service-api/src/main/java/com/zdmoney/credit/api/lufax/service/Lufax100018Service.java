package com.zdmoney.credit.api.lufax.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.util.DesUtil;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100013Vo;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100018Vo;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 *  一次性逾期回购
 * Created by YM10098 on 2017/7/12.
 */
@Service
public class Lufax100018Service extends LufaxBusinessService {

    private static final Log LOGGER = LogFactory.getLog(LufaxBusinessService.class);

    @Autowired
    private LufaxProperties lufaxProperties;

    private static final String INTERFACE_ID = "800080";
    @FuncIdAnnotate(value = "lufax100018", desc = "一次性逾期回购", voCls = Lufax100018Vo.class)
    public FuncResult execute(Lufax100018Vo vo) {
        try {
            String jsonStr = JSON.toJSONString(vo);
            LOGGER.info("证大发起一次性回购指令：" + jsonStr);
            String encryptStr = DesUtil.encrypt(jsonStr, "utf-8", lufaxProperties.getKeyStorePassword(), lufaxProperties.getKeyStoreFileName());
            JSONObject wrapper = new JSONObject();
            String interface_reqser = DateTime.now().toString("yyyyMMddHHmmssSS") + INTERFACE_ID + RandomStringUtils.randomNumeric(6);
            wrapper.put("interface_reqser", interface_reqser); //请求流水
            wrapper.put("interface_id", INTERFACE_ID);//接口编号
            wrapper.put("channel_code", CHANNEL_CODE);
            wrapper.put("service_company_code", SERVICE_COMPANY_CODE);
            wrapper.put("info_content", encryptStr);
            String wrapperStr = wrapper.toJSONString();
            String fileName = "ZDJR_TO_LUFAX" + DateTime.now().toString("yyyyMMddHHmmssSSS") + ".txt";
            JSONObject json = upload(fileName, wrapperStr);
            if(HttpStatus.SC_OK == Integer.parseInt(json.getString("HttpStatus"))){
                Lufax100013Vo vo13 = new Lufax100013Vo();
                vo13.setInterfaceId(INTERFACE_ID_FILE_UPLOAD);
                vo13.setFile_name(Arrays.asList(json.getString("fileKey")));
                vo13.setProduct_type(ZDJR_PRODUCT_TYPE);
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
