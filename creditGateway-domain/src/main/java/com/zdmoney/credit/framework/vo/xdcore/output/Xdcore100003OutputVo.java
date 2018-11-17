package com.zdmoney.credit.framework.vo.xdcore.output;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;


/**
 * 功能号Xdcore100003 返回Vo对象 【推送提前清贷结果】
 * @author 00236640
 *
 */
public class Xdcore100003OutputVo extends XdcoreBaseParamVo {

	private static final long serialVersionUID = 5222889671328184506L;
	
	/** 状态 **/
	@NotBlank(message = "状态不能为空")
	private String status;
	/** 消息 **/
	@NotBlank(message = "消息不能为空")
	private String msg;
	/** 合同号 **/
	@NotBlank(message = "合同号不能为空")
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
