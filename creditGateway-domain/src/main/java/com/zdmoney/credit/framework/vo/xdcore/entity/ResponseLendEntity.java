package com.zdmoney.credit.framework.vo.xdcore.entity;

import org.hibernate.validator.constraints.NotBlank;

public class ResponseLendEntity {

    /** 合同编号 **/
    @NotBlank(message = "合同编号不能为空")
    private String pactNo;
    /** 处理结果 **/
    @NotBlank(message = "处理结果不能为空")
    private String status;
    /** 处理描述 **/
    private String msg;

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
