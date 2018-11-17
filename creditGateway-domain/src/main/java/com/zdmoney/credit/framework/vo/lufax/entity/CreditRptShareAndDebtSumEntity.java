package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CreditRptShareAndDebtSumEntity {
	/**订单编号*/
//    @NotEmpty(message = "订单编号不能为空！")
    private String applNoHost;
    
    /**授信及负债信息是否为空*/
//    @NotEmpty(message = "授信及负债信息是否为空不能为空！")
    private String isEmpty;
    
    /**授信及负债信息代码*/
//    @NotEmpty(message = "授信及负债信息代码不能为空！")
    private String ShareAndDebtCD;
    
    /**贷款机构数/发卡机构数 */
//    @NotEmpty(message = "贷款机构数/发卡机构数不能为空！")
    private String financeOrgCount;
    
    /**笔数/账户数 */
//    @NotEmpty(message = "笔数/账户数不能为空！")
    private String accountCount;
    
    /**合同金额/授信总额 */
//    @NotEmpty(message = "合同金额/授信总额不能为空！")
    private String creditLimit;
    
    /**单家行最高授信额度 */
//    @NotEmpty(message = "单家行最高授信额度不能为空！")
    private String maxCreditLimitPerOrg;
    
    /**余额 */
//    @NotEmpty(message = "余额不能为空！")
    private String balance;
    
    /**已用额度/透支余额*/
//    @NotEmpty(message = "已用额度/透支余额不能为空！")
    private String usedCreditLimit;

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
	
	@JSONField(name = "ShareAndDebtCD")
	public String getShareAndDebtCD() {
		return ShareAndDebtCD;
	}

	public void setShareAndDebtCD(String shareAndDebtCD) {
		ShareAndDebtCD = shareAndDebtCD;
	}

	public String getFinanceOrgCount() {
		return financeOrgCount;
	}

	public void setFinanceOrgCount(String financeOrgCount) {
		this.financeOrgCount = financeOrgCount;
	}

	public String getAccountCount() {
		return accountCount;
	}

	public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getMaxCreditLimitPerOrg() {
		return maxCreditLimitPerOrg;
	}

	public void setMaxCreditLimitPerOrg(String maxCreditLimitPerOrg) {
		this.maxCreditLimitPerOrg = maxCreditLimitPerOrg;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getUsedCreditLimit() {
		return usedCreditLimit;
	}

	public void setUsedCreditLimit(String usedCreditLimit) {
		this.usedCreditLimit = usedCreditLimit;
	}
    
}
