package com.zdmoney.credit.api.waimao3.service;

import java.rmi.RemoteException;
import java.util.UUID;

import javax.xml.rpc.ServiceException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.util.Dates;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.wm3Ws.service.Request;
import com.zdmoney.credit.wm3Ws.service.Response;

@Service
public class Wm3BusinessService extends BusinessService {
    
    protected static Log logger = LogFactory.getLog(Wm3BusinessService.class);
    
    @Autowired
    private WM3WebserviceTool wm3WebserviceTool;
    
    /**
     * 调用外贸3接口通用方法（业务提交接口）
     * @param request
     * @return
     * @throws ServiceException 
     */
    public FuncResult process(Request request) {
        Response response = null;
        logger.info("接口输入参数："+ JSONObject.toJSONString(request));
        if(null == wm3WebserviceTool){
            return FuncResult.fail("接口工具类初始化异常！");
        }
        try {
            response = wm3WebserviceTool.getProcessStub().process(request);
        } catch (RemoteException e) {
            logger.error("调用外贸信托业务提交接口异常！，异常信息：" + e.getMessage());
            return FuncResult.fail("调用外贸信托业务提交接口异常！，异常信息：" + e.getMessage());
        }
        if(null == response){
            return FuncResult.fail("调用外贸信托业务提交接口异常！返回结果参数为空。");
        }
        logger.info("接口返回结果："+ JSONObject.toJSONString(response));
        return FuncResult.success("正常", response);
    }
    
    /**
     * 调用外贸3接口通用方法（结果查询接口）
     * @param request
     * @return
     */
    public FuncResult search(Request request) {
        Response response = null;
        logger.info("接口输入参数："+ JSONObject.toJSONString(request));
        if(null == wm3WebserviceTool){
            return FuncResult.fail("接口工具类初始化异常！");
        }
        try {
            response = wm3WebserviceTool.getSearchStub().search(request);
        } catch (RemoteException e) {
            logger.error("调用外贸信托结果查询接口异常！，异常信息：" + e.getMessage());
            return FuncResult.fail("调用外贸信托结果查询接口异常！，异常信息：" + e.getMessage());
        }
        if(null == response){
            return FuncResult.fail("调用外贸信托结果查询接口异常！返回结果参数为空。");
        }
        logger.info("接口返回结果："+ JSONObject.toJSONString(response));
        return FuncResult.success("正常", response);
    }
    
    /**
     * 封装请求参数对象
     * @return
     */
    public Request getRequestVo(){
        Request request = new Request();
        // 合作机构号、待确定
        request.setBrNo(WM3BaseParamVo.SYS_SOURCE_WM3);
        // 请求日期
        request.setReqDate(Dates.getDateTime("YYYYMMDD"));
        // 请求时间
        request.setReqTime(Dates.getDateTime("hh:mm:ss"));
        // 口令
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        request.setToken(uuid);
        // 流水号
        request.setReqSerial(String.valueOf(System.currentTimeMillis()));
        return request;
    }
}
