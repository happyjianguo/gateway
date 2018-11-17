package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by YM10098 on 2017/7/12.
 */
public class BuyBackCompensatoryDetailEntity implements Serializable{

    private static final long serialVersionUID = -4569878519485249112L;
    /** 第几期 **/
    @NotNull(message = "第几期不能为空！")
    private int rpterm;
    /** 本金 **/
    @NotNull(message = "本金不能为空！")
    private BigDecimal capital;
    /** 利息 **/
    @NotNull(message = "利息不能为空！")
    private BigDecimal aint;
    /** 罚息 **/
    private BigDecimal oint;
    /** 平台管理费 **/
    @NotNull(message = "平台管理费不能为空！")
    private BigDecimal fee_amt2;
    /** 信安咨询费 **/
    @NotNull(message = "信安咨询费不能为空！")
    private BigDecimal fee_amt3;
    /** 小贷管理费 **/
    @NotNull(message = "小贷管理费不能为空！")
    private BigDecimal fee_amt4;
    /** 风险准备金 **/
    @NotNull(message = "风险准备金不能为空！")
    private BigDecimal fee_amt5;
    /** 逾期违约金 **/
    @NotNull(message = "逾期违约金不能为空！")
    private BigDecimal fee_amt6;
    /** 准备金是否代垫 **/
    @NotEmpty(message = "准备金是否代垫不能为空！")
    private String is_reserve_advance;
    /** 提前还款违约金 **/
    @NotNull(message = "提前还款违约金不能为空！")
    private BigDecimal penal_value;

    public int getRpterm() {
        return rpterm;
    }

    public void setRpterm(int rpterm) {
        this.rpterm = rpterm;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getAint() {
        return aint;
    }

    public void setAint(BigDecimal aint) {
        this.aint = aint;
    }

    public BigDecimal getOint() {
        return oint;
    }

    public void setOint(BigDecimal oint) {
        this.oint = oint;
    }

    public BigDecimal getFee_amt2() {
        return fee_amt2;
    }

    public void setFee_amt2(BigDecimal fee_amt2) {
        this.fee_amt2 = fee_amt2;
    }

    public BigDecimal getFee_amt3() {
        return fee_amt3;
    }

    public void setFee_amt3(BigDecimal fee_amt3) {
        this.fee_amt3 = fee_amt3;
    }

    public BigDecimal getFee_amt4() {
        return fee_amt4;
    }

    public void setFee_amt4(BigDecimal fee_amt4) {
        this.fee_amt4 = fee_amt4;
    }

    public BigDecimal getFee_amt5() {
        return fee_amt5;
    }

    public void setFee_amt5(BigDecimal fee_amt5) {
        this.fee_amt5 = fee_amt5;
    }

    public BigDecimal getFee_amt6() {
        return fee_amt6;
    }

    public void setFee_amt6(BigDecimal fee_amt6) {
        this.fee_amt6 = fee_amt6;
    }

    public String getIs_reserve_advance() {
        return is_reserve_advance;
    }

    public void setIs_reserve_advance(String is_reserve_advance) {
        this.is_reserve_advance = is_reserve_advance;
    }

    public BigDecimal getPenal_value() {
        return penal_value;
    }

    public void setPenal_value(BigDecimal penal_value) {
        this.penal_value = penal_value;
    }
}
