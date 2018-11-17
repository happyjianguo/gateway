package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100017Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:19:07
 */
public class Bsb100017Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;
	
	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 借据号*/
	@NotEmpty(message = "借据号不能为空！")
	private String orderNo;

	public String getProdSubNo() {
		return prodSubNo;
	}

	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
}
