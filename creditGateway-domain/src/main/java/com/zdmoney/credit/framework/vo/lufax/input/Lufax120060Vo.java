package com.zdmoney.credit.framework.vo.lufax.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100001Vo.java
 * @author YM10184
 */
public class Lufax120060Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    /**贷款受理号*/
    @NotEmpty(message = "贷款受理号不能为空！")
    private String anshuo_loan_accept_id;
    
    /**服务公司*/
    @NotEmpty(message = "服务公司不能为空！")
    private String service_company;
    
    /**产品类型*/
    @NotEmpty(message = "产品类型不能为空！")
    private String product_type;
    
    /**采集信息来源*/
    @NotEmpty(message = "采集信息来源不能为空！")
    private String info_from;
    
    /**证件类型*/
    @NotEmpty(message = "证件类型不能为空！")
    private String identity_type;
    
    /**证件号码*/
    @NotEmpty(message = "证件号码不能为空！")
    private String identity_no;
    
    /**客户姓名*/
    @NotEmpty(message = "客户姓名不能为空！")
    private String name;
    
    /**贷款目的*/
    @NotEmpty(message = "贷款目的不能为空！")
    private String apply_purpose;
    
    /**教育程度*/
    @NotEmpty(message = "教育程度不能为空！")
    private String education;
    
    /**婚姻状况*/
    @NotEmpty(message = "婚姻状况不能为空！")
    private String marital_status;
    
    /**月收入*/
    @NotEmpty(message = "月收入不能为空！")
    private String monthly_income;
    
    /**雇佣类型*/
    @NotEmpty(message = "雇佣类型不能为空！")
    private String income_type;
    
    /**单位名称*/
    @NotEmpty(message = "单位名称不能为空！")
    private String unit_name;
    
    /**单位所在省*/
    @NotEmpty(message = "单位所在省不能为空！")
    private String unit_province;
    
    /**单位所在市*/
    @NotEmpty(message = "单位所在市不能为空！")
    private String unit_city;
    
    /**单位所在区*/
    @NotEmpty(message = "单位所在区不能为空！")
    private String unit_district;
    
    /**单位详细地址*/
    @NotEmpty(message = "单位详细地址不能为空！")
    private String unit_address;
    
    /**居住地所在省*/
    @NotEmpty(message = "居住地所在省不能为空！")
    private String home_province;
    
    /**居住地所在市*/
    @NotEmpty(message = "居住地所在市不能为空！")
    private String home_city;
    
    /**居住地所在区*/
    @NotEmpty(message = "居住地所在区不能为空！")
    private String home_district;
    
    /**居住地详细地址*/
    @NotEmpty(message = "居住地详细地址不能为空！")
    private String home_address;
    
    /**联系人与借款人关系*/
    @NotEmpty(message = "联系人与借款人关系不能为空！")
    private String releation;
    
    /**联系人姓名*/
    @NotEmpty(message = "联系人姓名不能为空！")
    private String contract_name;
    
    /**联系人联系方式*/
    @NotEmpty(message = "联系人联系方式不能为空！")
    private String contract_phone_no;
    
    /**借款人部门*/
    @NotEmpty(message = "借款人部门不能为空！")
    private String department;
    
    /**借款人职业*/
    @NotEmpty(message = "借款人职业不能为空！")
    private String profession;

	public String getAnshuo_loan_accept_id() {
		return anshuo_loan_accept_id;
	}

	public void setAnshuo_loan_accept_id(String anshuo_loan_accept_id) {
		this.anshuo_loan_accept_id = anshuo_loan_accept_id;
	}

	public String getService_company() {
		return service_company;
	}

	public void setService_company(String service_company) {
		this.service_company = service_company;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getInfo_from() {
		return info_from;
	}

	public void setInfo_from(String info_from) {
		this.info_from = info_from;
	}

	public String getIdentity_type() {
		return identity_type;
	}

	public void setIdentity_type(String identity_type) {
		this.identity_type = identity_type;
	}

	public String getIdentity_no() {
		return identity_no;
	}

	public void setIdentity_no(String identity_no) {
		this.identity_no = identity_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApply_purpose() {
		return apply_purpose;
	}

	public void setApply_purpose(String apply_purpose) {
		this.apply_purpose = apply_purpose;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getMonthly_income() {
		return monthly_income;
	}

	public void setMonthly_income(String monthly_income) {
		this.monthly_income = monthly_income;
	}

	public String getIncome_type() {
		return income_type;
	}

	public void setIncome_type(String income_type) {
		this.income_type = income_type;
	}

	public String getUnit_name() {
		return unit_name;
	}

	public void setUnit_name(String unit_name) {
		this.unit_name = unit_name;
	}

	public String getUnit_province() {
		return unit_province;
	}

	public void setUnit_province(String unit_province) {
		this.unit_province = unit_province;
	}

	public String getUnit_city() {
		return unit_city;
	}

	public void setUnit_city(String unit_city) {
		this.unit_city = unit_city;
	}

	public String getUnit_district() {
		return unit_district;
	}

	public void setUnit_district(String unit_district) {
		this.unit_district = unit_district;
	}

	public String getUnit_address() {
		return unit_address;
	}

	public void setUnit_address(String unit_address) {
		this.unit_address = unit_address;
	}

	public String getHome_province() {
		return home_province;
	}

	public void setHome_province(String home_province) {
		this.home_province = home_province;
	}

	public String getHome_city() {
		return home_city;
	}

	public void setHome_city(String home_city) {
		this.home_city = home_city;
	}

	public String getHome_district() {
		return home_district;
	}

	public void setHome_district(String home_district) {
		this.home_district = home_district;
	}

	public String getHome_address() {
		return home_address;
	}

	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}

	public String getReleation() {
		return releation;
	}

	public void setReleation(String releation) {
		this.releation = releation;
	}

	public String getContract_name() {
		return contract_name;
	}

	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}

	public String getContract_phone_no() {
		return contract_phone_no;
	}

	public void setContract_phone_no(String contract_phone_no) {
		this.contract_phone_no = contract_phone_no;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
    
}
