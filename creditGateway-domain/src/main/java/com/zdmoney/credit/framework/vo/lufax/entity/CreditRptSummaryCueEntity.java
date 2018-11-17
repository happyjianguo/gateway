package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class CreditRptSummaryCueEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**住房贷款笔数*/
//    @NotEmpty(message = "住房贷款笔数不能为空！")
    private String houseLoanCount;
    
    /**其他贷款笔数*/
//    @NotEmpty(message = "其他贷款笔数不能为空！")
    private String otherLoanCount;
    
    /**首笔贷款发放月份*/
//    @NotEmpty(message = "首笔贷款发放月份不能为空！")
    private String firstLoanOpenMonth;
    
    /**贷记卡账户数*/
//    @NotEmpty(message = "贷记卡账户数不能为空！")
    private String loancardCount;
    
    /**首张贷记卡发卡月份*/
//    @NotEmpty(message = "首张贷记卡发卡月份不能为空！")
    private String firstLoancardOpenMonth;
    
    /**准贷记卡账户数*/
//    @NotEmpty(message = "准贷记卡账户数不能为空！")
    private String standardLoancardCount;
    
    /**首张准贷记卡发卡月份*/
//    @NotEmpty(message = "首张准贷记卡发卡月份不能为空！")
    private String firstStandardLoancardOpenMonth;

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getHouseLoanCount() {
		return houseLoanCount;
	}

	public void setHouseLoanCount(String houseLoanCount) {
		this.houseLoanCount = houseLoanCount;
	}

	public String getOtherLoanCount() {
		return otherLoanCount;
	}

	public void setOtherLoanCount(String otherLoanCount) {
		this.otherLoanCount = otherLoanCount;
	}

	public String getFirstLoanOpenMonth() {
		return firstLoanOpenMonth;
	}

	public void setFirstLoanOpenMonth(String firstLoanOpenMonth) {
		this.firstLoanOpenMonth = firstLoanOpenMonth;
	}

	public String getLoancardCount() {
		return loancardCount;
	}

	public void setLoancardCount(String loancardCount) {
		this.loancardCount = loancardCount;
	}

	public String getFirstLoancardOpenMonth() {
		return firstLoancardOpenMonth;
	}

	public void setFirstLoancardOpenMonth(String firstLoancardOpenMonth) {
		this.firstLoancardOpenMonth = firstLoancardOpenMonth;
	}

	public String getStandardLoancardCount() {
		return standardLoancardCount;
	}

	public void setStandardLoancardCount(String standardLoancardCount) {
		this.standardLoancardCount = standardLoancardCount;
	}

	public String getFirstStandardLoancardOpenMonth() {
		return firstStandardLoancardOpenMonth;
	}

	public void setFirstStandardLoancardOpenMonth(
			String firstStandardLoancardOpenMonth) {
		this.firstStandardLoancardOpenMonth = firstStandardLoancardOpenMonth;
	}
    
}
