package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class ApplicationListEntity {
	/**订单编号*/
    @NotEmpty(message = "订单编号不能为空！")
    private String APPL_NO_HOST;
    
    /**陆金所网站用户名*/
    @NotEmpty(message = "陆金所网站用户名不能为空！")
    private String LUFAX_BORROWER_USERNAME;
    
    /**借款申请ID*/
    @NotEmpty(message = "借款申请ID不能为空！")
    private String lufax_loan_req_id;
    
    /**申请日期*/
    @NotEmpty(message = "申请日期不能为空！")
    private String APPL_DATE;
    
    /**申请类型*/
    @NotEmpty(message = "申请类型不能为空！")
    private String APPL_TYPE;
    
    /**借款金额*/
    @NotEmpty(message = "借款金额不能为空！")
    private String APPL_TOTAL_AMOUNT;
    
    /**贷款期限*/
    @NotEmpty(message = "贷款期限不能为空！")
    private String APPL_TERM;
    
    /**贷款期限单位*/
    @NotEmpty(message = "贷款期限单位不能为空！")
    private String APPL_TERM_UNIT;
    
    /**贷款期数*/
    @NotEmpty(message = "贷款期数不能为空！")
    private String APPL_INSTALMENT_NUM;
    
    /**贷款利率*/
    @NotEmpty(message = "贷款利率不能为空！")
    private String LOAN_RATE;
    
    /**还款银行*/
    @NotEmpty(message = "还款银行不能为空！")
    private String PAYEE_BANK_NAME;
    
    /**还款银行编码*/
    @NotEmpty(message = "还款银行编码不能为空！")
    private String PAYEE_BANK_CODE;
    
    /**还款银行分行*/
    @NotEmpty(message = "还款银行分行不能为空！")
    private String PAYEE_BANK_BRANCE;
    
    /**还款帐户*/
    @NotEmpty(message = "还款帐户不能为空！")
    private String PAYEE_ACCOUNT;
    
    /**还款姓名*/
    @NotEmpty(message = "还款姓名不能为空！")
    private String PAYEE_NAME;
    
    /**申请件类型*/
    @NotEmpty(message = "申请件类型不能为空！")
    private String APPL_FLAG;
    
    /**审批意见*/
    @NotEmpty(message = "审批意见不能为空！")
    private String AUDIT_INFO;
    
    /**还款方式*/
    @NotEmpty(message = "还款方式不能为空！")
    private String REPAYMENT_METHOD;
    
    /**还款周期*/
    @NotEmpty(message = "还款周期不能为空！")
    private String RETURN_PERIOD;
    
    /**账户类型*/
    @NotEmpty(message = "账户类型不能为空！")
    private String ACCOUNT_TYPE;
    
    /**银行卡鉴权手机号码*/
    @NotEmpty(message = "银行卡鉴权手机号码不能为空！")
    private String IDENDITY_PHONE;
    
    /**银行预留手机号码*/
    @NotEmpty(message = "银行预留手机号码不能为空！")
    private String RETAIN_PHONE;
    
    /**贷款类型*/
    @NotEmpty(message = "贷款类型不能为空！")
    private String LOAN_TYPE;
    
    /**贷款种类*/
    @NotEmpty(message = "贷款种类不能为空！")
    private String LOAN_CLASS;
    
    /**产品小类编码*/
    @NotEmpty(message = "产品小类编码不能为空！")
    private String PRODUCT_CODE;
    
    /**产品大类编码*/
    @NotEmpty(message = "产品大类编码不能为空！")
    private String PARENT_PRODUCT_CODE;
    
    /**产品大类*/
    @NotEmpty(message = "产品大类不能为空！")
    private String CHANNEL_CODE;
    
    /**服务方*/
    @NotEmpty(message = "服务方不能为空！")
    private String service_company_code;
    
    /**机构编码*/
    @NotEmpty(message = "机构编码不能为空！")
    private String DEPT_NO;
    
    /**贷款目的*/
    @NotEmpty(message = "贷款目的不能为空！")
    private String APPL_PURPOSE;

    @JSONField(name = "APPL_NO_HOST")
	public String getAPPL_NO_HOST() {
		return APPL_NO_HOST;
	}

	public void setAPPL_NO_HOST(String APPL_NO_HOST) {
		this.APPL_NO_HOST = APPL_NO_HOST;
	}

	@JSONField(name = "LUFAX_BORROWER_USERNAME")
	public String getLUFAX_BORROWER_USERNAME() {
		return LUFAX_BORROWER_USERNAME;
	}

	public void setLUFAX_BORROWER_USERNAME(String lUFAX_BORROWER_USERNAME) {
		LUFAX_BORROWER_USERNAME = lUFAX_BORROWER_USERNAME;
	}

	public String getLufax_loan_req_id() {
		return lufax_loan_req_id;
	}

	public void setLufax_loan_req_id(String lufax_loan_req_id) {
		this.lufax_loan_req_id = lufax_loan_req_id;
	}

	@JSONField(name = "APPL_DATE")
	public String getAPPL_DATE() {
		return APPL_DATE;
	}

	public void setAPPL_DATE(String aPPL_DATE) {
		APPL_DATE = aPPL_DATE;
	}
	
	@JSONField(name = "APPL_TYPE")
	public String getAPPL_TYPE() {
		return APPL_TYPE;
	}

	public void setAPPL_TYPE(String aPPL_TYPE) {
		APPL_TYPE = aPPL_TYPE;
	}

	@JSONField(name = "APPL_TOTAL_AMOUNT")
	public String getAPPL_TOTAL_AMOUNT() {
		return APPL_TOTAL_AMOUNT;
	}

	public void setAPPL_TOTAL_AMOUNT(String aPPL_TOTAL_AMOUNT) {
		APPL_TOTAL_AMOUNT = aPPL_TOTAL_AMOUNT;
	}

	@JSONField(name = "APPL_TERM")
	public String getAPPL_TERM() {
		return APPL_TERM;
	}

	public void setAPPL_TERM(String aPPL_TERM) {
		APPL_TERM = aPPL_TERM;
	}

	
	@JSONField(name = "APPL_TERM_UNIT")
	public String getAPPL_TERM_UNIT() {
		return APPL_TERM_UNIT;
	}

	public void setAPPL_TERM_UNIT(String aPPL_TERM_UNIT) {
		APPL_TERM_UNIT = aPPL_TERM_UNIT;
	}

	@JSONField(name = "APPL_INSTALMENT_NUM")
	public String getAPPL_INSTALMENT_NUM() {
		return APPL_INSTALMENT_NUM;
	}

	public void setAPPL_INSTALMENT_NUM(String aPPL_INSTALMENT_NUM) {
		APPL_INSTALMENT_NUM = aPPL_INSTALMENT_NUM;
	}

	@JSONField(name = "LOAN_RATE")
	public String getLOAN_RATE() {
		return LOAN_RATE;
	}

	public void setLOAN_RATE(String lOAN_RATE) {
		LOAN_RATE = lOAN_RATE;
	}

	@JSONField(name = "PAYEE_BANK_NAME")
	public String getPAYEE_BANK_NAME() {
		return PAYEE_BANK_NAME;
	}

	public void setPAYEE_BANK_NAME(String pAYEE_BANK_NAME) {
		PAYEE_BANK_NAME = pAYEE_BANK_NAME;
	}

	@JSONField(name = "PAYEE_BANK_CODE")
	public String getPAYEE_BANK_CODE() {
		return PAYEE_BANK_CODE;
	}

	public void setPAYEE_BANK_CODE(String pAYEE_BANK_CODE) {
		PAYEE_BANK_CODE = pAYEE_BANK_CODE;
	}

	@JSONField(name = "PAYEE_BANK_BRANCE")
	public String getPAYEE_BANK_BRANCE() {
		return PAYEE_BANK_BRANCE;
	}

	public void setPAYEE_BANK_BRANCE(String pAYEE_BANK_BRANCE) {
		PAYEE_BANK_BRANCE = pAYEE_BANK_BRANCE;
	}

	@JSONField(name = "PAYEE_ACCOUNT")
	public String getPAYEE_ACCOUNT() {
		return PAYEE_ACCOUNT;
	}

	public void setPAYEE_ACCOUNT(String pAYEE_ACCOUNT) {
		PAYEE_ACCOUNT = pAYEE_ACCOUNT;
	}

	@JSONField(name = "PAYEE_NAME")
	public String getPAYEE_NAME() {
		return PAYEE_NAME;
	}

	public void setPAYEE_NAME(String pAYEE_NAME) {
		PAYEE_NAME = pAYEE_NAME;
	}

	@JSONField(name = "APPL_FLAG")
	public String getAPPL_FLAG() {
		return APPL_FLAG;
	}

	public void setAPPL_FLAG(String aPPL_FLAG) {
		APPL_FLAG = aPPL_FLAG;
	}

	@JSONField(name = "AUDIT_INFO")
	public String getAUDIT_INFO() {
		return AUDIT_INFO;
	}

	public void setAUDIT_INFO(String aUDIT_INFO) {
		AUDIT_INFO = aUDIT_INFO;
	}

	@JSONField(name = "REPAYMENT_METHOD")
	public String getREPAYMENT_METHOD() {
		return REPAYMENT_METHOD;
	}

	public void setREPAYMENT_METHOD(String rEPAYMENT_METHOD) {
		REPAYMENT_METHOD = rEPAYMENT_METHOD;
	}

	@JSONField(name = "RETURN_PERIOD")
	public String getRETURN_PERIOD() {
		return RETURN_PERIOD;
	}

	public void setRETURN_PERIOD(String rETURN_PERIOD) {
		RETURN_PERIOD = rETURN_PERIOD;
	}

	@JSONField(name = "ACCOUNT_TYPE")
	public String getACCOUNT_TYPE() {
		return ACCOUNT_TYPE;
	}

	public void setACCOUNT_TYPE(String aCCOUNT_TYPE) {
		ACCOUNT_TYPE = aCCOUNT_TYPE;
	}

	@JSONField(name = "LOAN_TYPE")
	public String getLOAN_TYPE() {
		return LOAN_TYPE;
	}

	public void setLOAN_TYPE(String lOAN_TYPE) {
		LOAN_TYPE = lOAN_TYPE;
	}

	@JSONField(name = "PRODUCT_CODE")
	public String getPRODUCT_CODE() {
		return PRODUCT_CODE;
	}

	public void setPRODUCT_CODE(String pRODUCT_CODE) {
		PRODUCT_CODE = pRODUCT_CODE;
	}

	@JSONField(name = "PARENT_PRODUCT_CODE")
	public String getPARENT_PRODUCT_CODE() {
		return PARENT_PRODUCT_CODE;
	}

	public void setPARENT_PRODUCT_CODE(String pARENT_PRODUCT_CODE) {
		PARENT_PRODUCT_CODE = pARENT_PRODUCT_CODE;
	}

	@JSONField(name = "CHANNEL_CODE")
	public String getCHANNEL_CODE() {
		return CHANNEL_CODE;
	}

	public void setCHANNEL_CODE(String cHANNEL_CODE) {
		CHANNEL_CODE = cHANNEL_CODE;
	}

	public String getService_company_code() {
		return service_company_code;
	}

	public void setService_company_code(String service_company_code) {
		this.service_company_code = service_company_code;
	}

	@JSONField(name = "DEPT_NO")
	public String getDEPT_NO() {
		return DEPT_NO;
	}

	public void setDEPT_NO(String dEPT_NO) {
		DEPT_NO = dEPT_NO;
	}

	@JSONField(name = "RETAIN_PHONE")
	public String getRETAIN_PHONE() {
		return RETAIN_PHONE;
	}

	public void setRETAIN_PHONE(String rETAIN_PHONE) {
		RETAIN_PHONE = rETAIN_PHONE;
	}

	@JSONField(name = "IDENDITY_PHONE")
	public String getIDENDITY_PHONE() {
		return IDENDITY_PHONE;
	}

	public void setIDENDITY_PHONE(String iDENDITY_PHONE) {
		IDENDITY_PHONE = iDENDITY_PHONE;
	}

	@JSONField(name = "LOAN_CLASS")
	public String getLOAN_CLASS() {
		return LOAN_CLASS;
	}

	public void setLOAN_CLASS(String lOAN_CLASS) {
		LOAN_CLASS = lOAN_CLASS;
	}

	@JSONField(name = "APPL_PURPOSE")
	public String getAPPL_PURPOSE() {
		return APPL_PURPOSE;
	}

	public void setAPPL_PURPOSE(String aPPL_PURPOSE) {
		APPL_PURPOSE = aPPL_PURPOSE;
	}
    
}
