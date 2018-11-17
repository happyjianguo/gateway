package com.zdmoney.credit.framework.vo.bsb.output;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseResponseVo;

/**
 * @ClassName:     Bsb100002OutputVo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:16:10
 */
public class Bsb100002OutputVo extends BsbBaseResponseVo {

	private static final long serialVersionUID = 1L;
	
	/** 业务申请流水号*/ 
	private String busNumber;

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	
}
