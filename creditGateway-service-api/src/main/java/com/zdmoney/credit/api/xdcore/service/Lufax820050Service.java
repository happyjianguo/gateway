package com.zdmoney.credit.api.xdcore.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.CoreProperties;
import com.zdmoney.credit.framework.vo.xdcore.input.Lufax820050Vo;

/**
 * 
 * @author YM10112
 *
 */
@Service
public class Lufax820050Service extends XdcoreBusinessService {

    protected static Log logger = LogFactory.getLog(Lufax820050Service.class);

    @Autowired
    private CoreProperties coreProperties;

    /**
     * 陆金所通知正大投资时间接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdcore820050", desc = "陆金所通知正大投资时间接口", voCls = Lufax820050Vo.class)
    public FuncResult execute(Lufax820050Vo vo) {
    	//String requestUrl = "http://172.16.5.182:8081/credit-web" + "/gateway/pushInvestTimeNotify";
        String requestUrl = coreProperties.getServiceUrl() + "/gateway/pushInvestTimeNotify";
        return this.lufaxCoreExecute(vo, requestUrl);
    }
}
