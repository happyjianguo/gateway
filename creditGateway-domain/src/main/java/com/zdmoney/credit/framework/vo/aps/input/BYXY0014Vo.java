package com.zdmoney.credit.framework.vo.aps.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;

/**
 * @ClassName:     BYXY0014Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:56:39
 */
public class BYXY0014Vo extends ApsBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	/** 授信流水号*/
	private String serialNo;
	
	/** 业务申请流水号*/
	@NotEmpty
	private String busNumber;
	
	/** 补件类型 用”|”分割，例如01|02|03*/
	private String patchType;
	
	/** 结果码*/
	@NotEmpty
	private String respcd;
	
	/** 结果信息*/
	@NotEmpty
	private String resptx;

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

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

	public String getPatchType() {
		return patchType;
	}

	public void setPatchType(String patchType) {
		this.patchType = patchType;
	}
	
}
