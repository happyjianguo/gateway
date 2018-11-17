package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100005Vo;

/**
 * @ClassName:     Bsb100005Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:49:09
 */
@Service
public class Bsb100005Service extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100005Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100005
     * @return
     */
    @FuncIdAnnotate(value = "bsb100005", desc = "包银放款接口", voCls = Bsb100005Vo.class)
    public FuncResult execute(Bsb100005Vo vo) {
    	vo.setTxncd("BYXY0005");
        /**包商放款申请接口url **/
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
