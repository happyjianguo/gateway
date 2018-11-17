package com.zdmoney.credit.api.bsb.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.serializer.CustomBigDecimalSerializer;
import com.zdmoney.credit.common.util.AesUtil;
import com.zdmoney.credit.common.util.Identities;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;
import com.zdmoney.credit.system.service.HttpUtilService;

/**
 * @description: 
 * @author: 柳云华
 * @version: 1.0
 * @createdate: 2016年12月23日 上午10:26:02
 * Modification  History:
 *    Date        Author        Version        Description
 * -----------------------------------------------------------------------------------
 * 2016年12月23日          柳云华                           1.0             初始化
 */
@Service
public class BsbBusinessService extends BusinessService {
	
	private static final Log LOGGER = LogFactory.getLog(BsbBusinessService.class);
    
    @Autowired
    private HttpUtilService httpUtilService;
    
    @Autowired
    private BsbProperties bsbProperties;
    
    @Autowired
    private Identities identities;
    
    /**
     * @param vo
     * @param url
     * @param txncd 
     * 			接口标识(接口唯一标识，接口id，见具体接口)
     * @param ordrno 
     * 			每笔交易唯一标识（包银消费发起通知交易则为包银消费流水，格式一样）例如：jsq_20151010131222000001020202等
     * @return
     */
    public FuncResult execute(BsbBaseParamVo vo, String url) {
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        /** 调用接口返回数据 **/
        String result = null;
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
			String vo2json = JSONObject.toJSONString(vo,new CustomBigDecimalSerializer());
			LOGGER.info("☆☆☆☆☆☆☆☆☆☆data域json字符串："+ vo2json);
			//生成签名
			String enStr = vo2json + "|" + bsbProperties.getMd5SignKey() ;
			commmap.put("signtx", DigestUtils.md5Hex(enStr.getBytes("UTF-8")));
			//组装返回map
			Map<String,Object> params = new HashMap<String,Object>();
			params.put("comm", commmap);//comm域
			LOGGER.info("☆☆☆☆☆☆☆☆☆☆comm域json字符串："+ JSONObject.toJSONString(commmap));
			//密文字符串
			String encryptStr = AesUtil.encryptAES(vo2json, bsbProperties.getAesKey());
			params.put("data", encryptStr);//data域
			
			/** map对象转换为json字符串 **/
			String jsonData = JSONObject.toJSONString(params);
			LOGGER.info("※※※※※※※※※※※※※※※※※※※※request message is convert  successfully, and readay send to BSB system※※※※※※※※※※※※※※※※※※※※");
			/** 调用包银接口 **/
			result = httpUtilService.postToBsb(url, jsonData);
			if(!Strings.isEmpty(result)){
				LOGGER.info("※※※※※※※※※※※※※※※※※※※※response message is received successfully※※※※※※※※※※※※※※※※※※※※");
			}
			if(Strings.isEmpty(result)){
			    return FuncResult.fail("调用包银接口异常！");
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return FuncResult.fail("包银接口调用异常！");
		}
        JSONObject last = new JSONObject();
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if(!json.containsKey("data")){
            return FuncResult.fail("包银接口返回结果参数异常！");
        }
        last.put("comm", json.getJSONObject("comm"));
        String dataStr = json.getString("data");
        try {
			String decryptStr = AesUtil.decryptAES(dataStr, bsbProperties.getAesKey());
			JSONObject decryptObject = JSONObject.parseObject(decryptStr);
			last.put("data", decryptObject);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return FuncResult.fail("AES解析密文异常！");
		}
        return FuncResult.success("正常", last);
    }
}
