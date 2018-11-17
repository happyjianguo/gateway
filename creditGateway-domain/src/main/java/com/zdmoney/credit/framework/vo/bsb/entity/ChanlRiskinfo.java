package com.zdmoney.credit.framework.vo.bsb.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ChanlRiskinfo {

	private String riskCode;
	
	private String riskCodeValue;

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskCodeValue() {
		return riskCodeValue;
	}

	public void setRiskCodeValue(String riskCodeValue) {
		this.riskCodeValue = riskCodeValue;
	}
	
	public String toString() {  
    	return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);   
    }
}
