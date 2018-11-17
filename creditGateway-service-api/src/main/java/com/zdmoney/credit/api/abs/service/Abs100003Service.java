package com.zdmoney.credit.api.abs.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.AbsProperties;
import com.zdmoney.credit.framework.vo.abs.input.Abs100003Vo;

/**
 * 数信单据撤销接口
 * @author 00236640
 *
 */
@Service
public class Abs100003Service extends AbsBusinessService {

    protected static Log logger = LogFactory.getLog(Abs100003Service.class);

    @Autowired
    private AbsProperties absProperties;
    
    /**
     * 数信单据撤销接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "abs100003", desc = "数信单据撤销接口", voCls = Abs100003Vo.class)
    public FuncResult execute(Abs100003Vo vo) {
        /** 数信单据撤销接口url **/
        String requestUrl = absProperties.getServiceUrl() + "/shared/absShared/api/cancelBiz";
        return this.execute(vo, requestUrl);
    }
}
