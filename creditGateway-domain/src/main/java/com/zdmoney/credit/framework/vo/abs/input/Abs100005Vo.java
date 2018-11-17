package com.zdmoney.credit.framework.vo.abs.input;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.PayOverEntity;

/**
 * 功能号Abs100005 Vo对象 【提前清贷申请】
 * 目前调整为：【提前结清扣款结果通知接口】
 * @author 00236640
 *
 */
public class Abs100005Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 合同号 **/
    @NotBlank(message = "合同号不能为空！")
    private String pactNo;

    /** 账户户名 **/
    @NotBlank(message = "账户户名不能为空！")
    private String acName;
    
    /** 还款账号 **/
    @NotBlank(message = "还款账号不能为空！")
    private String acNo;
    
    /** 银行代码 **/
    @NotBlank(message = "银行代码不能为空！")
    private String opnCode;
    
    /** 开户行 **/
    @NotBlank(message = "开户行不能为空！")
    private String opnName;
    
    /** 扣款流水号 **/
    @NotBlank(message = "扣款流水号不能为空！")
    private String serialNo;
    
    /** 应收罚息 **/
    @NotNull(message = "应收罚息不能为空！")
    private BigDecimal payOver;
    
    /** 应收代扣费总额 **/
    @NotNull(message = "应收代扣费总额不能为空！")
    private BigDecimal feeRec;
    
    /** 扣款金额 **/
    @NotNull(message = "扣款金额不能为空！")
    private BigDecimal repayTotal;
    
    /** 扣款本金 **/
    @NotNull(message = "扣款本金不能为空！")
    private BigDecimal repayAmt;
    
    /** 扣款利息 **/
    @NotNull(message = "扣款利息不能为空！")
    private BigDecimal repayInte;
    
    /** 扣款罚息 **/
    @NotNull(message = "扣款罚息不能为空！")
    private BigDecimal repayOver;
    
    /** 代扣费总额 **/
    @NotNull(message = "代扣费总额不能为空！")
    private BigDecimal feeTotal;
    
    /** 虚拟账户渠道 **/
    private String cardChn;
    
    /** 每期罚息明细信息 **/
    private List<PayOverEntity> listPayOver = new ArrayList<PayOverEntity>();

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
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

    public List<PayOverEntity> getListPayOver() {
        return listPayOver;
    }

    public void setListPayOver(List<PayOverEntity> listPayOver) {
        this.listPayOver = listPayOver;
    }

    public String getCardChn() {
        return cardChn;
    }

    public void setCardChn(String cardChn) {
        this.cardChn = cardChn;
    }
}
