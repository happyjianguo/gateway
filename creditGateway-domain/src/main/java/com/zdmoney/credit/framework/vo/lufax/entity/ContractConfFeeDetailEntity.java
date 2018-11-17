package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 10098  2017年4月24日 上午11:58:44
 */
public class ContractConfFeeDetailEntity implements Serializable{
	

	private static final long serialVersionUID = 6882841834940863088L;

	/** 费用名称 **/
	@NotBlank(message = "费用名称不能为空！")
	private String fee_name;
	/** 费用类型 **/
	@NotBlank(message = "费用类型不能为空！")
	private String fee_type;
	/** 费率 **/
	@NotBlank(message = "费率不能为空！")
	private String fee_rate;
	/** 收费金额 **/
	@NotBlank(message = "收费金额不能为空！")
	private String fee_amount;
	/** 期收总金额 **/
	@NotBlank(message = "期收总金额不能为空！")
	private String fee_total_amount;
	/** 扣款时点 **/
	@NotBlank(message = "扣款时点不能为空！")
	private String fee_time;
	/** 扣款频率 **/
	@NotBlank(message = "扣款频率不能为空！")
	private String fee_frequency;
	/** 收取单位 **/
	private String fee_company;
	
	public String getFee_name() {
		return fee_name;
	}
	public void setFee_name(String fee_name) {
		this.fee_name = fee_name;
	}
	public String getFee_type() {
		return fee_type;
	}
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	public String getFee_rate() {
		return fee_rate;
	}
	public void setFee_rate(String fee_rate) {
		this.fee_rate = fee_rate;
	}
	public String getFee_amount() {
		return fee_amount;
	}
	public void setFee_amount(String fee_amount) {
		this.fee_amount = fee_amount;
	}
	public String getFee_total_amount() {
		return fee_total_amount;
	}
	public void setFee_total_amount(String fee_total_amount) {
		this.fee_total_amount = fee_total_amount;
	}
	public String getFee_time() {
		return fee_time;
	}
	public void setFee_time(String fee_time) {
		this.fee_time = fee_time;
	}
	public String getFee_frequency() {
		return fee_frequency;
	}
	public void setFee_frequency(String fee_frequency) {
		this.fee_frequency = fee_frequency;
	}
	public String getFee_company() {
		return fee_company;
	}
	public void setFee_company(String fee_company) {
		this.fee_company = fee_company;
	}
	
}
