package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100008Vo;

/**
 * @ClassName:     Bsb100008Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:47:33
 */
@Service
public class Bsb100008Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100008Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100008
     * @return
     */
    @FuncIdAnnotate(value = "bsb100008", desc = "违约申请", voCls = Bsb100008Vo.class)
    public FuncResult execute(Bsb100008Vo vo) {
    	vo.setTxncd("BYXY0008");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
