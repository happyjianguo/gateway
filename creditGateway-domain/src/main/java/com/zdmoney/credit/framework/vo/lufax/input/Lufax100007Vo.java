package com.zdmoney.credit.framework.vo.lufax.input;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.framework.vo.lufax.entity.FeePlanLufaxEntity;
import com.zdmoney.credit.framework.vo.lufax.entity.RepayPlanLufaxEntity;

/**
 * @ClassName:     Lufax100007Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100007Vo extends LufaxBaseParamVo {

	private static final long serialVersionUID = -2942050521690202046L;

	 /** 流水号 **/
    @NotBlank(message = "流水号不能为空！")
	private String loanNo;
    /** 放款金额 **/
    @NotBlank(message = "放款金额不能为空！")
	private String loanAmt;
    /** 贷款期限 **/
    @NotBlank(message = "贷款期限不能为空！")
	private String loanTerm;
    /** 还款方式 **/
    @NotBlank(message = "还款方式不能为空！")
	private String repaymentType;
    /** 产品子类 **/
    @NotBlank(message = "产品子类不能为空！")
	private String productNo;
    /** 机构号 **/
    @NotBlank(message = "机构号不能为空！")
	private String depNo;
    /** 产品大类 **/
    @NotBlank(message = "产品大类不能为空！")
	private String productType;
    /** 年利率 **/
    @NotBlank(message = "年利率不能为空！")
	private String loanRate;
    /**还款计划明细**/
    @NotEmpty(message="还款计划明细不能为空")
    private List<RepayPlanLufaxEntity> repayPlan = new ArrayList<>();
    /**费用计划明细**/
    private List<FeePlanLufaxEntity> feePlan;
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public String getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}
	public String getRepaymentType() {
		return repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getDepNo() {
		return depNo;
	}
	public void setDepNo(String depNo) {
		this.depNo = depNo;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}
	public List<RepayPlanLufaxEntity> getRepayPlan() {
		return repayPlan;
	}
	public void setRepayPlan(List<RepayPlanLufaxEntity> repayPlan) {
		this.repayPlan = repayPlan;
	}
	public List<FeePlanLufaxEntity> getFeePlan() {
		return feePlan;
	}
	public void setFeePlan(List<FeePlanLufaxEntity> feePlan) {
		this.feePlan = feePlan;
	}
    
}
