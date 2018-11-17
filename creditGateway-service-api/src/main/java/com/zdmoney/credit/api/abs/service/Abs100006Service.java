package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100006Vo;

/**
 * 数信待回购信息上传接口
 * @author 00236640
 *
 */
@Service
public class Abs100006Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100006Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信待回购信息上传接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100006", desc = "数信待回购信息上传接口", voCls = Abs100006Vo.class)
    public FuncResult execute(Abs100006Vo vo) {
        /** 数信待回购信息上传接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/buybackReq";
        return this.execute(vo, requestUrl);
    }
}
