package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.BYXY0016Vo;

/**
 * @ClassName:     BYXY0016Service.java
 * @Description:   包银放款结果通知接口
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:00:28
 */
@Service
public class BYXY0016Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(BYXY0016Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 包银放款结果通知
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "BYXY0016", desc = "包银放款结果通知", voCls = BYXY0016Vo.class)
    public FuncResult execute(BYXY0016Vo vo) {
        /*String requestUrl = "http://172.16.5.182:8081/credit-web" + "/gateway/loanResultNotify";*/
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/loanResultNotify";
        return this.execute2(vo, requestUrl);
    }
}
