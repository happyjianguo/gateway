package com.zdmoney.credit.api.waimao3.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2312Vo;
import com.zdmoney.credit.wm3Ws.service.Request;

@Service
public class WM3_2312Service extends Wm3BusinessService  {
	/**
	 * 线下实收[2312]
     * @param vo
     *  
     */
    @FuncIdAnnotate(value = "wm3_2312", desc = "线下实收", voCls = WM3_2312Vo.class)
    public FuncResult execute(WM3_2312Vo vo) {
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 结果查询 **/
        request.setTxCode("2312");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 业务查询接口 **/
        return this.process(request);
    }
	

}
