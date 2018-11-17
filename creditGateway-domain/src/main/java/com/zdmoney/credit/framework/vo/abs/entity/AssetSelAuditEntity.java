package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 资产挑选 -- 审批信息
 * @author 10098  2016年11月25日 下午3:19:15
 */
public class AssetSelAuditEntity {
	/** 审批意见申请金额 **/
	@NotNull(message = "审批意见申请金额不能为空")
	private BigDecimal approvalApplyLimit;
	/** 审批意见申请期限 **/
	@NotNull(message = "审批意见申请期限不能为空")
	private Integer approvalApplyTerm;
	/** 核实收入 **/
	private BigDecimal approvalCheckIncome;
	/** 审批额度 **/
	@NotNull(message = "审批额度不能为空")
	private BigDecimal approvalLimit;
	/** 审批期限 **/
	@NotNull(message = "审批期限不能为空")
	private Integer approvalTerm;
	/** 月还款额 **/
	@NotNull(message = "月还款额不能为空")
	private BigDecimal approvalMonthPay;
	/** 内部负债率 **/
	private BigDecimal approvalDebtTate;
	/** 总负债率 **/
	private BigDecimal approvalAllDebtRate;
	/** 审批时间 **/
	@NotBlank(message = "审批时间不能为空")
	private String approvalDate;
	/** 备注中是否私营企业主 **/
	@NotBlank(message = "备注中是否私营企业主不能为空")
	private String approvalMemo;
	public BigDecimal getApprovalApplyLimit() {
		return approvalApplyLimit;
	}
	public void setApprovalApplyLimit(BigDecimal approvalApplyLimit) {
		this.approvalApplyLimit = approvalApplyLimit;
	}
	public Integer getApprovalApplyTerm() {
		return approvalApplyTerm;
	}
	public void setApprovalApplyTerm(Integer approvalApplyTerm) {
		this.approvalApplyTerm = approvalApplyTerm;
	}
	public BigDecimal getApprovalCheckIncome() {
		return approvalCheckIncome;
	}
	public void setApprovalCheckIncome(BigDecimal approvalCheckIncome) {
		this.approvalCheckIncome = approvalCheckIncome;
	}
	public BigDecimal getApprovalLimit() {
		return approvalLimit;
	}
	public void setApprovalLimit(BigDecimal approvalLimit) {
		this.approvalLimit = approvalLimit;
	}
	public Integer getApprovalTerm() {
		return approvalTerm;
	}
	public void setApprovalTerm(Integer approvalTerm) {
		this.approvalTerm = approvalTerm;
	}
	public BigDecimal getApprovalMonthPay() {
		return approvalMonthPay;
	}
	public void setApprovalMonthPay(BigDecimal approvalMonthPay) {
		this.approvalMonthPay = approvalMonthPay;
	}
	public BigDecimal getApprovalDebtTate() {
		return approvalDebtTate;
	}
	public void setApprovalDebtTate(BigDecimal approvalDebtTate) {
		this.approvalDebtTate = approvalDebtTate;
	}
	public BigDecimal getApprovalAllDebtRate() {
		return approvalAllDebtRate;
	}
	public void setApprovalAllDebtRate(BigDecimal approvalAllDebtRate) {
		this.approvalAllDebtRate = approvalAllDebtRate;
	}
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getApprovalMemo() {
		return approvalMemo;
	}
	public void setApprovalMemo(String approvalMemo) {
		this.approvalMemo = approvalMemo;
	}
	
}
