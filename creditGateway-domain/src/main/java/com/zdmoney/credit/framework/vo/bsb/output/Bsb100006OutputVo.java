package com.zdmoney.credit.framework.vo.bsb.output;

import java.math.BigDecimal;
import java.util.List;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseResponseVo;

/**
 * @ClassName:     Bsb100006OutputVo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:35:55
 */
public class Bsb100006OutputVo extends BsbBaseResponseVo{

	private static final long serialVersionUID = 1L;
	
	private String orderNo;
	private String loanDate;
	private Integer totalCnt;
	private List<Item> payPlanList;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
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

	public static class Item{
		private Integer period;
		private String scheduleDate;
		private BigDecimal schedulePrincipal;
		private BigDecimal scheduleInterest;
		private BigDecimal scheduleServiceFee;
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
		public BigDecimal getScheduleServiceFee() {
			return scheduleServiceFee;
		}
		public void setScheduleServiceFee(BigDecimal scheduleServiceFee) {
			this.scheduleServiceFee = scheduleServiceFee;
		}
	}
}
