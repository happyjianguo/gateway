package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100009Vo;

/**
 * @ClassName:     Bsb100009Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:14:43
 */
@Service
public class Bsb100009Service extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100009Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100001
     * @return
     */
    @FuncIdAnnotate(value = "bsb100009", desc = "包银还款", voCls = Bsb100009Vo.class)
    public FuncResult execute(Bsb100009Vo vo) {
    	vo.setTxncd("BYXY0009");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
