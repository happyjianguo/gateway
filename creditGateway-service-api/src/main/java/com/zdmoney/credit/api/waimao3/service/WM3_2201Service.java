package com.zdmoney.credit.api.waimao3.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2201Vo;
import com.zdmoney.credit.wm3Ws.service.Request;

/**
 * 还款计划上传接口
 * @author YM10112
 *
 */
@Service
public class WM3_2201Service extends Wm3BusinessService {

    /**
     * 还款计划上传接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "wm3_2201", desc = "还款计划上传", voCls = WM3_2201Vo.class)
    public FuncResult execute(WM3_2201Vo vo) {
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 还款计划上传接口的编号 **/
        request.setTxCode("2201");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 调用还款计划上传接口 **/
        return this.process(request);
    }
}
