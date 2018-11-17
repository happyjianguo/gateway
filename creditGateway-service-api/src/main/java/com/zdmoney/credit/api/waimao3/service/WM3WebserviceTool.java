package com.zdmoney.credit.api.waimao3.service;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.config.Wm3Properties;
import com.zdmoney.credit.wm3Ws.service.InfWsProcessServiceLocator;
import com.zdmoney.credit.wm3Ws.service.InfWsProcessServiceSoapBindingStub;
import com.zdmoney.credit.wm3Ws.service.InfWsSearchServiceLocator;
import com.zdmoney.credit.wm3Ws.service.InfWsSearchServiceSoapBindingStub;

@Service
public class WM3WebserviceTool implements InitializingBean{
    
    @Autowired
    private Wm3Properties wm3Properties;
    
    private InfWsProcessServiceSoapBindingStub processStub;
    
    private InfWsSearchServiceSoapBindingStub searchStub;

    /**
     * 启动服务的时候、初始化接口调用工具类实例
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        InfWsProcessServiceLocator processLocator = new InfWsProcessServiceLocator();
        processLocator.setInfWsProcessPortEndpointAddress(wm3Properties.getProcessUrl());
        InfWsSearchServiceLocator searchLocator = new InfWsSearchServiceLocator();
        searchLocator.setInfWsSearchPortEndpointAddress(wm3Properties.getSearchUrl());
        try {
            processStub = (InfWsProcessServiceSoapBindingStub) processLocator.getInfWsProcessPort();
            searchStub = (InfWsSearchServiceSoapBindingStub) searchLocator.getInfWsSearchPort();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    public InfWsProcessServiceSoapBindingStub getProcessStub() {
        return processStub;
    }

    public void setProcessStub(InfWsProcessServiceSoapBindingStub processStub) {
        this.processStub = processStub;
    }

    public InfWsSearchServiceSoapBindingStub getSearchStub() {
        return searchStub;
    }

    public void setSearchStub(InfWsSearchServiceSoapBindingStub searchStub) {
        this.searchStub = searchStub;
    }
}
