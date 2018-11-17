package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100002Vo;

/**
 * @ClassName:     Bsb100002Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:48:51
 */
@Service
public class Bsb100002Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100002Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100002
     * @return
     */
    @FuncIdAnnotate(value = "bsb100002", desc = "准入查询", voCls = Bsb100002Vo.class)
    public FuncResult execute(Bsb100002Vo vo) {
    	vo.setTxncd("BYXY0002");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
