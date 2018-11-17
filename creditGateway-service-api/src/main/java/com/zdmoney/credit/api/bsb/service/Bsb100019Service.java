package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100019Vo;


@Service
public class Bsb100019Service extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100019Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100019
     * @return
     */
    @FuncIdAnnotate(value = "bsb100019", desc = "包银还款", voCls = Bsb100019Vo.class)
    public FuncResult execute(Bsb100019Vo vo) {
    	vo.setTxncd("BYXY0019");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
