package com.zdmoney.credit.framework.vo.bsb.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class AgentCustBankcard {
	
	/** 银行卡号*/
	@NotEmpty(message = "银行卡号不能为空！")
	private String bankCardNo;
	
	/** 银行卡类型*/
	@NotEmpty(message = "银行卡类型不能为空！")
	private String bankCardType;
	
	/** 客户姓名*/
	@NotEmpty(message = "客户姓名不能为空！")
	private String custName;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 证件号码*/
	@NotEmpty(message = "证件号码不能为空！")
	private String idNo;
	
	/** 银行卡预留手机号码*/
	@NotEmpty(message = "银行卡预留手机号码不能为空！")
	private String mobileNo;

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	

}
