package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100007Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:43:43
 */
public class Bsb100007Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 未还金额*/
	@NotEmpty(message = "未还金额不能为空！")
	private String remainderAmt;
	
	/** 商户编号*/
	@NotEmpty(message = "商户编号不能为空！")
	private String mercNo;
	
	/** 商户名称*/
	private String mercName;
	
	/** 借据号*/
	@NotEmpty(message = "借据号不能为空！")
	private String orderNo;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 证件号码*/
	@NotEmpty(message = "证件号码不能为空！")
	private String idNo;
	
	/** 手机号码*/
	@NotEmpty(message = "手机号码不能为空！")
	private String mobNo;
	
	/** 通知回调地址*/
	private String callbackUrl;
	
	/** 客户姓名*/
	@NotEmpty(message = "客户姓名不能为空！")
	private String custName;
	
	/** 预留*/
	private String remark;
	public String getRemainderAmt() {
		return remainderAmt;
	}
	public void setRemainderAmt(String remainderAmt) {
		this.remainderAmt = remainderAmt;
	}
	public String getMercNo() {
		return mercNo;
	}
	public void setMercNo(String mercNo) {
		this.mercNo = mercNo;
	}
	public String getMercName() {
		return mercName;
	}
	public void setMercName(String mercName) {
		this.mercName = mercName;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
