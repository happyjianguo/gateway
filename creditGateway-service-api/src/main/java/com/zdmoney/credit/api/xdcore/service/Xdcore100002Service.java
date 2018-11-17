package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Xdcore100002Vo;

/**
 * 证大核心系统推送息费减免结果
 * @author 00236640
 *
 */
@Service
public class Xdcore100002Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Xdcore100002Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 证大核心系统推送息费减免结果
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore100002", desc = "证大核心系统推送息费减免结果", voCls = Xdcore100002Vo.class)
    public FuncResult execute(Xdcore100002Vo vo) {
        /** 证大核心系统推送息费减免结果接口url **/
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/pushFeeReduceApplyResult";
        return this.execute(vo, requestUrl);
    }
}
