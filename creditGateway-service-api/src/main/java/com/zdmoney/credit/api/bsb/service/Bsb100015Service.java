package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100015Vo;

/**
 * @ClassName:     Bsb100015Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:50:12
 */
@Service
public class Bsb100015Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100015Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100015
     * @return
     */
    @FuncIdAnnotate(value = "bsb100015", desc = "影像资料上传", voCls = Bsb100015Vo.class)
    public FuncResult execute(Bsb100015Vo vo) {
    	vo.setTxncd("BYXY0015");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
