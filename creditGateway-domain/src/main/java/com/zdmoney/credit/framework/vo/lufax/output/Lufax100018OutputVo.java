package com.zdmoney.credit.framework.vo.lufax.output;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * 
 * @author YM10112
 *
 */
public class Lufax100018OutputVo extends LufaxBaseParamVo {
	private static final long serialVersionUID = 1L;

	private String lufax_borrower_username; // 借款人P2P网站ID
	private String lufax_loan_req_id; // 借款申请ID
	private String anshuo_loan_accept_id; // 安硕贷款受理号
	private List<LoanPlan> loan_plan;// 还款计划
	private String value_date; // 起息日 yyyyMMddHH24miss:yyyyMMdd+000000
	private String due_date; // 到期日 yyyyMMddHH24miss:yyyyMMdd+235959

	
	public String getLufax_borrower_username() {
		return lufax_borrower_username;
	}


	public void setLufax_borrower_username(String lufax_borrower_username) {
		this.lufax_borrower_username = lufax_borrower_username;
	}


	public String getLufax_loan_req_id() {
		return lufax_loan_req_id;
	}


	public void setLufax_loan_req_id(String lufax_loan_req_id) {
		this.lufax_loan_req_id = lufax_loan_req_id;
	}


	public String getAnshuo_loan_accept_id() {
		return anshuo_loan_accept_id;
	}


	public void setAnshuo_loan_accept_id(String anshuo_loan_accept_id) {
		this.anshuo_loan_accept_id = anshuo_loan_accept_id;
	}


	public List<LoanPlan> getLoan_plan() {
		return loan_plan;
	}


	public void setLoan_plan(List<LoanPlan> loan_plan) {
		this.loan_plan = loan_plan;
	}


	public String getValue_date() {
		return value_date;
	}


	public void setValue_date(String value_date) {
		this.value_date = value_date;
	}


	public String getDue_date() {
		return due_date;
	}


	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}


	public static class LoanPlan {
		private String payment_accno;// 还款帐号
		private Integer rpterm;// 还款期数
		private String pflg;// 状态
		private String wrpdte;// 还款日  yyyyMMddHHmmss
		private String rrpdte;// 结清日期   yyyyMMddHHmmss
		private BigDecimal rate;// 当期利率  年利率，支持6位小数
		private BigDecimal orate;// 罚息利率
		private BigDecimal total_amount;// 还款总额
		private BigDecimal capital;// 本金
		private BigDecimal aint;// 利息
		private BigDecimal oint;// 罚息
		private BigDecimal insureamount;// 担保费
		private BigDecimal fee1;// 费用1
		private BigDecimal fee2;// 费用2
		private BigDecimal fee_amt2; // 平台管理费
		private BigDecimal fee_amt3; // 信安咨询费
		private BigDecimal fee_amt4; // 小贷管理费
		private BigDecimal fee_amt5; // 风险准备金
		private BigDecimal fee_amt6; // 逾期违约金
		public String getPayment_accno() {
			return payment_accno;
		}
		public void setPayment_accno(String payment_accno) {
			this.payment_accno = payment_accno;
		}
		public Integer getRpterm() {
			return rpterm;
		}
		public void setRpterm(Integer rpterm) {
			this.rpterm = rpterm;
		}
		public String getPflg() {
			return pflg;
		}
		public void setPflg(String pflg) {
			this.pflg = pflg;
		}
		public String getWrpdte() {
			return wrpdte;
		}
		public void setWrpdte(String wrpdte) {
			this.wrpdte = wrpdte;
		}
		public String getRrpdte() {
			return rrpdte;
		}
		public void setRrpdte(String rrpdte) {
			this.rrpdte = rrpdte;
		}
		public BigDecimal getRate() {
			return rate;
		}
		public void setRate(BigDecimal rate) {
			this.rate = rate;
		}
		public BigDecimal getOrate() {
			return orate;
		}
		public void setOrate(BigDecimal orate) {
			this.orate = orate;
		}
		public BigDecimal getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(BigDecimal total_amount) {
			this.total_amount = total_amount;
		}
		public BigDecimal getCapital() {
			return capital;
		}
		public void setCapital(BigDecimal capital) {
			this.capital = capital;
		}
		public BigDecimal getAint() {
			return aint;
		}
		public void setAint(BigDecimal aint) {
			this.aint = aint;
		}
		public BigDecimal getOint() {
			return oint;
		}
		public void setOint(BigDecimal oint) {
			this.oint = oint;
		}
		public BigDecimal getInsureamount() {
			return insureamount;
		}
		public void setInsureamount(BigDecimal insureamount) {
			this.insureamount = insureamount;
		}
		public BigDecimal getFee1() {
			return fee1;
		}
		public void setFee1(BigDecimal fee1) {
			this.fee1 = fee1;
		}
		public BigDecimal getFee2() {
			return fee2;
		}
		public void setFee2(BigDecimal fee2) {
			this.fee2 = fee2;
		}
		public BigDecimal getFee_amt2() {
			return fee_amt2;
		}
		public void setFee_amt2(BigDecimal fee_amt2) {
			this.fee_amt2 = fee_amt2;
		}
		public BigDecimal getFee_amt3() {
			return fee_amt3;
		}
		public void setFee_amt3(BigDecimal fee_amt3) {
			this.fee_amt3 = fee_amt3;
		}
		public BigDecimal getFee_amt4() {
			return fee_amt4;
		}
		public void setFee_amt4(BigDecimal fee_amt4) {
			this.fee_amt4 = fee_amt4;
		}
		public BigDecimal getFee_amt5() {
			return fee_amt5;
		}
		public void setFee_amt5(BigDecimal fee_amt5) {
			this.fee_amt5 = fee_amt5;
		}
		public BigDecimal getFee_amt6() {
			return fee_amt6;
		}
		public void setFee_amt6(BigDecimal fee_amt6) {
			this.fee_amt6 = fee_amt6;
		}
		
		
	}
}
