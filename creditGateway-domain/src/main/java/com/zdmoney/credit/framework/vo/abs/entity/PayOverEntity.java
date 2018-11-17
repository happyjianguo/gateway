package com.zdmoney.credit.framework.vo.abs.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

public class PayOverEntity {

    /** 期次 **/
    @NotNull(message = "期次不能为空！")
    private Integer cnt;

    /** 当期应收罚息 **/
    @NotNull(message = "当期应收罚息不能为空！")
    private BigDecimal txPayOver;

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public BigDecimal getTxPayOver() {
        return txPayOver;
    }

    public void setTxPayOver(BigDecimal txPayOver) {
        this.txPayOver = txPayOver;
    }
}
