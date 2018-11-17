package com.zdmoney.credit.framework.vo.bsb.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100020Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:19:07
 */
public class Bsb100020Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;
	
	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 证件号码*/
    @NotEmpty(message = "证件号码不能为空！")
    private String idNo;
    
    /** 客户姓名*/
    @NotEmpty(message = "客户姓名不能为空！")
    private String custName;
    
    /** 业务流水号*/
    @NotEmpty(message = "业务流水号不能为空！")
    private String busNumber;

	public String getProdSubNo() {
		return prodSubNo;
	}

	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
	}

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
	
}
