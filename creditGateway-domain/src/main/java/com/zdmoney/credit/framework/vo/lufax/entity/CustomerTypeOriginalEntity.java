package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerTypeOriginalEntity {
	/**户口所在地*/
    @NotEmpty(message = "户口所在地不能为空！")
    private String RESIDENCE_AREA;
    
    /**雇佣类型*/
    @NotEmpty(message = "雇佣类型不能为空！")
    private String EMPLOYEE_TYPE;
    
    /**婚姻状况*/
    @NotEmpty(message = "婚姻状况不能为空！")
    private String MARITAL_STATUS;

    /**发生过逾期的贷款总次数*/
    private String OVERDUE_SUM;
    
    /**发生过逾期的贷记卡总账户数*/
    private String CREDIT_CARDS_OVERDUE_SUM;
    
    /**发生过90天以上逾期的贷款总次数*/
    private String NINTY_OVERDUE_SUM;
    
    /**发生过90天以上逾期的贷记卡总账户数*/
    private String NINTY_CREDIT_CARDS_OVERDUE_SUM;
    
    /**月负债*/
    private String DEBT_INFO;
    
    /**借款人主体性质*/
    private String SUBJECT_NATURE_OF_BORROWER;
    
    @JSONField(name = "RESIDENCE_AREA")
	public String getRESIDENCE_AREA() {
		return RESIDENCE_AREA;
	}

	public void setRESIDENCE_AREA(String rESIDENCE_AREA) {
		RESIDENCE_AREA = rESIDENCE_AREA;
	}

	@JSONField(name = "EMPLOYEE_TYPE")
	public String getEMPLOYEE_TYPE() {
		return EMPLOYEE_TYPE;
	}

	public void setEMPLOYEE_TYPE(String eMPLOYEE_TYPE) {
		EMPLOYEE_TYPE = eMPLOYEE_TYPE;
	}

	@JSONField(name = "MARITAL_STATUS")
	public String getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}

	public void setMARITAL_STATUS(String mARITAL_STATUS) {
		MARITAL_STATUS = mARITAL_STATUS;
	}

	@JSONField(name = "OVERDUE_SUM")
	public String getOVERDUE_SUM() {
		return OVERDUE_SUM;
	}

	public void setOVERDUE_SUM(String oVERDUE_SUM) {
		OVERDUE_SUM = oVERDUE_SUM;
	}

	@JSONField(name = "CREDIT_CARDS_OVERDUE_SUM")
	public String getCREDIT_CARDS_OVERDUE_SUM() {
		return CREDIT_CARDS_OVERDUE_SUM;
	}

	public void setCREDIT_CARDS_OVERDUE_SUM(String cREDIT_CARDS_OVERDUE_SUM) {
		CREDIT_CARDS_OVERDUE_SUM = cREDIT_CARDS_OVERDUE_SUM;
	}

	@JSONField(name = "NINTY_OVERDUE_SUM")
	public String getNINTY_OVERDUE_SUM() {
		return NINTY_OVERDUE_SUM;
	}

	public void setNINTY_OVERDUE_SUM(String nINTY_OVERDUE_SUM) {
		NINTY_OVERDUE_SUM = nINTY_OVERDUE_SUM;
	}

	@JSONField(name = "NINTY_CREDIT_CARDS_OVERDUE_SUM")
	public String getNINTY_CREDIT_CARDS_OVERDUE_SUM() {
		return NINTY_CREDIT_CARDS_OVERDUE_SUM;
	}

	public void setNINTY_CREDIT_CARDS_OVERDUE_SUM(
			String nINTY_CREDIT_CARDS_OVERDUE_SUM) {
		NINTY_CREDIT_CARDS_OVERDUE_SUM = nINTY_CREDIT_CARDS_OVERDUE_SUM;
	}

	@JSONField(name = "DEBT_INFO")
	public String getDEBT_INFO() {
		return DEBT_INFO;
	}

	public void setDEBT_INFO(String dEBT_INFO) {
		DEBT_INFO = dEBT_INFO;
	}

	@JSONField(name = "SUBJECT_NATURE_OF_BORROWER")
	public String getSUBJECT_NATURE_OF_BORROWER() {
		return SUBJECT_NATURE_OF_BORROWER;
	}

	public void setSUBJECT_NATURE_OF_BORROWER(String sUBJECT_NATURE_OF_BORROWER) {
		SUBJECT_NATURE_OF_BORROWER = sUBJECT_NATURE_OF_BORROWER;
	}
    
}
