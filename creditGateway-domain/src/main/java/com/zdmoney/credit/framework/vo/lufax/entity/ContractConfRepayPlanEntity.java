package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author 10098  2017年4月24日 上午11:49:48
 */
public class ContractConfRepayPlanEntity implements Serializable{

	private static final long serialVersionUID = -4288853325083220649L;
    /**还款卡帐号**/
    @NotBlank(message = "还款卡帐号不能为空！")
	private String payment_accno;
    /**还款标志**/
    @NotBlank(message = "还款标志不能为空！")
	private String pflg;
    /**当期利率**/
    @NotBlank(message = "当期利率不能为空！")
	private String rate;
    /**罚息利率**/
    @NotBlank(message = "罚息利率不能为空！")
	private String orate;
    /**还款总额**/
    @NotBlank(message = "还款总额不能为空！")
	private String total_amount;
    /**每期保费**/
    @NotBlank(message = "每期保费不能为空！")
	private String insureamount;
    /**费用1**/
	private String fee1;
    /**费用2**/
	private String fee2;
    /**平台管理费**/
	private String fee_amt2;
    /**信安咨询费**/
	private String fee_amt3;
    /**小贷管理费**/
	private String fee_amt4;
    /**风险准备金**/
	private String fee_amt5;
	/**逾期违约金**/
	private String fee_amt6;
	/**期次**/
    @NotBlank(message = "期次不能为空！")
	private int TERM_NO;
    /**应还日**/
    @NotBlank(message = "应还日不能为空！")
	private String PAY_DATE;
    /**起息日**/
    @NotBlank(message = "起息日不能为空！")
	private String VALUE_DATE;
    /**结息日**/
    @NotBlank(message = "结息日不能为空！")
	private String EXPIRY_DATE;
    /**贷款利率**/
    @NotBlank(message = "贷款利率不能为空！")
	private String LOAN_RATE;
    /**应还本金**/
    @NotBlank(message = "应还本金不能为空！")
	private String PAYPRINCIPALAMT;
    /**实还本金**/
    @NotBlank(message = "实还本金不能为空！")
	private String ACTUAL_PAYPRINCIPALAMT;
    /**应还利息**/
    @NotBlank(message = "应还利息不能为空！")
	private String PAYINTEAMT;
    /**实还利息**/
    @NotBlank(message = "实还利息不能为空！")
	private String ACTUAL_PAYINTEAMT;
    /**应还罚息**/
    @NotBlank(message = "应还罚息不能为空！")
	private String PAYFINEAMT;
    /**实还罚息**/
    @NotBlank(message = "实还罚息不能为空！")
	private String ACTUAL_PAYFINEAMT;
    /**应还复利**/
    @NotBlank(message = "应还复利不能为空！")
	private String PAYCOMPOUND;
    /**实还复利**/
    @NotBlank(message = "实还复利不能为空！")
	private String ACTUAL_PAYCOMPOUND;
    /**罚息计算日期**/
	private String FINE_CALCULATE_DATE;
    /**罚息积数**/
	private String FINE_BASE;
    /**复利计算日期**/
	private String COMPOUND_CALCULATE_DATE;
    /**复利积数**/
	private String COMPOUND_BASE;
    /**本金余额**/
    @NotBlank(message = "本金余额不能为空！")
	private String PRINCIPAL_BALANCE;
    /**期供金额**/
    @NotBlank(message = "期供金额不能为空！")
	private String TERM_AMT;
    /**结清日期**/
	private String FINISH_DATE;
    /**状态**/
    @NotBlank(message = "状态不能为空！")
	private String STATUS;
    /**费用计划表**/
	private List<ContractConfRepayFeeEntity> repayFeePlans = new ArrayList<ContractConfRepayFeeEntity>();
	
	@JSONField(name = "TERM_NO")
	public int getTERM_NO() {
		return TERM_NO;
	}
	public void setTERM_NO(int tERM_NO) {
		TERM_NO = tERM_NO;
	}
	
