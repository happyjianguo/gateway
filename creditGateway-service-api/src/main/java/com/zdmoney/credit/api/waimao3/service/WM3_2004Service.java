package com.zdmoney.credit.api.waimao3.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2004Vo;
import com.zdmoney.credit.wm3Ws.service.Request;

/**
 * 预审批单笔申请接口
 * @author 00236640
 *
 */
@Service
public class WM3_2004Service extends Wm3BusinessService {

    /**
     * 外贸信托预审批单笔申请接口
     * @param vo
     * @return
     * @throws  
     */
    @FuncIdAnnotate(value = "wm3_2004", desc = "预审批单笔申请接口", voCls = WM3_2004Vo.class)
    public FuncResult execute(WM3_2004Vo vo) {
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 预审批单笔申请接口的编号 **/
        request.setTxCode("2004");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 调用外贸预审批单笔申请接口 **/
        return this.process(request);
    }
}
