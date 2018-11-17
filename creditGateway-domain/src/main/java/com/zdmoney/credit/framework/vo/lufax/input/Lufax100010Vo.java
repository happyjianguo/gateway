package com.zdmoney.credit.framework.vo.lufax.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.common.annotate.BigDecimalAnnotate;
import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName: Lufax100010Vo.java
 * @Description: 证大同步还款计划给陆金所
 * @author 柳云华
 * @version V1.0
 * @Since JDK 1.7
 * @Date 2017年4月19日 下午2:07:36
 */
public class Lufax100010Vo extends LufaxBaseParamVo {

	private static final long serialVersionUID = 1L;
	@NotEmpty(message = "单笔交易明细不能为空！")
	private List<RepayPlanLufax> detail;//单笔交易明细
	@NotNull(message = "总条数不能为空！")
	private Integer line_sum;	//总条数
    private String  anshuo_batch_id;	//安硕批次号
	@NotEmpty(message = "接口ID不能为空！")
    private String interface_id;	//接口ID
	@NotEmpty(message = "请求流水号不能为空！")
    private String interface_reqser;	//请求流水号
	@NotEmpty(message = "签名不能为空！")
    private String sign;	//签名
    
    public List<RepayPlanLufax> getDetail() {
		return detail;
	}
	public void setDetail(List<RepayPlanLufax> detail) {
		this.detail = detail;
	}

    public Integer getLine_sum() {
		return line_sum;
	}
	public void setLine_sum(Integer line_sum) {
		this.line_sum = line_sum;
	}
	public String getAnshuo_batch_id() {
		return anshuo_batch_id;
	}
	public void setAnshuo_batch_id(String anshuo_batch_id) {
		this.anshuo_batch_id = anshuo_batch_id;
	}
	public String getInterface_id() {
		return interface_id;
	}
	public void setInterface_id(String interface_id) {
		this.interface_id = interface_id;
	}
	public String getInterface_reqser() {
		return interface_reqser;
	}
	public void setInterface_reqser(String interface_reqser) {
		this.interface_reqser = interface_reqser;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}

	public static class RepayPlanLufax{
    	@NotEmpty(message = "还款计划记录的主键不能为空！")
    	private String id_seq_no;
    	@NotEmpty(message = "借据号不能为空！")
    	private String loan_no;
		@NotEmpty(message = "业务类型不能为空！")
    	private String product_type;//业务类型 3000100010：产险 	3000200010：长安	1000500010 ：证大
		@NotEmpty(message = "安硕贷款受理号不能为空！")
		private String anshuo_loan_accept_id;//安硕贷款受理号
		@NotEmpty(message = "借款申请不能为空！")
		private String lufax_loan_req_id;//借款申请ID
		@NotEmpty(message = "还款帐号不能为空！")
		private String payment_accno;//还款帐号
		@NotEmpty(message = "还款标志不能为空！")
		private String pflg;//还款标志 010-已付清	020-逾期	025-罚息保费逾期	030-代扣中	040-未付	050-提前结清	060-代偿中	070-代偿结清
		@NotEmpty(message = "还款期数不能为空！")
		private String rpterm;//还款期数
		@NotEmpty(message = "应还款日不能为空！")
    	private String wrpdte;//应还款日 yyyyMMddHH24miss(yyyyMMdd+235959)
		
		@NotEmpty(message = "起息日不能为空！")
    	private String value_date;//起息日 yyyyMMdd
		@NotEmpty(message = "结息日不能为空！")
    	private String expiry_date;//结息日 yyyyMMdd
		@NotNull(message = "应还本金不能为空！")
		private BigDecimal payprincipalamt;//应还本金
		@NotNull(message = "实还本金不能为空！")
		private BigDecimal capital;//实还本金
		@NotNull(message = "应还利息不能为空！")
		private BigDecimal payinteamt;//应还利息
		@NotNull(message = "实还利息不能为空！")
		private BigDecimal aint;//实还利息
		@NotNull(message = "应还罚息不能为空！")
		private BigDecimal payfineamt;//应还罚息
    	private BigDecimal oint;//实还罚息
    	private BigDecimal paycompound;	//应还复利
    	private BigDecimal actual_paycompound;	//实还复利
    	@NotNull(message = "罚息积数不能为空！")
    	private BigDecimal fine_base;	//罚息积数
    	@NotNull(message = "复利积数不能为空！")
    	private BigDecimal compound_base;	//复利积数
    	@NotEmpty(message = "罚息计算日期不能为空！")
    	private String fine_calculate_date;	//罚息计算日期yyyyMMdd
    	@NotEmpty(message = "复利计算日期不能为空！")
    	private String compound_calculate_date;	//复利计算日期yyyyMMdd
    	@NotNull(message = "本金余额不能为空！")
    	private BigDecimal principal_balance;	//本金余额
    	@NotNull(message = "期供金额不能为空！")
    	private BigDecimal term_amt;	//期供金额
    	@NotEmpty(message = "结清日期不能为空！")
    	private String finish_date;	//结清日期yyyyMMdd
    	
