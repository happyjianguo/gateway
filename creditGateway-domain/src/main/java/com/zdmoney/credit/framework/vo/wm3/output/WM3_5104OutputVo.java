package com.zdmoney.credit.framework.vo.wm3.output;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
/**
 * 功能号WM3_5104Vo 对象
 *  溢缴款账户充值结果查询响应数据类
 * 
 */
public class WM3_5104OutputVo extends WM3BaseParamVo {
	
	private static final long serialVersionUID = -2298736515217062669L;

	/** 溢缴款余额 **/
	@NotNull(message = "溢缴款余额不能为空！")
	private BigDecimal acctBal;

	/** 充值状态 **/
	@NotBlank(message = "充值状态不能为空！")
	private String payStatus;

	/** 溢缴款账户号 **/
	@NotBlank(message = "溢缴款账户号不能为空！")
	private String accountNo;

	/** 充值金额 **/
	@NotNull(message = "充值金额不能为空！")
	private BigDecimal amount;
    
	/** 充值结果描述 **/
	@NotBlank(message = "充值结果描述不能为空！")
	private String entryMessage;

	public BigDecimal getAcctBal() {
		return acctBal;
	}

	public void setAcctBal(BigDecimal acctBal) {
		this.acctBal = acctBal;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getEntryMessage() {
		return entryMessage;
	}

	public void setEntryMessage(String entryMessage) {
		this.entryMessage = entryMessage;
	}

	
	
	

}
