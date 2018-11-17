package com.zdmoney.credit.framework.vo.abs.output;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;


/**
 * 功能号Abs100001 返回Vo对象 【单笔资产挑选接口】
 * @author 00236640
 *
 */
public class Abs100001OutputVo extends AbsBaseParamVo {
    
    private static final long serialVersionUID = 1459794732461173791L;
    
    /** 状态  **/
    @NotBlank(message = "返回状态不能为空！")
    private String status;
    
    /** 消息 **/
    @NotEmpty(message = "返回消息不能为空！")
    private String msg;
    
    /** 申请件编号 **/
    @NotBlank(message = "申请件编号不能为空！")
    private String prePactNo;

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

    public String getPrePactNo() {
        return prePactNo;
    }

    public void setPrePactNo(String prePactNo) {
        this.prePactNo = prePactNo;
    }
}
