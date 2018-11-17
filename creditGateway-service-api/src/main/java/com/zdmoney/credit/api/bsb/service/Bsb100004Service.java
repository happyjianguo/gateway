package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100004Vo;

/**
 * @ClassName:     Bsb100004Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:49:01
 */
@Service
public class Bsb100004Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100004Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100004
     * @return
     */
    @FuncIdAnnotate(value = "bsb100004", desc = "授信审核结果查询", voCls = Bsb100004Vo.class)
    public FuncResult execute(Bsb100004Vo vo) {
    	vo.setTxncd("BYXY0004");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
