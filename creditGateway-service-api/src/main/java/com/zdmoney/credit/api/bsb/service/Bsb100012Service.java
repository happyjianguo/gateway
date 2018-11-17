package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100012Vo;

/**
 * @ClassName:     Bsb100012Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:50:02
 */
@Service
public class Bsb100012Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100012Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100012
     * @return
     */
    @FuncIdAnnotate(value = "bsb100012", desc = "获取短信验证码", voCls = Bsb100012Vo.class)
    public FuncResult execute(Bsb100012Vo vo) {
    	vo.setTxncd("BYXY0012");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
