package com.zdmoney.credit.framework.vo.abs.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 借款关联人
 * @author 10098  2016年11月11日 上午11:31:31
 */
public class RelBorrowerEntity {

	/** 借款人名称 **/
	@NotBlank(message = "借款人名称不能为空！")
	private String relName;
	/** 证件类型 **/
	@NotBlank(message = "证件类型不能为空！")
	private String relIdtype;
	/** 证件号码 **/
	@NotBlank(message = "证件号码不能为空！")
	private String relIdno;
	/** 联系电话 **/
	@NotBlank(message = "联系电话不能为空！")
	private String relTel;
	public String getRelName() {
		return relName;
	}
	public void setRelName(String relName) {
		this.relName = relName;
	}
	public String getRelIdtype() {
		return relIdtype;
	}
	public void setRelIdtype(String relIdtype) {
		this.relIdtype = relIdtype;
	}
	public String getRelIdno() {
		return relIdno;
	}
	public void setRelIdno(String relIdno) {
		this.relIdno = relIdno;
	}
	public String getRelTel() {
		return relTel;
	}
	public void setRelTel(String relTel) {
		this.relTel = relTel;
	}
}
