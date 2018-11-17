package com.zdmoney.credit.framework.vo.lufax.entity;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerInfoEntity {
	/** 申请信息*/
	@Valid
	@NotNull(message = "申请信息不能为空！")
	private ApplicationListEntity APPLICATION_LIST;
	
	/** 个人信息*/
	@Valid
	@NotNull(message = "个人信息不能为空！")
	private CustomerBaseListEntity CUSTOMER_BASE_LIST;
	
	/** 收入信息*/
	@Valid
	@NotEmpty(message = "收入信息不能为空！")
	private List<CustomerIncomeListEntity> CUSTOMER_INCOME_LIST;
	
	/** 贷款材料流水*/
	@Valid
	@NotNull(message = "贷款材料流水不能为空！")
	private List<CustomerSerialnoListEntity> CUSTOMER_SERIALNO_LIST;
	
	/** 贷款材料影像信息*/
	@Valid
	@NotEmpty(message = "贷款材料影像信息不能为空！")
	private List<ApplicationImageListEntity> APPLICATION_IMAGE_LIST;
	
	/** 客户信息原始数据*/
	@Valid
	@NotNull(message = "客户信息原始数据不能为空！")
	private CustomerTypeOriginalEntity CUSTOMER_TYPE_ORIGINAL;
	
	/** 职业信息*/
	@Valid
	@NotEmpty(message = "职业信息不能为空！")
	private List<CustomerOccupationListEntity> CUSTOMER_OCCUPATION_LIST;
	
	/** 地址信息*/
	@Valid
	@NotEmpty(message = "地址信息不能为空！")
	private List<CustomerAddressList> CUSTOMER_ADDRESS_LIST;
	
	@JSONField(name = "APPLICATION_LIST")
	public ApplicationListEntity getAPPLICATION_LIST() {
		return APPLICATION_LIST;
	}

	public void setAPPLICATION_LIST(ApplicationListEntity aPPLICATION_LIST) {
		APPLICATION_LIST = aPPLICATION_LIST;
	}
	
	@JSONField(name = "CUSTOMER_BASE_LIST")
	public CustomerBaseListEntity getCUSTOMER_BASE_LIST() {
		return CUSTOMER_BASE_LIST;
	}

	public void setCUSTOMER_BASE_LIST(CustomerBaseListEntity cUSTOMER_BASE_LIST) {
		CUSTOMER_BASE_LIST = cUSTOMER_BASE_LIST;
	}
	
	@JSONField(name = "CUSTOMER_INCOME_LIST")
	public List<CustomerIncomeListEntity> getCUSTOMER_INCOME_LIST() {
		return CUSTOMER_INCOME_LIST;
	}

	public void setCUSTOMER_INCOME_LIST(
			List<CustomerIncomeListEntity> cUSTOMER_INCOME_LIST) {
		CUSTOMER_INCOME_LIST = cUSTOMER_INCOME_LIST;
	}
	
	@JSONField(name = "CUSTOMER_SERIALNO_LIST")
	public List<CustomerSerialnoListEntity> getCUSTOMER_SERIALNO_LIST() {
		return CUSTOMER_SERIALNO_LIST;
	}

	public void setCUSTOMER_SERIALNO_LIST(
			List<CustomerSerialnoListEntity> cUSTOMER_SERIALNO_LIST) {
		CUSTOMER_SERIALNO_LIST = cUSTOMER_SERIALNO_LIST;
	}
	
	@JSONField(name = "APPLICATION_IMAGE_LIST")
	public List<ApplicationImageListEntity> getAPPLICATION_IMAGE_LIST() {
		return APPLICATION_IMAGE_LIST;
	}

	public void setAPPLICATION_IMAGE_LIST(
			List<ApplicationImageListEntity> aPPLICATION_IMAGE_LIST) {
		APPLICATION_IMAGE_LIST = aPPLICATION_IMAGE_LIST;
	}

	@JSONField(name = "CUSTOMER_TYPE_ORIGINAL")
	public CustomerTypeOriginalEntity getCUSTOMER_TYPE_ORIGINAL() {
		return CUSTOMER_TYPE_ORIGINAL;
	}

	public void setCUSTOMER_TYPE_ORIGINAL(
			CustomerTypeOriginalEntity cUSTOMER_TYPE_ORIGINAL) {
		CUSTOMER_TYPE_ORIGINAL = cUSTOMER_TYPE_ORIGINAL;
	}

	@JSONField(name = "CUSTOMER_OCCUPATION_LIST")
	public List<CustomerOccupationListEntity> getCUSTOMER_OCCUPATION_LIST() {
		return CUSTOMER_OCCUPATION_LIST;
	}

	public void setCUSTOMER_OCCUPATION_LIST(
			List<CustomerOccupationListEntity> cUSTOMER_OCCUPATION_LIST) {
		CUSTOMER_OCCUPATION_LIST = cUSTOMER_OCCUPATION_LIST;
	}

	@JSONField(name = "CUSTOMER_ADDRESS_LIST")
	public List<CustomerAddressList> getCUSTOMER_ADDRESS_LIST() {
		return CUSTOMER_ADDRESS_LIST;
	}

	public void setCUSTOMER_ADDRESS_LIST(
			List<CustomerAddressList> cUSTOMER_ADDRESS_LIST) {
		CUSTOMER_ADDRESS_LIST = cUSTOMER_ADDRESS_LIST;
	}
	
}
