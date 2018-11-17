package com.zdmoney.credit.framework.vo.bsb.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;
import com.zdmoney.credit.framework.vo.bsb.entity.ChanlRiskinfo;
import com.zdmoney.credit.framework.vo.bsb.entity.Environment;

/**
 * @ClassName:     Bsb100002Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:17:44
 */
public class Bsb100002Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 商户编号*/
	@NotEmpty(message = "商户编号不能为空！")
	private String mercNo;
	
	/** 商户名称*/
	@NotEmpty(message = "商户名称不能为空！")
	private String mercName;
	
	/** 客户姓名*/
	@NotEmpty(message = "客户姓名不能为空！")
	private String custName;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 证件号码*/
	@NotEmpty(message = "证件号码不能为空！")
	private String idNo;
	
	/** 婚姻状态*/
	private String marrStatus;
	
	/** 最高学历*/
	private String eduDegree;
	
	/** 手机号码*/
	@NotEmpty(message = "手机号码不能为空！")
	private String mobNo;
	
	/** 申请人联系地址类型*/
	private String addrType;
	
	/** 居住地址-行政区*/
	private String addrRegion;
	
	/** 居住地址-详细地址*/
	private String addrDetail;
	
	/** 性别*/
	@NotEmpty(message = "性别不能为空！")
	private String gender;
	
	/** 贷款金额*/
	@NotNull(message = "贷款金额不能为空！")
	private BigDecimal transAmt;
	
	/** 总期数*/
	@NotNull(message = "总期数不能为空！")
	private Integer totalCnt;
	
	/** 环境信息*/
	private Environment environmentObject;
	
	/** 渠道风控信息*/
	private List<ChanlRiskinfo> chanlRiskinfo;

	public String getProdSubNo() {
		return prodSubNo;
	}

	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
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

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
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

	public String getMarrStatus() {
		return marrStatus;
	}

	public void setMarrStatus(String marrStatus) {
		this.marrStatus = marrStatus;
	}

	public String getEduDegree() {
		return eduDegree;
	}

	public void setEduDegree(String eduDegree) {
		this.eduDegree = eduDegree;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getAddrType() {
		return addrType;
	}

	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}

	public String getAddrRegion() {
		return addrRegion;
	}

	public void setAddrRegion(String addrRegion) {
		this.addrRegion = addrRegion;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigDecimal getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt = transAmt;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

	public Environment getEnvironmentObject() {
		return environmentObject;
	}

	public void setEnvironmentObject(Environment environmentObject) {
		this.environmentObject = environmentObject;
	}

	public List<ChanlRiskinfo> getChanlRiskinfo() {
		return chanlRiskinfo;
	}

	public void setChanlRiskinfo(List<ChanlRiskinfo> chanlRiskinfo) {
		this.chanlRiskinfo = chanlRiskinfo;
	}
	
}
