package com.zdmoney.credit.api.xdcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Lufax800021Vo;

/**
 * @ClassName:     Lufax800021Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2018年1月16日 下午3:27:37
 */
@Service
public class Lufax800021Service extends XdcoreBusinessService {

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 陆金所实时放款结果通知接口（800021）
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore800021", desc = "实时放款结果通知接口（800021）", voCls = Lufax800021Vo.class)
    public FuncResult execute(Lufax800021Vo vo) {
        String requestUrl = coreProperties.getServiceUrl() + "/lufax/loanResultNotify";
        return this.lufaxCoreExecute(vo, requestUrl);
    }
}
