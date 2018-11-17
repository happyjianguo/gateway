package com.zdmoney.credit.wm3Ws.service;


public class InfWsSearchProxy implements InfWsSearch {
  private String _endpoint = null;
  private InfWsSearch infWsSearch = null;
  
  public InfWsSearchProxy() {
    _initInfWsSearchProxy();
  }
  
  public InfWsSearchProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfWsSearchProxy();
  }
  
  private void _initInfWsSearchProxy() {
    try {
      infWsSearch = (new InfWsSearchServiceLocator()).getInfWsSearchPort();
      if (infWsSearch != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infWsSearch)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infWsSearch)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infWsSearch != null)
      ((javax.xml.rpc.Stub)infWsSearch)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public InfWsSearch getInfWsSearch() {
    if (infWsSearch == null)
      _initInfWsSearchProxy();
    return infWsSearch;
  }
  
  public Response search(Request request) throws java.rmi.RemoteException{
    if (infWsSearch == null)
      _initInfWsSearchProxy();
    return infWsSearch.search(request);
  }
  
  
}