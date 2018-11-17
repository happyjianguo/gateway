package com.zdmoney.credit.framework.vo.bsb.entity;

public class SpouseInfo {
	
	/** 证件类型*/
	private String idType;
	
	/** 证件号码*/
	private String idNo;
	
	/** 配偶姓名*/
	private String spouseName;
	
	/** 移动电话*/
	private String mobNo;
	
	/** 最高学历*/
	private String eduDegree;
	
	/** 户籍地址*/
	private String cenRegiAdds;

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

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getEduDegree() {
		return eduDegree;
	}

	public void setEduDegree(String eduDegree) {
		this.eduDegree = eduDegree;
	}

	public String getCenRegiAdds() {
		return cenRegiAdds;
	}

	public void setCenRegiAdds(String cenRegiAdds) {
		this.cenRegiAdds = cenRegiAdds;
	}
	
}
