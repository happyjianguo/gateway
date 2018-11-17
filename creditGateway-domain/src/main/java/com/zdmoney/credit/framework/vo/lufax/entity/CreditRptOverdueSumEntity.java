package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class CreditRptOverdueSumEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**逾期(透支)信息代码*/
//    @NotEmpty(message = "逾期(透支)信息代码不能为空！")
    private String overdueCD;
    
    /**笔数/账户数 */
//    @NotEmpty(message = "笔数/账户数 不能为空！")
    private String count;
    
    /**月份数*/
//    @NotEmpty(message = "月份数不能为空！")
    private String months;
    
    /**单月最高逾期总额/单月最高透支总额 */
//    @NotEmpty(message = "单月最高逾期总额/单月最高透支总额不能为空！")
    private String highestOverdueAmountPerMon;
    
    /**最长逾期月数/最长透支月数 */
//    @NotEmpty(message = "最长逾期月数/最长透支月数不能为空！")
    private String maxDuration;

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getOverdueCD() {
		return overdueCD;
	}

	public void setOverdueCD(String overdueCD) {
		this.overdueCD = overdueCD;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getMonths() {
		return months;
	}

	public void setMonths(String months) {
		this.months = months;
	}

	public String getHighestOverdueAmountPerMon() {
		return highestOverdueAmountPerMon;
	}

	public void setHighestOverdueAmountPerMon(String highestOverdueAmountPerMon) {
		this.highestOverdueAmountPerMon = highestOverdueAmountPerMon;
	}

	public String getMaxDuration() {
		return maxDuration;
	}

	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}
    
}
