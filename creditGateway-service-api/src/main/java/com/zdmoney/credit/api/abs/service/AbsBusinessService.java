package com.zdmoney.credit.api.abs.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.util.BeanUtils;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.system.service.HttpUtilService;

@Service
public class AbsBusinessService extends BusinessService {
    
    @Autowired
    private HttpUtilService httpUtilService;
    
    /**
     * 调用数信接口通用方法
     * @param vo
     * @param url
     * @return
     */
    public FuncResult execute(AbsBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        /** 实体bean对象转换为map对象 **/
        Map<String, Object> map = BeanUtils.toMap(vo);
        /** 把参数包裹在content中 **/
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("content", map);
        /** map对象转换为json字符串 **/
        String jsonData = JSONObject.toJSONString(params/*,SerializerFeature.SortField*/);
        /** 调用数信接口 **/
        result = httpUtilService.post(url, jsonData);
        if(Strings.isEmpty(result)){
            return FuncResult.fail("调用数信接口异常！");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if(!json.containsKey("status")){
            return FuncResult.fail("数信接口返回结果参数异常！");
        }
        /*String status = json.getString("status");
        if("FAIL".equals(status)){
            return FuncResult.fail(json.getString("msg"));
        }*/
        return FuncResult.success("正常", json);
    }
}
