package com.zdmoney.credit.framework.vo.xdcore.input;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

/**
 * @ClassName:     BYXY0010Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:56:57
 */
public class BYXY0010Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	/** 银行卡号*/
	@NotBlank(message="银行卡号不能为空")
	private String bankCardNo;
	
	/** 货币类型*/
	@NotBlank(message="货币类型不能为空")
	private String currency;
	
	/** 借据号*/
	@NotBlank(message="借据号不能为空")
	private String orderNo;
	
	/** 期次*/
	@NotNull(message="期次不能为空")
	private Integer period;
	
	/** 交易日期*/
	@NotBlank(message="交易日期不能为空")
	private String scheduleDate;
	
	/** 还款结果*/
	@NotBlank(message="还款结果不能为空")
	private String payResult;
	
	/** 失败原因*/
	private String failReason;
	
	/** 交易金额*/
	@NotNull(message="交易金额不能为空")
	private BigDecimal totalamt;

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getPayResult() {
		return payResult;
	}

	public void setPayResult(String payResult) {
		this.payResult = payResult;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public BigDecimal getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(BigDecimal totalamt) {
		this.totalamt = totalamt;
	}
	
}
