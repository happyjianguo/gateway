package com.zdmoney.credit.framework.vo.lufax.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class CustomerSerialnoListEntity {
	/**银行编号*/
    private String BANK_CODE;
    
    /**最近第一个月收入*/
    private String RELAMONTH;
    
    /**流水类型 */
    private String ACCOUTTY;

    @JSONField(name = "BANK_CODE")
	public String getBANK_CODE() {
		return BANK_CODE;
	}

	public void setBANK_CODE(String bANK_CODE) {
		BANK_CODE = bANK_CODE;
	}

	@JSONField(name = "RELAMONTH")
	public String getRELAMONTH() {
		return RELAMONTH;
	}

	public void setRELAMONTH(String rELAMONTH) {
		RELAMONTH = rELAMONTH;
	}

	@JSONField(name = "ACCOUTTY")
	public String getACCOUTTY() {
		return ACCOUTTY;
	}

	public void setACCOUTTY(String aCCOUTTY) {
		ACCOUTTY = aCCOUTTY;
	}
    
}
