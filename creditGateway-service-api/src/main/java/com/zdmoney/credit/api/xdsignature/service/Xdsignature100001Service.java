package com.zdmoney.credit.api.xdsignature.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.xdcore.service.XdcoreBusinessService;
import com.zdmoney.credit.callinter.HttpUtils;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.json.JSONUtil;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.SignatureProperties;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100001Vo;
import com.zdmoney.credit.framework.vo.xdsignature.output.Xdsignature100001OutputVo;
import com.zdmoney.credit.system.service.HttpUtilService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/3/9.
 */
@Service
public class Xdsignature100001Service extends XdsignatureBusinessServcie {
    protected static Log logger = LogFactory.getLog(Xdsignature100001Service.class);

    @Autowired
    private SignatureProperties signatureProperties;
    @Autowired
    private HttpUtilService httpUtilService;


    /**
     * 证大核心电子签章系统处理法大大手动签章同步响应
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "xdsignature100001", desc = "证大核心电子签章系统接收法大大手动签章的同步响应结果", voCls = Xdsignature100001Vo.class)
    public FuncResult execute(Xdsignature100001Vo vo) {
        /** 证大核心电子系统处理法大大手动签章同步返回的url **/
        String url = signatureProperties.getServiceUrl() +"/api/contract/accepSynchronousExtsignResult";
        /** 调用接口返回数据 **/
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用信贷核心电子签章系统接口 **/
        String html =  HttpUtils.doRedirectJsonPost(url, jsonData);
        Xdsignature100001OutputVo outputVo =new Xdsignature100001OutputVo();
        outputVo.setHtml(html);
        String result = JSONUtil.beanToJson(outputVo);
        JSONObject jsonObject = JSON.parseObject(result);
        return FuncResult.success("正常", jsonObject);
    }
}
