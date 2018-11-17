package com.zdmoney.credit.framework.vo.lufax.input;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.alibaba.fastjson.annotation.JSONField;
import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.framework.vo.lufax.entity.CreditInfoEntity;
import com.zdmoney.credit.framework.vo.lufax.entity.CustomerInfoEntity;

/**
 * @ClassName:     Lufax100001Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100001Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    /** 客户信息*/
	@Valid
	@NotNull(message = "客户信息不能为空！")
    private CustomerInfoEntity CUSTOMER_INFO;
	
	/** 征信信息*/
	@Valid
	@NotNull(message = "征信信息不能为空！")
    private CreditInfoEntity CREDIT_INFO;
	
	@JSONField(name = "CUSTOMER_INFO")
	public CustomerInfoEntity getCUSTOMER_INFO() {
		return CUSTOMER_INFO;
	}

	public void setCUSTOMER_INFO(CustomerInfoEntity cUSTOMER_INFO) {
		CUSTOMER_INFO = cUSTOMER_INFO;
	}

	@JSONField(name = "CREDIT_INFO")
	public CreditInfoEntity getCREDIT_INFO() {
		return CREDIT_INFO;
	}

	public void setCREDIT_INFO(CreditInfoEntity cREDIT_INFO) {
		CREDIT_INFO = cREDIT_INFO;
	}
	
}
