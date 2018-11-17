package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;

public class DeductItemBaseEntity {
	private String pactNo;		//合同号
	private String serialNo;	//扣款流水号	
	private BigDecimal payOver;		//应收罚息
	private BigDecimal feeRec;		//应收代扣费总额
	private BigDecimal repayTotal;	//扣款金额
	private BigDecimal repayAmt;	//扣款本金
	private BigDecimal repayInte;	//扣款利息
	private BigDecimal repayOver;	//扣款罚息
	private BigDecimal feeTotal;	//代扣费总额
	private BigDecimal mFeeTotal;	//自收费总额
	private String acNo;		//扣款账号
	private String cardChn;		//虚拟账户渠道  CL0001中金支付 CL0002广银联
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public BigDecimal getPayOver() {
		return payOver;
	}
	public void setPayOver(BigDecimal payOver) {
		this.payOver = payOver;
	}
	public BigDecimal getFeeRec() {
		return feeRec;
	}
	public void setFeeRec(BigDecimal feeRec) {
		this.feeRec = feeRec;
	}
	public BigDecimal getRepayTotal() {
		return repayTotal;
	}
	public void setRepayTotal(BigDecimal repayTotal) {
		this.repayTotal = repayTotal;
	}
	public BigDecimal getRepayAmt() {
		return repayAmt;
	}
	public void setRepayAmt(BigDecimal repayAmt) {
		this.repayAmt = repayAmt;
	}
	public BigDecimal getRepayInte() {
		return repayInte;
	}
	public void setRepayInte(BigDecimal repayInte) {
		this.repayInte = repayInte;
	}
	public BigDecimal getRepayOver() {
		return repayOver;
	}
	public void setRepayOver(BigDecimal repayOver) {
		this.repayOver = repayOver;
	}
	public BigDecimal getFeeTotal() {
		return feeTotal;
	}
	public void setFeeTotal(BigDecimal feeTotal) {
		this.feeTotal = feeTotal;
	}
	public BigDecimal getmFeeTotal() {
		return mFeeTotal;
	}
	public void setmFeeTotal(BigDecimal mFeeTotal) {
		this.mFeeTotal = mFeeTotal;
	}
	public String getAcNo() {
		return acNo;
	}
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}
	public String getCardChn() {
		return cardChn;
	}
	public void setCardChn(String cardChn) {
		this.cardChn = cardChn;
	}
	
	
}
