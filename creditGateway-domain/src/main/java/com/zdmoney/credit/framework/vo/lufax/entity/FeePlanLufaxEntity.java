package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 10098  2017年4月21日 下午3:51:50
 */
public class FeePlanLufaxEntity implements Serializable{
	
	private static final long serialVersionUID = -4431254650656351354L;
	/** 费用编码 **/
    @NotBlank(message = "费用编码不能为空！")
	private String feeCode;
    /** 应还费用金额 **/
    @NotBlank(message = "应还费用金额不能为空！")
	private String payfeeamt;
	public String getFeeCode() {
		return feeCode;
	}
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}
	public String getPayfeeamt() {
		return payfeeamt;
	}
	public void setPayfeeamt(String payfeeamt) {
		this.payfeeamt = payfeeamt;
	}
}
