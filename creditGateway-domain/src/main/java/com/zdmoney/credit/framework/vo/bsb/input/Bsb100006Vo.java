package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100006Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:18:18
 */
public class Bsb100006Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 业务申请流水号*/
	@NotEmpty(message = "业务申请流水号不能为空！")
	private String busNumber;
	
	/** 授信流水号*/
	private String serialNo;

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
}
