package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 10098  2017年4月24日 上午11:33:04
 */
public class ContractConfDataInfoLufaxEntity  implements Serializable{
	
	private static final long serialVersionUID = 960615652249531327L;
	/**利率**/
    @NotBlank(message = "利率不能为空！")
	private String interest_rate;
    /**期数**/
    @NotBlank(message = "期数不能为空！")
	private String periods_num;
    /**罚息**/
    @NotBlank(message = "罚息不能为空！")
	private String default_interest;
	public String getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getPeriods_num() {
		return periods_num;
	}
	public void setPeriods_num(String periods_num) {
		this.periods_num = periods_num;
	}
	public String getDefault_interest() {
		return default_interest;
	}
	public void setDefault_interest(String default_interest) {
		this.default_interest = default_interest;
	}
}
