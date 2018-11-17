package com.zdmoney.credit.framework.vo.wm3.input;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;

/**
 * 功能号WM3_5102Vo Vo对象
 * 溢缴款账户充值接口类
 * 
 */
public class WM3_5102Vo extends WM3BaseParamVo {

	private static final long serialVersionUID = 5118912428072955526L;

	/** 证件号 **/
	@NotBlank(message = "证件号不能为空！")
	private String idNo;

	/** 客户名称 **/
	@NotBlank(message = "客户名称不能为空！")
	private String custName;

	/** 溢缴款账户号 **/
	@NotBlank(message = "溢缴款账户号不能为空！")
	private String accountNo;

	/** 充值金额 **/
	@NotNull(message = "充值金额不能为空！")
	private BigDecimal amount;

	/** 扣款卡号 **/
	@NotBlank(message = "扣款卡号不能为空！")
	private String acctNo;

	/** 账户类型 **/
	@NotBlank(message = "账户类型不能为空！")
	private String acctType;

	/** 账户名称 **/
	@NotBlank(message = "账户名称不能为空！")
	private String acctName;

	/** 支付系统渠道（银行）编号 **/
	@NotBlank(message = "支付系统渠道（银行）编号不能为空！")
	private String channelNo;

	/** 联行号 **/
	@NotBlank(message = "联行号不能为空！")
	private String bankDetailNo;

	/** 开户行名称 **/
	@NotBlank(message = "开户行名称不能为空！")
	private String bankName;

	/** 开户行所在省 **/
	@NotBlank(message = "开户行所在省不能为空！")
	private String province;

	/** 开户行所在市 **/
	@NotBlank(message = "开户行所在市不能为空！")
	private String city;

	/** 信用卡3为安全码 **/
	@NotBlank(message = "信用卡3为安全码不能为空！")
	private String cvn2No;

	/** 信用卡有效期 **/
	@NotBlank(message = "信用卡有效期不能为空！")
	private String valDate;

	/** 手机号 **/
	@NotBlank(message = "手机号不能为空！")
	private String phoneNo;

	/** email **/
	@NotBlank(message = "email不能为空！")
	private String email;
	
	/** 证件类型 **/
	@NotBlank(message = "证件类型不能为空！")
	private String idType;
	
	/** 合同号 **/
	@NotBlank(message = "合同号不能为空！")
	private String pactNo;
	
	/** 机构号 **/
	@NotBlank(message = "机构号不能为空！")
	private String brNo;
	
	/** 流水号 **/
	@NotBlank(message = "流水号不能为空！")
	private String serialNo;

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}



	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public String getBankDetailNo() {
		return bankDetailNo;
	}

	public void setBankDetailNo(String bankDetailNo) {
		this.bankDetailNo = bankDetailNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCvn2No() {
		return cvn2No;
	}

	public void setCvn2No(String cvn2No) {
		this.cvn2No = cvn2No;
	}

	public String getValDate() {
		return valDate;
	}

	public void setValDate(String valDate) {
		this.valDate = valDate;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getPactNo() {
		return pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getBrNo() {
		return brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
      
}
