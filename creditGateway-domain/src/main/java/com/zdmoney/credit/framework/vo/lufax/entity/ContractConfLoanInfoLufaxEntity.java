package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author 10098  2017年4月24日 上午11:34:03
 */
public class ContractConfLoanInfoLufaxEntity implements Serializable{
	
	private static final long serialVersionUID = 3037222853553790043L;
	
	/**借据号**/
    @NotBlank(message = "借据号不能为空！")	
	private String LOAN_NO;
	/**前端主机ID**/
    @NotBlank(message = "前端主机ID不能为空！")
	private String LUFAX_LOAN_REQ_ID;
	/**起息日期**/
    @NotBlank(message = "起息日期不能为空！")
	private String PUTOUT_DATE;       
	/**到期日期**/
    @NotBlank(message = "到期日期不能为空！")
	private String MATURITY_DATE;     
    /**借据会计日期**/
    @NotBlank(message = "借据会计日期不能为空！")
	private String CURDEDUCT_DATE;
	/**默认还款日**/
    @NotBlank(message = "默认还款日不能为空！")
	private String DEFAULT_PAYDATE;
    /**正常本金**/
    @NotBlank(message = "正常本金不能为空！")
	private String NORMAL_PRINCIPAL;
    /**下次还款日**/
    @NotBlank(message = "下次还款日不能为空！")
	private String NEXT_PAYDATE;
    /**下次利率调整日期**/
    @NotBlank(message = "下次利率调整日期不能为空！")
	private String RATE_NEXT_ADJUST_DATE;
    /**申请币种**/
    @NotBlank(message = "申请币种不能为空！")
	private String cur;
    /**申请币种**/
    @NotBlank(message = "执行利率不能为空！")
	private String rate;
    /**申请币种**/
    @NotBlank(message = "申请金额不能为空！")
	private String capital;
    /**申请期限**/
    @NotBlank(message = "申请期限不能为空！")
	private int loan_term;
    /**申请期限单位**/
    @NotBlank(message = "申请期限单位不能为空！")
	private String loan_term_flag;
    /**申请贷款状态**/
    @NotBlank(message = "申请贷款状态不能为空！")
	private String loan_state;
    /**（担）保费率**/
    @NotBlank(message = "（担）保费率不能为空！")
	private String gage_rate;
    /**（担）保金额**/
    @NotBlank(message = "（担）保金额不能为空！")
	private String gage_amount;
    /**咨询服务费**/
	private String refer_fee;
	/** 一次费用 **/
	private String fee1;
    /**担保费总额**/
    @NotBlank(message = "担保费总额不能为空！")
	private String total_insurance_amount;
    /**利息总额**/
    @NotBlank(message = "利息总额不能为空！")
	private String total_interest_amount;
    /**借款人预期还款总额**/
    @NotBlank(message = "借款人预期还款总额不能为空！")
	private String total_repay_amount;
    /**还款方式**/
    @NotBlank(message = "还款方式不能为空！")
	private String repayment_method;
    /**是否定向支付**/
    @NotBlank(message = "是否定向支付不能为空！")
	private String isdirected;
    /**定向支付网站注册名 **/
	private String directed_username;
    /**定向支付银行账号**/
	private String directed_accno;
    /**定向支付银行代码**/
	private String directed_bank_code;
    /**定向支付开户名称**/
	private String directed_name;
	/**定向支付4S店分行省份**/
	private String directed_province;
	/**定向支付4S店分行城市**/
	private String directed_city;
	/**定向支付4S店分行名称**/
	private String directed_branch;
    /**保险承保总金额**/
    @NotBlank(message = "保险承保总金额不能为空！")
	private String insured_total_amount;
    /**还款计划**/
    @NotBlank(message = "还款计划不能为空！")
	private List<ContractConfRepayPlanEntity> repayPlans = new ArrayList<ContractConfRepayPlanEntity>();
    /**费用明细**/
    @NotBlank(message = "费用明细不能为空！")
    private List<ContractConfFeeDetailEntity> fee_detail = new ArrayList<ContractConfFeeDetailEntity>();
    
    
	@JSONField(name = "LOAN_NO")     
    public String getLOAN_NO() {
		return LOAN_NO;
	}
	public void setLOAN_NO(String lOAN_NO) {
		LOAN_NO = lOAN_NO;
	}
	@JSONField(name = "LUFAX_LOAN_REQ_ID") 
	public String getLUFAX_LOAN_REQ_ID() {
		return LUFAX_LOAN_REQ_ID;
	}
	public void setLUFAX_LOAN_REQ_ID(String lUFAX_LOAN_REQ_ID) {
		LUFAX_LOAN_REQ_ID = lUFAX_LOAN_REQ_ID;
	}
	@JSONField(name = "PUTOUT_DATE") 
	public String getPUTOUT_DATE() {
		return PUTOUT_DATE;
	}
	public void setPUTOUT_DATE(String pUTOUT_DATE) {
		PUTOUT_DATE = pUTOUT_DATE;
	}
	
	@JSONField(name = "MATURITY_DATE")
	public String getMATURITY_DATE() {
		return MATURITY_DATE;
	}
	public void setMATURITY_DATE(String mATURITY_DATE) {
		MATURITY_DATE = mATURITY_DATE;
	}
	
	@JSONField(name = "CURDEDUCT_DATE")
	public String getCURDEDUCT_DATE() {
		return CURDEDUCT_DATE;
	}
	public void setCURDEDUCT_DATE(String cURDEDUCT_DATE) {
		CURDEDUCT_DATE = cURDEDUCT_DATE;
	}
	
