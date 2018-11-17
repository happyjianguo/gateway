package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerOccupationListEntity {
	/**单位名称*/
    @NotEmpty(message = "单位名称不能为空！")
    private String UNIT_NAME;
    
    /**部门*/
    @NotEmpty(message = "部门不能为空！")
    private String DEPARTMENT;
    
    /**职业*/
    @NotEmpty(message = "职业不能为空！")
    private String PROFESSION;
    
    /**职业状况*/
    @NotEmpty(message = "职业状况不能为空！")
    private String STATETYPE;
    
    /**工作的区*/
    @NotEmpty(message = "工作的区不能为空！")
    private String WORKING_AREA;

    @JSONField(name = "UNIT_NAME")
	public String getUNIT_NAME() {
		return UNIT_NAME;
	}

	public void setUNIT_NAME(String uNIT_NAME) {
		UNIT_NAME = uNIT_NAME;
	}

	@JSONField(name = "DEPARTMENT")
	public String getDEPARTMENT() {
		return DEPARTMENT;
	}

	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}

	@JSONField(name = "PROFESSION")
	public String getPROFESSION() {
		return PROFESSION;
	}

	public void setPROFESSION(String pROFESSION) {
		PROFESSION = pROFESSION;
	}

	@JSONField(name = "STATETYPE")
	public String getSTATETYPE() {
		return STATETYPE;
	}

	public void setSTATETYPE(String sTATETYPE) {
		STATETYPE = sTATETYPE;
	}

	@JSONField(name = "WORKING_AREA")
	public String getWORKING_AREA() {
		return WORKING_AREA;
	}

	public void setWORKING_AREA(String wORKING_AREA) {
		WORKING_AREA = wORKING_AREA;
	}
    
}
