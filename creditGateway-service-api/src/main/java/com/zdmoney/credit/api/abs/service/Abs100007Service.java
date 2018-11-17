package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100007Vo;

/**
 * 数信对公还款接口
 * @author 00236640
 *
 */
@Service
public class Abs100007Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100007Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信对公还款接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100007", desc = "数信对公还款接口", voCls = Abs100007Vo.class)
    public FuncResult execute(Abs100007Vo vo) {
        /** 数信对公还款接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/paidinCapital";
        return this.execute(vo, requestUrl);
    }
}
