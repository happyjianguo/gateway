package com.zdmoney.credit.framework.vo.wm3.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 外贸3——申请放款，借款关联人信息
 * @author 10098  2017年3月15日 上午11:51:49
 */
public class ApplyRelationWm3Entity implements Serializable {
    private static final long serialVersionUID = 3163417782726789126L;
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
