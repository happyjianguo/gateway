package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Lufax800013Vo;

/**
 * @ClassName:     Lufax800013Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月26日 下午3:31:43
 */
@Service
public class Lufax800013Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Lufax800013Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 陆金所反馈对公虚拟户提现结果
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore800013", desc = "陆金所反馈对公虚拟户提现结果", voCls = Lufax800013Vo.class)
    public FuncResult execute(Lufax800013Vo vo) {
//    	String requestUrl = "http://172.16.5.174:8080/credit-web" + "/gateway/withdrawResult";
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/withdrawResult";
        return this.lufaxCoreExecute(vo, requestUrl);
    }
}
