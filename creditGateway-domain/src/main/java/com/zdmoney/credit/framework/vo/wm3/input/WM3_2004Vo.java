package com.zdmoney.credit.framework.vo.wm3.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;

/**
 * 功能号WM3_2004Vo Vo对象
 * 预审批单笔申请接口参数类
 * @author 00236640
 *
 */
public class WM3_2004Vo extends WM3BaseParamVo {
    
    private static final long serialVersionUID = 4606376095466745388L;
    
    /** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String brNo;
    
    /** 申请件编号 **/
    @NotBlank(message = "申请件编号不能为空！")
    private String prePactNo;
    
    /** 客户姓名 **/
    @NotBlank(message = "客户姓名不能为空！")
    private String custName;
    
    /** 证件类型 **/
    @NotBlank(message = "证件类型不能为空！")
    private String idType;
    
    /** 证件号码 **/
    @NotBlank(message = "证件号码不能为空！")
    private String idNo;
    
    private String custType;
    private String sex;
    private String birth;
    private String marriage;
    private String children;
    private String edu;
    private String degree;
    private String telNo;
    private String phoneNo;
    private String homeArea;
    private String homeSts;
    private String income;
    private String projNo;
    private String prdtNo;
    private String pactAmt;
    private String lnRate;
    private String appArea;
    private String appUse;
    private String termMon;
    private String termDay;
    private String vouType;
    private String payType;
    private String ifCar;
    private String ifCarCred;
    private String ifRoom;
    private String ifMort;
    private String ifCard;
    private String cardAmt;
    private String ifApp;
    private String ifId;
    private String ifPact;

    public String getBrNo() {
        return brNo;
    }

    public void setBrNo(String brNo) {
        this.brNo = brNo;
    }

    public String getPrePactNo() {
        return prePactNo;
    }

    public void setPrePactNo(String prePactNo) {
        this.prePactNo = prePactNo;
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

    public String getHomeArea() {
      return homeArea;
    }

    public void setHomeArea(String homeArea) {
      this.homeArea = homeArea;
    }

    public String getHomeSts() {
      return homeSts;
    }

    public void setHomeSts(String homeSts) {
      this.homeSts = homeSts;
    }

    public String getIncome() {
      return income;
    }

    public void setIncome(String income) {
      this.income = income;
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

    public String getPactAmt() {
      return pactAmt;
    }

    public void setPactAmt(String pactAmt) {
      this.pactAmt = pactAmt;
    }

    public String getLnRate() {
      return lnRate;
    }

    public void setLnRate(String lnRate) {
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

    public String getTermMon() {
      return termMon;
    }

    public void setTermMon(String termMon) {
      this.termMon = termMon;
    }

    public String getTermDay() {
      return termDay;
    }

    public void setTermDay(String termDay) {
      this.termDay = termDay;
    }

    public String getVouType() {
      return vouType;
    }

    public void setVouType(String vouType) {
      this.vouType = vouType;
    }

    public String getPayType() {
      return payType;
    }

    public void setPayType(String payType) {
      this.payType = payType;
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

    public String getCardAmt() {
      return cardAmt;
    }

    public void setCardAmt(String cardAmt) {
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
    
    
}
