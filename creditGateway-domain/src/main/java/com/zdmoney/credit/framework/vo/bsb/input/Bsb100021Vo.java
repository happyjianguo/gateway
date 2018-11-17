package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100021Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:19:07
 */
public class Bsb100021Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;
	
	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 交易流水号*/
	private String ordrno;
	
    /** 业务流水号*/
    private String busNumber;

    public String getProdSubNo() {
        return prodSubNo;
    }

    public void setProdSubNo(String prodSubNo) {
        this.prodSubNo = prodSubNo;
    }

    public String getOrdrno() {
        return ordrno;
    }

    public void setOrdrno(String ordrno) {
        this.ordrno = ordrno;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
}
