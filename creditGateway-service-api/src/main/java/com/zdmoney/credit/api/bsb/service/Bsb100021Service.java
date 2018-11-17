package com.zdmoney.credit.api.bsb.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.BsbProperties;
import com.zdmoney.credit.framework.vo.bsb.input.Bsb100021Vo;

/**
 * @ClassName:     Bsb100021Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:50:12
 */
@Service
public class Bsb100021Service  extends BsbBusinessService {

    protected static Log logger = LogFactory.getLog(Bsb100021Service.class);

    @Autowired
    private BsbProperties bsbProperties;
    
    /**
     * @param bsb100017
     * @return
     */
    @FuncIdAnnotate(value = "bsb100021", desc = "预授信结果查询接口", voCls = Bsb100021Vo.class)
    public FuncResult execute(Bsb100021Vo vo) {
    	vo.setTxncd("BYXY0021");
        String requestUrl = bsbProperties.getServiceUrl();
        return this.execute(vo, requestUrl);
    }
}
