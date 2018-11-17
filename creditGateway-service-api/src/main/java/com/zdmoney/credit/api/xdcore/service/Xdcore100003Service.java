package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Xdcore100003Vo;

/**
 * 证大核心系统推送提前清贷结果
 * @author 00236640
 *
 */
@Service
public class Xdcore100003Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Xdcore100003Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 证大核心系统推送提前清贷结果
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore100003", desc = "证大核心系统推送提前清贷结果", voCls = Xdcore100003Vo.class)
    public FuncResult execute(Xdcore100003Vo vo) {
        /** 证大核心系统推送提前清贷结果接口url **/
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/disposeAllRepaymentResult";
        return this.execute(vo, requestUrl);
    }
}
