package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100012Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:18:43
 */
public class Bsb100012Vo   extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 银行卡号*/
	@NotEmpty(message = "银行卡号不能为空！")
	private String bankCardNo;
	
	/** 客户姓名*/
	@NotEmpty(message = "客户姓名不能为空！")
	private String custName;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 证件号码*/
	@NotEmpty(message = "证件号码不能为空！")
	private String idNo;
	
	/** 手机号码*/
	@NotEmpty(message = "手机号码不能为空！")
	private String mobNo;

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
}