	@JSONField(name = "DEFAULT_PAYDATE")
	public String getDEFAULT_PAYDATE() {
		return DEFAULT_PAYDATE;
	}
	public void setDEFAULT_PAYDATE(String dEFAULT_PAYDATE) {
		DEFAULT_PAYDATE = dEFAULT_PAYDATE;
	}
	
	@JSONField(name = "NORMAL_PRINCIPAL")
	public String getNORMAL_PRINCIPAL() {
		return NORMAL_PRINCIPAL;
	}
	public void setNORMAL_PRINCIPAL(String nORMAL_PRINCIPAL) {
		NORMAL_PRINCIPAL = nORMAL_PRINCIPAL;
	}
	
	@JSONField(name = "NEXT_PAYDATE")
	public String getNEXT_PAYDATE() {
		return NEXT_PAYDATE;
	}
	public void setNEXT_PAYDATE(String nEXT_PAYDATE) {
		NEXT_PAYDATE = nEXT_PAYDATE;
	}
	
	@JSONField(name = "RATE_NEXT_ADJUST_DATE")
	public String getRATE_NEXT_ADJUST_DATE() {
		return RATE_NEXT_ADJUST_DATE;
	}
	public void setRATE_NEXT_ADJUST_DATE(String rATE_NEXT_ADJUST_DATE) {
		RATE_NEXT_ADJUST_DATE = rATE_NEXT_ADJUST_DATE;
	}
	
	public String getCur() {
		return cur;
	}
	public void setCur(String cur) {
		this.cur = cur;
	}
	public int getLoan_term() {
		return loan_term;
	}
	public void setLoan_term(int loan_term) {
		this.loan_term = loan_term;
	}
	public String getLoan_term_flag() {
		return loan_term_flag;
	}
	public void setLoan_term_flag(String loan_term_flag) {
		this.loan_term_flag = loan_term_flag;
	}
	public String getLoan_state() {
		return loan_state;
	}
	public void setLoan_state(String loan_state) {
		this.loan_state = loan_state;
	}
	public String getGage_rate() {
		return gage_rate;
	}
	public void setGage_rate(String gage_rate) {
		this.gage_rate = gage_rate;
	}
	public String getGage_amount() {
		return gage_amount;
	}
	public void setGage_amount(String gage_amount) {
		this.gage_amount = gage_amount;
	}
	public String getRefer_fee() {
		return refer_fee;
	}
	public void setRefer_fee(String refer_fee) {
		this.refer_fee = refer_fee;
	}
	public String getTotal_insurance_amount() {
		return total_insurance_amount;
	}
	public void setTotal_insurance_amount(String total_insurance_amount) {
		this.total_insurance_amount = total_insurance_amount;
	}
	public String getTotal_interest_amount() {
		return total_interest_amount;
	}
	public void setTotal_interest_amount(String total_interest_amount) {
		this.total_interest_amount = total_interest_amount;
	}
	public String getTotal_repay_amount() {
		return total_repay_amount;
	}
	public void setTotal_repay_amount(String total_repay_amount) {
		this.total_repay_amount = total_repay_amount;
	}
	public String getRepayment_method() {
		return repayment_method;
	}
	public void setRepayment_method(String repayment_method) {
		this.repayment_method = repayment_method;
	}
	public String getIsdirected() {
		return isdirected;
	}
	public void setIsdirected(String isdirected) {
		this.isdirected = isdirected;
	}
	public String getDirected_username() {
		return directed_username;
	}
	public void setDirected_username(String directed_username) {
		this.directed_username = directed_username;
	}
	public String getDirected_accno() {
		return directed_accno;
	}
	public void setDirected_accno(String directed_accno) {
		this.directed_accno = directed_accno;
	}
	public String getDirected_bank_code() {
		return directed_bank_code;
	}
	public void setDirected_bank_code(String directed_bank_code) {
		this.directed_bank_code = directed_bank_code;
	}
	public String getDirected_name() {
		return directed_name;
	}
	public void setDirected_name(String directed_name) {
		this.directed_name = directed_name;
	}
	public String getInsured_total_amount() {
		return insured_total_amount;
	}
	public void setInsured_total_amount(String insured_total_amount) {
		this.insured_total_amount = insured_total_amount;
	}
	public List<ContractConfRepayPlanEntity> getRepayPlans() {
		return repayPlans;
	}
	public void setRepayPlans(List<ContractConfRepayPlanEntity> repayPlans) {
		this.repayPlans = repayPlans;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getFee1() {
		return fee1;
	}
	public void setFee1(String fee1) {
		this.fee1 = fee1;
	}
	public String getDirected_province() {
		return directed_province;
	}
	public void setDirected_province(String directed_province) {
		this.directed_province = directed_province;
	}
	public String getDirected_city() {
		return directed_city;
	}
	public void setDirected_city(String directed_city) {
		this.directed_city = directed_city;
	}
	public String getDirected_branch() {
		return directed_branch;
	}
	public void setDirected_branch(String directed_branch) {
		this.directed_branch = directed_branch;
	}
	public List<ContractConfFeeDetailEntity> getFee_detail() {
		return fee_detail;
	}
	public void setFee_detail(List<ContractConfFeeDetailEntity> fee_detail) {
		this.fee_detail = fee_detail;
	}
    
}
