package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

/**
 * 资产挑选 -- 其他审核信息
 * @author 10098  2016年11月25日 下午3:13:05
 */
public class AssetSelOtherCheckEntity {
	
	/** 审批之联系人与申请人关系 **/
	private String relName;
	/** 审批之联系人是否知晓贷款 **/
	private String contactRelation;
	/** 近三个月查询信用报告数 **/
	private BigDecimal contactGender;
	/** 近一个月查询信用报告数 **/
	private BigDecimal ifKnowLoan;
	/** 其他审核信息 **/
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
	public BigDecimal getContactGender() {
		return contactGender;
	}
	public void setContactGender(BigDecimal contactGender) {
		this.contactGender = contactGender;
	}
	public BigDecimal getIfKnowLoan() {
		return ifKnowLoan;
	}
	public void setIfKnowLoan(BigDecimal ifKnowLoan) {
		this.ifKnowLoan = ifKnowLoan;
	}
	public String getContactCorpPost() {
		return contactCorpPost;
	}
	public void setContactCorpPost(String contactCorpPost) {
		this.contactCorpPost = contactCorpPost;
	}
	
}
