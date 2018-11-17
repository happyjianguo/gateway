package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeductMoneyListEntity {
	private String pactNo;//合同号
	private String serialNo;//扣款流水号
	private String acNo;//扣款账号
	private String cardChn;//扣款渠道    CL0001中金支付     CL0002广银联
	private String repayType;//扣款类型  01-正常扣款   02-提前清贷   03-溢缴款充值
    private BigDecimal repayAmt;//扣款总金额  
	List<DeductMoneyDetailListEntity> listSubj = new ArrayList<DeductMoneyDetailListEntity>();
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getAcNo() {
		return acNo;
	}
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}
	public String getCardChn() {
		return cardChn;
	}
	public void setCardChn(String cardChn) {
		this.cardChn = cardChn;
	}

	public String getRepayType() {
		return repayType;
	}

	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public BigDecimal getRepayAmt() {
		return repayAmt;
	}
	public void setRepayAmt(BigDecimal repayAmt) {
		this.repayAmt = repayAmt;
	}
	public List<DeductMoneyDetailListEntity> getListSubj() {
		return listSubj;
	}
	public void setListSubj(List<DeductMoneyDetailListEntity> listSubj) {
		this.listSubj = listSubj;
	}
	
    
}
