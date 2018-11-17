package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100008Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:43:43
 */
public class Bsb100008Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 还款业务申请流水号*/
	@NotEmpty(message = "还款业务申请流水号不能为空！")
	private String repayBusNumber;
	
	/** 还款或违约申请流水号*/
	private String serialNo;

	public String getRepayBusNumber() {
		return repayBusNumber;
	}

	public void setRepayBusNumber(String repayBusNumber) {
		this.repayBusNumber = repayBusNumber;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	
}
