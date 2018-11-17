package com.zdmoney.credit.framework.vo.wm3.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author 10098  2017年3月16日 下午3:12:09
 */
public class ApplyLoanWm3Entity implements Serializable {

	private static final long serialVersionUID = 2540569271093006764L;

	/** 合同号码 **/
	@NotBlank(message = "合同号码不能为空！")
	private String pactNo;
	/** 客户名称 **/
	@NotBlank(message = "客户名称不能为空！")
	private String custName;
	/** 客户编号 **/
	private Long borrowerId;
	/** 证件类型 **/
	@NotBlank(message = "证件类型不能为空！")
	private String idType;
	/** 证件号码 **/
	@NotBlank(message = "证件号码不能为空！")
	private String idNo;
	/** 客户类型 **/
	@NotBlank(message = "客户类型不能为空！")
	private String custType;
	/** 性别 **/
	@NotBlank(message = "性别不能为空！")
	private String sex;
	/** 出生日期 **/
	@NotBlank(message = "出生日期不能为空！")
	private String birth;
	/** 婚姻状况 **/
	@NotBlank(message = "婚姻状况不能为空！")
	private String marriage;
	/** 是否有子女 **/
	private String children;
	/** 最高学历 **/
	@NotBlank(message = "最高学历不能为空！")
	private String edu;
	/** 最高学位 **/
	@NotBlank(message = "最高学位不能为空！")
	private String degree;
	/** 联系电话 **/
	@NotBlank(message = "联系电话不能为空！")
	private String telNo;
	/** 手机号码 **/
	@NotBlank(message = "手机号码不能为空！")
	private String phoneNo;
	/** 通讯邮编 **/
	private String postCode;
	/** 通讯地址 **/
	private String postAddr;
	/** 户籍归属地 **/
	@NotBlank(message = "户籍归属地不能为空！")
	private String homeArea;
	/** 住宅电话 **/
	private String homeTel;
	/** 住宅邮编 **/
	private String homeCode;
	/** 住宅地址 **/
	private String homeAddr;
	/** 居住状况 **/
	private String homeSts;
	/** 月收入（元） **/
	@NotBlank(message = "月收入（元）不能为空！")
	private Long income;
	/** 配偶名称 **/
	private String mateName;
	/** 配偶证件类型 **/
	private String mateIdtype;
	/** 配偶证件号码 **/
	private String mateIdno;
	/** 配偶工作单位 **/
	private String mateWork;
	/** 配偶联系电话 **/
	private String mateTel;
	/** 信托项目编号 **/
	@NotBlank(message = "信托项目编号不能为空！")
	private String projNo;
	/** 产品号 **/
	@NotBlank(message = "产品号不能为空！")
	private String prdtNo;
	/** 合同金额 **/
	@NotBlank(message = "合同金额不能为空！")
	private BigDecimal pactAmt = new BigDecimal(0.00);
	/** 趸交费总额 **/
	@NotBlank(message = "趸交费总额不能为空！")
	private BigDecimal feeTotal = new BigDecimal(0.00);
	/** 保单编号 **/
	private String premNo;
	/** 保费费率 **/
	private BigDecimal premRate = new BigDecimal(0.00);
	/** 利率（月） **/
	@NotBlank(message = "利率（月）不能为空！")
	private BigDecimal lnRate = new BigDecimal(0.00);
	/** 申请地点 **/
	@NotBlank(message = "申请地点不能为空！")
	private String appArea;
	/** 申请用途 **/
	@NotBlank(message = "申请用途不能为空！")
	private String appUse;
	/** 合同期限（月） **/
	@NotNull(message = "合同期限（月）不能为空！")
	private Integer termMon;
	/** 合同期限（日） **/
	@NotNull(message = "合同期限（日）不能为空！")
	private Integer termDay;
	/** 担保方式 **/
	@NotBlank(message = "担保方式不能为空！")
	private String vouType;
	/** 到期日期 **/
	private String endDate;
	/** 扣款日类型 **/
	@NotBlank(message = "扣款日类型不能为空！")
	private String payType;
	/** 扣款日期 **/
	private Integer payDay;
	/** 期缴（保）费金额 **/
	@NotBlank(message = "期缴（保）费金额不能为空！")
	private BigDecimal vouAmt = new BigDecimal(0.00);
	/** 职业 **/
	private String workType;
	/** 工作单位名称 **/
	private String workName;
	/** 工作单位所属行业 **/
	private String workWay;
	/** 工作单位邮编 **/
	private String workCode;
	/** 工作单位地址 **/
	private String workAddr;
	/** 职务 **/
	private String workDuty;
	/** 职称 **/
	private String workTitle;
	/** 工作起始年份 **/
	private String workYear;
	/** 是否有车 **/
	@NotBlank(message = "是否有车不能为空！")
	private String ifCar;
	/** 是否有按揭车贷 **/
	@NotBlank(message = "是否有按揭车贷不能为空！")
	private String ifCarCred;
	/** 是否有房 **/
	@NotBlank(message = "是否有房不能为空！")
	private String ifRoom;
	/** 是否有按揭房贷 **/
	@NotBlank(message = "是否有按揭房贷不能为空！")
	private String ifMort;
	/** 是否有贷记卡 **/
	@NotBlank(message = "是否有贷记卡不能为空！")
	private String ifCard;
	/** 贷记卡最低额度 **/
	@NotBlank(message = "贷记卡最低额度不能为空！")
	private Long cardAmt;
	/** 是否填写申请表 **/
	@NotBlank(message = "是否填写申请表不能为空！")
	private String ifApp;
	/** 是否有身份证信息 **/
	@NotBlank(message = "是否有身份证信息不能为空！")
	private String ifId;
	/** 是否以签订合同 **/
	@NotBlank(message = "是否以签订合同不能为空！")
	private String ifPact;
	/** 预审批ID **/
	@NotBlank(message = "预审批ID不能为空！")
	private String prePactNo;
	/** 查证流水号 **/
	private String czPactNo;
	/** 工作状态 **/
	private String workSts;
	/** 虚拟账户渠道 **/
	private String cardChn;
	/** 账卡信息 **/
	@Valid
	private List<ApplyAccountWm3Entity> listAc = new ArrayList<ApplyAccountWm3Entity>();
	/** 共同借款人信息 **/
	@Valid
	private List<ApplyBorrowerWm3Entity> listCom = new ArrayList<ApplyBorrowerWm3Entity>();
	/** 押品信息 **/
	private List<ApplyGageWm3Entity> listGage = new ArrayList<ApplyGageWm3Entity>();
	/** 借款关系人信息 **/
	@Valid
	private List<ApplyRelationWm3Entity> listRel = new ArrayList<ApplyRelationWm3Entity>();
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public Long getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(Long borrowerId) {
		this.borrowerId = borrowerId;
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
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPostAddr() {
		return postAddr;
	}
	public void setPostAddr(String postAddr) {
		this.postAddr = postAddr;
	}
	public String getHomeArea() {
		return homeArea;
	}
	public void setHomeArea(String homeArea) {
		this.homeArea = homeArea;
	}
	public String getHomeTel() {
		return homeTel;
	}
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}
	public String getHomeCode() {
		return homeCode;
	}
	public void setHomeCode(String homeCode) {
		this.homeCode = homeCode;
	}
	public String getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}
	public String getHomeSts() {
		return homeSts;
	}
	public void setHomeSts(String homeSts) {
		this.homeSts = homeSts;
	}
	public Long getIncome() {
		return income;
	}
	public void setIncome(Long income) {
		this.income = income;
	}
	public String getMateName() {
		return mateName;
	}
	public void setMateName(String mateName) {
		this.mateName = mateName;
	}
	public String getMateIdtype() {
		return mateIdtype;
	}
	public void setMateIdtype(String mateIdtype) {
		this.mateIdtype = mateIdtype;
	}
	public String getMateIdno() {
		return mateIdno;
	}
	public void setMateIdno(String mateIdno) {
		this.mateIdno = mateIdno;
	}
	public String getMateWork() {
		return mateWork;
	}
	public void setMateWork(String mateWork) {
		this.mateWork = mateWork;
	}
	public String getMateTel() {
		return mateTel;
	}
	public void setMateTel(String mateTel) {
		this.mateTel = mateTel;
	}
	public String getProjNo() {
		return projNo;
	}
	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}
	public String getPrdtNo() {
		return prdtNo;
	}
	public void setPrdtNo(String prdtNo) {
		this.prdtNo = prdtNo;
	}
	public BigDecimal getPactAmt() {
		return pactAmt;
	}
	public void setPactAmt(BigDecimal pactAmt) {
		this.pactAmt = pactAmt;
	}
	public BigDecimal getFeeTotal() {
		return feeTotal;
	}
	public void setFeeTotal(BigDecimal feeTotal) {
		this.feeTotal = feeTotal;
	}
	public String getPremNo() {
		return premNo;
	}
	public void setPremNo(String premNo) {
		this.premNo = premNo;
	}
	public BigDecimal getPremRate() {
		return premRate;
	}
	public void setPremRate(BigDecimal premRate) {
		this.premRate = premRate;
	}
	public BigDecimal getLnRate() {
		return lnRate;
	}
	public void setLnRate(BigDecimal lnRate) {
		this.lnRate = lnRate;
	}
	public String getAppArea() {
		return appArea;
	}
	public void setAppArea(String appArea) {
		this.appArea = appArea;
	}
	public String getAppUse() {
		return appUse;
	}
	public void setAppUse(String appUse) {
		this.appUse = appUse;
	}
	public Integer getTermMon() {
		return termMon;
	}
	public void setTermMon(Integer termMon) {
		this.termMon = termMon;
	}
	public Integer getTermDay() {
		return termDay;
	}
	public void setTermDay(Integer termDay) {
		this.termDay = termDay;
	}
	public String getVouType() {
		return vouType;
	}
	public void setVouType(String vouType) {
		this.vouType = vouType;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public Integer getPayDay() {
		return payDay;
	}
	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}
	public BigDecimal getVouAmt() {
		return vouAmt;
	}
	public void setVouAmt(BigDecimal vouAmt) {
		this.vouAmt = vouAmt;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkWay() {
		return workWay;
	}
	public void setWorkWay(String workWay) {
		this.workWay = workWay;
	}
	public String getWorkCode() {
		return workCode;
	}
	public void setWorkCode(String workCode) {
		this.workCode = workCode;
	}
	public String getWorkAddr() {
		return workAddr;
	}
	public void setWorkAddr(String workAddr) {
		this.workAddr = workAddr;
	}
	public String getWorkDuty() {
		return workDuty;
	}
	public void setWorkDuty(String workDuty) {
		this.workDuty = workDuty;
	}
	public String getWorkTitle() {
		return workTitle;
	}
	public void setWorkTitle(String workTitle) {
		this.workTitle = workTitle;
	}
	public String getWorkYear() {
		return workYear;
	}
	public void setWorkYear(String workYear) {
		this.workYear = workYear;
	}
	public String getIfCar() {
		return ifCar;
	}
	public void setIfCar(String ifCar) {
		this.ifCar = ifCar;
	}
	public String getIfCarCred() {
		return ifCarCred;
	}
	public void setIfCarCred(String ifCarCred) {
		this.ifCarCred = ifCarCred;
	}
	public String getIfRoom() {
		return ifRoom;
	}
	public void setIfRoom(String ifRoom) {
		this.ifRoom = ifRoom;
	}
	public String getIfMort() {
		return ifMort;
	}
	public void setIfMort(String ifMort) {
		this.ifMort = ifMort;
	}
	public String getIfCard() {
		return ifCard;
	}
	public void setIfCard(String ifCard) {
		this.ifCard = ifCard;
	}
	public Long getCardAmt() {
		return cardAmt;
	}
	public void setCardAmt(Long cardAmt) {
		this.cardAmt = cardAmt;
	}
	public String getIfApp() {
		return ifApp;
	}
	public void setIfApp(String ifApp) {
		this.ifApp = ifApp;
	}
	public String getIfId() {
		return ifId;
	}
	public void setIfId(String ifId) {
		this.ifId = ifId;
	}
	public String getIfPact() {
		return ifPact;
	}
	public void setIfPact(String ifPact) {
		this.ifPact = ifPact;
	}
	public String getPrePactNo() {
		return prePactNo;
	}
	public void setPrePactNo(String prePactNo) {
		this.prePactNo = prePactNo;
	}
	public String getCzPactNo() {
		return czPactNo;
	}
	public void setCzPactNo(String czPactNo) {
		this.czPactNo = czPactNo;
	}
	public String getWorkSts() {
		return workSts;
	}
	public void setWorkSts(String workSts) {
		this.workSts = workSts;
	}
	public String getCardChn() {
		return cardChn;
	}
	public void setCardChn(String cardChn) {
		this.cardChn = cardChn;
	}
	public List<ApplyAccountWm3Entity> getListAc() {
		return listAc;
	}
	public void setListAc(List<ApplyAccountWm3Entity> listAc) {
		this.listAc = listAc;
	}
	public List<ApplyBorrowerWm3Entity> getListCom() {
		return listCom;
	}
	public void setListCom(List<ApplyBorrowerWm3Entity> listCom) {
		this.listCom = listCom;
	}
	public List<ApplyGageWm3Entity> getListGage() {
		return listGage;
	}
	public void setListGage(List<ApplyGageWm3Entity> listGage) {
		this.listGage = listGage;
	}
	public List<ApplyRelationWm3Entity> getListRel() {
		return listRel;
	}
	public void setListRel(List<ApplyRelationWm3Entity> listRel) {
		this.listRel = listRel;
	}

}
