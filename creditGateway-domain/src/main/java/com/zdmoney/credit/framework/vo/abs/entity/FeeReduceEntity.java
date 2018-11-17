package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class FeeReduceEntity {

    /** 合同号 **/
	@NotBlank(message = "合同号不能为空")
    private String pactNo;
    /** 减免本金 **/
    @NotNull(message = "减免本金不能为空")
    private BigDecimal refAmt;
    /** 减免利息 **/
    @NotNull(message = "减免利息不能为空")
    private BigDecimal refInte;
    /** 减免罚息 **/
    @NotNull(message = "减免罚息不能为空")
    private BigDecimal refOver;
    /** 减免费用 **/
    @NotNull(message = "减免费用不能为空")
    private BigDecimal refFee;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public BigDecimal getRefAmt() {
        return refAmt;
    }

    public void setRefAmt(BigDecimal refAmt) {
        this.refAmt = refAmt;
    }

    public BigDecimal getRefInte() {
        return refInte;
    }

    public void setRefInte(BigDecimal refInte) {
        this.refInte = refInte;
    }

    public BigDecimal getRefOver() {
        return refOver;
    }

    public void setRefOver(BigDecimal refOver) {
        this.refOver = refOver;
    }

    public BigDecimal getRefFee() {
        return refFee;
    }

    public void setRefFee(BigDecimal refFee) {
        this.refFee = refFee;
    }
}
