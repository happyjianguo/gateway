package com.zdmoney.credit.framework.vo.lufax.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author 10098  2017年4月24日 上午11:58:44
 */
public class ContractConfRepayFeeEntity implements Serializable{
	
	private static final long serialVersionUID = 9040469494769582654L;
	/**期次**/
    @NotBlank(message = "期次不能为空！")
	private int TERM_NO;
	/**费用类型**/
    @NotBlank(message = "费用类型不能为空！")
	private String FEE_CODE;
	/**应还费用金额**/
    @NotBlank(message = "应还费用不能为空！")
	private BigDecimal PAYFEEAMT;
	/**实还费用金额**/
    @NotBlank(message = "实还费用金额不能为空！")
	private BigDecimal ACTUAL_PAYFEEAMT;
    
    @JSONField(name = "TERM_NO")
	public int getTERM_NO() {
		return TERM_NO;
	}
	public void setTERM_NO(int tERM_NO) {
		TERM_NO = tERM_NO;
	}
	
	@JSONField(name = "FEE_CODE")
	public String getFEE_CODE() {
		return FEE_CODE;
	}
	public void setFEE_CODE(String fEE_CODE) {
		FEE_CODE = fEE_CODE;
	}
	
	@JSONField(name = "PAYFEEAMT")
	public BigDecimal getPAYFEEAMT() {
		return PAYFEEAMT;
	}
	public void setPAYFEEAMT(BigDecimal pAYFEEAMT) {
		PAYFEEAMT = pAYFEEAMT;
	}
	
	@JSONField(name = "ACTUAL_PAYFEEAMT")
	public BigDecimal getACTUAL_PAYFEEAMT() {
		return ACTUAL_PAYFEEAMT;
	}
	public void setACTUAL_PAYFEEAMT(BigDecimal aCTUAL_PAYFEEAMT) {
		ACTUAL_PAYFEEAMT = aCTUAL_PAYFEEAMT;
	}
}
