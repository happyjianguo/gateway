package com.zdmoney.credit.framework.vo.wm3.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 外贸3——申请放款，押品信息
 * @author 10098  2017年3月15日 上午11:46:01
 */
public class ApplyGageWm3Entity implements Serializable {

	private static final long serialVersionUID = -3593372136043416226L;
	/** 押品所有权人名称 **/
	private String gcustName;
	/** 押品所有权人证件类型 **/
	private String gcustIdtype;
	/** 押品所有权人证件号码 **/
	private String gcustIdno;
	/** 押品类型 **/
	private String gType;
	/** 押品名称 **/
	private String gName;
	/** 押品描述 **/
	private String gDesc;
	/** 押品评估价值 **/
	private BigDecimal gValue = new BigDecimal(0.00);
	/** 权证号码 **/
	private String gLicno;
	/** 权证类型 **/
	private String gLicType;

	public String getGcustName() {
		return gcustName;
	}
	public void setGcustName(String gcustName) {
		this.gcustName = gcustName;
	}
	public String getGcustIdtype() {
		return gcustIdtype;
	}
	public void setGcustIdtype(String gcustIdtype) {
		this.gcustIdtype = gcustIdtype;
	}
	public String getGcustIdno() {
		return gcustIdno;
	}
	public void setGcustIdno(String gcustIdno) {
		this.gcustIdno = gcustIdno;
	}
	public String getgType() {
		return gType;
	}
	public void setgType(String gType) {
		this.gType = gType;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getgDesc() {
		return gDesc;
	}
	public void setgDesc(String gDesc) {
		this.gDesc = gDesc;
	}
	public BigDecimal getgValue() {
		return gValue;
	}
	public void setgValue(BigDecimal gValue) {
		this.gValue = gValue;
	}
	public String getgLicno() {
		return gLicno;
	}
	public void setgLicno(String gLicno) {
		this.gLicno = gLicno;
	}
	public String getgLicType() {
		return gLicType;
	}
	public void setgLicType(String gLicType) {
		this.gLicType = gLicType;
	}
	
}
