package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Lufax800011Vo;

/**
 * @ClassName:     Lufax800011Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月26日 下午3:27:37
 */
@Service
public class Lufax800011Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Lufax800011Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 陆金所反馈对公虚拟户充值结果
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore800011", desc = "陆金所反馈对公虚拟户充值结果", voCls = Lufax800011Vo.class)
    public FuncResult execute(Lufax800011Vo vo) {
//    	String requestUrl = "http://172.16.5.174:8080/credit-web" + "/gateway/rechargeResult";
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/rechargeResult";
        return this.lufaxCoreExecute(vo, requestUrl);
    }
}
