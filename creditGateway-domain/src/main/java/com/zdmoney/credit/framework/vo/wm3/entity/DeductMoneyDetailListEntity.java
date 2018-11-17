package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;

public class DeductMoneyDetailListEntity {
	private Integer cnt;//期次  没有填 0
	private String subjType;//科目类型
	private BigDecimal subjAmt;//科目金额
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public String getSubjType() {
		return subjType;
	}
	public void setSubjType(String subjType) {
		this.subjType = subjType;
	}
	public BigDecimal getSubjAmt() {
		return subjAmt;
	}
	public void setSubjAmt(BigDecimal subjAmt) {
		this.subjAmt = subjAmt;
	}
    
	
}
