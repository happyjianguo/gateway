package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100006Vo;

/**
 * @ClassName:     Bsb100006Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:47:33
 */
@Service
public class Bsb100006Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100006Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100006
     * @return
     */
    @FuncIdAnnotate(value = "bsb100006", desc = "放款结果查询结果", voCls = Bsb100006Vo.class)
    public FuncResult execute(Bsb100006Vo vo) {
    	vo.setTxncd("BYXY0006");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
