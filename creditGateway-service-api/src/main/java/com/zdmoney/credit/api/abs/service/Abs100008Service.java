package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100008Vo;

/**
 * 数信扣款结果上传接口
 * @author 00236640
 *
 */
@Service
public class Abs100008Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100008Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信扣款结果上传接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100008", desc = "数信扣款结果上传接口", voCls = Abs100008Vo.class)
    public FuncResult execute(Abs100008Vo vo) {
        /** 数信扣款结果上传接口url **/ 
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/deductResultReceive";
        return this.execute(vo, requestUrl);
    }
}
