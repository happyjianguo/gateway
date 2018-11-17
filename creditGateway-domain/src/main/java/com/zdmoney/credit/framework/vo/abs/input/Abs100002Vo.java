package com.zdmoney.credit.framework.vo.abs.input;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.AccountEntity;
import com.zdmoney.credit.framework.vo.abs.entity.ComBorrowerEntity;
import com.zdmoney.credit.framework.vo.abs.entity.RelBorrowerEntity;
import com.zdmoney.credit.framework.vo.abs.entity.RepayScheduleEntity;

/**
 * 功能号Abs100002 Vo对象 【放款申请接口】
 * @author 00236640
 *
 */
public class Abs100002Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 7402720051515304194L;
    
    /** 合同号码 **/
    @NotBlank(message = "合同号码不能为空！")
    private String pactNo;
    /** 产品号 **/
    @NotBlank(message = "产品号不能为空！")
    private String prdtNo;
    /** 合同金额 **/
    @NotNull(message = "合同金额不能为空！")
    private BigDecimal pactAmt;
    /** 趸交费总额 **/
    @NotNull(message = "趸交费总额不能为空！")
    private BigDecimal feeTotal;
    /** 利率（月） **/
    @NotNull(message = "利率（月）不能为空！")
    private BigDecimal lnRate;
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
    /** 到期日期 **/
    private String endDate;
    /** 扣款日类型 **/
    @NotBlank(message = "扣款日类型不能为空！")
    private String payType;
    /** 扣款日期 **/
    private Integer payDay;
    /** 期缴（保）费金额 **/
    @NotNull(message = "期缴（保）费金额不能为空！")
    private BigDecimal vouAmt;
    /** 借款状态 **/
    private String loanState;
    /** 借款流程状态 **/
    private String loanFlowState;
    /** 所属网点(管理营业部) **/
    private String salesDepartmentId;
    /** 所属网点(放款营业部) **/
    private String signSalesDepId;
    /** 申请营业部 **/
    private String applySalesDepId;
    /** 资金来源 **/
    private String fundsSources;
    /** 债权归属 **/
    private String loanBelong;
    /** 审批金额 **/
    private BigDecimal money;
    /** 借款目的 **/
    private String purpose;
    /** 申请日期 **/
    private String requestDate;
    /** 月还款能力 **/
    private BigDecimal restoreem;
    /** 审核金额 **/
    private BigDecimal auditingMoney;
    /** 申请金额 **/
    private BigDecimal requestMoney;
    /** 放款时间 **/
    private String grantMoneyDate;
    /** 签约日期 **/
    private String signDate;
    /** 申请期限 **/
    private Integer requestTime;
    /** 审批日期 **/
    private String auditDate;
    /** 审批金额 **/
    private BigDecimal approveMoney;
    /** 审批期数 **/
    private Integer approveTime;
    /** 合同确认日期 **/
    private String contractDate;
    /** 开始还款日期 **/
    private String startrdate;
    /** 结束还款日期 **/
    private String endrdate;
    /** 年化利率 **/
    private BigDecimal Rateey;
    /** 借款期限（月数） **/
    private Integer loanTime;
    /** 放款金额 **/
    private BigDecimal grantMoney;
    /** 风险金 **/
    private BigDecimal riskMoney;
    /** 罚息比率 **/
    private BigDecimal penaltyRate;
    /** 剩余本金 **/
    private BigDecimal residualPactMoney;
    /** 银行年利率均化到每月的利率,即平均每月利息 **/
    private BigDecimal accrualem;
    /** 预收的款项 **/
    private BigDecimal advance;
    /** 实际到账利率 **/
    private BigDecimal rate;
    /** 银行名称 **/
    private String bank;
    /** 是否签订合同 **/
    @NotBlank(message = "是否签订合同不能为空！")
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
    /** 产品名称 **/
    @NotBlank(message = "产品名称不能为空！")
    private String prdtName;
    /** 还款方式 **/
    @NotBlank(message = "还款方式不能为空！")
    private String repayType;
    /** 账户信息 **/
    List<AccountEntity> listAc = new ArrayList<AccountEntity>();
    /** 共同借款人 **/
    List<ComBorrowerEntity> listCom = new ArrayList<ComBorrowerEntity>();
    /** 借款关联人 **/
    List<RelBorrowerEntity> listRel = new ArrayList<RelBorrowerEntity>();
    /** 还款计划 **/
    //@NotEmpty(message = "【listRepay】还款计划列表信息不能为空！")
    List<RepayScheduleEntity> listRepay = new ArrayList<RepayScheduleEntity>();
    public String getPactNo() {
        return pactNo;
    }
    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
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
    public String getLoanState() {
        return loanState;
    }
    public void setLoanState(String loanState) {
        this.loanState = loanState;
    }
    public String getLoanFlowState() {
        return loanFlowState;
    }
    public void setLoanFlowState(String loanFlowState) {
        this.loanFlowState = loanFlowState;
    }
    public String getSalesDepartmentId() {
        return salesDepartmentId;
    }
    public void setSalesDepartmentId(String salesDepartmentId) {
        this.salesDepartmentId = salesDepartmentId;
    }
    public String getSignSalesDepId() {
        return signSalesDepId;
    }
    public void setSignSalesDepId(String signSalesDepId) {
        this.signSalesDepId = signSalesDepId;
    }
    public String getApplySalesDepId() {
        return applySalesDepId;
    }
    public void setApplySalesDepId(String applySalesDepId) {
        this.applySalesDepId = applySalesDepId;
    }
    public String getFundsSources() {
        return fundsSources;
    }
    public void setFundsSources(String fundsSources) {
        this.fundsSources = fundsSources;
    }
    public String getLoanBelong() {
        return loanBelong;
    }
    public void setLoanBelong(String loanBelong) {
        this.loanBelong = loanBelong;
    }
    public BigDecimal getMoney() {
        return money;
    }
    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public String getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
    public BigDecimal getRestoreem() {
        return restoreem;
    }
    public void setRestoreem(BigDecimal restoreem) {
        this.restoreem = restoreem;
    }
    public BigDecimal getAuditingMoney() {
        return auditingMoney;
    }
    public void setAuditingMoney(BigDecimal auditingMoney) {
        this.auditingMoney = auditingMoney;
    }
    public BigDecimal getRequestMoney() {
        return requestMoney;
    }
    public void setRequestMoney(BigDecimal requestMoney) {
        this.requestMoney = requestMoney;
    }
    public String getGrantMoneyDate() {
        return grantMoneyDate;
    }
    public void setGrantMoneyDate(String grantMoneyDate) {
        this.grantMoneyDate = grantMoneyDate;
    }
    public String getSignDate() {
        return signDate;
    }
    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }
    public Integer getRequestTime() {
        return requestTime;
    }
    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
    }
    public String getAuditDate() {
        return auditDate;
    }
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }
    public BigDecimal getApproveMoney() {
        return approveMoney;
    }
    public void setApproveMoney(BigDecimal approveMoney) {
        this.approveMoney = approveMoney;
    }
    public Integer getApproveTime() {
        return approveTime;
    }
    public void setApproveTime(Integer approveTime) {
        this.approveTime = approveTime;
    }
    public String getContractDate() {
        return contractDate;
    }
    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }
    public String getStartrdate() {
        return startrdate;
    }
    public void setStartrdate(String startrdate) {
        this.startrdate = startrdate;
    }
    public String getEndrdate() {
        return endrdate;
    }
    public void setEndrdate(String endrdate) {
        this.endrdate = endrdate;
    }
    public BigDecimal getRateey() {
        return Rateey;
    }
    public void setRateey(BigDecimal rateey) {
        Rateey = rateey;
    }
    public Integer getLoanTime() {
        return loanTime;
    }
    public void setLoanTime(Integer loanTime) {
        this.loanTime = loanTime;
    }
    public BigDecimal getGrantMoney() {
        return grantMoney;
    }
    public void setGrantMoney(BigDecimal grantMoney) {
        this.grantMoney = grantMoney;
    }
    public BigDecimal getRiskMoney() {
        return riskMoney;
    }
    public void setRiskMoney(BigDecimal riskMoney) {
        this.riskMoney = riskMoney;
    }
    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }
    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }
    public BigDecimal getResidualPactMoney() {
        return residualPactMoney;
    }
    public void setResidualPactMoney(BigDecimal residualPactMoney) {
        this.residualPactMoney = residualPactMoney;
    }
    public BigDecimal getAccrualem() {
        return accrualem;
    }
    public void setAccrualem(BigDecimal accrualem) {
        this.accrualem = accrualem;
    }
    public BigDecimal getAdvance() {
        return advance;
    }
    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
    }
    public BigDecimal getRate() {
        return rate;
    }
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
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
    public String getPrdtName() {
        return prdtName;
    }
    public void setPrdtName(String prdtName) {
        this.prdtName = prdtName;
    }
    
    public String getRepayType() {
        return repayType;
    }
    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }
    @Valid
    public List<AccountEntity> getListAc() {
        return listAc;
    }
    public void setListAc(List<AccountEntity> listAc) {
        this.listAc = listAc;
    }
    @Valid
    public List<ComBorrowerEntity> getListCom() {
        return listCom;
    }
    public void setListCom(List<ComBorrowerEntity> listCom) {
        this.listCom = listCom;
    }
    @Valid
    public List<RelBorrowerEntity> getListRel() {
        return listRel;
    }
    public void setListRel(List<RelBorrowerEntity> listRel) {
        this.listRel = listRel;
    }
    @Valid
    public List<RepayScheduleEntity> getListRepay() {
        return listRepay;
    }
    public void setListRepay(List<RepayScheduleEntity> listRepay) {
        this.listRepay = listRepay;
    }
}
