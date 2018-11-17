package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class CreditRptGuaranteeSumEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**担保笔数*/
//    @NotEmpty(message = "担保笔数不能为空！")
    private String count;
    
    /**担保金额*/
//    @NotEmpty(message = "担保金额不能为空！")
    private String amount;
    
    /**担保本金余额*/
//    @NotEmpty(message = "担保本金余额不能为空！")
    private String balance;

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
    
}
