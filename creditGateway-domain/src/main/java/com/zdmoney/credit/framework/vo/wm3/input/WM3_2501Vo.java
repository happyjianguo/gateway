package com.zdmoney.credit.framework.vo.wm3.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;

/**
 * 功能号WM3_2501Vo Vo对象
 * 还款账号单笔维护
 * @author 10098  2017年5月24日 上午10:46:01
 */
public class WM3_2501Vo extends WM3BaseParamVo {

	private static final long serialVersionUID = 1L;
	/** 合作机构号 **/
	@NotBlank(message = "合作机构号不能为空！")
	private String brNo;
	/** 合同号 **/
	@NotBlank(message = "合同号不能为空！")
	private String pactNo;
	/** 操作类型 **/
	@NotBlank(message = "操作类型不能为空！")
	private String opType;
	/** 还款账号 **/
	@NotBlank(message = "还款账号不能为空！")
	private String newAcno;
	/** 还款账号名 **/
	@NotBlank(message = "还款账号名不能为空！")
	private String newAcname;
	/** 还款账号开户行代码 **/
	@NotBlank(message = "还款账号开户行代码不能为空！")
	private String newAcbankno;
	/** 还款账号开户行名称 **/
	@NotBlank(message = "还款账号开户行名称不能为空！")
	private String newAcbankname;
	/** 开户银行所在省 **/
	private String newBankProv;
	/** 开户银行所在市 **/
	private String newBankCity;
	/** 开户银行网点 **/
	private String newBankSite;
	/** 证件类型 **/
	@NotBlank(message = "证件类型不能为空！")
	private String idType;
	/** 证件号码 **/
	@NotBlank(message = "证件号码不能为空！")
	private String idNo;
	/** 银行预留手机号 **/
	private String phoneNo;
	/** 信用卡有效期 **/
	private String validDate;
	/** 信用卡CVV2码 **/
	private String cvvNo;
	/** 变更原因 **/
	private String chgReason;
	/** 是否有扣款授权书 **/
	@NotBlank(message = "是否有扣款授权书不能为空！")
	private String ifAuth;
	/** 账户类型 **/
	@NotBlank(message = "账户类型不能为空！")
	private String acType;
	public String getBrNo() {
		return brNo;
	}
	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getNewAcno() {
		return newAcno;
	}
	public void setNewAcno(String newAcno) {
		this.newAcno = newAcno;
	}
	public String getNewAcname() {
		return newAcname;
	}
	public void setNewAcname(String newAcname) {
		this.newAcname = newAcname;
	}
	public String getNewAcbankno() {
		return newAcbankno;
	}
	public void setNewAcbankno(String newAcbankno) {
		this.newAcbankno = newAcbankno;
	}
	public String getNewAcbankname() {
		return newAcbankname;
	}
	public void setNewAcbankname(String newAcbankname) {
		this.newAcbankname = newAcbankname;
	}
	public String getNewBankProv() {
		return newBankProv;
	}
	public void setNewBankProv(String newBankProv) {
		this.newBankProv = newBankProv;
	}
	public String getNewBankCity() {
		return newBankCity;
	}
	public void setNewBankCity(String newBankCity) {
		this.newBankCity = newBankCity;
	}
	public String getNewBankSite() {
		return newBankSite;
	}
	public void setNewBankSite(String newBankSite) {
		this.newBankSite = newBankSite;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public String getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(String cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getChgReason() {
		return chgReason;
	}
	public void setChgReason(String chgReason) {
		this.chgReason = chgReason;
	}
	public String getIfAuth() {
		return ifAuth;
	}
	public void setIfAuth(String ifAuth) {
		this.ifAuth = ifAuth;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
}
