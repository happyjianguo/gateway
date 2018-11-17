package com.zdmoney.credit.framework.vo.bsb.entity;

public class UserRelationInfo {
	
	/** 用户联系人关系*/
	private String contactsRelations;
	
	/** 用户联系人姓名*/
	private String contactsName;
	
	/** 用户联系人手机号*/
	private String contactsMobile;
	
	/** 用户联系人证件类型*/
	private String userConDocType;
	
	/** 用户联系人证件号码*/
	private String userConDocIdNum;
	
	/** 用户联系人公司名称*/
	private String userConComy;
	
	/** 用户联系人职务*/
	private String userConPost;
	
	/** 用户联系人公司电话*/
	private String userConPhone;
	
	/** 用户联系人是否知晓贷款*/
	private String isKnowLoan;

	public String getContactsRelations() {
		return contactsRelations;
	}

	public void setContactsRelations(String contactsRelations) {
		this.contactsRelations = contactsRelations;
	}

	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public String getContactsMobile() {
		return contactsMobile;
	}

	public void setContactsMobile(String contactsMobile) {
		this.contactsMobile = contactsMobile;
	}

	public String getUserConDocType() {
		return userConDocType;
	}

	public void setUserConDocType(String userConDocType) {
		this.userConDocType = userConDocType;
	}

	public String getUserConDocIdNum() {
		return userConDocIdNum;
	}

	public void setUserConDocIdNum(String userConDocIdNum) {
		this.userConDocIdNum = userConDocIdNum;
	}

	public String getUserConComy() {
		return userConComy;
	}

	public void setUserConComy(String userConComy) {
		this.userConComy = userConComy;
	}

	public String getUserConPost() {
		return userConPost;
	}

	public void setUserConPost(String userConPost) {
		this.userConPost = userConPost;
	}

	public String getUserConPhone() {
		return userConPhone;
	}

	public void setUserConPhone(String userConPhone) {
		this.userConPhone = userConPhone;
	}

	public String getIsKnowLoan() {
		return isKnowLoan;
	}

	public void setIsKnowLoan(String isKnowLoan) {
		this.isKnowLoan = isKnowLoan;
	}
	
}
