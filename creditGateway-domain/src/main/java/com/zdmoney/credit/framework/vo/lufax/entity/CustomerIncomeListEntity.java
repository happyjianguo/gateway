package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerIncomeListEntity {
	/**雇佣类型*/
    @NotEmpty(message = "雇佣类型不能为空！")
    private String INCOME_IDENTITY;
    
    /**月收入*/
    @NotEmpty(message = "月收入不能为空！")
    private String MONTHLY_INCOME;

    @JSONField(name = "INCOME_IDENTITY")
	public String getINCOME_IDENTITY() {
		return INCOME_IDENTITY;
	}

	public void setINCOME_IDENTITY(String iNCOME_IDENTITY) {
		INCOME_IDENTITY = iNCOME_IDENTITY;
	}

	@JSONField(name = "MONTHLY_INCOME")
	public String getMONTHLY_INCOME() {
		return MONTHLY_INCOME;
	}

	public void setMONTHLY_INCOME(String mONTHLY_INCOME) {
		MONTHLY_INCOME = mONTHLY_INCOME;
	}
    
}
