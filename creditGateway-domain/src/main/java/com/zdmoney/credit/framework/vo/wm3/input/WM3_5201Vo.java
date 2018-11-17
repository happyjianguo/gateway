package com.zdmoney.credit.framework.vo.wm3.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;

/**
 * 功能号WM3_5101Vo Vo对象
 * 账户开户接口类
 * 
 */
public class WM3_5201Vo extends WM3BaseParamVo {

	private static final long serialVersionUID = 5118912428072955526L;

	/** 账户类型 **/
	@NotBlank(message = "账户类型不能为空！")
	private String idType;
	
	/** 证件号 **/
	@NotBlank(message = "证件号不能为空！")
	private String idNo;

	/** 客户名称 **/
	@NotBlank(message = "客户名称不能为空！")
	private String custName;

	/** 合同号 **/
	@NotBlank(message = "合同号不能为空！")
	private String pactNo;
	
	/** 机构号 **/
	@NotBlank(message = "机构号不能为空！")
	private String brNo;
	
	/** 项目编号 **/
	@NotBlank(message = "项目编号不能为空！")
	private String projNo;

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

	public String getPactNo() {
		return pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getBrNo() {
		return brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getProjNo() {
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}

}
