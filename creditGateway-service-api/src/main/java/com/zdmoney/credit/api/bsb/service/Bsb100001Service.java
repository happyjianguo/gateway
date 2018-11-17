package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100001Vo;

/**
 * @ClassName:     Bsb100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:48:46
 */
@Service
public class Bsb100001Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100001Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100001
     * @return
     */
    @FuncIdAnnotate(value = "bsb100001", desc = "放款试算", voCls = Bsb100001Vo.class)
    public FuncResult execute(Bsb100001Vo vo) {
    	vo.setTxncd("BYXY0001");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
