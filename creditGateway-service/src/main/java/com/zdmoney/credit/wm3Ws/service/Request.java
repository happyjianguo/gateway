/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zdmoney.credit.wm3Ws.service;


public class Request  implements java.io.Serializable {
    private java.lang.String brNo;

    private java.lang.String content;

    private java.lang.String reqDate;

    private java.lang.String reqSerial;

    private java.lang.String reqTime;

    private java.lang.String token;

    private java.lang.String txCode;

    public Request() {
    }

    public Request(
           java.lang.String brNo,
           java.lang.String content,
           java.lang.String reqDate,
           java.lang.String reqSerial,
           java.lang.String reqTime,
           java.lang.String token,
           java.lang.String txCode) {
           this.brNo = brNo;
           this.content = content;
           this.reqDate = reqDate;
           this.reqSerial = reqSerial;
           this.reqTime = reqTime;
           this.token = token;
           this.txCode = txCode;
    }


    /**
     * Gets the brNo value for this Request.
     * 
     * @return brNo
     */
    public java.lang.String getBrNo() {
        return brNo;
    }


    /**
     * Sets the brNo value for this Request.
     * 
     * @param brNo
     */
    public void setBrNo(java.lang.String brNo) {
        this.brNo = brNo;
    }


    /**
     * Gets the content value for this Request.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Request.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the reqDate value for this Request.
     * 
     * @return reqDate
     */
    public java.lang.String getReqDate() {
        return reqDate;
    }


    /**
     * Sets the reqDate value for this Request.
     * 
     * @param reqDate
     */
    public void setReqDate(java.lang.String reqDate) {
        this.reqDate = reqDate;
    }


    /**
     * Gets the reqSerial value for this Request.
     * 
     * @return reqSerial
     */
    public java.lang.String getReqSerial() {
        return reqSerial;
    }


    /**
     * Sets the reqSerial value for this Request.
     * 
     * @param reqSerial
     */
    public void setReqSerial(java.lang.String reqSerial) {
        this.reqSerial = reqSerial;
    }


    /**
     * Gets the reqTime value for this Request.
     * 
     * @return reqTime
     */
    public java.lang.String getReqTime() {
        return reqTime;
    }


    /**
     * Sets the reqTime value for this Request.
     * 
     * @param reqTime
     */
    public void setReqTime(java.lang.String reqTime) {
        this.reqTime = reqTime;
    }


    /**
     * Gets the token value for this Request.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this Request.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the txCode value for this Request.
     * 
     * @return txCode
     */
    public java.lang.String getTxCode() {
        return txCode;
    }


    /**
     * Sets the txCode value for this Request.
     * 
     * @param txCode
     */
    public void setTxCode(java.lang.String txCode) {
        this.txCode = txCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brNo==null && other.getBrNo()==null) || 
             (this.brNo!=null &&
              this.brNo.equals(other.getBrNo()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.reqDate==null && other.getReqDate()==null) || 
             (this.reqDate!=null &&
              this.reqDate.equals(other.getReqDate()))) &&
            ((this.reqSerial==null && other.getReqSerial()==null) || 
             (this.reqSerial!=null &&
              this.reqSerial.equals(other.getReqSerial()))) &&
            ((this.reqTime==null && other.getReqTime()==null) || 
             (this.reqTime!=null &&
              this.reqTime.equals(other.getReqTime()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.txCode==null && other.getTxCode()==null) || 
             (this.txCode!=null &&
              this.txCode.equals(other.getTxCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBrNo() != null) {
            _hashCode += getBrNo().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getReqDate() != null) {
            _hashCode += getReqDate().hashCode();
        }
        if (getReqSerial() != null) {
            _hashCode += getReqSerial().hashCode();
        }
        if (getReqTime() != null) {
            _hashCode += getReqTime().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getTxCode() != null) {
            _hashCode += getTxCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.inf.creditapp.app/", "request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
