package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.BYXY0018Vo;

/**
 * @ClassName:     BYXY0018Service.java
 * @Description:   当期提前扣款结果通知接口
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年2月9日 下午2:15:17
 */
@Service
public class BYXY0018Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(BYXY0018Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 还款结果通知 for 提前还款申请|提前结清代偿
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "BYXY0018", desc = "还款结果通知", voCls = BYXY0018Vo.class)
    public FuncResult execute(BYXY0018Vo vo) {
    	/*String requestUrl = "http://172.16.5.182:8081/credit-web" + "/gateway/advanceRepayResultNotify";*/
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/advanceRepayResultNotify";
        return this.execute2(vo, requestUrl);
    }
}
