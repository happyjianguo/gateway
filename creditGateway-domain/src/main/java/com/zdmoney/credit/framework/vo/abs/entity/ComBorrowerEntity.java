package com.zdmoney.credit.framework.vo.abs.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 共同借款人
 * @author 10098  2016年11月11日 上午11:27:23
 */
public class ComBorrowerEntity {
	/** 借款人名称 **/
	@NotBlank(message = "借款人名称不能为空！")
	private String comName;
	/** 证件类型 **/
	@NotBlank(message = "证件类型不能为空！")
	private String comIdtype;
	/** 证件号码 **/
	@NotBlank(message = "证件号码不能为空！")
	private String comIdno;
	/** 联系电话 **/
	@NotBlank(message = "联系电话不能为空！")
	private String comTel;
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComIdtype() {
		return comIdtype;
	}
	public void setComIdtype(String comIdtype) {
		this.comIdtype = comIdtype;
	}
	public String getComIdno() {
		return comIdno;
	}
	public void setComIdno(String comIdno) {
		this.comIdno = comIdno;
	}
	public String getComTel() {
		return comTel;
	}
	public void setComTel(String comTel) {
		this.comTel = comTel;
	}
	
}