	@JSONField(name = "PAY_DATE")
	public String getPAY_DATE() {
		return PAY_DATE;
	}
	public void setPAY_DATE(String pAY_DATE) {
		PAY_DATE = pAY_DATE;
	}
	
	@JSONField(name = "VALUE_DATE")
	public String getVALUE_DATE() {
		return VALUE_DATE;
	}
	public void setVALUE_DATE(String vALUE_DATE) {
		VALUE_DATE = vALUE_DATE;
	}
	
	@JSONField(name = "EXPIRY_DATE")
	public String getEXPIRY_DATE() {
		return EXPIRY_DATE;
	}
	public void setEXPIRY_DATE(String eXPIRY_DATE) {
		EXPIRY_DATE = eXPIRY_DATE;
	}
	
	@JSONField(name = "LOAN_RATE")
	public String getLOAN_RATE() {
		return LOAN_RATE;
	}
	public void setLOAN_RATE(String lOAN_RATE) {
		LOAN_RATE = lOAN_RATE;
	}
	
	@JSONField(name = "PAYPRINCIPALAMT")
	public String getPAYPRINCIPALAMT() {
		return PAYPRINCIPALAMT;
	}
	public void setPAYPRINCIPALAMT(String pAYPRINCIPALAMT) {
		PAYPRINCIPALAMT = pAYPRINCIPALAMT;
	}
	
	@JSONField(name = "ACTUAL_PAYPRINCIPALAMT")
	public String getACTUAL_PAYPRINCIPALAMT() {
		return ACTUAL_PAYPRINCIPALAMT;
	}
	public void setACTUAL_PAYPRINCIPALAMT(String aCTUAL_PAYPRINCIPALAMT) {
		ACTUAL_PAYPRINCIPALAMT = aCTUAL_PAYPRINCIPALAMT;
	}
	
	@JSONField(name = "PAYINTEAMT")
	public String getPAYINTEAMT() {
		return PAYINTEAMT;
	}
	public void setPAYINTEAMT(String pAYINTEAMT) {
		PAYINTEAMT = pAYINTEAMT;
	}
	
	@JSONField(name = "ACTUAL_PAYINTEAMT")
	public String getACTUAL_PAYINTEAMT() {
		return ACTUAL_PAYINTEAMT;
	}
	public void setACTUAL_PAYINTEAMT(String aCTUAL_PAYINTEAMT) {
		ACTUAL_PAYINTEAMT = aCTUAL_PAYINTEAMT;
	}
	
	@JSONField(name = "PAYFINEAMT")
	public String getPAYFINEAMT() {
		return PAYFINEAMT;
	}
	public void setPAYFINEAMT(String pAYFINEAMT) {
		PAYFINEAMT = pAYFINEAMT;
	}
	
	@JSONField(name = "ACTUAL_PAYFINEAMT")
	public String getACTUAL_PAYFINEAMT() {
		return ACTUAL_PAYFINEAMT;
	}
	public void setACTUAL_PAYFINEAMT(String aCTUAL_PAYFINEAMT) {
		ACTUAL_PAYFINEAMT = aCTUAL_PAYFINEAMT;
	}
	
	@JSONField(name = "PAYCOMPOUND")
	public String getPAYCOMPOUND() {
		return PAYCOMPOUND;
	}
	public void setPAYCOMPOUND(String pAYCOMPOUND) {
		PAYCOMPOUND = pAYCOMPOUND;
	}
	
	@JSONField(name = "ACTUAL_PAYCOMPOUND")
	public String getACTUAL_PAYCOMPOUND() {
		return ACTUAL_PAYCOMPOUND;
	}
	public void setACTUAL_PAYCOMPOUND(String aCTUAL_PAYCOMPOUND) {
		ACTUAL_PAYCOMPOUND = aCTUAL_PAYCOMPOUND;
	}
	
