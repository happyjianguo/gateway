package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100013Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:18:48
 */
public class Bsb100013Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 短信验证码*/
	@NotEmpty(message = "短信验证码不能为空！")
	private String shtMessVerCd;
	
	/** 银行卡号*/
	@NotEmpty(message = "银行卡号不能为空！")
	private String bankCardNo;
	
	/** 银行卡类型*/
	@NotEmpty(message = "银行卡类型不能为空！")
	private String bankCardType;
	
	/** 客户姓名*/
	@NotEmpty(message = "客户姓名不能为空！")
	private String custName;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 证件号码*/
	@NotEmpty(message = "证件号码不能为空！")
	private String idNo;
	
	/** 银行卡预留手机号码*/
	@NotEmpty(message = "银行卡预留手机号码不能为空！")
	private String mobileNo;
	
	/** 认证状态*/
	private String validStatus;
	
	/** 开户行名*/
	private String openBankName;
	
	/** 业务流水号*/
	@NotEmpty(message = "业务流水号不能为空！")
	private String busNumber;

	public String getProdSubNo() {
		return prodSubNo;
	}

	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
	}

	public String getShtMessVerCd() {
		return shtMessVerCd;
	}

	public void setShtMessVerCd(String shtMessVerCd) {
		this.shtMessVerCd = shtMessVerCd;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getValidStatus() {
		return validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	public String getOpenBankName() {
		return openBankName;
	}

	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	
}