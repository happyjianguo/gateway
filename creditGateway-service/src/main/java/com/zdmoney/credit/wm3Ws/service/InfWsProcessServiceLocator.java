/**
 * InfWsProcessServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zdmoney.credit.wm3Ws.service;


public class InfWsProcessServiceLocator extends org.apache.axis.client.Service implements InfWsProcessService {

    public InfWsProcessServiceLocator() {
    }


    public InfWsProcessServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InfWsProcessServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }
    

    // Use to get a proxy class for InfWsProcessPort
    //private java.lang.String InfWsProcessPort_address = "http://10.7.101.39/mfs/services/creditService";
    private java.lang.String InfWsProcessPort_address;

    public java.lang.String getInfWsProcessPortAddress() {
        return InfWsProcessPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InfWsProcessPortWSDDServiceName = "InfWsProcessPort";

    public java.lang.String getInfWsProcessPortWSDDServiceName() {
        return InfWsProcessPortWSDDServiceName;
    }

    public void setInfWsProcessPortWSDDServiceName(java.lang.String name) {
        InfWsProcessPortWSDDServiceName = name;
    }

    public InfWsProcess getInfWsProcessPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InfWsProcessPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInfWsProcessPort(endpoint);
    }

    public InfWsProcess getInfWsProcessPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            InfWsProcessServiceSoapBindingStub _stub = new InfWsProcessServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getInfWsProcessPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInfWsProcessPortEndpointAddress(java.lang.String address) {
        InfWsProcessPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (InfWsProcess.class.isAssignableFrom(serviceEndpointInterface)) {
                InfWsProcessServiceSoapBindingStub _stub = new InfWsProcessServiceSoapBindingStub(new java.net.URL(InfWsProcessPort_address), this);
                _stub.setPortName(getInfWsProcessPortWSDDServiceName());
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
        if ("InfWsProcessPort".equals(inputPortName)) {
            return getInfWsProcessPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.inf.creditapp.app/", "InfWsProcessService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.inf.creditapp.app/", "InfWsProcessPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InfWsProcessPort".equals(portName)) {
            setInfWsProcessPortEndpointAddress(address);
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
