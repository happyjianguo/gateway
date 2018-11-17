package com.zdmoney.credit.api.waimao3.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_5104Vo;
import com.zdmoney.credit.wm3Ws.service.Request;

/**
 *  溢缴款账户充值结果查询
 *
 */
@Service
public class WM3_5104Service extends Wm3BusinessService {
	
	/**
     * 溢缴款账户充值结果查询
     * @param vo
     * @return
     * @throws  
     */
    @FuncIdAnnotate(value = "wm3_5104", desc = "溢缴款账户充值结果查询", voCls = WM3_5104Vo.class)
    public FuncResult execute(WM3_5104Vo vo) {
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 溢缴款账户充值结果查询 **/
        request.setTxCode("5104");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 调用溢缴款账户充值结果查询接口 **/
        return this.search(request);
    }


}
