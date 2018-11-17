package com.zdmoney.credit.framework.vo.lufax.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerBaseListEntity {
	/**客户类型*/
    @NotEmpty(message = "客户类型不能为空！")
    private String CUST_TYPE;
    
    /**客户姓名*/
    @NotEmpty(message = "客户姓名不能为空！")
    private String CUST_NAME;
    
    /**证件类型*/
    @NotEmpty(message = "证件类型不能为空！")
    private String IDENTITY_TYPE;
    
    /**证件到期日*/
    @NotEmpty(message = "证件到期日不能为空！")
    private String CREDIT_CERT_END_TIME;
    
    /**证件编号*/
    @NotEmpty(message = "证件编号不能为空！")
    private String IDENTITY;
    
    /**手机号码*/
    @NotEmpty(message = "手机号码不能为空！")
    private String mobile;
    
    /**性别*/
    @NotEmpty(message = "性别不能为空！")
    private String SEX;
    
    /**出生年月*/
    @NotEmpty(message = "出生年月不能为空！")
    private String BIRTHDAY;
    
    /**教育状况*/
    @NotEmpty(message = "教育状况不能为空！")
    private String EDUCATION;
    
    /**婚姻状况*/
    @NotEmpty(message = "婚姻状况不能为空！")
    private String MARITAL_STATUS;
    
    /**是否有工作*/
    @NotEmpty(message = "是否有工作不能为空！")
    private String IS_WORK;
    
    /**年龄*/
    @NotEmpty(message = "年龄不能为空！")
    private String AGE;
    
    /**户口所在地*/
    @NotEmpty(message = "户口所在地不能为空！")
    private String RESIDENCE_AREA;

    @JSONField(name = "CUST_TYPE")
	public String getCUST_TYPE() {
		return CUST_TYPE;
	}

	public void setCUST_TYPE(String cUST_TYPE) {
		CUST_TYPE = cUST_TYPE;
	}

	@JSONField(name = "CUST_NAME")
	public String getCUST_NAME() {
		return CUST_NAME;
	}

	public void setCUST_NAME(String cUST_NAME) {
		CUST_NAME = cUST_NAME;
	}

	@JSONField(name = "IDENTITY_TYPE")
	public String getIDENTITY_TYPE() {
		return IDENTITY_TYPE;
	}

	public void setIDENTITY_TYPE(String iDENTITY_TYPE) {
		IDENTITY_TYPE = iDENTITY_TYPE;
	}

	@JSONField(name = "IDENTITY")
	public String getIDENTITY() {
		return IDENTITY;
	}

	public void setIDENTITY(String iDENTITY) {
		IDENTITY = iDENTITY;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JSONField(name = "SEX")
	public String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}

	@JSONField(name = "BIRTHDAY")
	public String getBIRTHDAY() {
		return BIRTHDAY;
	}

	public void setBIRTHDAY(String bIRTHDAY) {
		BIRTHDAY = bIRTHDAY;
	}
	
	@JSONField(name = "EDUCATION")
	public String getEDUCATION() {
		return EDUCATION;
	}

	public void setEDUCATION(String eDUCATION) {
		EDUCATION = eDUCATION;
	}

	@JSONField(name = "MARITAL_STATUS")
	public String getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}

	public void setMARITAL_STATUS(String mARITAL_STATUS) {
		MARITAL_STATUS = mARITAL_STATUS;
	}

	@JSONField(name = "IS_WORK")
	public String getIS_WORK() {
		return IS_WORK;
	}

	public void setIS_WORK(String iS_WORK) {
		IS_WORK = iS_WORK;
	}

	@JSONField(name = "AGE")
	public String getAGE() {
		return AGE;
	}

	public void setAGE(String aGE) {
		AGE = aGE;
	}

	@JSONField(name = "RESIDENCE_AREA")
	public String getRESIDENCE_AREA() {
		return RESIDENCE_AREA;
	}

	public void setRESIDENCE_AREA(String rESIDENCE_AREA) {
		RESIDENCE_AREA = rESIDENCE_AREA;
	}

	@JSONField(name = "CREDIT_CERT_END_TIME")
	public String getCREDIT_CERT_END_TIME() {
		return CREDIT_CERT_END_TIME;
	}

	public void setCREDIT_CERT_END_TIME(String cREDIT_CERT_END_TIME) {
		CREDIT_CERT_END_TIME = cREDIT_CERT_END_TIME;
	}
    
}
