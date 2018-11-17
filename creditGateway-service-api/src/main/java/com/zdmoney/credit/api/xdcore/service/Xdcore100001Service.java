package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Xdcore100001Vo;

/**
 * 证大核心系统推送放款结果接口
 * @author 00236640
 *
 */
@Service
public class Xdcore100001Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Xdcore100001Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 证大核心系统推送放款结果接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore100001", desc = "证大核心系统推送放款结果接口", voCls = Xdcore100001Vo.class)
    public FuncResult execute(Xdcore100001Vo vo) {
        /** 证大核心系统推送放款结果接口url **/
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/disposeFinanceGrantResult";
        return this.execute(vo, requestUrl);
    }
}
