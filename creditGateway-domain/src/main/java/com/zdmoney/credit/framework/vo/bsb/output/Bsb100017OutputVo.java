package com.zdmoney.credit.framework.vo.bsb.output;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseResponseVo;

/**
 * @ClassName:     Bsb100017OutputVo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:17:27
 */
public class Bsb100017OutputVo extends BsbBaseResponseVo {

	private static final long serialVersionUID = 1L;
	
	/** 借据号*/
	private String orderNo;
	
	/** 贷款本金*/
	private String installTotalAmt;
	
	/** 已还本金*/
	private String repayBaseAmt;
	
	/** 应还本金*/
	private String repyam;
	
	/** 原利息*/
	private String installTotalInterest;
	
	/** 减免利息*/
	private String disCountInterest;
	
	/** 已还期数*/
	private String repayPeriod;
	
	/** 剩余期数*/
	private String remainRepayTimes;
	
	/** 违约金比例*/
	private String liqdaRatio;
	
	/** 违约金金额*/
	private String liqdaAmount;
	
	/** 提前还款总金额*/
	private String earlyRepaymentAmt;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getInstallTotalAmt() {
		return installTotalAmt;
	}

	public void setInstallTotalAmt(String installTotalAmt) {
		this.installTotalAmt = installTotalAmt;
	}

	public String getRepayBaseAmt() {
		return repayBaseAmt;
	}

	public void setRepayBaseAmt(String repayBaseAmt) {
		this.repayBaseAmt = repayBaseAmt;
	}

	public String getRepyam() {
		return repyam;
	}

	public void setRepyam(String repyam) {
		this.repyam = repyam;
	}

	public String getInstallTotalInterest() {
		return installTotalInterest;
	}

	public void setInstallTotalInterest(String installTotalInterest) {
		this.installTotalInterest = installTotalInterest;
	}

	public String getDisCountInterest() {
		return disCountInterest;
	}

	public void setDisCountInterest(String disCountInterest) {
		this.disCountInterest = disCountInterest;
	}

	public String getRepayPeriod() {
		return repayPeriod;
	}

	public void setRepayPeriod(String repayPeriod) {
		this.repayPeriod = repayPeriod;
	}

	public String getRemainRepayTimes() {
		return remainRepayTimes;
	}

	public void setRemainRepayTimes(String remainRepayTimes) {
		this.remainRepayTimes = remainRepayTimes;
	}

	public String getLiqdaRatio() {
		return liqdaRatio;
	}

	public void setLiqdaRatio(String liqdaRatio) {
		this.liqdaRatio = liqdaRatio;
	}

	public String getLiqdaAmount() {
		return liqdaAmount;
	}

	public void setLiqdaAmount(String liqdaAmount) {
		this.liqdaAmount = liqdaAmount;
	}

	public String getEarlyRepaymentAmt() {
		return earlyRepaymentAmt;
	}

	public void setEarlyRepaymentAmt(String earlyRepaymentAmt) {
		this.earlyRepaymentAmt = earlyRepaymentAmt;
	}
}
