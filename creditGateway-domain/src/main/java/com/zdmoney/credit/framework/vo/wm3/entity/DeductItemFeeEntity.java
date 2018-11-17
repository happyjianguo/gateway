package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;

public class DeductItemFeeEntity {
	private long cnt;	//期次
	private String feeType;	//费用用途 01 服务费	02 保费 04 展期费 05 趸交费  06 违约金
	private String feeKind;	//费用类型 01 自收	02 代收
	private BigDecimal feeAmt;	//费用金额
	public long getCnt() {
		return cnt;
	}
	public void setCnt(long cnt) {
		this.cnt = cnt;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getFeeKind() {
		return feeKind;
	}
	public void setFeeKind(String feeKind) {
		this.feeKind = feeKind;
	}
	public BigDecimal getFeeAmt() {
		return feeAmt;
	}
	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}
	
	
}
