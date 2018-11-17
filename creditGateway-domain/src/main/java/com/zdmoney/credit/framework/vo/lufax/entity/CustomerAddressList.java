package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerAddressList {
	/**与借款人的关系*/
    @NotEmpty(message = "与借款人的关系不能为空！")
    private String RELATION;
    
    /**地址类型*/
    @NotEmpty(message = "地址类型不能为空！")
    private String ADDRESS_TYPE;
    
    /**国家*/
    @NotEmpty(message = "国家不能为空！")
    private String ADDRESS_COUNTRY;
    
    /**省*/
    @NotEmpty(message = "省不能为空！")
    private String ADDRESS_PROVINCE;
    
    /**市*/
    @NotEmpty(message = "市不能为空！")
    private String ADDRESS_CITY;
    
    /**区*/
    @NotEmpty(message = "区不能为空！")
    private String ADDRESS_DISTRICT;
    
    /**地址详情*/
    @NotEmpty(message = "地址详情不能为空！")
    private String ADDRESS;

    @JSONField(name = "RELATION")
	public String getRELATION() {
		return RELATION;
	}

	public void setRELATION(String rELATION) {
		RELATION = rELATION;
	}

	@JSONField(name = "ADDRESS_TYPE")
	public String getADDRESS_TYPE() {
		return ADDRESS_TYPE;
	}

	public void setADDRESS_TYPE(String aDDRESS_TYPE) {
		ADDRESS_TYPE = aDDRESS_TYPE;
	}

	@JSONField(name = "ADDRESS_COUNTRY")
	public String getADDRESS_COUNTRY() {
		return ADDRESS_COUNTRY;
	}

	public void setADDRESS_COUNTRY(String aDDRESS_COUNTRY) {
		ADDRESS_COUNTRY = aDDRESS_COUNTRY;
	}

	@JSONField(name = "ADDRESS_PROVINCE")
	public String getADDRESS_PROVINCE() {
		return ADDRESS_PROVINCE;
	}

	public void setADDRESS_PROVINCE(String aDDRESS_PROVINCE) {
		ADDRESS_PROVINCE = aDDRESS_PROVINCE;
	}

	@JSONField(name = "ADDRESS_CITY")
	public String getADDRESS_CITY() {
		return ADDRESS_CITY;
	}

	public void setADDRESS_CITY(String aDDRESS_CITY) {
		ADDRESS_CITY = aDDRESS_CITY;
	}

	@JSONField(name = "ADDRESS_DISTRICT")
	public String getADDRESS_DISTRICT() {
		return ADDRESS_DISTRICT;
	}

	public void setADDRESS_DISTRICT(String aDDRESS_DISTRICT) {
		ADDRESS_DISTRICT = aDDRESS_DISTRICT;
	}

	@JSONField(name = "ADDRESS")
	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
    
}
