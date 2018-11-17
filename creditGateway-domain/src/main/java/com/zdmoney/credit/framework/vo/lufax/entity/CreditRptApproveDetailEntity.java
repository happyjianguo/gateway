package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class CreditRptApproveDetailEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**查询日期*/
//    @NotEmpty(message = "查询日期不能为空！")
    private String queryDate;
    
    /**查询操作员*/
//    @NotEmpty(message = "查询操作员不能为空！")
    private String querier;
    
    /**查询原因*/
//    @NotEmpty(message = "查询原因不能为空！")
    private String queryReason;

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getQueryDate() {
		return queryDate;
	}

	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public String getQuerier() {
		return querier;
	}

	public void setQuerier(String querier) {
		this.querier = querier;
	}

	public String getQueryReason() {
		return queryReason;
	}

	public void setQueryReason(String queryReason) {
		this.queryReason = queryReason;
	}
    
}
