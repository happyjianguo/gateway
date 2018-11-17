package com.zdmoney.credit.framework.vo.aps.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 推送超时 拒绝结果 响应信息
 * @author 10098  2016年11月15日 下午8:30:02
 */
public class TimeOutRefEntity {
	/** 预审批ID **/
	@NotBlank(message="预审批ID不能为空")
	private String prePactNo;
	/** 处理结果 **/
	@NotBlank(message="处理结果不能为空")
	private String status;
	/**处理描述**/
	private String msg;
	public String getPrePactNo() {
		return prePactNo;
	}
	public void setPrePactNo(String prePactNo) {
		this.prePactNo = prePactNo;
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
