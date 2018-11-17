package com.zdmoney.credit.framework.vo.bsb.entity;

import java.math.BigDecimal;

public class AgentRentHourseInfo {
	/** 房屋地址*/
	private String hourseAddress;
	
	/** 房屋租金*/
	private BigDecimal monthRental;
	
	/** 租房开始日期*/
	private String startPayDate;
	
	/** 租房结束日期*/
	private String endPayDate;
	
	/** 服务费承担方*/
	private String repayMethod;
	
	/** 客户首付方式*/
	private String customerFirstType;
	
	/** 渠道付款方式*/
	private String payType;
	
	/** 客户首次还款日期*/
	private String firstPayDate;

	public String getHourseAddress() {
		return hourseAddress;
	}

	public void setHourseAddress(String hourseAddress) {
		this.hourseAddress = hourseAddress;
	}

	public BigDecimal getMonthRental() {
		return monthRental;
	}

	public void setMonthRental(BigDecimal monthRental) {
		this.monthRental = monthRental;
	}

	public String getStartPayDate() {
		return startPayDate;
	}

	public void setStartPayDate(String startPayDate) {
		this.startPayDate = startPayDate;
	}

	public String getEndPayDate() {
		return endPayDate;
	}

	public void setEndPayDate(String endPayDate) {
		this.endPayDate = endPayDate;
	}

	public String getRepayMethod() {
		return repayMethod;
	}

	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getCustomerFirstType() {
		return customerFirstType;
	}

	public void setCustomerFirstType(String customerFirstType) {
		this.customerFirstType = customerFirstType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getFirstPayDate() {
		return firstPayDate;
	}

	public void setFirstPayDate(String firstPayDate) {
		this.firstPayDate = firstPayDate;
	}
	
}
