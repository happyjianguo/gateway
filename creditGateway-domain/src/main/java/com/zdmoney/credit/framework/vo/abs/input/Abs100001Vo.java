package com.zdmoney.credit.framework.vo.abs.input;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.AssetSelAuditEntity;
import com.zdmoney.credit.framework.vo.abs.entity.AssetSelCreditEntity;
import com.zdmoney.credit.framework.vo.abs.entity.AssetSelOtherCheckEntity;
import com.zdmoney.credit.framework.vo.abs.entity.AssetSelRelEntity;

/**
 * 功能号Abs100001 Vo对象 【单笔资产挑选接口】
 * @author 00236640
 *
 */
public class Abs100001Vo extends AbsBaseParamVo {
    
    private static final long serialVersionUID = 1459794732461173791L;
    
    /** 申请件编号 **/
    @NotBlank(message = "申请件编号不能为空")
    private String prePactNo;
    /** 产品号 **/
    @NotBlank(message = "产品号不能为空")
    private String prdtNo;
    /** 合同金额 **/
    @NotNull(message = "合同金额不能为空")
    private BigDecimal pactAmt;
    /** 申请金额 **/
    private BigDecimal applyLmt;
    /** 申请期限 **/
    private Integer applyTerm;
    /** 利率（月） **/
    @NotNull(message = "利率（月）不能为空")
    private BigDecimal lnRate;
    /** 申请地点 **/
    @NotBlank(message = "申请地点不能为空")
    private String appArea;
    /** 申请用途 **/
    @NotBlank(message = "申请用途不能为空")
    private String appUse;
    /** 申请日期 **/
    @NotBlank(message = "申请日期不能为空")
    private String requestDate;
    /** 合同期限（月） **/
    @NotNull(message = "合同期限（月）不能为空")
    private Integer termMon;
    /** 合同期限（日） **/
    @NotNull(message = "合同期限（日）不能为空")
    private Integer termDay;
    /** 担保方式 **/
    @NotBlank(message = "担保方式不能为空")
    private String vouType;
    /** 到期日期 **/
    private String endDate;
    /** 扣款日类型 **/
    @NotBlank(message = "扣款日类型不能为空")
    private String payType;
    /** 扣款日期 **/
    private Integer payDay;
    /** 客户名称 **/
    @NotBlank(message = "客户名称不能为空")
    private String custName;
    /** 证件类型 **/
    @NotBlank(message = "证件类型不能为空")
    private String idType;
    /** 证件号码 **/
    @NotBlank(message = "证件号码不能为空")
    private String idNo;
    /** 客户类型 **/
    @NotBlank(message = "客户类型不能为空")
    private String custType;
    /** 性别 **/
    @NotBlank(message = "性别不能为空")
    private String sex;
    /** 出生日期 **/
    @NotBlank(message = "出生日期不能为空")
    private String birth;
    /** 年龄 **/
    @NotNull(message = "年龄不能为空")
    private Integer age;
    /** 婚姻状况 **/
    @NotBlank(message = "婚姻状况不能为空")
    private String marriage;
    /** 是否有子女 **/
    @NotBlank(message = "是否有子女不能为空")
    private String children;
    /** 子女数 **/
    private Integer childrenAmount;
    /** 最高学历 **/
    @NotBlank(message = "最高学历不能为空")
    private String edu;
    /** 最高学位 **/
    @NotBlank(message = "最高学位不能为空")
    private String degree;
    /** 毕业时间 **/
    //@NotBlank(message = "毕业时间不能为空")
    private String graduationTime;
    /** 联系电话 **/
    @NotBlank(message = "联系电话不能为空")
    private String telNo;
    /** 手机号码 **/
    @NotBlank(message = "手机号码不能为空")
    private String phoneNo;
    /** 通讯邮编 **/
    private String postCode;
    /** 通讯地址 **/
    private String postAddr;
    /** 户籍归属地 **/
    @NotBlank(message = "户籍归属地不能为空")
    private String homeArea;
    /** 家庭所在省 **/
    private String homeProvine;
    /** 家庭所在市 **/
    private String homeCity;
    /** 家庭所在区 **/
    private String homeDistrict;
    /** 户籍详细地址 **/
    @NotBlank(message = "户籍详细地址不能为空")
    private String idIssuerAddress;
    /** 户籍邮编 **/
    private String issuerPostcode;
    /** 住宅电话 **/
    private String homeTel;
    /** 户籍所在省 **/
    private String issuerState;
    /** 户籍所在市 **/
    private String issuerCity;
    /** 户籍所在区 **/
    private String issuerZone;
    /** 住宅邮编 **/
    private String homePostCode;
    /** 住宅地址 **/
    private String homeAddr;
    /** 居住状况 **/
    @NotBlank(message = "居住状况不能为空")
    private String homeSts;
    /** 住宅类型 **/
    private String houseType;
    /** 租金/元 **/
    private BigDecimal houseRent;
    /** 可接受的月最高还款 **/
    private BigDecimal monthMaxRepay;
    /** QQ号 **/
    private String qqNum;
    /** 微信号 **/
    private String wechatNum;
    /** 电子邮箱 **/
    private String email;
    /** 月收入（元） **/
    //@NotNull(message = "月收入（元）不能为空")
    private BigDecimal income;
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
    /** 房屋居住人数 **/
    private Integer livePersonCount;
    /** 和谁生活 **/
    private String liveWith;
    /** 公司人数规模 **/
    private Integer cpamount;
    /** 证件失效日期 **/
    private String idEndDate;
    /** 发证机关 **/
    private String idSource;
    /** 证件签发日期 **/
    private String idStartDate;
    /** 工作年限 **/
    //@NotBlank(message = "工作年限不能为空")
    private String workYear;
    /** 资金来源 **/
    private String financingComeFrom;
    /** 投资年龄 **/
    private String investYears;
    /** 投资知识 **/
    private String investmentLore;
    /** 客户编号 **/
    private String pCode;
    /** 房产证号 **/
    private String realEstateLicenseCode;
    /** 建档日期 **/
    private String createdDate;
    /** 家庭背景 **/
    private String familyBackground;
    /** 客户来源 **/
    private String comeFrom;
    /** 其它来源 **/
    private String otherComeFrom;
    /** 发薪日 **/
    private Integer salaryDay;
    /** 月总收入 **/
    //@NotNull(message = "月总收入不能为空")
    private BigDecimal totalMonthlyIncome;
    /** 供养亲属人数 **/
    private Integer numberDependanted;
    /** 地址优先级 **/
    private String addressPriority;
    /** 每月家庭支出 **/
    private BigDecimal familyExpense;
    /** 是否贷款 **/
    private String hasLoan;
    /** 职业 **/
    private String workType;
    /** 工作单位名称 **/
    private String workName;
    /** 工作状态 **/
    private String workSts;
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
    private String workStartYear;
    /** 单位所在省 **/
    private String corpProvince;
    /** 单位所在市 **/
    private String corpCity;
    /** 单位所在区/县 **/
    private String corpZone;
    /** 工商网信息 **/
    private String corpPostcode;
    /** 现单位性质 **/
    private String corpStructure;
    /** 发薪方式 **/
    private String corpPayWay;
    /** 单位月收入/元 **/
    private BigDecimal monthSalary;
    /** 其他月收入 **/
    private BigDecimal otherIncome;
    /** 是否私营业主 **/
    @NotBlank(message = "是否私营业主不能为空")
    private String privateOwnersFlag;
    /** 成立时间 **/
    private String setupDate;
    /** 占股比例/% **/
    private BigDecimal sharesScale;
    /** 注册资本/万元 **/
    private BigDecimal registerFunds;
    /** 私营企业类型 **/
    private String priEnterpriseType;
    /** 经营场所 **/
    private String businessPlace;
    /** 月租金/元 **/
    private BigDecimal monthRent;
    /** 员工人数/人 **/
    private Integer employeeNum;
    /** 企业净利润率/% **/
    private BigDecimal enterpriseRate;
    /** 每月净利润额/万元 **/
    private BigDecimal monthAmt;
    /** 是否有车 **/
    @NotBlank(message = "是否有车不能为空")
    private String ifCar;
    /** （汽车）是否本地牌照 **/
    private String localPlate;
    /** 是否有按揭车贷 **/
    @NotBlank(message = "是否有按揭车贷不能为空")
    private String ifCarCred;
    /** 车辆类型 **/
    private String carType;
    /** 车辆购买时间 **/
    private String carBuyDate;
    /** 裸车价/万元 **/
    private BigDecimal nakedCarBuyPrice;
    /** 购车价/万元 **/
    private BigDecimal carBuyPrice;
    /** 贷款剩余期数 **/
    private BigDecimal carLoanTerm;
    /** 车辆借款期限 **/
    private Integer carLoanPeriod;
    /** 车月供/元 **/
    private BigDecimal carMonthPaymentAmt;
    /** 是否有房 **/
    @NotBlank(message = "是否有房不能为空")
    private String ifRoom;
    /** 是否有按揭房贷 **/
    @NotBlank(message = "是否有按揭房贷不能为空")
    private String ifMort;
    /** 房产类型 **/
    private String estateType;
    /** 房产所在省 **/
    private String estateState;
    /** 房产所在市 **/
    private String estateCity;
    /** 房产所在区 **/
    private String estateZone;
    /** 购买总价值/万元 **/
    private BigDecimal estateAmt;
    /** 市场参考价/万元 **/
    private BigDecimal referenceAmt;
    /** 房贷金额/万元 **/
    private BigDecimal estateLoanAmt;
    /** 房贷月供 **/
    private BigDecimal estateMonthPaymentAmt;
    /** 房屋已还期数 **/
    private Integer hasRepaymentNum;
    /** 建筑面积 **/
    private BigDecimal builtupArea;
    /** 房产所有权 **/
    private String houseOwnership;
    /** 产权比例 **/
    private BigDecimal equityRate;
    /** 单据户名为本人 **/
    private String ifMe;
    /** 房屋购买时间 **/
    private String estateBuyDate;
    /** 房屋贷款余额 **/
    private BigDecimal loanBalance;
    /** 房屋借款期限 **/
    private Integer hourseLoanPeriod;
    /** 房屋购买价格 **/
    private BigDecimal hoursePrice;
    /** 房屋单元价格 **/
    private BigDecimal unitPrice;
    /** 住房贷款笔数 **/
    private Integer houseLoanNum;
    /** 其他贷款笔数 **/
    private Integer ortherLoanNum;
    /** 首笔贷款发放月份 **/
    private Integer loanFirstMonth;
    /** 贷记卡账户数 **/
    private Integer creditAccounts;
    /** 首张贷记卡发放月份 **/
    private Integer creditFirstMonth;
    /** 准贷记卡账户数 **/
    private Integer semiCreditAccounts;
    /** 首张准贷记卡发放月份 **/
    private Integer semiCreditFirstMonth;
    /** 是否有贷记卡 **/
    @NotBlank(message = "是否有贷记卡不能为空")
    private String ifCard;
    /** 贷记卡最低额度 **/
    @NotNull(message = "贷记卡最低额度不能为空")
    private BigDecimal cardAmt;
    /** 贷款逾期笔数 **/
    private Integer loanOverCount;
    /** 贷款逾期月份数 **/
    private Integer loanOverMonth;
    /** 贷款逾期单月做高逾期总额 **/
    private BigDecimal loanOverLtotal;
    /** 贷款逾期最长逾期月数 **/
    private BigDecimal loanOverLmonths;
    /** 贷记卡逾期账户数 **/
    private Integer creditOverAccounts;
    /** 贷记卡逾期月份数 **/
    private Integer creditOverMonths;
    /** 贷记卡逾期单月最高逾期总额 **/
    private BigDecimal creditOverLtotal;
    /** 贷记卡逾期最长逾期月数 **/
    private Integer creditOverLmonth;
    /** 未结清贷款法人机构数 **/
    private Integer loaningCorpOrg;
    /** 未结清贷款结构数 **/
    private Integer loaningOrgNums;
    /** 未结清贷款笔数 **/
    private Integer loaningNum;
    /** 未结清贷款合同金额 **/
    private BigDecimal loaningContractTotal;
    /** 未结清贷款余额 **/
    private BigDecimal loaningRemainSum;
    /** 未结清贷款最近6个月平均应还款 **/
    private BigDecimal loaningMeanPay;
    /** 未销户贷记卡发卡法人机构数 **/
    private Integer existCorpOrg;
    /** 未销户贷记卡发卡机构数 **/
    private Integer existOrgNum;
    /** 未销户贷记卡账户数 **/
    private Integer existAccount;
    /** 未销户贷记卡授信总额 **/
    private BigDecimal existCreditTotal;
    /** 未销户贷记卡单家行最高授信额 **/
    private BigDecimal existMaxAmount;
    /** 未销户贷记卡已用额度 **/
    private BigDecimal existUsedAmount;
    /** 未销户贷记卡最近6个月平均使用额度 **/
    private BigDecimal existMeanAmount;
    /** 对外担保笔数 **/
    private Integer ensureCount;
    /** 对外担保金额 **/
    private BigDecimal ensureAmount;
    /** 对外担保本金余额 **/
    private BigDecimal ensureRemainder;
    /** 公积金开户时间 **/
    private String openAccountDate;
    /** 公积金缴存比例 **/
    private BigDecimal depositRate;
    /** 公积金月缴存额 **/
    private BigDecimal monthDepositAmt;
    /** 公积金缴存基数 **/
    private BigDecimal depositBase;
    /** 公积金材料 **/
    private String providentInfo;
    /** 公积金缴纳单位同申请单位 **/
    private String paymentUnit;
    /** 公积金申请单位已缴月数 **/
    private Integer paymentMonthNum;
    /** 保单保险金额 **/
    private BigDecimal insuranceAmt;
    /** 保单保险年限 **/
    private Integer insuranceTerm;
    /** 保单已缴年限 **/
    private Integer paidTerm;
    /** 保单最近一次缴纳时间 **/
    private String lastPaymentDate;
    /** 保单缴费方式 **/
    private String paymentMethod;
    /** 保单与被保险人关系 **/
    private String policyRelation;
    /** 保单年缴金额 **/
    private BigDecimal yearPaymentAmt;
    /** 保单真伪核实方式 **/
    private String policyCheck;
    /** 网购达人贷账户注册时间 **/
    private String acctRegisterDate;
    /** 网购达人贷买家信用等级 **/
    private String buyerCreditLevel;
    /** 网购达人贷买家信用类型 **/
    private String buyerCreditType;
    /** 网购达人贷好评率 **/
    private String goodRate;
    /** 网购达人贷上一年度支出额 **/
    private BigDecimal lastYearPayAmt;
    /** 网购达人贷芝麻信用分 **/
    private BigDecimal sesameCreditValue;
    /** 网购达人贷近第1个月支出额 **/
    private BigDecimal payAmt1;
    /** 网购达人贷近第2个月支出额 **/
    private BigDecimal payAmt2;
    /** 网购达人贷近第3个月支出额 **/
    private BigDecimal payAmt3;
    /** 网购达人贷月均 **/
    private BigDecimal onlinePayMonthAmt;
    /** 淘宝商户贷开店时间 **/
    private String setupShopDate;
    /** 淘宝商户贷卖家信用等级 **/
    private String sellerCreditLevel;
    /** 淘宝商户贷卖家信用类型 **/
    private String sellerCreditType;
    /** 淘宝商户贷近半年好评数 **/
    private BigDecimal regardedNum;
    /** 淘宝商户贷近1个月账单金额 **/
    private BigDecimal taobaoBillAmt1;
    /** 淘宝商户贷近2个月账单金额 **/
    private BigDecimal taobaoBillAmt2;
    /** 淘宝商户贷近3个月账单金额 **/
    private BigDecimal taobaoBillAmt3;
    /** 淘宝商户贷近4个月账单金额 **/
    private BigDecimal taobaoBillAmt4;
    /** 淘宝商户贷近5个月账单金额 **/
    private BigDecimal taobaoBillAmt5;
    /** 淘宝商户贷近6个月账单金额 **/
    private BigDecimal taobaoBillAmt6;
    /** 淘宝商户贷月均 **/
    private BigDecimal taobaoPayMonthAmt;
    /** 个人流水1 **/
    private String personalWater1;
    /** 个人流水月均 **/
    private BigDecimal personMonthAverage;
    /** 个人流水合计 **/
    private BigDecimal personalWaterTotal;
    /** 对公流水1 **/
    private String publicWater1;
    /** 对公流水月均 **/
    private BigDecimal publicMonthAverage;
    /** 对公流水合计 **/
    private BigDecimal publicWaterTotal;
    /** 流水收入合计 **/
    private BigDecimal waterIncomeTotal;
    /** acc额度 **/
    private BigDecimal accLmt;
    /** 发卡时间 **/
    private String issuerDate;
    /** 额度 **/
    private BigDecimal cardCreditLimit;
    /** 账单金额1 **/
    private BigDecimal cardBillAmt1;
    /** 账单金额2 **/
    private BigDecimal cardBillAmt2;
    /** 账单金额3 **/
    private BigDecimal cardBillAmt3;
    /** 账单金额4 **/
    private BigDecimal cardBillAmt4;
    /** 月均 **/
    private BigDecimal cardPayMonthAmt;
    /** 是否填写申请表 **/
    @NotBlank(message = "是否填写申请表不能为空")
    private String ifApp;
    /** 是否有身份证信息 **/
    @NotBlank(message = "是否有身份证信息不能为空")
    private String ifId;
    /** 是否以签订合同 **/
    @NotBlank(message = "是否以签订合同不能为空")
    private String ifPact;
    /** 产品名称 **/
    @NotBlank(message = "产品名称不能为空")
    private String prdtName;
    /** 入职时间 **/
    @NotBlank(message = "入职时间不能为空")
    private String workStart;
    /** 联系人信息 **/
    private List<AssetSelRelEntity> listRel = new ArrayList<AssetSelRelEntity>();
    /** 其他审批信息 **/
    private List<AssetSelOtherCheckEntity> listOtherCheck = new ArrayList<AssetSelOtherCheckEntity>();
    /** 信用卡信息 **/
    private List<AssetSelCreditEntity> listCredit = new ArrayList<AssetSelCreditEntity>();
    /** 审批信息 **/
    private List<AssetSelAuditEntity> listAudit = new ArrayList<AssetSelAuditEntity>();
	public String getPrePactNo() {
		return prePactNo;
	}
	public void setPrePactNo(String prePactNo) {
		this.prePactNo = prePactNo;
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
	public BigDecimal getApplyLmt() {
		return applyLmt;
	}
	public void setApplyLmt(BigDecimal applyLmt) {
		this.applyLmt = applyLmt;
	}
	public Integer getApplyTerm() {
		return applyTerm;
	}
	public void setApplyTerm(Integer applyTerm) {
		this.applyTerm = applyTerm;
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
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
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
	public Integer getChildrenAmount() {
		return childrenAmount;
	}
	public void setChildrenAmount(Integer childrenAmount) {
		this.childrenAmount = childrenAmount;
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
	public String getGraduationTime() {
		return graduationTime;
	}
	public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
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
	public String getHomeProvine() {
		return homeProvine;
	}
	public void setHomeProvine(String homeProvine) {
		this.homeProvine = homeProvine;
	}
	public String getHomeCity() {
		return homeCity;
	}
	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}
	public String getHomeDistrict() {
		return homeDistrict;
	}
	public void setHomeDistrict(String homeDistrict) {
		this.homeDistrict = homeDistrict;
	}
	public String getIdIssuerAddress() {
		return idIssuerAddress;
	}
	public void setIdIssuerAddress(String idIssuerAddress) {
		this.idIssuerAddress = idIssuerAddress;
	}
	public String getIssuerPostcode() {
		return issuerPostcode;
	}
	public void setIssuerPostcode(String issuerPostcode) {
		this.issuerPostcode = issuerPostcode;
	}
	public String getHomeTel() {
		return homeTel;
	}
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}
	public String getIssuerState() {
		return issuerState;
	}
	public void setIssuerState(String issuerState) {
		this.issuerState = issuerState;
	}
	public String getIssuerCity() {
		return issuerCity;
	}
	public void setIssuerCity(String issuerCity) {
		this.issuerCity = issuerCity;
	}
	public String getIssuerZone() {
		return issuerZone;
	}
	public void setIssuerZone(String issuerZone) {
		this.issuerZone = issuerZone;
	}
	public String getHomePostCode() {
		return homePostCode;
	}
	public void setHomePostCode(String homePostCode) {
		this.homePostCode = homePostCode;
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
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public BigDecimal getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(BigDecimal houseRent) {
		this.houseRent = houseRent;
	}
	public BigDecimal getMonthMaxRepay() {
		return monthMaxRepay;
	}
	public void setMonthMaxRepay(BigDecimal monthMaxRepay) {
		this.monthMaxRepay = monthMaxRepay;
	}
	public String getQqNum() {
		return qqNum;
	}
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	public String getWechatNum() {
		return wechatNum;
	}
	public void setWechatNum(String wechatNum) {
		this.wechatNum = wechatNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigDecimal getIncome() {
		return income;
	}
	public void setIncome(BigDecimal income) {
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
	public Integer getLivePersonCount() {
		return livePersonCount;
	}
	public void setLivePersonCount(Integer livePersonCount) {
		this.livePersonCount = livePersonCount;
	}
	public String getLiveWith() {
		return liveWith;
	}
	public void setLiveWith(String liveWith) {
		this.liveWith = liveWith;
	}
	public Integer getCpamount() {
		return cpamount;
	}
	public void setCpamount(Integer cpamount) {
		this.cpamount = cpamount;
	}
	public String getIdEndDate() {
		return idEndDate;
	}
	public void setIdEndDate(String idEndDate) {
		this.idEndDate = idEndDate;
	}
	public String getIdSource() {
		return idSource;
	}
	public void setIdSource(String idSource) {
		this.idSource = idSource;
	}
	public String getIdStartDate() {
		return idStartDate;
	}
	public void setIdStartDate(String idStartDate) {
		this.idStartDate = idStartDate;
	}
	public String getWorkYear() {
		return workYear;
	}
	public void setWorkYear(String workYear) {
		this.workYear = workYear;
	}
	public String getFinancingComeFrom() {
		return financingComeFrom;
	}
	public void setFinancingComeFrom(String financingComeFrom) {
		this.financingComeFrom = financingComeFrom;
	}
	public String getInvestYears() {
		return investYears;
	}
	public void setInvestYears(String investYears) {
		this.investYears = investYears;
	}
	public String getInvestmentLore() {
		return investmentLore;
	}
	public void setInvestmentLore(String investmentLore) {
		this.investmentLore = investmentLore;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getRealEstateLicenseCode() {
		return realEstateLicenseCode;
	}
	public void setRealEstateLicenseCode(String realEstateLicenseCode) {
		this.realEstateLicenseCode = realEstateLicenseCode;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getFamilyBackground() {
		return familyBackground;
	}
	public void setFamilyBackground(String familyBackground) {
		this.familyBackground = familyBackground;
	}
	public String getComeFrom() {
		return comeFrom;
	}
	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}
	public String getOtherComeFrom() {
		return otherComeFrom;
	}
	public void setOtherComeFrom(String otherComeFrom) {
		this.otherComeFrom = otherComeFrom;
	}
	public Integer getSalaryDay() {
		return salaryDay;
	}
	public void setSalaryDay(Integer salaryDay) {
		this.salaryDay = salaryDay;
	}
	public BigDecimal getTotalMonthlyIncome() {
		return totalMonthlyIncome;
	}
	public void setTotalMonthlyIncome(BigDecimal totalMonthlyIncome) {
		this.totalMonthlyIncome = totalMonthlyIncome;
	}
	public Integer getNumberDependanted() {
		return numberDependanted;
	}
	public void setNumberDependanted(Integer numberDependanted) {
		this.numberDependanted = numberDependanted;
	}
	public String getAddressPriority() {
		return addressPriority;
	}
	public void setAddressPriority(String addressPriority) {
		this.addressPriority = addressPriority;
	}
	public BigDecimal getFamilyExpense() {
		return familyExpense;
	}
	public void setFamilyExpense(BigDecimal familyExpense) {
		this.familyExpense = familyExpense;
	}
	public String getHasLoan() {
		return hasLoan;
	}
	public void setHasLoan(String hasLoan) {
		this.hasLoan = hasLoan;
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
	public String getWorkSts() {
		return workSts;
	}
	public void setWorkSts(String workSts) {
		this.workSts = workSts;
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
	public String getWorkStartYear() {
		return workStartYear;
	}
	public void setWorkStartYear(String workStartYear) {
		this.workStartYear = workStartYear;
	}
	public String getCorpProvince() {
		return corpProvince;
	}
	public void setCorpProvince(String corpProvince) {
		this.corpProvince = corpProvince;
	}
	public String getCorpCity() {
		return corpCity;
	}
	public void setCorpCity(String corpCity) {
		this.corpCity = corpCity;
	}
	public String getCorpZone() {
		return corpZone;
	}
	public void setCorpZone(String corpZone) {
		this.corpZone = corpZone;
	}
	public String getCorpPostcode() {
		return corpPostcode;
	}
	public void setCorpPostcode(String corpPostcode) {
		this.corpPostcode = corpPostcode;
	}
	public String getCorpStructure() {
		return corpStructure;
	}
	public void setCorpStructure(String corpStructure) {
		this.corpStructure = corpStructure;
	}
	public String getCorpPayWay() {
		return corpPayWay;
	}
	public void setCorpPayWay(String corpPayWay) {
		this.corpPayWay = corpPayWay;
	}
	public BigDecimal getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(BigDecimal monthSalary) {
		this.monthSalary = monthSalary;
	}
	public BigDecimal getOtherIncome() {
		return otherIncome;
	}
	public void setOtherIncome(BigDecimal otherIncome) {
		this.otherIncome = otherIncome;
	}
	public String getPrivateOwnersFlag() {
		return privateOwnersFlag;
	}
	public void setPrivateOwnersFlag(String privateOwnersFlag) {
		this.privateOwnersFlag = privateOwnersFlag;
	}
	public String getSetupDate() {
		return setupDate;
	}
	public void setSetupDate(String setupDate) {
		this.setupDate = setupDate;
	}
	public BigDecimal getSharesScale() {
		return sharesScale;
	}
	public void setSharesScale(BigDecimal sharesScale) {
		this.sharesScale = sharesScale;
	}
	public BigDecimal getRegisterFunds() {
		return registerFunds;
	}
	public void setRegisterFunds(BigDecimal registerFunds) {
		this.registerFunds = registerFunds;
	}
	public String getPriEnterpriseType() {
		return priEnterpriseType;
	}
	public void setPriEnterpriseType(String priEnterpriseType) {
		this.priEnterpriseType = priEnterpriseType;
	}
	public String getBusinessPlace() {
		return businessPlace;
	}
	public void setBusinessPlace(String businessPlace) {
		this.businessPlace = businessPlace;
	}
	public BigDecimal getMonthRent() {
		return monthRent;
	}
	public void setMonthRent(BigDecimal monthRent) {
		this.monthRent = monthRent;
	}
	public Integer getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(Integer employeeNum) {
		this.employeeNum = employeeNum;
	}
	public BigDecimal getEnterpriseRate() {
		return enterpriseRate;
	}
	public void setEnterpriseRate(BigDecimal enterpriseRate) {
		this.enterpriseRate = enterpriseRate;
	}
	public BigDecimal getMonthAmt() {
		return monthAmt;
	}
	public void setMonthAmt(BigDecimal monthAmt) {
		this.monthAmt = monthAmt;
	}
	public String getIfCar() {
		return ifCar;
	}
	public void setIfCar(String ifCar) {
		this.ifCar = ifCar;
	}
	public String getLocalPlate() {
		return localPlate;
	}
	public void setLocalPlate(String localPlate) {
		this.localPlate = localPlate;
	}
	public String getIfCarCred() {
		return ifCarCred;
	}
	public void setIfCarCred(String ifCarCred) {
		this.ifCarCred = ifCarCred;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarBuyDate() {
		return carBuyDate;
	}
	public void setCarBuyDate(String carBuyDate) {
		this.carBuyDate = carBuyDate;
	}
	public BigDecimal getNakedCarBuyPrice() {
		return nakedCarBuyPrice;
	}
	public void setNakedCarBuyPrice(BigDecimal nakedCarBuyPrice) {
		this.nakedCarBuyPrice = nakedCarBuyPrice;
	}
	public BigDecimal getCarBuyPrice() {
		return carBuyPrice;
	}
	public void setCarBuyPrice(BigDecimal carBuyPrice) {
		this.carBuyPrice = carBuyPrice;
	}
	public BigDecimal getCarLoanTerm() {
		return carLoanTerm;
	}
	public void setCarLoanTerm(BigDecimal carLoanTerm) {
		this.carLoanTerm = carLoanTerm;
	}
	public Integer getCarLoanPeriod() {
		return carLoanPeriod;
	}
	public void setCarLoanPeriod(Integer carLoanPeriod) {
		this.carLoanPeriod = carLoanPeriod;
	}
	public BigDecimal getCarMonthPaymentAmt() {
		return carMonthPaymentAmt;
	}
	public void setCarMonthPaymentAmt(BigDecimal carMonthPaymentAmt) {
		this.carMonthPaymentAmt = carMonthPaymentAmt;
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
	public String getEstateType() {
		return estateType;
	}
	public void setEstateType(String estateType) {
		this.estateType = estateType;
	}
	public String getEstateState() {
		return estateState;
	}
	public void setEstateState(String estateState) {
		this.estateState = estateState;
	}
	public String getEstateCity() {
		return estateCity;
	}
	public void setEstateCity(String estateCity) {
		this.estateCity = estateCity;
	}
	public String getEstateZone() {
		return estateZone;
	}
	public void setEstateZone(String estateZone) {
		this.estateZone = estateZone;
	}
	public BigDecimal getEstateAmt() {
		return estateAmt;
	}
	public void setEstateAmt(BigDecimal estateAmt) {
		this.estateAmt = estateAmt;
	}
	public BigDecimal getReferenceAmt() {
		return referenceAmt;
	}
	public void setReferenceAmt(BigDecimal referenceAmt) {
		this.referenceAmt = referenceAmt;
	}
	public BigDecimal getEstateLoanAmt() {
		return estateLoanAmt;
	}
	public void setEstateLoanAmt(BigDecimal estateLoanAmt) {
		this.estateLoanAmt = estateLoanAmt;
	}
	public BigDecimal getEstateMonthPaymentAmt() {
		return estateMonthPaymentAmt;
	}
	public void setEstateMonthPaymentAmt(BigDecimal estateMonthPaymentAmt) {
		this.estateMonthPaymentAmt = estateMonthPaymentAmt;
	}
	public Integer getHasRepaymentNum() {
		return hasRepaymentNum;
	}
	public void setHasRepaymentNum(Integer hasRepaymentNum) {
		this.hasRepaymentNum = hasRepaymentNum;
	}
	public BigDecimal getBuiltupArea() {
		return builtupArea;
	}
	public void setBuiltupArea(BigDecimal builtupArea) {
		this.builtupArea = builtupArea;
	}
	public String getHouseOwnership() {
		return houseOwnership;
	}
	public void setHouseOwnership(String houseOwnership) {
		this.houseOwnership = houseOwnership;
	}
	public BigDecimal getEquityRate() {
		return equityRate;
	}
	public void setEquityRate(BigDecimal equityRate) {
		this.equityRate = equityRate;
	}
	public String getIfMe() {
		return ifMe;
	}
	public void setIfMe(String ifMe) {
		this.ifMe = ifMe;
	}
	public String getEstateBuyDate() {
		return estateBuyDate;
	}
	public void setEstateBuyDate(String estateBuyDate) {
		this.estateBuyDate = estateBuyDate;
	}
	public BigDecimal getLoanBalance() {
		return loanBalance;
	}
	public void setLoanBalance(BigDecimal loanBalance) {
		this.loanBalance = loanBalance;
	}
	public Integer getHourseLoanPeriod() {
		return hourseLoanPeriod;
	}
	public void setHourseLoanPeriod(Integer hourseLoanPeriod) {
		this.hourseLoanPeriod = hourseLoanPeriod;
	}
	public BigDecimal getHoursePrice() {
		return hoursePrice;
	}
	public void setHoursePrice(BigDecimal hoursePrice) {
		this.hoursePrice = hoursePrice;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getHouseLoanNum() {
		return houseLoanNum;
	}
	public void setHouseLoanNum(Integer houseLoanNum) {
		this.houseLoanNum = houseLoanNum;
	}
	public Integer getOrtherLoanNum() {
		return ortherLoanNum;
	}
	public void setOrtherLoanNum(Integer ortherLoanNum) {
		this.ortherLoanNum = ortherLoanNum;
	}
	public Integer getLoanFirstMonth() {
		return loanFirstMonth;
	}
	public void setLoanFirstMonth(Integer loanFirstMonth) {
		this.loanFirstMonth = loanFirstMonth;
	}
	public Integer getCreditAccounts() {
		return creditAccounts;
	}
	public void setCreditAccounts(Integer creditAccounts) {
		this.creditAccounts = creditAccounts;
	}
	public Integer getCreditFirstMonth() {
		return creditFirstMonth;
	}
	public void setCreditFirstMonth(Integer creditFirstMonth) {
		this.creditFirstMonth = creditFirstMonth;
	}
	public Integer getSemiCreditAccounts() {
		return semiCreditAccounts;
	}
	public void setSemiCreditAccounts(Integer semiCreditAccounts) {
		this.semiCreditAccounts = semiCreditAccounts;
	}
	public Integer getSemiCreditFirstMonth() {
		return semiCreditFirstMonth;
	}
	public void setSemiCreditFirstMonth(Integer semiCreditFirstMonth) {
		this.semiCreditFirstMonth = semiCreditFirstMonth;
	}
	public String getIfCard() {
		return ifCard;
	}
	public void setIfCard(String ifCard) {
		this.ifCard = ifCard;
	}
	public BigDecimal getCardAmt() {
		return cardAmt;
	}
	public void setCardAmt(BigDecimal cardAmt) {
		this.cardAmt = cardAmt;
	}
	public Integer getLoanOverCount() {
		return loanOverCount;
	}
	public void setLoanOverCount(Integer loanOverCount) {
		this.loanOverCount = loanOverCount;
	}
	public Integer getLoanOverMonth() {
		return loanOverMonth;
	}
	public void setLoanOverMonth(Integer loanOverMonth) {
		this.loanOverMonth = loanOverMonth;
	}
	public BigDecimal getLoanOverLtotal() {
		return loanOverLtotal;
	}
	public void setLoanOverLtotal(BigDecimal loanOverLtotal) {
		this.loanOverLtotal = loanOverLtotal;
	}
	public BigDecimal getLoanOverLmonths() {
		return loanOverLmonths;
	}
	public void setLoanOverLmonths(BigDecimal loanOverLmonths) {
		this.loanOverLmonths = loanOverLmonths;
	}
	public Integer getCreditOverAccounts() {
		return creditOverAccounts;
	}
	public void setCreditOverAccounts(Integer creditOverAccounts) {
		this.creditOverAccounts = creditOverAccounts;
	}
	public Integer getCreditOverMonths() {
		return creditOverMonths;
	}
	public void setCreditOverMonths(Integer creditOverMonths) {
		this.creditOverMonths = creditOverMonths;
	}
	public BigDecimal getCreditOverLtotal() {
		return creditOverLtotal;
	}
	public void setCreditOverLtotal(BigDecimal creditOverLtotal) {
		this.creditOverLtotal = creditOverLtotal;
	}
	public Integer getCreditOverLmonth() {
		return creditOverLmonth;
	}
	public void setCreditOverLmonth(Integer creditOverLmonth) {
		this.creditOverLmonth = creditOverLmonth;
	}
	public Integer getLoaningCorpOrg() {
		return loaningCorpOrg;
	}
	public void setLoaningCorpOrg(Integer loaningCorpOrg) {
		this.loaningCorpOrg = loaningCorpOrg;
	}
	public Integer getLoaningOrgNums() {
		return loaningOrgNums;
	}
	public void setLoaningOrgNums(Integer loaningOrgNums) {
		this.loaningOrgNums = loaningOrgNums;
	}
	public Integer getLoaningNum() {
		return loaningNum;
	}
	public void setLoaningNum(Integer loaningNum) {
		this.loaningNum = loaningNum;
	}
	public BigDecimal getLoaningContractTotal() {
		return loaningContractTotal;
	}
	public void setLoaningContractTotal(BigDecimal loaningContractTotal) {
		this.loaningContractTotal = loaningContractTotal;
	}
	public BigDecimal getLoaningRemainSum() {
		return loaningRemainSum;
	}
	public void setLoaningRemainSum(BigDecimal loaningRemainSum) {
		this.loaningRemainSum = loaningRemainSum;
	}
	public BigDecimal getLoaningMeanPay() {
		return loaningMeanPay;
	}
	public void setLoaningMeanPay(BigDecimal loaningMeanPay) {
		this.loaningMeanPay = loaningMeanPay;
	}
	public Integer getExistCorpOrg() {
		return existCorpOrg;
	}
	public void setExistCorpOrg(Integer existCorpOrg) {
		this.existCorpOrg = existCorpOrg;
	}
	public Integer getExistOrgNum() {
		return existOrgNum;
	}
	public void setExistOrgNum(Integer existOrgNum) {
		this.existOrgNum = existOrgNum;
	}
	public Integer getExistAccount() {
		return existAccount;
	}
	public void setExistAccount(Integer existAccount) {
		this.existAccount = existAccount;
	}
	public BigDecimal getExistCreditTotal() {
		return existCreditTotal;
	}
	public void setExistCreditTotal(BigDecimal existCreditTotal) {
		this.existCreditTotal = existCreditTotal;
	}
	public BigDecimal getExistMaxAmount() {
		return existMaxAmount;
	}
	public void setExistMaxAmount(BigDecimal existMaxAmount) {
		this.existMaxAmount = existMaxAmount;
	}
	public BigDecimal getExistUsedAmount() {
		return existUsedAmount;
	}
	public void setExistUsedAmount(BigDecimal existUsedAmount) {
		this.existUsedAmount = existUsedAmount;
	}
	public BigDecimal getExistMeanAmount() {
		return existMeanAmount;
	}
	public void setExistMeanAmount(BigDecimal existMeanAmount) {
		this.existMeanAmount = existMeanAmount;
	}
	public Integer getEnsureCount() {
		return ensureCount;
	}
	public void setEnsureCount(Integer ensureCount) {
		this.ensureCount = ensureCount;
	}
	public BigDecimal getEnsureAmount() {
		return ensureAmount;
	}
	public void setEnsureAmount(BigDecimal ensureAmount) {
		this.ensureAmount = ensureAmount;
	}
	public BigDecimal getEnsureRemainder() {
		return ensureRemainder;
	}
	public void setEnsureRemainder(BigDecimal ensureRemainder) {
		this.ensureRemainder = ensureRemainder;
	}
	public String getOpenAccountDate() {
		return openAccountDate;
	}
	public void setOpenAccountDate(String openAccountDate) {
		this.openAccountDate = openAccountDate;
	}
	public BigDecimal getDepositRate() {
		return depositRate;
	}
	public void setDepositRate(BigDecimal depositRate) {
		this.depositRate = depositRate;
	}
	public BigDecimal getMonthDepositAmt() {
		return monthDepositAmt;
	}
	public void setMonthDepositAmt(BigDecimal monthDepositAmt) {
		this.monthDepositAmt = monthDepositAmt;
	}
	public BigDecimal getDepositBase() {
		return depositBase;
	}
	public void setDepositBase(BigDecimal depositBase) {
		this.depositBase = depositBase;
	}
	public String getProvidentInfo() {
		return providentInfo;
	}
	public void setProvidentInfo(String providentInfo) {
		this.providentInfo = providentInfo;
	}
	public String getPaymentUnit() {
		return paymentUnit;
	}
	public void setPaymentUnit(String paymentUnit) {
		this.paymentUnit = paymentUnit;
	}
	public Integer getPaymentMonthNum() {
		return paymentMonthNum;
	}
	public void setPaymentMonthNum(Integer paymentMonthNum) {
		this.paymentMonthNum = paymentMonthNum;
	}
	public BigDecimal getInsuranceAmt() {
		return insuranceAmt;
	}
	public void setInsuranceAmt(BigDecimal insuranceAmt) {
		this.insuranceAmt = insuranceAmt;
	}
	public Integer getInsuranceTerm() {
		return insuranceTerm;
	}
	public void setInsuranceTerm(Integer insuranceTerm) {
		this.insuranceTerm = insuranceTerm;
	}
	public Integer getPaidTerm() {
		return paidTerm;
	}
	public void setPaidTerm(Integer paidTerm) {
		this.paidTerm = paidTerm;
	}
	public String getLastPaymentDate() {
		return lastPaymentDate;
	}
	public void setLastPaymentDate(String lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPolicyRelation() {
		return policyRelation;
	}
	public void setPolicyRelation(String policyRelation) {
		this.policyRelation = policyRelation;
	}
	public BigDecimal getYearPaymentAmt() {
		return yearPaymentAmt;
	}
	public void setYearPaymentAmt(BigDecimal yearPaymentAmt) {
		this.yearPaymentAmt = yearPaymentAmt;
	}
	public String getPolicyCheck() {
		return policyCheck;
	}
	public void setPolicyCheck(String policyCheck) {
		this.policyCheck = policyCheck;
	}
	public String getAcctRegisterDate() {
		return acctRegisterDate;
	}
	public void setAcctRegisterDate(String acctRegisterDate) {
		this.acctRegisterDate = acctRegisterDate;
	}
	public String getBuyerCreditLevel() {
		return buyerCreditLevel;
	}
	public void setBuyerCreditLevel(String buyerCreditLevel) {
		this.buyerCreditLevel = buyerCreditLevel;
	}
	public String getBuyerCreditType() {
		return buyerCreditType;
	}
	public void setBuyerCreditType(String buyerCreditType) {
		this.buyerCreditType = buyerCreditType;
	}
	public String getGoodRate() {
		return goodRate;
	}
	public void setGoodRate(String goodRate) {
		this.goodRate = goodRate;
	}
	public BigDecimal getLastYearPayAmt() {
		return lastYearPayAmt;
	}
	public void setLastYearPayAmt(BigDecimal lastYearPayAmt) {
		this.lastYearPayAmt = lastYearPayAmt;
	}
	public BigDecimal getSesameCreditValue() {
		return sesameCreditValue;
	}
	public void setSesameCreditValue(BigDecimal sesameCreditValue) {
		this.sesameCreditValue = sesameCreditValue;
	}
	public BigDecimal getPayAmt1() {
		return payAmt1;
	}
	public void setPayAmt1(BigDecimal payAmt1) {
		this.payAmt1 = payAmt1;
	}
	public BigDecimal getPayAmt2() {
		return payAmt2;
	}
	public void setPayAmt2(BigDecimal payAmt2) {
		this.payAmt2 = payAmt2;
	}
	public BigDecimal getPayAmt3() {
		return payAmt3;
	}
	public void setPayAmt3(BigDecimal payAmt3) {
		this.payAmt3 = payAmt3;
	}
	public BigDecimal getOnlinePayMonthAmt() {
		return onlinePayMonthAmt;
	}
	public void setOnlinePayMonthAmt(BigDecimal onlinePayMonthAmt) {
		this.onlinePayMonthAmt = onlinePayMonthAmt;
	}
	public String getSetupShopDate() {
		return setupShopDate;
	}
	public void setSetupShopDate(String setupShopDate) {
		this.setupShopDate = setupShopDate;
	}
	public String getSellerCreditLevel() {
		return sellerCreditLevel;
	}
	public void setSellerCreditLevel(String sellerCreditLevel) {
		this.sellerCreditLevel = sellerCreditLevel;
	}
	public String getSellerCreditType() {
		return sellerCreditType;
	}
	public void setSellerCreditType(String sellerCreditType) {
		this.sellerCreditType = sellerCreditType;
	}
	public BigDecimal getRegardedNum() {
		return regardedNum;
	}
	public void setRegardedNum(BigDecimal regardedNum) {
		this.regardedNum = regardedNum;
	}
	public BigDecimal getTaobaoBillAmt1() {
		return taobaoBillAmt1;
	}
	public void setTaobaoBillAmt1(BigDecimal taobaoBillAmt1) {
		this.taobaoBillAmt1 = taobaoBillAmt1;
	}
	public BigDecimal getTaobaoBillAmt2() {
		return taobaoBillAmt2;
	}
	public void setTaobaoBillAmt2(BigDecimal taobaoBillAmt2) {
		this.taobaoBillAmt2 = taobaoBillAmt2;
	}
	public BigDecimal getTaobaoBillAmt3() {
		return taobaoBillAmt3;
	}
	public void setTaobaoBillAmt3(BigDecimal taobaoBillAmt3) {
		this.taobaoBillAmt3 = taobaoBillAmt3;
	}
	public BigDecimal getTaobaoBillAmt4() {
		return taobaoBillAmt4;
	}
	public void setTaobaoBillAmt4(BigDecimal taobaoBillAmt4) {
		this.taobaoBillAmt4 = taobaoBillAmt4;
	}
	public BigDecimal getTaobaoBillAmt5() {
		return taobaoBillAmt5;
	}
	public void setTaobaoBillAmt5(BigDecimal taobaoBillAmt5) {
		this.taobaoBillAmt5 = taobaoBillAmt5;
	}
	public BigDecimal getTaobaoBillAmt6() {
		return taobaoBillAmt6;
	}
	public void setTaobaoBillAmt6(BigDecimal taobaoBillAmt6) {
		this.taobaoBillAmt6 = taobaoBillAmt6;
	}
	public BigDecimal getTaobaoPayMonthAmt() {
		return taobaoPayMonthAmt;
	}
	public void setTaobaoPayMonthAmt(BigDecimal taobaoPayMonthAmt) {
		this.taobaoPayMonthAmt = taobaoPayMonthAmt;
	}
	public String getPersonalWater1() {
		return personalWater1;
	}
	public void setPersonalWater1(String personalWater1) {
		this.personalWater1 = personalWater1;
	}
	public BigDecimal getPersonMonthAverage() {
		return personMonthAverage;
	}
	public void setPersonMonthAverage(BigDecimal personMonthAverage) {
		this.personMonthAverage = personMonthAverage;
	}
	public BigDecimal getPersonalWaterTotal() {
		return personalWaterTotal;
	}
	public void setPersonalWaterTotal(BigDecimal personalWaterTotal) {
		this.personalWaterTotal = personalWaterTotal;
	}
	public String getPublicWater1() {
		return publicWater1;
	}
	public void setPublicWater1(String publicWater1) {
		this.publicWater1 = publicWater1;
	}
	public BigDecimal getPublicMonthAverage() {
		return publicMonthAverage;
	}
	public void setPublicMonthAverage(BigDecimal publicMonthAverage) {
		this.publicMonthAverage = publicMonthAverage;
	}
	public BigDecimal getPublicWaterTotal() {
		return publicWaterTotal;
	}
	public void setPublicWaterTotal(BigDecimal publicWaterTotal) {
		this.publicWaterTotal = publicWaterTotal;
	}
	public BigDecimal getWaterIncomeTotal() {
		return waterIncomeTotal;
	}
	public void setWaterIncomeTotal(BigDecimal waterIncomeTotal) {
		this.waterIncomeTotal = waterIncomeTotal;
	}
	public BigDecimal getAccLmt() {
		return accLmt;
	}
	public void setAccLmt(BigDecimal accLmt) {
		this.accLmt = accLmt;
	}
	public String getIssuerDate() {
		return issuerDate;
	}
	public void setIssuerDate(String issuerDate) {
		this.issuerDate = issuerDate;
	}
	public BigDecimal getCardCreditLimit() {
		return cardCreditLimit;
	}
	public void setCardCreditLimit(BigDecimal cardCreditLimit) {
		this.cardCreditLimit = cardCreditLimit;
	}
	public BigDecimal getCardBillAmt1() {
		return cardBillAmt1;
	}
	public void setCardBillAmt1(BigDecimal cardBillAmt1) {
		this.cardBillAmt1 = cardBillAmt1;
	}
	public BigDecimal getCardBillAmt2() {
		return cardBillAmt2;
	}
	public void setCardBillAmt2(BigDecimal cardBillAmt2) {
		this.cardBillAmt2 = cardBillAmt2;
	}
	public BigDecimal getCardBillAmt3() {
		return cardBillAmt3;
	}
	public void setCardBillAmt3(BigDecimal cardBillAmt3) {
		this.cardBillAmt3 = cardBillAmt3;
	}
	public BigDecimal getCardBillAmt4() {
		return cardBillAmt4;
	}
	public void setCardBillAmt4(BigDecimal cardBillAmt4) {
		this.cardBillAmt4 = cardBillAmt4;
	}
	public BigDecimal getCardPayMonthAmt() {
		return cardPayMonthAmt;
	}
	public void setCardPayMonthAmt(BigDecimal cardPayMonthAmt) {
		this.cardPayMonthAmt = cardPayMonthAmt;
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
	public String getPrdtName() {
		return prdtName;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}
	public String getWorkStart() {
		return workStart;
	}
	public void setWorkStart(String workStart) {
		this.workStart = workStart;
	}
	public List<AssetSelRelEntity> getListRel() {
		return listRel;
	}
	public void setListRel(List<AssetSelRelEntity> listRel) {
		this.listRel = listRel;
	}
	public List<AssetSelOtherCheckEntity> getListOtherCheck() {
		return listOtherCheck;
	}
	public void setListOtherCheck(List<AssetSelOtherCheckEntity> listOtherCheck) {
		this.listOtherCheck = listOtherCheck;
	}
	public List<AssetSelCreditEntity> getListCredit() {
		return listCredit;
	}
	public void setListCredit(List<AssetSelCreditEntity> listCredit) {
		this.listCredit = listCredit;
	}
	public List<AssetSelAuditEntity> getListAudit() {
		return listAudit;
	}
	public void setListAudit(List<AssetSelAuditEntity> listAudit) {
		this.listAudit = listAudit;
	}    
    
}
