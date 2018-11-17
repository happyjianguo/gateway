package com.zdmoney.credit.framework.vo.wm3.entity;

public class RepayPlanResponseEntity {
	private String pactNo;	//合同号
	private long cnt;//期次 期次为 0，代表整个 合同都有错误问题
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
	public long getCnt() {
		return cnt;
	}
	public void setCnt(long cnt) {
		this.cnt = cnt;
	}
	
}
