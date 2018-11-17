package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100017Vo;

/**
 * @ClassName:     Bsb100017Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:50:12
 */
@Service
public class Bsb100017Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100017Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100017
     * @return
     */
    @FuncIdAnnotate(value = "bsb100017", desc = "提前结清试算", voCls = Bsb100017Vo.class)
    public FuncResult execute(Bsb100017Vo vo) {
    	vo.setTxncd("BYXY0017");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
