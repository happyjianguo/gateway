package com.zdmoney.credit.api.xdsignature.service;

import com.zdmoney.credit.api.xdcore.service.XdcoreBusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.SignatureProperties;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100002Vo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/3/13.
 */
@Service
public class Xdsignature100002Service extends XdsignatureBusinessServcie {
    protected static Log logger = LogFactory.getLog(Xdsignature100002Service.class);

    @Autowired
    private SignatureProperties signatureProperties;
    @FuncIdAnnotate(value = "xdsignature100002",desc = "法大大异步接口",voCls = Xdsignature100002Vo.class)
    public FuncResult execute(Xdsignature100002Vo xdsignature100002Vo){
        String url = signatureProperties.getServiceUrl() +"/api/contract/accepAsynchronousSignResult";
        return this.execute(xdsignature100002Vo,url);
    };
}
