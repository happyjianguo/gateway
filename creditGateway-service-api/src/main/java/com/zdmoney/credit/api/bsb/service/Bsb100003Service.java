package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100003Vo;

/**
 * @ClassName:     Bsb100003Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:48:56
 */
@Service
public class Bsb100003Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100003Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100003
     * @return
     */
    @FuncIdAnnotate(value = "bsb100003", desc = "预授信", voCls = Bsb100003Vo.class)
    public FuncResult execute(Bsb100003Vo vo) {
    	vo.setTxncd("BYXY0003");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
