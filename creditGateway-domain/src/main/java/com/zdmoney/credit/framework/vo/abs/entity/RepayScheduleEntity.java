package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 还款计划信息
 * @author 10098 2016年11月11日 上午11:35:42
 */
public class RepayScheduleEntity {

    /** 当期利息 **/
    @NotNull(message = "当期利息不能为空！")
    private BigDecimal currentAccrual;
    
    /** 当前期数 **/
    @NotNull(message = "当前期数不能为空！")
    private Integer currentTerm;
    
    /** 本金余额 **/
    @NotNull(message = "本金金额不能为空！")
    private BigDecimal principalBalance;
    
    /** 一次性还款金额 **/
    @NotNull(message = "一次性还款金额不能为空！")
    private BigDecimal repaymentAll;
    
    /** 还款日期 **/
    @NotBlank(message = "还款日期不能为空！")
    private String returnDate;
    
    /** 剩余欠款,用于记录不足额部分 **/
    @NotNull(message = "剩余欠款不能为空！")
    private BigDecimal deficit;
    
    /** 当前还款状态 **/
    @NotBlank(message = "当前还款状态不能为空！")
    private String repaymentState;
    
    /** 结清日期 **/
    @NotBlank(message = "结清日期不能为空！")
    private String factreturnDate;
    
    /** 罚息起算日期 **/
    @NotBlank(message = "罚息起算日期不能为空！")
    private String penaltyDate;
    
    /** 每期还款金额 **/
    @NotNull(message = "每期还款金额不能为空！")
    private BigDecimal returneterm;
    
    /** 本期次账单日YYYYMMDD **/
    @NotBlank(message = "本期账单日不能为空！")
    private String endDate;
    
    /** 当期本金 **/
    @NotNull(message = "当期本金不能为空！")
    private BigDecimal prcpAmt;

    public BigDecimal getCurrentAccrual() {
        return currentAccrual;
    }

    public void setCurrentAccrual(BigDecimal currentAccrual) {
        this.currentAccrual = currentAccrual;
    }

    public Integer getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(Integer currentTerm) {
        this.currentTerm = currentTerm;
    }

    public BigDecimal getPrincipalBalance() {
        return principalBalance;
    }

    public void setPrincipalBalance(BigDecimal principalBalance) {
        this.principalBalance = principalBalance;
    }

    public BigDecimal getRepaymentAll() {
        return repaymentAll;
    }

    public void setRepaymentAll(BigDecimal repaymentAll) {
        this.repaymentAll = repaymentAll;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public BigDecimal getDeficit() {
        return deficit;
    }

    public void setDeficit(BigDecimal deficit) {
        this.deficit = deficit;
    }

    public String getRepaymentState() {
        return repaymentState;
    }

    public void setRepaymentState(String repaymentState) {
        this.repaymentState = repaymentState;
    }

    public String getFactreturnDate() {
        return factreturnDate;
    }

    public void setFactreturnDate(String factreturnDate) {
        this.factreturnDate = factreturnDate;
    }

    public String getPenaltyDate() {
        return penaltyDate;
    }

    public void setPenaltyDate(String penaltyDate) {
        this.penaltyDate = penaltyDate;
    }

    public BigDecimal getReturneterm() {
        return returneterm;
    }

    public void setReturneterm(BigDecimal returneterm) {
        this.returneterm = returneterm;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPrcpAmt() {
        return prcpAmt;
    }

    public void setPrcpAmt(BigDecimal prcpAmt) {
        this.prcpAmt = prcpAmt;
    }
}
