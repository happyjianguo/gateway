package com.zdmoney.credit.framework.vo.xdcore.entity;

import java.math.BigDecimal;

public class PayPlanListEntity {
	
	private Integer period;//期次
	private String scheduleDate;//应还日期
	private BigDecimal schedulePrincipal;//应还本金
	private BigDecimal scheduleInterest;//应还利息
	private BigDecimal scheduleServiceFee;//应还手续费
	
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	
	public BigDecimal getSchedulePrincipal() {
		return schedulePrincipal;
	}
	public void setSchedulePrincipal(BigDecimal schedulePrincipal) {
		this.schedulePrincipal = schedulePrincipal;
	}
	public BigDecimal getScheduleInterest() {
		return scheduleInterest;
	}
	public void setScheduleInterest(BigDecimal scheduleInterest) {
		this.scheduleInterest = scheduleInterest;
	}
	public BigDecimal getScheduleServiceFee() {
		return scheduleServiceFee;
	}
	public void setScheduleServiceFee(BigDecimal scheduleServiceFee) {
		this.scheduleServiceFee = scheduleServiceFee;
	}
	
	
}
