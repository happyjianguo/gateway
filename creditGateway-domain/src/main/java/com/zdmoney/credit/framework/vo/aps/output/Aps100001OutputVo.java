package com.zdmoney.credit.framework.vo.aps.output;


import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;


/**
 * 功能号Aps100001 返回Vo对象 【推送资产挑选结果接口】
 * @author 00236640
 *
 */
public class Aps100001OutputVo extends ApsBaseParamVo {
    
	private static final long serialVersionUID = 1679743278464618038L;

	/** 状态  **/
	@NotBlank(message = "返回状态不能为空！")
    private String status;
    
    /** 消息 **/
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
