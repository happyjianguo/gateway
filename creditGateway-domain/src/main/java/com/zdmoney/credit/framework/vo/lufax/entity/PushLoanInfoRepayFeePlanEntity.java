package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by YM10098 on 2017/7/5.
 */
public class PushLoanInfoRepayFeePlanEntity implements Serializable{

    private static final long serialVersionUID = -1379624001283073655L;
    /** 期次 **/
    @NotNull(message = "期次不能为空！")
    private BigDecimal termNo;
    /** 费用类型 **/
    @NotEmpty(message = "费用类型不能为空！")
    private String feeCode;
    /** 应还费用金额 **/
    @NotNull(message = "应还费用金额不能为空！")
    private BigDecimal payfeeamt;
    /** 实还费用金额 **/
    @NotNull(message = "实还费用金额不能为空！")
    private BigDecimal actualPayfeeamt;

    public BigDecimal getTermNo() {
        return termNo;
    }

    public void setTermNo(BigDecimal termNo) {
        this.termNo = termNo;
    }

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
