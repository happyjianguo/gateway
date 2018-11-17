package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by YM10098 on 2017/7/6.
 */
public class PushLoanInfoFeeInfoEntity implements Serializable{

    private static final long serialVersionUID = -4160686769851494954L;
    /**费用类型**/
    private String feeCode;
    /**应还费用金额**/
    private BigDecimal payfeeamt;
    /**实还费用金额**/
    private BigDecimal actualPayfeeamt;

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public BigDecimal getPayfeeamt() {
        return payfeeamt;
    }

    public void setPayfeeamt(BigDecimal payfeeamt) {
        this.payfeeamt = payfeeamt;
    }

    public BigDecimal getActualPayfeeamt() {
        return actualPayfeeamt;
    }

    public void setActualPayfeeamt(BigDecimal actualPayfeeamt) {
        this.actualPayfeeamt = actualPayfeeamt;
    }
}
