package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.common.annotate.BigDecimalAnnotate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YM10098 on 2017/7/5.
 */
public class PushLoanInfoRepayPlanEntity implements Serializable {
    private static final long serialVersionUID = -1455003285203203840L;

    /** 期次 **/
    @NotNull(message = "期次不能为空！")
    private Integer termNo;
    /** 应还日 **/
    @NotEmpty(message = "应还日不能为空！")
    private String payDate;
    /** 起息日 **/
    @NotEmpty(message = "起息日不能为空！")
    private String valueDate;
    /** 结息日 **/
    @NotEmpty(message = "结息日不能为空！")
    private String expiryDate;
    /** 贷款利率 **/
    @NotNull(message = "贷款利率不能为空！")
    @BigDecimalAnnotate(isSubstring = false)
    private BigDecimal loanRate;
    /** 应还本金 **/
    @NotNull(message = "应还本金不能为空！")
    private BigDecimal payprincipalamt;
    /** 实还本金 **/
    @NotNull(message = "实还本金不能为空！")
    private BigDecimal actualPayprincipalamt;
    /** 应还利息 **/
    @NotNull(message = "应还利息不能为空！")
    private BigDecimal payinteamt;
    /** 实还利息 **/
    @NotNull(message = "实还利息不能为空！")
    private BigDecimal actualPayinteamt;
    /** 应还罚息 **/
    @NotNull(message = "应还罚息不能为空！")
    private BigDecimal payfineamt;
    /** 实还罚息 **/
    @NotNull(message = "实还罚息不能为空！")
    private BigDecimal actualPayfineamt;
    /** 应还复利 **/
    @NotNull(message = "应还复利不能为空！")
    private BigDecimal paycompound;
    /** 实还复利 **/
    @NotNull(message = "实还复利不能为空！")
    private BigDecimal actualPaycompound;
    /** 罚息计算日期 **/
    private String fineCalculateDate;
    /** 罚息积数 **/
    private BigDecimal fineBase;
    /** 复利计算日期 **/
    private String compoundCalculateDate;
    /** 复利积数 **/
    private BigDecimal compoundBase;
    /** 本金余额 **/
    @NotNull(message = "本金余额不能为空！")
    private BigDecimal principalBalance;
    /** 期供金额 **/
    @NotNull(message = "期供金额不能为空！")
    private BigDecimal termAmt;
    /** 结清日期 **/
    private String finishDate;
    /** 状态 **/
    @NotEmpty(message = "状态不能为空！")
    private String status;
    private List<PushLoanInfoRepayFeePlanEntity> repayFeePlans = new ArrayList<>();
    public Integer getTermNo() {
        return termNo;
    }

    public void setTermNo(Integer termNo) {
        this.termNo = termNo;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BigDecimal getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(BigDecimal loanRate) {
        this.loanRate = loanRate;
    }

    public BigDecimal getPayprincipalamt() {
        return payprincipalamt;
    }

    public void setPayprincipalamt(BigDecimal payprincipalamt) {
        this.payprincipalamt = payprincipalamt;
    }

    public BigDecimal getActualPayprincipalamt() {
        return actualPayprincipalamt;
    }

    public void setActualPayprincipalamt(BigDecimal actualPayprincipalamt) {
        this.actualPayprincipalamt = actualPayprincipalamt;
    }

    public BigDecimal getPayinteamt() {
        return payinteamt;
    }

    public void setPayinteamt(BigDecimal payinteamt) {
        this.payinteamt = payinteamt;
    }

    public BigDecimal getActualPayinteamt() {
        return actualPayinteamt;
    }

    public void setActualPayinteamt(BigDecimal actualPayinteamt) {
        this.actualPayinteamt = actualPayinteamt;
    }

    public BigDecimal getPayfineamt() {
        return payfineamt;
    }

    public void setPayfineamt(BigDecimal payfineamt) {
        this.payfineamt = payfineamt;
    }

    public BigDecimal getActualPayfineamt() {
        return actualPayfineamt;
    }

    public void setActualPayfineamt(BigDecimal actualPayfineamt) {
        this.actualPayfineamt = actualPayfineamt;
    }

    public BigDecimal getPaycompound() {
        return paycompound;
    }

    public void setPaycompound(BigDecimal paycompound) {
        this.paycompound = paycompound;
    }

    public BigDecimal getActualPaycompound() {
        return actualPaycompound;
    }

    public void setActualPaycompound(BigDecimal actualPaycompound) {
        this.actualPaycompound = actualPaycompound;
    }

    public String getFineCalculateDate() {
        return fineCalculateDate;
    }

    public void setFineCalculateDate(String fineCalculateDate) {
        this.fineCalculateDate = fineCalculateDate;
    }

    public BigDecimal getFineBase() {
        return fineBase;
    }

    public void setFineBase(BigDecimal fineBase) {
        this.fineBase = fineBase;
    }

    public String getCompoundCalculateDate() {
        return compoundCalculateDate;
    }

    public void setCompoundCalculateDate(String compoundCalculateDate) {
        this.compoundCalculateDate = compoundCalculateDate;
    }

    public BigDecimal getCompoundBase() {
        return compoundBase;
    }

    public void setCompoundBase(BigDecimal compoundBase) {
        this.compoundBase = compoundBase;
    }

    public BigDecimal getPrincipalBalance() {
        return principalBalance;
    }

    public void setPrincipalBalance(BigDecimal principalBalance) {
        this.principalBalance = principalBalance;
    }

    public BigDecimal getTermAmt() {
        return termAmt;
    }

    public void setTermAmt(BigDecimal termAmt) {
        this.termAmt = termAmt;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PushLoanInfoRepayFeePlanEntity> getRepayFeePlans() {
        return repayFeePlans;
    }

    public void setRepayFeePlans(List<PushLoanInfoRepayFeePlanEntity> repayFeePlans) {
        this.repayFeePlans = repayFeePlans;
    }
}
