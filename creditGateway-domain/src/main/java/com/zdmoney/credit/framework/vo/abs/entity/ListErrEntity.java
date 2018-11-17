package com.zdmoney.credit.framework.vo.abs.entity;

import org.hibernate.validator.constraints.NotBlank;

public class ListErrEntity {

    /** 合同号 **/
    @NotBlank(message = "合同号不能为空！")
    private String pactNo;

    /** 错误描述 **/
    private String dealDesc;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }
}
