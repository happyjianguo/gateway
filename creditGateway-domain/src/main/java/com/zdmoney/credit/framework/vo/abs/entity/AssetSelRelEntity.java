package com.zdmoney.credit.framework.vo.abs.entity;

import org.hibernate.validator.constraints.NotBlank;
/**
 * 资产挑选 --联系人信息
 * @author 10098  2016年11月25日 下午3:12:41
 */
public class AssetSelRelEntity {
	/** 联系人名称 **/
	@NotBlank(message = "联系人名称不能为空")
	private String relName;
	/** 联系人与申请人关系 **/
	@NotBlank(message = "联系人与申请人关系不能为空")
	private String contactRelation;
	/** 联系人性别 **/
	@NotBlank(message = "联系人性别不能为空")
	private String contactGender;
	/** 联系人是否知晓贷款 **/
	@NotBlank(message = "联系人是否知晓贷款不能为空")
	private String ifKnowLoan;
	/** 联系人职务 **/
	private String contactCorpPost;
	public String getRelName() {
		return relName;
	}
	public void setRelName(String relName) {
		this.relName = relName;
	}
	public String getContactRelation() {
		return contactRelation;
	}
	public void setContactRelation(String contactRelation) {
		this.contactRelation = contactRelation;
	}
	public String getContactGender() {
		return contactGender;
	}
	public void setContactGender(String contactGender) {
		this.contactGender = contactGender;
	}
	public String getIfKnowLoan() {
		return ifKnowLoan;
	}
	public void setIfKnowLoan(String ifKnowLoan) {
		this.ifKnowLoan = ifKnowLoan;
	}
	public String getContactCorpPost() {
		return contactCorpPost;
	}
	public void setContactCorpPost(String contactCorpPost) {
		this.contactCorpPost = contactCorpPost;
	}

}
