package com.zdmoney.credit.framework.vo.wm3.entity;

public class ResponseListWm3Entiy {
	private String batNo;// 批次号
	private String pactNo;// 合同编号
	private String dealSts;// 处理状态
	private String dealDesc;// 处理说明

	public String getBatNo() {
		return batNo;
	}

	public void setBatNo(String batNo) {
		this.batNo = batNo;
	}

	public String getPactNo() {
		return pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getDealSts() {
		return dealSts;
	}

	public void setDealSts(String dealSts) {
		this.dealSts = dealSts;
	}

	public String getDealDesc() {
		return dealDesc;
	}

	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}

}
