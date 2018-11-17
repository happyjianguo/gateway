package com.zdmoney.credit.api.aps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;
import com.zdmoney.credit.system.service.HttpUtilService;

@Service
public class ApsBusinessService extends BusinessService {
    
    @Autowired
    private HttpUtilService httpUtilService;

    /**
     * 调用征审系统接口通用方法
     * @param vo
     * @param url
     * @return
     */
    public FuncResult execute(ApsBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        /** 实体对象转换成json字符串 **/
        String jsonData = JSONObject.toJSONString(vo);
        /** json字符串转换成map对象 **/
        //Map<String, Object> params = JSONObject.parseObject(jsonData);
        /** 调用征审系统接口 **/
        result = httpUtilService.postToAps(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用征审系统接口异常！");
        }
        /** 返回结果转码操作 **/
        //result = UrlUtil.paramDecoder(result);
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        /*if(!json.containsKey("status")){
            return FuncResult.fail("征审系统接口返回结果参数异常！");
        }*/
        return FuncResult.success("正常", json);
    }
    
    /**
     * 包银调用信贷核心系统接口通用方法
     * @param vo
     * @param url
     * @return
     */
    public FuncResult execute2(ApsBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用信贷核心接口 **/
        result = httpUtilService.postToAps(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用征审系统接口异常！","响应报文为空");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        /** 返回状态码，000000是正常，其余都是异常 **/
        String resCode = json.getString("code");
        String resMsg = json.getString("msg");
        if (!"000000".equals(resCode)) {
            return FuncResult.fail(resCode,resMsg);
        }
        return FuncResult.success(resCode, resMsg);
    }
}
