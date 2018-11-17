package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 10098  2017年4月21日 下午3:53:40
 */
public class RepayPlanLufaxEntity implements Serializable{

	private static final long serialVersionUID = -7156047499211067777L;

    /** 流水号 **/
    @NotBlank(message = "流水号不能为空！")
	private String loanNo;
    /** 期次 **/
    @NotBlank(message = "期次不能为空！")
	private String termNo;
    /** 应还日 **/
    @NotBlank(message = "应还日不能为空！")
	private String payDate;
    /** 贷款利率 **/
    @NotBlank(message = "贷款利率不能为空！")
	private String loanRate;
    /** 应还本金 **/
    @NotBlank(message = "应还本金不能为空！")
	private String payprincipalamt;
    /** 应还利息 **/
    @NotBlank(message = "应还利息不能为空！")
	private String payinteamt;
    /** 期供金额 **/
    @NotBlank(message = "期供金额不能为空！")
    private String termAmt;
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}
	public String getPayprincipalamt() {
		return payprincipalamt;
	}
	public void setPayprincipalamt(String payprincipalamt) {
		this.payprincipalamt = payprincipalamt;
	}
	public String getPayinteamt() {
		return payinteamt;
	}
	public void setPayinteamt(String payinteamt) {
		this.payinteamt = payinteamt;
	}
	public String getTermAmt() {
		return termAmt;
	}
	public void setTermAmt(String termAmt) {
		this.termAmt = termAmt;
	}
    
}
