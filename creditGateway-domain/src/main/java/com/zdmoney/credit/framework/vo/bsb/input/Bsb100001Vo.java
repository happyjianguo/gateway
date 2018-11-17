package com.zdmoney.credit.framework.vo.bsb.input;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100001Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:17:39
 */
public class Bsb100001Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;
	
	/** 产品小类编号*/
	@NotEmpty(message = "产品小类编号不能为空！")
	private String prodSubNo;
	
	/** 借款金额*/
	@NotNull(message = "借款金额不能为空！")
	private BigDecimal transAmt;
	
	/** 总期数*/
	@NotNull(message = "总期数不能为空！")
	private Integer totalCnt;
	
	/** 月租金*/
	private BigDecimal monthRental;
	
	/** 还款方式*/
	@NotEmpty(message = "还款方式不能为空！")
	private String repayMethod;
	
	/** 订单开始日期*/
	private String startPayDate;
	
	/** 尾款合并方式*/
	private String lastPayMergeType;
	
	/** 借款方式*/
	private String payType;
	
	/** 订单结束日期*/
	private String endPayDate;
	
	/** 首期还款日*/
	@NotEmpty(message = "首期还款日不能为空！")
	private String firstPayDate;
	
	/** 贴息比例*/
	private BigDecimal discountPron;
	
	/** 第二期还款日*/
	private String secondPayDate;
	
	/** 尾款金额*/
	private BigDecimal finalAmt;
	
	/** 客户手续费比例*/
	private BigDecimal userFeeRate;
	
	/** 利率*/
	private BigDecimal interestRate;

	public String getProdSubNo() {
		return prodSubNo;
	}

	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
	}

	public BigDecimal getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt = transAmt;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

	public BigDecimal getMonthRental() {
		return monthRental;
	}

	public void setMonthRental(BigDecimal monthRental) {
		this.monthRental = monthRental;
	}

	public String getRepayMethod() {
		return repayMethod;
	}

	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getStartPayDate() {
		return startPayDate;
	}

	public void setStartPayDate(String startPayDate) {
		this.startPayDate = startPayDate;
	}

	public String getLastPayMergeType() {
		return lastPayMergeType;
	}

	public void setLastPayMergeType(String lastPayMergeType) {
		this.lastPayMergeType = lastPayMergeType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getEndPayDate() {
		return endPayDate;
	}

	public void setEndPayDate(String endPayDate) {
		this.endPayDate = endPayDate;
	}

	public String getFirstPayDate() {
		return firstPayDate;
	}

	public void setFirstPayDate(String firstPayDate) {
		this.firstPayDate = firstPayDate;
	}

	public BigDecimal getDiscountPron() {
		return discountPron;
	}

	public void setDiscountPron(BigDecimal discountPron) {
		this.discountPron = discountPron;
	}

	public String getSecondPayDate() {
		return secondPayDate;
	}

	public void setSecondPayDate(String secondPayDate) {
		this.secondPayDate = secondPayDate;
	}

	public BigDecimal getFinalAmt() {
		return finalAmt;
	}

	public void setFinalAmt(BigDecimal finalAmt) {
		this.finalAmt = finalAmt;
	}

	public BigDecimal getUserFeeRate() {
		return userFeeRate;
	}

	public void setUserFeeRate(BigDecimal userFeeRate) {
		this.userFeeRate = userFeeRate;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	
}
