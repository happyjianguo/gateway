package com.zdmoney.credit.framework.vo.xdcore.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 响应 错误数据记录
 * @author 10098  2016年11月15日 上午11:22:37
 */
public class ResponseErrEntity {

	/** 合同号码 **/
	@NotBlank(message = "合同号码不能为空")
	private String pactNo;
	/** 信托项目编号 **/
	@NotBlank(message = "信托项目编号不能为空")
	private String projNo;
	/** 错误描述 **/
	private String msg;
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getProjNo() {
		return projNo;
	}
	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
