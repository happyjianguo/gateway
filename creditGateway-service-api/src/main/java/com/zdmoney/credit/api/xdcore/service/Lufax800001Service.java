package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ymkj.base.core.biz.api.message.Response;
import com.ymkj.bms.biz.api.service.master.IBMSChannelExecuter;
import com.ymkj.bms.biz.api.service.sign.ILufaxExecuter;
import com.ymkj.bms.biz.api.vo.request.master.ReqBMSLoanBaseVO;
import com.ymkj.bms.biz.api.vo.request.sign.ReqLufax800001Vo;
import com.ymkj.bms.biz.api.vo.response.sign.ResLufax800001Vo;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.ApsProperties;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Lufax800001Vo;

/**
 * @ClassName:     Lufax800001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月26日 下午3:37:51
 */
@Service
public class Lufax800001Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Lufax800001Service.class);

    private static final String GRANT_SUCCESS_CODE = "010"; //放款成功
    private static final String SHANGJIA_SUCCESS_CODE = "008"; //上架成功
    private static final String TOUZI_SUCCESS_CODE = "009"; //投资成功
    
    private static final String CREDIT_SUCCESS_CODE = "005"; //信审通过
    private static final String CREDIT_FAIL_CODE = "00401"; //信审不通过
    private static final String CREDIT_SUPPLY_CODE = "013"; //信审缺乏材料
    private static final String JINJIAN_RGQX_CODE = "00201"; //申请进件额度不够时的人工取消
    private static final String QRHT_RGQX_CODE = "00601"; //确认合同额度不够时的人工取消
    private static final String FQZ_SUCCESS_CODE = "004"; //反欺诈通过
    private static final String FQZ_FAIL_CODE = "00301"; //反欺诈拒绝
    
    @Autowired
    private CoreProperties coreProperties;
    
    @Autowired
    private ApsProperties apsProperties;
    
    @Autowired
    private IBMSChannelExecuter bmsChannelExecuter;
    
    @Autowired
    private ILufaxExecuter lufaxExecuter;

    /**
     * 进件通知外部接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore800001", desc = "进件通知外部接口", voCls = Lufax800001Vo.class)
    public FuncResult execute(Lufax800001Vo vo) {
    	String requestUrl = "";
    	String notifyCode = vo.getNotify_code();
    	if(GRANT_SUCCESS_CODE.equals(notifyCode)||SHANGJIA_SUCCESS_CODE.equals(notifyCode)||TOUZI_SUCCESS_CODE.equals(notifyCode)){
//    		requestUrl = "http://172.16.6.43:8080/credit-web/gateway/lendingResultNotice";
    		requestUrl = coreProperties.getServiceUrl() + "/gateway/lendingResultNotice";	
    		return this.lufaxCoreExecute(vo, requestUrl);
    	}else if(CREDIT_SUCCESS_CODE.equals(notifyCode)||CREDIT_FAIL_CODE.equals(notifyCode)||CREDIT_SUPPLY_CODE.equals(notifyCode)||JINJIAN_RGQX_CODE.equals(notifyCode)||QRHT_RGQX_CODE.equals(notifyCode)||FQZ_SUCCESS_CODE.equals(notifyCode)||FQZ_FAIL_CODE.equals(notifyCode)){
    	    ReqBMSLoanBaseVO param = new ReqBMSLoanBaseVO();
    	    param.setSysCode("bms");
    	    param.setLoanNo(vo.getApply_no());
//    	    param.setLoanNo(StringUtils.remove(vo.getApply_no(), "ZDJR_"));
    	    Response<Object> response = bmsChannelExecuter.isExistInBMS(param);
    	    if("000000".equals(response.getRepCode())){
    	        if("true".equals(response.getData())){
    	            logger.info("※※※※※※※申请单号-->"+param.getLoanNo()+"将发往【借款系统】");
    	            ReqLufax800001Vo lufax800001Vo = new ReqLufax800001Vo();
    	            lufax800001Vo.setSysCode("bms");
    	            BeanUtils.copyProperties(vo, lufax800001Vo);
    	            Response<ResLufax800001Vo> res = lufaxExecuter.inNoticeExternal(lufax800001Vo);
    	            logger.info("借款系统返回："+res);
    	            JSONObject json = new JSONObject();
    	            json.put("return_code", res.getRepCode());
    	            json.put("return_msg", res.getRepMsg());
    	            logger.info(json.toJSONString());
    	            return FuncResult.success(json);
    	        } else{
    	            logger.info("※※※※※※※申请单号-->"+param.getLoanNo()+"将发往【征审系统】");
    	            requestUrl = apsProperties.getServiceUrl() + "/App/rpc/lufax/inNoticeExternal";
    	            return this.lufaxApsExecute(vo, requestUrl);
    	        }
    	    }else{
    	        return FuncResult.fail("调用借款系统判断债权存在于新老系统失败※※※※※※※※※"+response.getRepCode()+"-->"+response.getRepMsg());
    	    }
    	}else{
    		return FuncResult.fail("调用进件通知外部接口异常！通知结果参数"+vo.getNotify_code()+"无效！");
    	}
    }
}
