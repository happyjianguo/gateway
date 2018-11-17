package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Xdcore100004Vo;

/**
 * 证大核心系统推送待回购信息
 * @author 00236640
 *
 */
@Service
public class Xdcore100004Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Xdcore100004Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 证大核心系统推送待回购信息
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore100004", desc = "证大核心系统推送待回购信息", voCls = Xdcore100004Vo.class)
    public FuncResult execute(Xdcore100004Vo vo) {
        /** 证大核心系统推送待回购信息接口url **/
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/pushBackLoan";
        return this.execute(vo, requestUrl);
    }
}
