package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100013Vo;

/**
 * @ClassName:     Bsb100013Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:50:07
 */
@Service
public class Bsb100013Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100013Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100013
     * @return
     */
    @FuncIdAnnotate(value = "bsb100013", desc = "银行卡鉴权", voCls = Bsb100013Vo.class)
    public FuncResult execute(Bsb100013Vo vo) {
    	vo.setTxncd("BYXY0013");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
