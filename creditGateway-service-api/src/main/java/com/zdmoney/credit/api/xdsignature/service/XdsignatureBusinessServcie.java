package com.zdmoney.credit.api.xdsignature.service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.xdsignature.input.XdsignatureBaseParamVo;
import com.zdmoney.credit.system.service.HttpUtilService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ym10094 on 2017/3/10.
 */
public class XdsignatureBusinessServcie extends BusinessService {
    @Autowired
    private HttpUtilService httpUtilService;
    /**
     * 调用信贷核心电子签章系统接口通用方法
     * @param vo
     * @param url
     * @return
     */
    public FuncResult execute(XdsignatureBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用信贷核心电子签章系统接口 **/
        result = httpUtilService.postToXdsignature(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用信贷核心电子签章系统接口异常！");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if (!json.containsKey("resCode")) {
            return FuncResult.fail("信贷核心电子签章系统接口返回结果参数异常！");
        }
        /** 核心电子签章接口返回具体结果信息 **/
        Object attachment = json.get("attachment");
        return FuncResult.success("正常", attachment);
    }
}
