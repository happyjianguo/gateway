package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;

public class DeductItemPayOverEntity {
	private long cnt;	//期次
	private BigDecimal   txPayOver;	//当期应收罚息
	public long getCnt() {
		return cnt;
	}
	public void setCnt(long cnt) {
		this.cnt = cnt;
	}
	public BigDecimal getTxPayOver() {
		return txPayOver;
	}
	public void setTxPayOver(BigDecimal txPayOver) {
		this.txPayOver = txPayOver;
	}
}
