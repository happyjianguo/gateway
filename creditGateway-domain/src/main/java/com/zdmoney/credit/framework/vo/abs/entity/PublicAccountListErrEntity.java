package com.zdmoney.credit.framework.vo.abs.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class PublicAccountListErrEntity {

    /** 合同号 **/
    @NotBlank(message = "合同号不能为空！")
    private String pactNo;
    
    /** 期次 **/
    @NotNull(message = "期次不能为空！")
    private Integer cnt;

    /** 错误描述 **/
    private String dealDesc;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }
}
