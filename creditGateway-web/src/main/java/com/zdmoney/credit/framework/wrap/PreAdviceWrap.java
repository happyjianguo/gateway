package com.zdmoney.credit.framework.wrap;

import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.framework.funcid.FuncIdInstance;
import com.zdmoney.credit.framework.request.RequestWrap;
import com.zdmoney.credit.framework.response.ResponseWrap;
import com.zdmoney.credit.framework.vo.common.SecretKeyVo;
import com.zdmoney.credit.framework.vo.request.BsbRequestVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;

/**
 * 封装请求信息包裹
 * 
 * @author Ivan
 *
 */
public class PreAdviceWrap {
	/** 请求信息 **/
	private RequestVo requestVo = new RequestVo();
	/** 内置request **/
	private RequestWrap requestWrap;
	/** 内置response **/
	private ResponseWrap responseWrap;
	/** 业务功能号 **/
	private FuncIdInstance funcIdInstance;
	/** 密钥信息 **/
	private SecretKeyVo secretKeyVo = new SecretKeyVo();
	
	/** 包银请求正文 **/
	private BsbRequestVo bsbRequestVo = new BsbRequestVo();
	
	/** 系统请求正文json*/
	private String requestContent;
	
	private ProjectEnum projectEnum;

	public RequestVo getRequestVo() {
		return requestVo;
	}

	public void setRequestVo(RequestVo requestVo) {
		this.requestVo = requestVo;
	}

	public FuncIdInstance getFuncIdInstance() {
		return funcIdInstance;
	}

	public void setFuncIdInstance(FuncIdInstance funcIdInstance) {
		this.funcIdInstance = funcIdInstance;
	}

	public SecretKeyVo getSecretKeyVo() {
		return secretKeyVo;
	}

	public void setSecretKeyVo(SecretKeyVo secretKeyVo) {
		this.secretKeyVo = secretKeyVo;
	}

	public RequestWrap getRequestWrap() {
		return requestWrap;
	}

	public void setRequestWrap(RequestWrap requestWrap) {
		this.requestWrap = requestWrap;
	}

	public ResponseWrap getResponseWrap() {
		return responseWrap;
	}

	public void setResponseWrap(ResponseWrap responseWrap) {
		this.responseWrap = responseWrap;
	}

	public BsbRequestVo getBsbRequestVo() {
		return bsbRequestVo;
	}

	public void setBsbRequestVo(BsbRequestVo bsbRequestVo) {
		this.bsbRequestVo = bsbRequestVo;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public ProjectEnum getProjectEnum() {
		return projectEnum;
	}

	public void setProjectEnum(ProjectEnum projectEnum) {
		this.projectEnum = projectEnum;
	}
	
}
