package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class CreditRptHeaderEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**报告编号*/
//    @NotEmpty(message = "报告编号不能为空！")
    private String reportSN;
    
    /**查询请求时间*/
//    @NotEmpty(message = "查询请求时间不能为空！")
    private String queryTime;
    
    /**报告时间*/
//    @NotEmpty(message = "报告时间不能为空！")
    private String reportCreateTime;

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getReportSN() {
		return reportSN;
	}

	public void setReportSN(String reportSN) {
		this.reportSN = reportSN;
	}

	public String getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	public String getReportCreateTime() {
		return reportCreateTime;
	}

	public void setReportCreateTime(String reportCreateTime) {
		this.reportCreateTime = reportCreateTime;
	}
    
}
