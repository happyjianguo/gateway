package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class BuyBackEntity {

    /** 合同号 **/
    @NotBlank(message = "合同号不能为空！")
    private String pactNo;

    /** 回购金额 **/
    @NotNull(message = "回购金额不能为空！")
    private BigDecimal repAmt;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public BigDecimal getRepAmt() {
        return repAmt;
    }

    public void setRepAmt(BigDecimal repAmt) {
        this.repAmt = repAmt;
    }
}
