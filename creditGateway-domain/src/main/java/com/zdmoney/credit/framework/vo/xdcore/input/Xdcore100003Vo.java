package com.zdmoney.credit.framework.vo.xdcore.input;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

/**
 * 功能号Xdcore100003 Vo对象 【推送提前清贷结果】
 * @author wangn
 *
 */
public class Xdcore100003Vo extends XdcoreBaseParamVo {

    private static final long serialVersionUID = 6574171377634757365L;
    
    /**合同号**/
    @NotBlank(message="合同号不能为空")
    private String pactNO;
    /**账号姓名**/
    @NotBlank(message="账号姓名不能为空")
    private String acName;
    /**还款账号**/
    @NotBlank(message="还款账号不能为空")
    private String acNo;
    /**银行代码**/
    @NotBlank(message="银行代码不能为空")
    private String opnCode;
    /**开户行**/
    private String opnName;
    /**扣款流水号**/
    @NotBlank(message="扣款流水号不能为空")
    private String serialNo;
    /**应收罚息**/
    @NotNull(message="应收罚息不能为空")
    private BigDecimal payOver;
    /**应收代扣费总额**/
    @NotNull(message="应收代扣费总额不能为空")
    private BigDecimal feeRec;
    /**扣款金额**/
    @NotNull(message="扣款金额不能为空")
    private BigDecimal repayTotal;
    /**扣款本金**/
    @NotNull(message="扣款本金不能为空")
    private BigDecimal repayAmt;
    /**扣款利息**/
    @NotNull(message="扣款利息不能为空")
    private BigDecimal repayInte;
    /**扣款罚息**/
    @NotNull(message="扣款罚息不能为空")
    private BigDecimal repayOver;
    /**代扣费总额**/
    private BigDecimal feeTotal;
    /**处理状态**/
    @NotBlank(message="处理状态不能为空")
    private String dealSts;
    /**处理说明**/
    private String dealDesc;
    public String getPactNO() {
        return pactNO;
    }
    public void setPactNO(String pactNO) {
        this.pactNO = pactNO;
    }
    public String getAcName() {
        return acName;
    }
    public void setAcName(String acName) {
        this.acName = acName;
    }
    public String getAcNo() {
        return acNo;
    }
    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }
    public String getOpnCode() {
        return opnCode;
    }
    public void setOpnCode(String opnCode) {
        this.opnCode = opnCode;
    }
    public String getOpnName() {
        return opnName;
    }
    public void setOpnName(String opnName) {
        this.opnName = opnName;
    }
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public BigDecimal getPayOver() {
        return payOver;
    }
    public void setPayOver(BigDecimal payOver) {
        this.payOver = payOver;
    }
    public BigDecimal getFeeRec() {
        return feeRec;
    }
    public void setFeeRec(BigDecimal feeRec) {
        this.feeRec = feeRec;
    }
    public BigDecimal getRepayTotal() {
        return repayTotal;
    }
    public void setRepayTotal(BigDecimal repayTotal) {
        this.repayTotal = repayTotal;
    }
    public BigDecimal getRepayAmt() {
        return repayAmt;
    }
    public void setRepayAmt(BigDecimal repayAmt) {
        this.repayAmt = repayAmt;
    }
    public BigDecimal getRepayInte() {
        return repayInte;
    }
    public void setRepayInte(BigDecimal repayInte) {
        this.repayInte = repayInte;
    }
    public BigDecimal getRepayOver() {
        return repayOver;
    }
    public void setRepayOver(BigDecimal repayOver) {
        this.repayOver = repayOver;
    }
    public BigDecimal getFeeTotal() {
        return feeTotal;
    }
    public void setFeeTotal(BigDecimal feeTotal) {
        this.feeTotal = feeTotal;
    }
    public String getDealSts() {
        return dealSts;
    }
    public void setDealSts(String dealSts) {
        this.dealSts = dealSts;
    }
    public String getDealDesc() {
        return dealDesc;
    }
    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }
}
