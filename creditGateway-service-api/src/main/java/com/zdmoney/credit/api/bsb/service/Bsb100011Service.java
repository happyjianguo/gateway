package com.zdmoney.credit.api.bsb.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.callinter.HttpUtils;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.util.AesUtil;
import com.zdmoney.credit.common.util.Identities;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100011Vo;
import com.zdmoney.credit.system.service.HttpUtilService;

/**
 * @ClassName:     Bsb100011Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:49:57
 */
@Service
public class Bsb100011Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100011Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    @Autowired
    private HttpUtilService httpUtilService;
    
    @Autowired
    private Identities identities;
    
    /**
     * 查询协议返回流
     * @param bsb100011
     * @return
     * @throws Exception 
     */
    @FuncIdAnnotate(value = "bsb100011", desc = "查询协议", voCls = Bsb100011Vo.class)
    public FuncResult execute(Bsb100011Vo vo) throws Exception {
    	vo.setTxncd("BYXY0011");
        String requestUrl = bsbProperties.getServiceUrl();//包银接口地址
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        /** 调用接口返回数据 **/
    	try {
    		Map<String, Object> commmap = new HashMap<String, Object>();
    		commmap.put("encodg", "UTF-8");//目前只支持“UTF-8”
    		commmap.put("invktm", simpleDateFormat.format(new Date()));
    		commmap.put("txncd", vo.getTxncd());//接口标识(接口唯一标识，接口id，见具体接口)
    		commmap.put("ordrno", identities.generateNo());//每笔交易唯一标识
    		commmap.put("chanltp", "C-00");//PC端申请:C-00 App Android端申请:C-01 App IOS端申请:C-02
    		commmap.put("chanlno", bsbProperties.getChanlno());
    		commmap.put("encrmd", "01");//00：不加密 01：AES加密-目前支持 02：3DES加密
    		commmap.put("signtp", "001");//000：不签名 001：MD5签名-目前采用
    		String vo2json = JSONObject.toJSONString(vo);
    		logger.info("data域json字符串："+ vo2json);
    		//生成签名
    		String enStr = vo2json + "|" + bsbProperties.getMd5SignKey() ;
    		commmap.put("signtx", DigestUtils.md5Hex(enStr.getBytes("UTF-8")));
    		//组装返回map
    		Map<String,Object> params = new HashMap<String,Object>();
    		params.put("comm", commmap);
    		//密文字符串
    		String encryptStr = AesUtil.encryptAES(vo2json, bsbProperties.getAesKey());
    		params.put("data", encryptStr);//data域
    		
    		/** map对象转换为json字符串 **/
    		String jsonData = JSONObject.toJSONString(params);
    		logger.info("request message ："+ jsonData);
    		
    		byte[] buff = HttpUtils.doJsonPostReStream(requestUrl, jsonData);	
    		String strInputStream = Hex.encodeHexString(buff);
    		return FuncResult.success("strInputStream", strInputStream);  		
    	} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return FuncResult.fail("包银接口调用异常！");
		}
    }
}
