package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class CreditRptAssurerRepayEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**保证人代偿信息是否为空*/
//    @NotEmpty(message = "保证人代偿信息是否为空不能为空！")
    private String isEmpty;

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(String isEmpty) {
		this.isEmpty = isEmpty;
	}
    
}
