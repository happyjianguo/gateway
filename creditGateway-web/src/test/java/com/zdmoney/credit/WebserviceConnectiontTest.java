package com.zdmoney.credit;

import java.rmi.RemoteException;
import java.util.UUID;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.util.Dates;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2004Vo;
import com.zdmoney.credit.wm3Ws.service.InfWsSearchServiceLocator;
import com.zdmoney.credit.wm3Ws.service.InfWsSearchServiceSoapBindingStub;
import com.zdmoney.credit.wm3Ws.service.Request;
import com.zdmoney.credit.wm3Ws.service.Response;

public class WebserviceConnectiontTest {
    
    @Test
    public void test001(){
        InfWsSearchServiceSoapBindingStub stub = null;
        Request request = getRequestVo();
        request.setTxCode("2004");
        WM3_2004Vo vo = new WM3_2004Vo();
        vo.setBrNo("005");
        vo.setCustName("郭睦敏");
        vo.setIdType("430524199010240732");
        vo.setIdNo("0");
        vo.setPrePactNo("201778347565646558");
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        Response response = null;
        InfWsSearchServiceLocator locator = new InfWsSearchServiceLocator();
        try {
            stub = (InfWsSearchServiceSoapBindingStub) locator.getInfWsSearchPort();
            response = stub.search(request);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println(response.getRespCode() + "\t" + response.getRespDesc()+"\t" + response.getContent());
    }

    /**
     * 封装请求参数对象
     * @return
     */
    public static Request getRequestVo(){
        Request request = new Request();
        // 合作机构号、待确定
        request.setBrNo("005");
        // 请求日期
        request.setReqDate(Dates.getDateTime("YYYYMMDD"));
        // 请求时间
        request.setReqTime(Dates.getDateTime("hh:mm:ss"));
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 口令
        request.setToken(uuid);
        // 流水号
        request.setReqSerial(uuid);
        return request;
    }
}
