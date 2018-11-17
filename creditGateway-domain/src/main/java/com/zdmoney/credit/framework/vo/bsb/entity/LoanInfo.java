package com.zdmoney.credit.framework.vo.bsb.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class LoanInfo {
	/** 还款间隔*/
	@NotEmpty(message = "还款间隔不能为空！")
	private String repayInterval;
	
	/** 利率模式*/
	private String interRateModel;
	
	/** 利率调整方式*/
	private String interRateAdMod;
	
	/** 借款金额*/
	@NotNull(message = "借款金额不能为空！")
	private BigDecimal transAmt;
	
	/** 总期数*/
	@NotNull(message = "单位信息不能为空！")
	private Integer totalCnt;
	
	/** 月租金*/
	private BigDecimal monthRental;
	
	/** 还款方式*/
	@NotEmpty(message = "还款方式不能为空！")
	private String repayMethod;
	
	/** 订单开始时间*/
	private String startPayDate;
	
	/** 订单结束时间*/
	private String endPayDate;
	
	/** 首个还款日期*/
	@NotEmpty(message = "首个还款日期不能为空！")
	private String firstPayDate;
	
	/** 尾款合并方式（尾款单独付*/
	private String lastPayMergeType;
	
	/** 付款方式*/
	private String payType;
	
	/** 贴息比例*/
	private String discountPron;
	
	/** 第二期还款日*/
	private String secondPayDate;
	
	/** 尾款金额*/
	private BigDecimal finalAmt;
	
	/** 客户手续费比例*/
	private String userFeeRate;
	
	/** 利率*/
	private String interestRate;
	
	/** 借款用途*/
	/*@NotEmpty(message = "借款用途不能为空！")*/
	private String loanUse;

	public String getRepayInterval() {
		return repayInterval;
	}

	public void setRepayInterval(String repayInterval) {
		this.repayInterval = repayInterval;
	}

	public String getInterRateModel() {
		return interRateModel;
	}

	public void setInterRateModel(String interRateModel) {
		this.interRateModel = interRateModel;
	}

	public String getInterRateAdMod() {
		return interRateAdMod;
	}

	public void setInterRateAdMod(String interRateAdMod) {
		this.interRateAdMod = interRateAdMod;
	}

	public BigDecimal getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt = transAmt;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

	public BigDecimal getMonthRental() {
		return monthRental;
	}

	public void setMonthRental(BigDecimal monthRental) {
		this.monthRental = monthRental;
	}

	public String getRepayMethod() {
		return repayMethod;
	}

	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getStartPayDate() {
		return startPayDate;
	}

	public void setStartPayDate(String startPayDate) {
		this.startPayDate = startPayDate;
	}

	public String getEndPayDate() {
		return endPayDate;
	}

	public void setEndPayDate(String endPayDate) {
		this.endPayDate = endPayDate;
	}

	public String getFirstPayDate() {
		return firstPayDate;
	}

	public void setFirstPayDate(String firstPayDate) {
		this.firstPayDate = firstPayDate;
	}

	public String getLastPayMergeType() {
		return lastPayMergeType;
	}

	public void setLastPayMergeType(String lastPayMergeType) {
		this.lastPayMergeType = lastPayMergeType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getDiscountPron() {
		return discountPron;
	}

	public void setDiscountPron(String discountPron) {
		this.discountPron = discountPron;
	}

	public String getSecondPayDate() {
		return secondPayDate;
	}

	public void setSecondPayDate(String secondPayDate) {
		this.secondPayDate = secondPayDate;
	}

	public BigDecimal getFinalAmt() {
		return finalAmt;
	}

	public void setFinalAmt(BigDecimal finalAmt) {
		this.finalAmt = finalAmt;
	}

	public String getUserFeeRate() {
		return userFeeRate;
	}

	public void setUserFeeRate(String userFeeRate) {
		this.userFeeRate = userFeeRate;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getLoanUse() {
		return loanUse;
	}

	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
	}
	
}
