package com.zdmoney.credit;

import java.net.UnknownHostException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.api.waimao3.service.WM3_2004Service;
import com.zdmoney.credit.api.waimao3.service.WM3_2201Service;
import com.zdmoney.credit.api.waimao3.service.WM3_5102Service;
import com.zdmoney.credit.api.waimao3.service.Wm3BusinessService;
import com.zdmoney.credit.api.waimao3.service.Wm3_2101Service;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2004Vo;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_2201Vo;
import com.zdmoney.credit.wm3Ws.service.InfWsSearchServiceLocator;
import com.zdmoney.credit.wm3Ws.service.InfWsSearchServiceSoapBindingStub;
import com.zdmoney.credit.wm3Ws.service.Request;
import com.zdmoney.credit.wm3Ws.service.Response;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration({"/spring/*.xml"}) //加载配置文件  
@Transactional
public class WebserviceTest {
    
    @Autowired
    private Wm3BusinessService wm3BusinessService;
    
    @Autowired
    private WM3_2004Service wm3_2004Service;
    
    @Autowired
    private WM3_5102Service wm3_5102Service;
 
    @Autowired
    private WM3_2201Service wm3_2201Service;
    @Autowired
    private Wm3_2101Service wm3_2101Service;
    
    @Test
    public void test001(){
        Request request = wm3BusinessService.getRequestVo();
        FuncResult result = wm3BusinessService.search(request);
        String infos = JSONObject.toJSONString(result);
        System.out.println("返回结果是："+ infos);
    }
    
    @Test
    public void test002() throws ServiceException{
        Request request = wm3BusinessService.getRequestVo();
        FuncResult result = wm3BusinessService.process(request);
        String infos = JSONObject.toJSONString(result);
        System.out.println("返回结果是："+ infos);
    }
    
    @Test
    public void test003() throws ServiceException{
    	System.setProperty("java.net.preferIPv4Stack", "true");
        WM3_2004Vo vo = new WM3_2004Vo();
        vo.setBrNo("005");
        vo.setCustName("郭睦敏");
        vo.setIdType("430524199010240732");
        vo.setIdNo("0");
        vo.setPrePactNo("201778347565646558");
        FuncResult result = wm3_2004Service.execute(vo);
        String infos = JSONObject.toJSONString(result);
        System.out.println("返回结果是："+ infos);
    }
    
    @Test
    public void test004() throws ServiceException, UnknownHostException{
    	WM3_2201Vo vo = new WM3_2201Vo();
        FuncResult result = wm3_2201Service.execute(vo);
        String infos = JSONObject.toJSONString(result);
        System.out.println("返回结果是："+ infos);
    }
    
    public static void main(String[] args){
        InfWsSearchServiceSoapBindingStub stub = null;
        Request request = new Request();
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
}
