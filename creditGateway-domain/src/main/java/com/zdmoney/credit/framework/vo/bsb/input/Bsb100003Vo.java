package com.zdmoney.credit.framework.vo.bsb.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.validation.constraints.Risk01;
import com.zdmoney.credit.framework.validation.constraints.Risk02;
import com.zdmoney.credit.framework.validation.constraints.Risk03;
import com.zdmoney.credit.framework.validation.constraints.Risk04;
import com.zdmoney.credit.framework.validation.constraints.Risk05;
import com.zdmoney.credit.framework.validation.constraints.Risk06;
import com.zdmoney.credit.framework.validation.constraints.Risk07;
import com.zdmoney.credit.framework.validation.constraints.Risk08;
import com.zdmoney.credit.framework.validation.constraints.Risk09;
import com.zdmoney.credit.framework.validation.constraints.Risk10;
import com.zdmoney.credit.framework.validation.constraints.Risk11;
import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;
import com.zdmoney.credit.framework.vo.bsb.entity.AgentCustBankcard;
import com.zdmoney.credit.framework.vo.bsb.entity.AgentRentHourseInfo;
import com.zdmoney.credit.framework.vo.bsb.entity.ChanlRiskinfo;
import com.zdmoney.credit.framework.vo.bsb.entity.CompanyInfo;
import com.zdmoney.credit.framework.vo.bsb.entity.EduInfo;
import com.zdmoney.credit.framework.vo.bsb.entity.Environment;
import com.zdmoney.credit.framework.vo.bsb.entity.ImgNameInfo;
import com.zdmoney.credit.framework.vo.bsb.entity.LoanInfo;
import com.zdmoney.credit.framework.vo.bsb.entity.SpouseInfo;
import com.zdmoney.credit.framework.vo.bsb.entity.UserRelationInfo;

/**
 * @ClassName:     Bsb100003Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:17:49
 */
public class Bsb100003Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 业务流水号*/
	private String busNumber;
	
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
	
	/** 手机号码*/
	@NotEmpty(message = "手机号码不能为空！")
	private String mobNo;
	
	/** 通知回调地址*/
	@NotEmpty(message = "通知回调地址不能为空！")
	private String callbackUrl;
	
	/** 性别*/
	@NotEmpty(message = "性别不能为空！")
	private String gender;
	
	/** 用户邮箱*/
	private String email;
	
	/** QQ号*/
	private String qqNum;
	
	/** 用户联系人关系*/
	private String contactsRelations;
	
	/** *用户联系人姓名*/
	private String contactsName;
	
	/** 用户联系人手机号*/
	private String contactsMobile;
	
	/** 婚姻状态*/
	@NotEmpty(message = "婚姻状态不能为空！")
	private String marrStatus;
	
	/** 最高学历*/
	@NotEmpty(message = "最高学历不能为空！")
	private String eduDegree;
	
	/** 居住地址-详细地址*/
	@NotEmpty(message = "居住地址-详细地址不能为空！")
	private String addrDetail;
	
	/** 户籍地址*/
	private String cenRegiAdds;
	
	/** 借款信息*/
	@Valid
	@NotNull(message = "借款信息不能为空！")
	private LoanInfo loanInfo;
	
	/** 单位信息*/
	@Valid
	@NotEmpty(message = "单位信息不能为空！")
	private List<CompanyInfo> companyInfo;
	
	/** 配偶信息*/
	private SpouseInfo spouseInfo;
	
	/** 用户联系人信息（非配偶）*/
	private List<UserRelationInfo> userRelationInfo;
	
	/** 银行卡认证信息*/
	@Valid
	@NotNull(message = "银行卡认证信息不能为空！")
	private AgentCustBankcard agentCustBankcardAuthInfo;
	
	/** 房屋合同信息*/
	private AgentRentHourseInfo agentRentHourseInfo;
	
	/** 影像资料文件地址列表*/
	/*@NotEmpty(message = "影像资料文件地址列表不能为空！")*/
	private List<ImgNameInfo> imgNameList;
	
	/** 贷款金额*/
	private BigDecimal transAmt;
	
	/** 总期数 */
	private int totalCnt;
	
	/** 是否预授信 01，表示预授信，02表示真正授信*/
	private String isPreApproval;
	
	/** 渠道风控信息*/
	@Valid
	@NotEmpty(message = "渠道风控信息不能为空！")
	@Risk01 @Risk02 @Risk03 @Risk04 @Risk05 @Risk06 @Risk07 @Risk08 @Risk09 @Risk10 @Risk11
	private List<ChanlRiskinfo> chanlRiskinfo;
	
	/** 学历教育信息*/
	private EduInfo eduInfoObject;
	
	/** 环境信息*/
	private Environment environmentObject;

	public String getProdSubNo() {
		return prodSubNo;
	}

	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
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

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

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

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public String getCenRegiAdds() {
		return cenRegiAdds;
	}

	public void setCenRegiAdds(String cenRegiAdds) {
		this.cenRegiAdds = cenRegiAdds;
	}

	public LoanInfo getLoanInfo() {
		return loanInfo;
	}

	public void setLoanInfo(LoanInfo loanInfo) {
		this.loanInfo = loanInfo;
	}

	public List<CompanyInfo> getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(List<CompanyInfo> companyInfo) {
		this.companyInfo = companyInfo;
	}

	public SpouseInfo getSpouseInfo() {
		return spouseInfo;
	}

	public void setSpouseInfo(SpouseInfo spouseInfo) {
		this.spouseInfo = spouseInfo;
	}

	public List<UserRelationInfo> getUserRelationInfo() {
		return userRelationInfo;
	}

	public void setUserRelationInfo(List<UserRelationInfo> userRelationInfo) {
		this.userRelationInfo = userRelationInfo;
	}

	public AgentCustBankcard getAgentCustBankcardAuthInfo() {
		return agentCustBankcardAuthInfo;
	}

	public void setAgentCustBankcardAuthInfo(
			AgentCustBankcard agentCustBankcardAuthInfo) {
		this.agentCustBankcardAuthInfo = agentCustBankcardAuthInfo;
	}

	public AgentRentHourseInfo getAgentRentHourseInfo() {
		return agentRentHourseInfo;
	}

	public void setAgentRentHourseInfo(AgentRentHourseInfo agentRentHourseInfo) {
		this.agentRentHourseInfo = agentRentHourseInfo;
	}

	public List<ImgNameInfo> getImgNameList() {
		return imgNameList;
	}

	public void setImgNameList(List<ImgNameInfo> imgNameList) {
		this.imgNameList = imgNameList;
	}

	public List<ChanlRiskinfo> getChanlRiskinfo() {
		return chanlRiskinfo;
	}

	public void setChanlRiskinfo(List<ChanlRiskinfo> chanlRiskinfo) {
		this.chanlRiskinfo = chanlRiskinfo;
	}

	public EduInfo getEduInfoObject() {
		return eduInfoObject;
	}

	public void setEduInfoObject(EduInfo eduInfoObject) {
		this.eduInfoObject = eduInfoObject;
	}

	public Environment getEnvironmentObject() {
		return environmentObject;
	}

	public void setEnvironmentObject(Environment environmentObject) {
		this.environmentObject = environmentObject;
	}

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    public String getIsPreApproval() {
        return isPreApproval;
    }

    public void setIsPreApproval(String isPreApproval) {
        this.isPreApproval = isPreApproval;
    }
	
}
