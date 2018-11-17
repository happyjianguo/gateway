package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;

public class RepayPlanListEntity {
	
	private String pactNo;//合同号
	private Integer cnt;//期次
	private String endDate;//账单日
	private BigDecimal totalAmt;//期供金额
	private BigDecimal prcpAmt;//当期本金
	private BigDecimal normInt;//当期利息
	
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}
	public BigDecimal getPrcpAmt() {
		return prcpAmt;
	}
	public void setPrcpAmt(BigDecimal prcpAmt) {
		this.prcpAmt = prcpAmt;
	}
	public BigDecimal getNormInt() {
		return normInt;
	}
	public void setNormInt(BigDecimal normInt) {
		this.normInt = normInt;
	}
	
}
