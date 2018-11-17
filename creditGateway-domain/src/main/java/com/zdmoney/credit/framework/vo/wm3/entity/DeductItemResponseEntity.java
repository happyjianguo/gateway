package com.zdmoney.credit.framework.vo.wm3.entity;

public class DeductItemResponseEntity {
	private String pactNo;	//合同号
	private String dealDesc;//错误描述
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getDealDesc() {
		return dealDesc;
	}
	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}
}
