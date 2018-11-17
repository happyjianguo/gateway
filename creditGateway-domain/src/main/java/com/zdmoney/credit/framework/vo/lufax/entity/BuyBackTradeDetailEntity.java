package com.zdmoney.credit.framework.vo.lufax.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YM10098 on 2017/7/12.
 */
public class BuyBackTradeDetailEntity implements Serializable{
    /** 业务类型 **/
    @NotEmpty(message = "业务类型不能为空！")
    private String product_type;
    /** 安硕贷款受理号 **/
    @NotEmpty(message = "安硕贷款受理号不能为空！")
    private String anshuo_loan_accept_id;
    /** 借款申请ID **/
    @NotEmpty(message = "借款申请ID不能为空！")
    private String lufax_loan_req_id;
    /** 代偿详细信息 **/
    @Valid
    @NotEmpty(message = "代偿详细信息不能为空！")
    private List<BuyBackCompensatoryDetailEntity> detail = new ArrayList<>();
    /** 剩余本金余额 **/
    @NotEmpty(message = "剩余本金余额不能为空！")
    private String sur_amount;
    /** 安硕序号 **/
    @NotEmpty(message = "安硕序号不能为空！")
    private String serialno;
    /** 代偿方 **/
    private String advance_party;

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getAnshuo_loan_accept_id() {
        return anshuo_loan_accept_id;
    }

    public void setAnshuo_loan_accept_id(String anshuo_loan_accept_id) {
        this.anshuo_loan_accept_id = anshuo_loan_accept_id;
    }

    public String getLufax_loan_req_id() {
        return lufax_loan_req_id;
    }

    public void setLufax_loan_req_id(String lufax_loan_req_id) {
        this.lufax_loan_req_id = lufax_loan_req_id;
    }

    public List<BuyBackCompensatoryDetailEntity> getDetail() {
        return detail;
    }

    public void setDetail(List<BuyBackCompensatoryDetailEntity> detail) {
        this.detail = detail;
    }

    public String getSur_amount() {
        return sur_amount;
    }

    public void setSur_amount(String sur_amount) {
        this.sur_amount = sur_amount;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getAdvance_party() {
        return advance_party;
    }

    public void setAdvance_party(String advance_party) {
        this.advance_party = advance_party;
    }
}
