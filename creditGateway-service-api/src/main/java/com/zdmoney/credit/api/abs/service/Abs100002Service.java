package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100002Vo;

/**
 * 数信放款申请接口
 * @author 00236640
 *
 */
@Service
public class Abs100002Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100002Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信放款申请
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100002", desc = "数信放款申请", voCls = Abs100002Vo.class)
    public FuncResult execute(Abs100002Vo vo) {
        /** 数信放款申请接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/LoanApply";
        return this.execute(vo, requestUrl);
    }
}
