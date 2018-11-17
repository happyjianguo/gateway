package com.zdmoney.credit.framework.vo.lufax.entity;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CreditInfoEntity {
	/**报告头描述*/
	@Valid
//	@NotEmpty(message = "报告头描述不能为空！")
	private List<CreditRptHeaderEntity> CREDIT_RPT_HEADER;
	
	/**信用汇总提示*/
	@Valid
//	@NotNull(message = "信用汇总提示不能为空！")
	private List<CreditRptSummaryCueEntity> CREDIT_RPT_SUMMARY_CUE;
	
	/**逾期(透支)信息汇总*/
	@Valid
//	@NotNull(message = "逾期(透支)信息汇总不能为空！")
	private List<CreditRptOverdueSumEntity> CREDIT_RPT_OVERDUE_SUM;
	
	/**授信及负债信息汇总描述*/
	@Valid
//	@NotNull(message = "授信及负债信息汇总描述不能为空！")
	private List<CreditRptShareAndDebtSumEntity> CREDIT_RPT_SHAREANDDEBT_SUM;
	
	/**对外担保信息汇总*/
	@Valid
//	@NotNull(message = "对外担保信息汇总不能为空！")
	private List<CreditRptGuaranteeSumEntity> CREDIT_RPT_GUARANTEE_SUM;
	
	/**保证人代偿信息*/
	@Valid
//	@NotNull(message = "保证人代偿信息不能为空！")
	private List<CreditRptAssurerRepayEntity> CREDIT_RPT_ASSURER_REPAY;
	
	/**信贷审批查询记录明细*/
	@Valid
//	@NotNull(message = "信贷审批查询记录明细不能为空！")
	private List<CreditRptApproveDetailEntity> CREDIT_RPT_APPROVE_DETAIL;

	@JSONField(name = "CREDIT_RPT_HEADER")
	public List<CreditRptHeaderEntity> getCREDIT_RPT_HEADER() {
		return CREDIT_RPT_HEADER;
	}

	public void setCREDIT_RPT_HEADER(List<CreditRptHeaderEntity> cREDIT_RPT_HEADER) {
		CREDIT_RPT_HEADER = cREDIT_RPT_HEADER;
	}

	@JSONField(name = "CREDIT_RPT_SUMMARY_CUE")
	public List<CreditRptSummaryCueEntity> getCREDIT_RPT_SUMMARY_CUE() {
		return CREDIT_RPT_SUMMARY_CUE;
	}

	public void setCREDIT_RPT_SUMMARY_CUE(
			List<CreditRptSummaryCueEntity> cREDIT_RPT_SUMMARY_CUE) {
		CREDIT_RPT_SUMMARY_CUE = cREDIT_RPT_SUMMARY_CUE;
	}

	@JSONField(name = "CREDIT_RPT_OVERDUE_SUM")
	public List<CreditRptOverdueSumEntity> getCREDIT_RPT_OVERDUE_SUM() {
		return CREDIT_RPT_OVERDUE_SUM;
	}

	public void setCREDIT_RPT_OVERDUE_SUM(
			List<CreditRptOverdueSumEntity> cREDIT_RPT_OVERDUE_SUM) {
		CREDIT_RPT_OVERDUE_SUM = cREDIT_RPT_OVERDUE_SUM;
	}

	@JSONField(name = "CREDIT_RPT_SHAREANDDEBT_SUM")
	public List<CreditRptShareAndDebtSumEntity> getCREDIT_RPT_SHAREANDDEBT_SUM() {
		return CREDIT_RPT_SHAREANDDEBT_SUM;
	}

	public void setCREDIT_RPT_SHAREANDDEBT_SUM(
			List<CreditRptShareAndDebtSumEntity> cREDIT_RPT_SHAREANDDEBT_SUM) {
		CREDIT_RPT_SHAREANDDEBT_SUM = cREDIT_RPT_SHAREANDDEBT_SUM;
	}

	@JSONField(name = "CREDIT_RPT_GUARANTEE_SUM")
	public List<CreditRptGuaranteeSumEntity> getCREDIT_RPT_GUARANTEE_SUM() {
		return CREDIT_RPT_GUARANTEE_SUM;
	}

	public void setCREDIT_RPT_GUARANTEE_SUM(
			List<CreditRptGuaranteeSumEntity> cREDIT_RPT_GUARANTEE_SUM) {
		CREDIT_RPT_GUARANTEE_SUM = cREDIT_RPT_GUARANTEE_SUM;
	}

	@JSONField(name = "CREDIT_RPT_ASSURER_REPAY")
	public List<CreditRptAssurerRepayEntity> getCREDIT_RPT_ASSURER_REPAY() {
		return CREDIT_RPT_ASSURER_REPAY;
	}

	public void setCREDIT_RPT_ASSURER_REPAY(
			List<CreditRptAssurerRepayEntity> cREDIT_RPT_ASSURER_REPAY) {
		CREDIT_RPT_ASSURER_REPAY = cREDIT_RPT_ASSURER_REPAY;
	}

	@JSONField(name = "CREDIT_RPT_APPROVE_DETAIL")
	public List<CreditRptApproveDetailEntity> getCREDIT_RPT_APPROVE_DETAIL() {
		return CREDIT_RPT_APPROVE_DETAIL;
	}

	public void setCREDIT_RPT_APPROVE_DETAIL(
			List<CreditRptApproveDetailEntity> cREDIT_RPT_APPROVE_DETAIL) {
		CREDIT_RPT_APPROVE_DETAIL = cREDIT_RPT_APPROVE_DETAIL;
	}
	
}
