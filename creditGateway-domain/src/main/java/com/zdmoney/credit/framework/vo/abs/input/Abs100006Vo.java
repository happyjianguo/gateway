package com.zdmoney.credit.framework.vo.abs.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.BuyBackEntity;

/**
 * 功能号Abs100005 Vo对象 【待回购信息上传】
 * @author 00236640
 *
 */
public class Abs100006Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 批次号 **/
    @NotBlank(message = "批次号不能为空！")
    private String batNo;

    /** 触发回购日期 **/
    @NotBlank(message = "触发回购日期不能为空！")
    private String repDate;
    
    /** 回购合计 **/
    @NotNull(message = "回购合计不能为空！")
    private BigDecimal repTotal;
    
    /** 回购本金 **/
    @NotNull(message = "回购本金不能为空！")
    private BigDecimal repAmt;
    
    /** 回购利息 **/
    @NotNull(message = "回购利息不能为空！")
    private BigDecimal repIntst;
    
    /** 回购金额列表信息 **/
    //@NotEmpty(message = "【listBuyBack】回购金额列表信息不能为空！")
    private List<BuyBackEntity> listBuyBack;

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    public String getRepDate() {
        return repDate;
    }

    public void setRepDate(String repDate) {
        this.repDate = repDate;
    }

    public BigDecimal getRepTotal() {
        return repTotal;
    }

    public void setRepTotal(BigDecimal repTotal) {
        this.repTotal = repTotal;
    }

    public BigDecimal getRepAmt() {
        return repAmt;
    }

    public void setRepAmt(BigDecimal repAmt) {
        this.repAmt = repAmt;
    }

    public BigDecimal getRepIntst() {
        return repIntst;
    }

    public void setRepIntst(BigDecimal repIntst) {
        this.repIntst = repIntst;
    }

    @Valid
    public List<BuyBackEntity> getListBuyBack() {
        return listBuyBack;
    }

    public void setListBuyBack(List<BuyBackEntity> listBuyBack) {
        this.listBuyBack = listBuyBack;
    }
}
