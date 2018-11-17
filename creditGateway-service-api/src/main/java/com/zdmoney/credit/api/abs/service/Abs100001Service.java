package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100001Vo;

/**
 * 单笔资产挑选接口
 * @author 00236640
 *
 */
@Service
public class Abs100001Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100001Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 单笔资产挑选接口
     * @param abs100001Vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100001", desc = "单笔资产挑选", voCls = Abs100001Vo.class)
    public FuncResult execute(Abs100001Vo vo) {
        /** 数信单笔资产挑选接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/preLoanApply";
        return this.execute(vo, requestUrl);
    }
}
