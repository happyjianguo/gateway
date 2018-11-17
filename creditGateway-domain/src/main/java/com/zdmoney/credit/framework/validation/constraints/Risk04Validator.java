package com.zdmoney.credit.framework.validation.constraints;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.zdmoney.credit.framework.vo.bsb.entity.ChanlRiskinfo;

/**
 * @ClassName:     RiskValidator.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年2月7日 下午3:04:18
 */
public class Risk04Validator implements ConstraintValidator<Risk04, List<ChanlRiskinfo>> {
	
	private String value;

	@Override
	public void initialize(Risk04 parameters) {
		this.value = parameters.value();
	}

	@Override
	public boolean isValid(List<ChanlRiskinfo> list, ConstraintValidatorContext context) {
		// null values are valid
		if (list == null) {
			return true;
		}
		for(ChanlRiskinfo data:list){
			if(value.equals( data.getRiskCode())&& StringUtils.isNotEmpty(data.getRiskCodeValue())){
				return true;
			}
		}
		return false;
	}

}
