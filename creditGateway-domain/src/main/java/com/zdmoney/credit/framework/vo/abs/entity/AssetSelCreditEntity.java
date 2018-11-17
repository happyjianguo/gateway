package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

/**
 * 资产挑选 -- 信用卡信息
 * @author 10098  2016年11月25日 下午3:18:24
 */
public class AssetSelCreditEntity {
	/** 信用卡总额度 **/
	private BigDecimal creditTotalLimit;
	/** 信用卡已用额度 **/
	private BigDecimal creditUsedLimit;
	/** 信用卡负债 **/
	private BigDecimal creditDebt;
	/** 信用贷款 **/
	private BigDecimal loanCredit;
	/** 额度 **/
	private BigDecimal creditLoanLimit;
	/** 期限 **/
	private Integer creditLoanTerm;
	/** 负债 **/
	private BigDecimal creditLoanDebt;
	/** 已还期数 **/
	private BigDecimal creditLoanAlsoPay;
	/** 外部负债总额 **/
	private BigDecimal outDebtTotal;
	
	public BigDecimal getCreditTotalLimit() {
		return creditTotalLimit;
	}
	public void setCreditTotalLimit(BigDecimal creditTotalLimit) {
		this.creditTotalLimit = creditTotalLimit;
	}
	public BigDecimal getCreditUsedLimit() {
		return creditUsedLimit;
	}
	public void setCreditUsedLimit(BigDecimal creditUsedLimit) {
		this.creditUsedLimit = creditUsedLimit;
	}
	public BigDecimal getCreditDebt() {
		return creditDebt;
	}
	public void setCreditDebt(BigDecimal creditDebt) {
		this.creditDebt = creditDebt;
	}
	public BigDecimal getLoanCredit() {
		return loanCredit;
	}
	public void setLoanCredit(BigDecimal loanCredit) {
		this.loanCredit = loanCredit;
	}
	public BigDecimal getCreditLoanLimit() {
		return creditLoanLimit;
	}
	public void setCreditLoanLimit(BigDecimal creditLoanLimit) {
		this.creditLoanLimit = creditLoanLimit;
	}
	public Integer getCreditLoanTerm() {
		return creditLoanTerm;
	}
	public void setCreditLoanTerm(Integer creditLoanTerm) {
		this.creditLoanTerm = creditLoanTerm;
	}
	public BigDecimal getCreditLoanDebt() {
		return creditLoanDebt;
	}
	public void setCreditLoanDebt(BigDecimal creditLoanDebt) {
		this.creditLoanDebt = creditLoanDebt;
	}
	public BigDecimal getCreditLoanAlsoPay() {
		return creditLoanAlsoPay;
	}
	public void setCreditLoanAlsoPay(BigDecimal creditLoanAlsoPay) {
		this.creditLoanAlsoPay = creditLoanAlsoPay;
	}
	public BigDecimal getOutDebtTotal() {
		return outDebtTotal;
	}
	public void setOutDebtTotal(BigDecimal outDebtTotal) {
		this.outDebtTotal = outDebtTotal;
	}

}
