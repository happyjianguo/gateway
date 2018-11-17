package com.zdmoney.credit.framework.vo.lufax.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 10098  2017年5月15日 下午8:49:24
 */
public class LoanDetailLufax{
	@NotEmpty(message="借据号不能为空！")
	private String loan_no;
	@NotEmpty(message="借据状态不能为空！")
	private String loan_status;
	@NotNull(message="逾期罚息不能为空！")
	private BigDecimal overdue_fine;
	@NotEmpty(message="是否报盘不能为空！")
	private String is_need_offer;
	/** 报盘状态 **/
	private String batch_status;
	@NotEmpty(message="逾期天数不能为空！")
	private String overdue_days;
	/**个还款日不能为空！**/
	private String next_repaydate;
	/**上个结息日不能为空！**/
	private String last_interest_expiry_date;
	@NotEmpty(message="借据会计日期不能为空！")
	private String curdeduct_date;
	/** 结清日期 **/
	private String finish_date;
	@NotNull(message="正常本金不能为空！")
	private BigDecimal normal_principal;
	@NotNull(message="逾期本金不能为空！")
	private BigDecimal overdue_principal;
	/**批扣发起日期不能为空！**/
	private String batch_begin_date;
	@NotNull(message="当前执行期次不能为空！")
	private int current_term;
	public String getLoan_no() {
		return loan_no;
	}
	public void setLoan_no(String loan_no) {
		this.loan_no = loan_no;
	}
	public String getLoan_status() {
		return loan_status;
	}
	public void setLoan_status(String loan_status) {
		this.loan_status = loan_status;
	}
	public BigDecimal getOverdue_fine() {
		return overdue_fine;
	}
	public void setOverdue_fine(BigDecimal overdue_fine) {
		this.overdue_fine = overdue_fine;
	}
	public String getIs_need_offer() {
		return is_need_offer;
	}
	public void setIs_need_offer(String is_need_offer) {
		this.is_need_offer = is_need_offer;
	}
	public String getBatch_status() {
		return batch_status;
	}
	public void setBatch_status(String batch_status) {
		this.batch_status = batch_status;
	}
	public String getOverdue_days() {
		return overdue_days;
	}
	public void setOverdue_days(String overdue_days) {
		this.overdue_days = overdue_days;
	}
	public String getNext_repaydate() {
		return next_repaydate;
	}
	public void setNext_repaydate(String next_repaydate) {
		this.next_repaydate = next_repaydate;
	}
	public String getLast_interest_expiry_date() {
		return last_interest_expiry_date;
	}
	public void setLast_interest_expiry_date(String last_interest_expiry_date) {
		this.last_interest_expiry_date = last_interest_expiry_date;
	}
	public String getCurdeduct_date() {
		return curdeduct_date;
	}
	public void setCurdeduct_date(String curdeduct_date) {
		this.curdeduct_date = curdeduct_date;
	}
	public String getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(String finish_date) {
		this.finish_date = finish_date;
	}
	public BigDecimal getNormal_principal() {
		return normal_principal;
	}
	public void setNormal_principal(BigDecimal normal_principal) {
		this.normal_principal = normal_principal;
	}
	public BigDecimal getOverdue_principal() {
		return overdue_principal;
	}
	public void setOverdue_principal(BigDecimal overdue_principal) {
		this.overdue_principal = overdue_principal;
	}
	public String getBatch_begin_date() {
		return batch_begin_date;
	}
	public void setBatch_begin_date(String batch_begin_date) {
		this.batch_begin_date = batch_begin_date;
	}
	public int getCurrent_term() {
		return current_term;
	}
	public void setCurrent_term(int current_term) {
		this.current_term = current_term;
	}
	
}
