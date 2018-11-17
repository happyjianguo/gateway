package com.zdmoney.credit.framework.vo.bsb;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class BsbBaseResponseVo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "返回码不能为空！")
	/** 返回码*/
	private String respcd;//
	
	@NotEmpty(message = "返回信息不能为空！")
	/** 返回信息*/
	private String resptx;

	public String getRespcd() {
		return respcd;
	}

	public void setRespcd(String respcd) {
		this.respcd = respcd;
	}

	public String getResptx() {
		return resptx;
	}

	public void setResptx(String resptx) {
		this.resptx = resptx;
	}
}