    	@NotNull(message = "每期保费不能为空！")
    	private BigDecimal insureamount;//每期保费
    	private BigDecimal fee1;//费用1
    	private BigDecimal fee2;//费用2
    	private String rrpdte;//实际还款日  yyyyMMddHH24miss(yyyyMMdd+235959)
    	@NotNull(message = "还款总额不能为空！")
    	private BigDecimal total_amount;//还款总额
    	private BigDecimal	fee_amt2; //平台管理费
		private BigDecimal	fee_amt3; //信安咨询费
		private BigDecimal	fee_amt4;	//小贷管理费
		private BigDecimal	fee_amt5;	//风险准备金
		private BigDecimal	fee_amt6;	//逾期违约金
		@BigDecimalAnnotate(isSubstring = false)
    	private BigDecimal rate;//贷款利率
		@BigDecimalAnnotate(isSubstring = false)
    	private BigDecimal orate;//逾期利率
    	@NotEmpty(message = "同步还款计划时间不能为空！")
    	private String bus_operation_time;//同步还款计划时间戳 还款计划变更时间	格式：yyyyMMddHHmmssSSS	是24小时制式的.	例1: 20160203093939768	例2: 20160201152533678 
    	@NotEmpty(message = "lufax还款请求号不能为空！")
    	private String lufax_repay_req_no;//lufax还款请求号 款请求的唯一性标志	还款计划的变更如果是由还款引起，需要传递还款事件的流水号(即lufax_repay_req_no)；如果是由于利率调整或者变更状态为逾期等非还款行为引起的变更，则该字段为空
    	@NotEmpty(message = "费用列表不能为空！")
    	private List<Fee> fee_list;//费用列表
    	public String getId_seq_no() {
			return id_seq_no;
		}
		public void setId_seq_no(String id_seq_no) {
			this.id_seq_no = id_seq_no;
		}
		public String getProduct_type() {
			return product_type;
		}
		public void setProduct_type(String product_type) {
			this.product_type = product_type;
		}
		public String getAnshuo_loan_accept_id() {
			return anshuo_loan_accept_id;
		}
		public void setAnshuo_loan_accept_id(String anshuo_loan_accept_id) {
			this.anshuo_loan_accept_id = anshuo_loan_accept_id;
		}
		public String getLufax_loan_req_id() {
			return lufax_loan_req_id;
		}
		public void setLufax_loan_req_id(String lufax_loan_req_id) {
			this.lufax_loan_req_id = lufax_loan_req_id;
		}
		public String getPayment_accno() {
			return payment_accno;
		}
		public void setPayment_accno(String payment_accno) {
			this.payment_accno = payment_accno;
		}
		public String getPflg() {
			return pflg;
		}
		public void setPflg(String pflg) {
			this.pflg = pflg;
		}
		public String getRpterm() {
			return rpterm;
		}
		public void setRpterm(String rpterm) {
			this.rpterm = rpterm;
		}
		public String getWrpdte() {
			return wrpdte;
		}
		public void setWrpdte(String wrpdte) {
			this.wrpdte = wrpdte;
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
		public String getRrpdte() {
			return rrpdte;
		}
		public void setRrpdte(String rrpdte) {
			this.rrpdte = rrpdte;
		}
		
		public BigDecimal getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(BigDecimal total_amount) {
			this.total_amount = total_amount;
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
		public String getBus_operation_time() {
			return bus_operation_time;
		}
		public void setBus_operation_time(String bus_operation_time) {
			this.bus_operation_time = bus_operation_time;
		}
		public String getLufax_repay_req_no() {
			return lufax_repay_req_no;
		}
		public void setLufax_repay_req_no(String lufax_repay_req_no) {
			this.lufax_repay_req_no = lufax_repay_req_no;
		}
		public List<Fee> getFee_list() {
			return fee_list;
		}
		public void setFee_list(List<Fee> fee_list) {
			this.fee_list = fee_list;
		}
		public String getLoan_no() {
			return loan_no;
		}
		public void setLoan_no(String loan_no) {
			this.loan_no = loan_no;
		}
		public String getValue_date() {
			return value_date;
		}
		public void setValue_date(String value_date) {
			this.value_date = value_date;
		}
		public String getExpiry_date() {
			return expiry_date;
		}
		public void setExpiry_date(String expiry_date) {
			this.expiry_date = expiry_date;
		}
		public BigDecimal getPayprincipalamt() {
			return payprincipalamt;
		}
		public void setPayprincipalamt(BigDecimal payprincipalamt) {
			this.payprincipalamt = payprincipalamt;
		}
		public BigDecimal getPayinteamt() {
			return payinteamt;
		}
		public void setPayinteamt(BigDecimal payinteamt) {
			this.payinteamt = payinteamt;
		}
		public BigDecimal getPayfineamt() {
			return payfineamt;
		}
		public void setPayfineamt(BigDecimal payfineamt) {
			this.payfineamt = payfineamt;
		}
		public BigDecimal getPaycompound() {
			return paycompound;
		}
		public void setPaycompound(BigDecimal paycompound) {
			this.paycompound = paycompound;
		}
		public BigDecimal getActual_paycompound() {
			return actual_paycompound;
		}
		public void setActual_paycompound(BigDecimal actual_paycompound) {
			this.actual_paycompound = actual_paycompound;
		}
		public BigDecimal getFine_base() {
			return fine_base;
		}
		public void setFine_base(BigDecimal fine_base) {
			this.fine_base = fine_base;
		}
		public BigDecimal getCompound_base() {
			return compound_base;
		}
		public void setCompound_base(BigDecimal compound_base) {
			this.compound_base = compound_base;
		}
		public String getFine_calculate_date() {
			return fine_calculate_date;
		}
		public void setFine_calculate_date(String fine_calculate_date) {
			this.fine_calculate_date = fine_calculate_date;
		}
		public String getCompound_calculate_date() {
			return compound_calculate_date;
		}
		public void setCompound_calculate_date(String compound_calculate_date) {
			this.compound_calculate_date = compound_calculate_date;
		}
		public BigDecimal getPrincipal_balance() {
			return principal_balance;
		}
		public void setPrincipal_balance(BigDecimal principal_balance) {
			this.principal_balance = principal_balance;
		}
		public BigDecimal getTerm_amt() {
			return term_amt;
		}
		public void setTerm_amt(BigDecimal term_amt) {
			this.term_amt = term_amt;
		}
		public String getFinish_date() {
			return finish_date;
		}
		public void setFinish_date(String finish_date) {
			this.finish_date = finish_date;
		}
		
    }
	public static class Fee{
		//@NotEmpty(message = "费用计划记录不能为空！")
		private String id_seq_no;	//费用计划记录的主键
		//@NotEmpty(message = "费用编码不能为空！")
		private String fee_code;	//费用编码
		//@NotEmpty(message = "应还费用不能为空！")
		private String payfeeamt;	//应还费用
		//@NotEmpty(message = "实还费用不能为空！")
		private String actual_payfeeamt;	//实还费用
		public String getId_seq_no() {
			return id_seq_no;
		}
		public void setId_seq_no(String id_seq_no) {
			this.id_seq_no = id_seq_no;
		}
		public String getFee_code() {
			return fee_code;
		}
		public void setFee_code(String fee_code) {
			this.fee_code = fee_code;
		}
		public String getPayfeeamt() {
			return payfeeamt;
		}
		public void setPayfeeamt(String payfeeamt) {
			this.payfeeamt = payfeeamt;
		}
		public String getActual_payfeeamt() {
			return actual_payfeeamt;
		}
		public void setActual_payfeeamt(String actual_payfeeamt) {
			this.actual_payfeeamt = actual_payfeeamt;
		}
	}
	
}
