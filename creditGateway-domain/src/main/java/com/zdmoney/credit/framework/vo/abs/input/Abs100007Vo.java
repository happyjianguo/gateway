package com.zdmoney.credit.framework.vo.abs.input;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.PaidInEntity;

/**
 * 功能号Abs100007 Vo对象 【对公还款接口】
 * @author 00236640
 *
 */
public class Abs100007Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 批次号 **/
    @NotBlank(message = "批次号不能为空！")
    private String batNo;
    
    /** 专户银行流水号 **/
    @NotBlank(message = "专户银行流水号不能为空！")
    private String bankNo;
    
    /** 记录数 **/
    @NotNull(message = "记录数不能为空！")
    private Integer dataCnt;
    
    /** 批次实收金额 **/
    @NotNull(message = "批次实收金额不能为空！")
    private BigDecimal totalAmt;
    
    /** 对公还款列表信息 **/
    //@NotEmpty(message = "【listPaidIn】对公还款列表信息不能为空！")
    private List<PaidInEntity> listPaidIn = new ArrayList<PaidInEntity>();

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public Integer getDataCnt() {
        return dataCnt;
    }

    public void setDataCnt(Integer dataCnt) {
        this.dataCnt = dataCnt;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    @Valid
    public List<PaidInEntity> getListPaidIn() {
        return listPaidIn;
    }

    public void setListPaidIn(List<PaidInEntity> listPaidIn) {
        this.listPaidIn = listPaidIn;
    }
}
