package com.zdmoney.credit.framework.vo.xdcore.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

/**
 * @ClassName:     BYXY0018Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年2月9日 上午9:29:56
 */
public class BYXY0018Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	/** 还款业务申请流水号*/
	@NotBlank(message="还款业务申请流水号不能为空")
	private String repayBusNumber;
	
	/** 返回码*/
	@NotBlank(message="返回码不能为空")
	private String respcd;
	
	/** 返回信息*/
	@NotBlank(message="返回信息不能为空")
	private String resptx;

	public String getRepayBusNumber() {
		return repayBusNumber;
	}

	public void setRepayBusNumber(String repayBusNumber) {
		this.repayBusNumber = repayBusNumber;
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
	
}
