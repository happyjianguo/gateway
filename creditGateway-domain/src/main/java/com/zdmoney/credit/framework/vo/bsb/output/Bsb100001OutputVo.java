package com.zdmoney.credit.framework.vo.bsb.output;

import java.math.BigDecimal;
import java.util.List;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseResponseVo;

/**
 * @ClassName:     Bsb100001OutputVo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:16:04
 */
public class Bsb100001OutputVo extends BsbBaseResponseVo {

	private static final long serialVersionUID = 1L;
	
	/** 总本金*/
	private BigDecimal capitalAmt;
	
	/** 总利息*/
	private BigDecimal totalFeeAmt;
	
	/** 总费用*/
	private BigDecimal totalInterest;
	
	/** 总期数*/
	private Integer totalCnt;
	
	/** 还款计划列表*/
	private List<Item> payPlanList;
	
	public static class Item{
		/** 应还期次*/
		private Integer period;
		
		/** 应还日期*/
		private String scheduleDate;
		
		/** 应还本金*/
		private BigDecimal schedulePrincipal;
		
		/** 应还利息*/
		private BigDecimal scheduleInterest;
		
		/** 应还手续费*/
		private BigDecimal scheduleServiceFe;

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

		public BigDecimal getSchedulePrincipal() {
			return schedulePrincipal;
		}

		public void setSchedulePrincipal(BigDecimal schedulePrincipal) {
			this.schedulePrincipal = schedulePrincipal;
		}

		public BigDecimal getScheduleInterest() {
			return scheduleInterest;
		}

		public void setScheduleInterest(BigDecimal scheduleInterest) {
			this.scheduleInterest = scheduleInterest;
		}

		public BigDecimal getScheduleServiceFe() {
			return scheduleServiceFe;
		}

		public void setScheduleServiceFe(BigDecimal scheduleServiceFe) {
			this.scheduleServiceFe = scheduleServiceFe;
		}
		
	}

	public BigDecimal getCapitalAmt() {
		return capitalAmt;
	}

	public void setCapitalAmt(BigDecimal capitalAmt) {
		this.capitalAmt = capitalAmt;
	}

	public BigDecimal getTotalFeeAmt() {
		return totalFeeAmt;
	}

	public void setTotalFeeAmt(BigDecimal totalFeeAmt) {
		this.totalFeeAmt = totalFeeAmt;
	}

	public BigDecimal getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(BigDecimal totalInterest) {
		this.totalInterest = totalInterest;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

	public List<Item> getPayPlanList() {
		return payPlanList;
	}

	public void setPayPlanList(List<Item> payPlanList) {
		this.payPlanList = payPlanList;
	}
	
}
