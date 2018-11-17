package com.zdmoney.credit.api.waimao3.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2501Vo;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_5101Vo;
import com.zdmoney.credit.wm3Ws.service.Request;
/**
 * 还款账号单笔维护
 * @author 10098  2017年5月24日 上午10:58:08
 */
@Service
public class WM3_2501Service extends Wm3BusinessService {
	
	/**
     * 还款账号单笔维护接口
     * @param vo
     * @return
     * @throws  
     */
    @FuncIdAnnotate(value = "wm3_2501", desc = "还款账号单笔维护", voCls = WM3_2501Vo.class)
    public FuncResult execute(WM3_2501Vo vo) {
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 还款账号单笔维护接口 **/
        request.setTxCode("2501");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 还款账号单笔维护接口 **/
        return this.process(request);
    }

}
