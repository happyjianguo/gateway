package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100005Vo;

/**
 * 数信提前清贷申请接口
 * @author 00236640
 *
 */
@Service
public class Abs100005Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100005Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信提前清贷申请接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100005", desc = "数信提前清贷申请接口", voCls = Abs100005Vo.class)
    public FuncResult execute(Abs100005Vo vo) {
        /** 数信提前清贷申请接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/aheadRepayApply";
        return this.execute(vo, requestUrl);
    }
}
