package com.zdmoney.credit.api.waimao3.service;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2101Vo;
import com.zdmoney.credit.wm3Ws.service.Request;



/**
 * 外贸3——放款批量申请接口
 * @author 10098  2017年3月16日 上午10:46:53
 */
@Service
public class Wm3_2101Service extends Wm3BusinessService {

	protected static Log log = LogFactory.getLog(Wm3_2101Service.class);
	
	
	@FuncIdAnnotate(value = "wm3_2101", desc = "外贸3放款申请", voCls = WM3_2101Vo.class)
	public FuncResult execute(WM3_2101Vo vo){
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 放款申请接口的编号 **/
        request.setTxCode("2101");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 调用外贸预审批单笔申请接口 **/
        return this.process(request);
	}
}
