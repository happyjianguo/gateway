package com.zdmoney.credit.framework.vo.bsb.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class CompanyInfo {
	
	/** 工作性质*/
	private String workNature;
	
	/** 关系*/
	@NotEmpty(message = "关系不能为空！")
	private String relation;
	
	/** 现单位名称*/
	@NotEmpty(message = "现单位名称不能为空！")
	private String comyName;
	
	/** 所在部门*/
	private String department;
	
	/** 月均收入*/
	@NotNull(message = "月均收入不能为空！")
	private BigDecimal monthIncome;
	
	/** 现单位性质*/
	@NotEmpty(message = "现单位性质不能为空！")
	private String comyNature;
	
	/** 现单位工龄*/
	private String workingYears;
	
	/** 现单位地址省*/
	private String comyAddPro;
	
	/** 现单位地址市*/
	private String comyAddCity;
	
	/** 详细地址*/
	private String comyAdd;
	
	/** 现单位邮编*/
	private String comyZipCode;
	
	/** 办公电话*/
	private String workPhone;
	
	/** 办公电话2*/
	private String workPhoneTwo;

	public String getWorkNature() {
		return workNature;
	}

	public void setWorkNature(String workNature) {
		this.workNature = workNature;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getComyName() {
		return comyName;
	}

	public void setComyName(String comyName) {
		this.comyName = comyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public BigDecimal getMonthIncome() {
		return monthIncome;
	}

	public void setMonthIncome(BigDecimal monthIncome) {
		this.monthIncome = monthIncome;
	}

	public String getComyNature() {
		return comyNature;
	}

	public void setComyNature(String comyNature) {
		this.comyNature = comyNature;
	}

	public String getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}

	public String getComyAddPro() {
		return comyAddPro;
	}

	public void setComyAddPro(String comyAddPro) {
		this.comyAddPro = comyAddPro;
	}

	public String getComyAddCity() {
		return comyAddCity;
	}

	public void setComyAddCity(String comyAddCity) {
		this.comyAddCity = comyAddCity;
	}

	public String getComyAdd() {
		return comyAdd;
	}

	public void setComyAdd(String comyAdd) {
		this.comyAdd = comyAdd;
	}

	public String getComyZipCode() {
		return comyZipCode;
	}

	public void setComyZipCode(String comyZipCode) {
		this.comyZipCode = comyZipCode;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getWorkPhoneTwo() {
		return workPhoneTwo;
	}

	public void setWorkPhoneTwo(String workPhoneTwo) {
		this.workPhoneTwo = workPhoneTwo;
	}
	
}
