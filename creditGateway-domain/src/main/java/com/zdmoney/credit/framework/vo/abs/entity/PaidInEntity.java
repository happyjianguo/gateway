package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.domain.BaseDomain;

/**
 * 对公还款列表信息
 * @author 00236640
 */
@SuppressWarnings("all")
public class PaidInEntity extends BaseDomain{

    /** 合同号 **/
    @NotBlank(message = "合同号不能为空！")
    private String pactNo;

    /** 本期期次 **/
    @NotNull(message = "本期期次不能为空！")
    private Integer cnt;

    /** 实收日期 **/
    @NotBlank(message = "实收日期不能为空！")
    private String payDate;

    /** 实收金额 **/
    @NotNull(message = "实收金额不能为空！")
    private BigDecimal payTotal;

    /** 实收本金 **/
    @NotNull(message = "实收本金不能为空！")
    private BigDecimal payAmt;

    /** 实收利息 **/
    @NotNull(message = "实收利息不能为空！")
    private BigDecimal payInte;

    /** 实收罚息 **/
    @NotNull(message = "实收罚息不能为空！")
    private BigDecimal payOver;

    /** 实收费用总额 **/
    @NotNull(message = "实收费用总额不能为空！")
    private BigDecimal feeTotal = new BigDecimal(0);

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
    
    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public BigDecimal getPayTotal() {
        return payTotal;
    }

    public void setPayTotal(BigDecimal payTotal) {
        this.payTotal = payTotal;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public BigDecimal getPayInte() {
        return payInte;
    }

    public void setPayInte(BigDecimal payInte) {
        this.payInte = payInte;
    }

    public BigDecimal getPayOver() {
        return payOver;
    }

    public void setPayOver(BigDecimal payOver) {
        this.payOver = payOver;
    }

    public BigDecimal getFeeTotal() {
        return feeTotal;
    }

    public void setFeeTotal(BigDecimal feeTotal) {
        this.feeTotal = feeTotal;
    }
}
