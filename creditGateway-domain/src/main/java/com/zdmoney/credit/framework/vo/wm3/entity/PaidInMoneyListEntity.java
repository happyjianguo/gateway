package com.zdmoney.credit.framework.vo.wm3.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class PaidInMoneyListEntity {
	private String pactNo;//合同号
	private String repayType;//实收类型
	private BigDecimal repayAmt;//实收金额
	List<DeductMoneyDetailListEntity> listSubj = new ArrayList<DeductMoneyDetailListEntity>();
	
	public PaidInMoneyListEntity() {
		
	}
	
	public PaidInMoneyListEntity(String pactNo,BigDecimal repayAmt) {
		this.pactNo = pactNo;
		this.repayAmt = repayAmt;
	}

	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
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

	@Override
    public String toString() {
        return "PaidInMoneyListEntity [pactNo=" + pactNo + ", repayAmt=" + repayAmt + "]";
    }

}
