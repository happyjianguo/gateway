package com.zdmoney.credit.framework.vo.wm3.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
/**
 * 功能号WM3_5104Vo 对象
 *  溢缴款账户充值结果查询请求数据类
 * 
 */
public class WM3_5104Vo extends WM3BaseParamVo {

	private static final long serialVersionUID = -8968958459058874773L;
	
	/** 身份证号 **/
	@NotBlank(message = "身份证号不能为空！")
	private String idNo;

	/** 客户名称 **/
	@NotBlank(message = "客户名称不能为空！")
	private String custName;

	/** 溢缴款账户号：机构号_合同号 **/
	@NotBlank(message = "溢缴款账户号不能为空！")
	private String accountNo;

	/** 流水号 **/
	@NotBlank(message = "流水号不能为空！")
	private String serialNo;

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

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		return "WM3_5104Vo [idNo=" + idNo + ", custName=" + custName
				+ ", accountNo=" + accountNo + ", serialNo=" + serialNo + "]";
	}

	
    
	 
	
	
	


}
