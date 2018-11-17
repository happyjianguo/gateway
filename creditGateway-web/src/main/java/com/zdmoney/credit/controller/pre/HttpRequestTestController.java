package com.zdmoney.credit.controller.pre;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.framework.controller.BaseController;

@Controller
@RequestMapping(value = "/test")
public class HttpRequestTestController extends BaseController {

    @RequestMapping(value = "/timeOutDays1", method = { RequestMethod.POST })
    @ResponseBody
    public String timeOutDays01(HttpServletRequest request, HttpServletResponse response, @RequestParam("listCancel") JSONArray arr) throws Exception {
        logger.info("进入超时取消借款服务，接收到的参数:listCancel=[{}]" + arr.toString());
        Iterator ite = arr.iterator();
        while(ite.hasNext()){
            String json = (String) ite.next();
            JSONObject obj = JSONObject.parseObject(json);
            System.out.println(JSONObject.toJSONString(obj));
        }
        JSONObject json = new JSONObject();
        // json=service.timeOutDays(map.toString());
        return json.toString();
    }
    
    @ResponseBody
    @RequestMapping(value = "/timeOutDays", method = RequestMethod.POST, consumes = "application/json")
    public String timeOutDays02(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> map) {
        String params = JSONObject.toJSONString(map);
        List<Map<String,Object>> paramList = (List<Map<String,Object>>) map.get("listCancel");
        for(Map<String,Object> param: paramList){
            String prePactNo = (String) param.get("prePactNo");
            System.out.println(prePactNo);
        }
        logger.info("进入超时取消借款服务，接收到的参数:" + params);
        return params;
    }
    
    @ResponseBody
    @RequestMapping(value = "/timeOutDays2", method = RequestMethod.POST, consumes = "application/json")
    public String timeOutDays03(HttpServletRequest request, HttpServletResponse response, @RequestBody String jsonData) {
        logger.info("进入超时取消借款服务，接收到的参数:" + jsonData);
        JSONObject json = JSONObject.parseObject(jsonData);
        logger.info("参数信息:"+ JSONObject.toJSONString(json));
        return jsonData;
    }
    
    @ResponseBody
    @RequestMapping(value = "/asyResult", method = RequestMethod.POST, consumes = "application/json")
    public String test01(HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> map) {
        String params = JSONObject.toJSONString(map);
        logger.info("进入推送资产挑选结果接口，接收到的参数:" + params);
        String prePactNo = (String) map.get("prePactNo");
        logger.info("预审批Id:"+ prePactNo);
        return params;
    }
}
