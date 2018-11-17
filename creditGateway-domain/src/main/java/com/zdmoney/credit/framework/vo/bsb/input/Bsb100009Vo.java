package com.zdmoney.credit.framework.vo.bsb.input;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100009Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:18:32
 */
public class Bsb100009Vo extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;
	
	/** 证件号码*/
	@NotEmpty(message = "证件号码不能为空！")
	private String idNo;
	
	/** 证件类型*/
	@NotEmpty(message = "证件类型不能为空！")
	private String idType;
	
	/** 客户姓名*/
	@NotEmpty(message = "客户姓名不能为空！")
	private String custName;
	
	/** 手机号码*/
	@NotEmpty(message = "手机号码不能为空！")
	private String mobNo;
	
	/** 交易类型*/
	private String trantype;
	
	/** 扣款类型*/
	private String debitType;
	
	@Valid
	@NotEmpty(message="还款列表不能为空！")
	public List<Item> payList;
	
	/** 通知回调地址*/
	@NotEmpty(message = "通知回调地址不能为空！")
	private String callbackUrl;
	
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getTrantype() {
		return trantype;
	}

	public void setTrantype(String trantype) {
		this.trantype = trantype;
	}

	public String getDebitType() {
		return debitType;
	}

	public void setDebitType(String debitType) {
		this.debitType = debitType;
	}

	public List<Item> getPayList() {
		return payList;
	}

	public void setPayList(List<Item> payList) {
		this.payList = payList;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public static class Item {
		/** 借据号*/
		@NotEmpty(message = "借据号不能为空！")
		private String orderNo;
		
		/** 期次 当期和部分提前还款必填*/
		private String period;
		
		/** 应还总额  当期和部分提前还款必填*/
		private String scheduleTotal;
		
		public Item() {
			super();
		}

		/**
		 * @param orderNo
		 * @param period
		 * @param scheduleTotal
		 */
		public Item(String orderNo, String period, String scheduleTotal) {
			super();
			this.orderNo = orderNo;
			this.period = period;
			this.scheduleTotal = scheduleTotal;
		}

		public String getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}

		public String getPeriod() {
			return period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getScheduleTotal() {
			return scheduleTotal;
		}

		public void setScheduleTotal(String scheduleTotal) {
			this.scheduleTotal = scheduleTotal;
		}
		
	}

}
