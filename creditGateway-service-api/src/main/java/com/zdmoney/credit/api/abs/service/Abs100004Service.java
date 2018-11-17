package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100004Vo;

/**
 * 数信息费减免申请接口
 * @author 00236640
 *
 */
@Service
public class Abs100004Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100004Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信息费减免申请接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100004", desc = "数信息费减免申请接口", voCls = Abs100004Vo.class)
    public FuncResult execute(Abs100004Vo vo) {
        /** 数信息费减免申请接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/feeReduceApply";
        return this.execute(vo, requestUrl);
    }
}
