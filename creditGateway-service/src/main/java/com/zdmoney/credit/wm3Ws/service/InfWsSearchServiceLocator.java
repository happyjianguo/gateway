/**
 * InfWsSearchServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zdmoney.credit.wm3Ws.service;


public class InfWsSearchServiceLocator extends org.apache.axis.client.Service implements InfWsSearchService {

    public InfWsSearchServiceLocator() {
    }


    public InfWsSearchServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InfWsSearchServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

	// Use to get a proxy class for InfWsSearchPort
    //private java.lang.String InfWsSearchPort_address = "http://10.7.101.39:80/mfs/services/searchService";
    private java.lang.String InfWsSearchPort_address;

    public java.lang.String getInfWsSearchPortAddress() {
        return InfWsSearchPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InfWsSearchPortWSDDServiceName = "InfWsSearchPort";

    public java.lang.String getInfWsSearchPortWSDDServiceName() {
        return InfWsSearchPortWSDDServiceName;
    }

    public void setInfWsSearchPortWSDDServiceName(java.lang.String name) {
        InfWsSearchPortWSDDServiceName = name;
    }

    public InfWsSearch getInfWsSearchPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InfWsSearchPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInfWsSearchPort(endpoint);
    }

    public InfWsSearch getInfWsSearchPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            InfWsSearchServiceSoapBindingStub _stub = new InfWsSearchServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getInfWsSearchPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInfWsSearchPortEndpointAddress(java.lang.String address) {
        InfWsSearchPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (InfWsSearch.class.isAssignableFrom(serviceEndpointInterface)) {
                InfWsSearchServiceSoapBindingStub _stub = new InfWsSearchServiceSoapBindingStub(new java.net.URL(InfWsSearchPort_address), this);
                _stub.setPortName(getInfWsSearchPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InfWsSearchPort".equals(inputPortName)) {
            return getInfWsSearchPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.inf.creditapp.app/", "InfWsSearchService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.inf.creditapp.app/", "InfWsSearchPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InfWsSearchPort".equals(portName)) {
            setInfWsSearchPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
