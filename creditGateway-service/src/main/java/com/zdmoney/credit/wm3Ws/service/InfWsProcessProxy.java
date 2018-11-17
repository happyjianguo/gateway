package com.zdmoney.credit.wm3Ws.service;


public class InfWsProcessProxy implements InfWsProcess {
  private String _endpoint = null;
  private InfWsProcess infWsProcess = null;
  
  public InfWsProcessProxy() {
    _initInfWsProcessProxy();
  }
  
  public InfWsProcessProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfWsProcessProxy();
  }
  
  private void _initInfWsProcessProxy() {
    try {
      infWsProcess = (new InfWsProcessServiceLocator()).getInfWsProcessPort();
      if (infWsProcess != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infWsProcess)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infWsProcess)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infWsProcess != null)
      ((javax.xml.rpc.Stub)infWsProcess)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public InfWsProcess getInfWsProcess() {
    if (infWsProcess == null)
      _initInfWsProcessProxy();
    return infWsProcess;
  }
  
  public Response process(Request request) throws java.rmi.RemoteException{
    if (infWsProcess == null)
      _initInfWsProcessProxy();
    return infWsProcess.process(request);
  }
  
  
}