	@JSONField(name = "FINE_CALCULATE_DATE")
	public String getFINE_CALCULATE_DATE() {
		return FINE_CALCULATE_DATE;
	}
	public void setFINE_CALCULATE_DATE(String fINE_CALCULATE_DATE) {
		FINE_CALCULATE_DATE = fINE_CALCULATE_DATE;
	}
	@JSONField(name = "FINE_BASE")
	public String getFINE_BASE() {
		return FINE_BASE;
	}
	public void setFINE_BASE(String fINE_BASE) {
		FINE_BASE = fINE_BASE;
	}
	
	@JSONField(name = "COMPOUND_CALCULATE_DATE")
	public String getCOMPOUND_CALCULATE_DATE() {
		return COMPOUND_CALCULATE_DATE;
	}
	public void setCOMPOUND_CALCULATE_DATE(String cOMPOUND_CALCULATE_DATE) {
		COMPOUND_CALCULATE_DATE = cOMPOUND_CALCULATE_DATE;
	}
	
	@JSONField(name = "COMPOUND_BASE")
	public String getCOMPOUND_BASE() {
		return COMPOUND_BASE;
	}
	public void setCOMPOUND_BASE(String cOMPOUND_BASE) {
		COMPOUND_BASE = cOMPOUND_BASE;
	}
	@JSONField(name = "PRINCIPAL_BALANCE")
	public String getPRINCIPAL_BALANCE() {
		return PRINCIPAL_BALANCE;
	}
	public void setPRINCIPAL_BALANCE(String pRINCIPAL_BALANCE) {
		PRINCIPAL_BALANCE = pRINCIPAL_BALANCE;
	}
	
	@JSONField(name = "TERM_AMT")
	public String getTERM_AMT() {
		return TERM_AMT;
	}
	public void setTERM_AMT(String tERM_AMT) {
		TERM_AMT = tERM_AMT;
	}
	
	@JSONField(name = "FINISH_DATE")
	public String getFINISH_DATE() {
		return FINISH_DATE;
	}
	public void setFINISH_DATE(String fINISH_DATE) {
		FINISH_DATE = fINISH_DATE;
	}
	
	@JSONField(name = "STATUS")
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public List<ContractConfRepayFeeEntity> getRepayFeePlans() {
		return repayFeePlans;
	}
	public void setRepayFeePlans(List<ContractConfRepayFeeEntity> repayFeePlans) {
		this.repayFeePlans = repayFeePlans;
	}
	public String getPayment_accno() {
		return payment_accno;
	}
	public void setPayment_accno(String payment_accno) {
		this.payment_accno = payment_accno;
	}
	public String getPflg() {
		return pflg;
	}
	public void setPflg(String pflg) {
		this.pflg = pflg;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getOrate() {
		return orate;
	}
	public void setOrate(String orate) {
		this.orate = orate;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	public String getInsureamount() {
		return insureamount;
	}
	public void setInsureamount(String insureamount) {
		this.insureamount = insureamount;
	}
	public String getFee1() {
		return fee1;
	}
	public void setFee1(String fee1) {
		this.fee1 = fee1;
	}
	public String getFee2() {
		return fee2;
	}
	public void setFee2(String fee2) {
		this.fee2 = fee2;
	}
	public String getFee_amt2() {
		return fee_amt2;
	}
	public void setFee_amt2(String fee_amt2) {
		this.fee_amt2 = fee_amt2;
	}
	public String getFee_amt3() {
		return fee_amt3;
	}
	public void setFee_amt3(String fee_amt3) {
		this.fee_amt3 = fee_amt3;
	}
	public String getFee_amt4() {
		return fee_amt4;
	}
	public void setFee_amt4(String fee_amt4) {
		this.fee_amt4 = fee_amt4;
	}
	public String getFee_amt5() {
		return fee_amt5;
	}
	public void setFee_amt5(String fee_amt5) {
		this.fee_amt5 = fee_amt5;
	}
	public String getFee_amt6() {
		return fee_amt6;
	}
	public void setFee_amt6(String fee_amt6) {
		this.fee_amt6 = fee_amt6;
	}

}
