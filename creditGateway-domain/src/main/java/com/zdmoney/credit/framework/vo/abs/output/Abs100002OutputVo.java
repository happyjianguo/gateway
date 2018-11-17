package com.zdmoney.credit.framework.vo.abs.output;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;

/**
 * 功能号Abs100002 返回Vo对象 【放款申请接口】
 * @author 00236640
 *
 */
public class Abs100002OutputVo extends AbsBaseParamVo {
    
    private static final long serialVersionUID = 1459794732461173791L;
    
    /** 状态  **/
    @NotBlank(message = "返回状态不能为空！")
    private String status;
    
    /** 消息 **/
    //@NotEmpty(message = "返回消息不能为空！")
    private String msg;
    
    /** 合同号码 **/
    @NotBlank(message = "合同号码不能为空！")
    private String pactNo;

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

    public String getPactNo() {
        return pactNo;
    }

    public void setPactNo(String pactNo) {
        this.pactNo = pactNo;
    }
}
