package com.zdmoney.credit.framework.vo.lufax.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.common.annotate.BigDecimalAnnotate;
import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100012Vo.java
 * @Description:   证大同步还款记录给陆金所
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100012Vo extends LufaxBaseParamVo {
	private static final long serialVersionUID = 1L;
	@NotEmpty(message = "单笔交易明细不能为空！")
	private List<RepayRecordLufax> detail;//单笔交易明细
	@NotNull(message = "总条数不能为空！")
	private Integer line_sum;	//总条数
	private String  anshuo_batch_id;	//安硕批次号
	@NotEmpty(message = "接口ID不能为空！")
    private String interface_id;	//接口ID
    @NotEmpty(message = "请求流水号不能为空！")
    private String interface_reqser;	//请求流水号
    @NotEmpty(message = "签名不能为空！")
    private String sign;	//签名
	
	public List<RepayRecordLufax> getDetail() {
		return detail;
	}

	public void setDetail(List<RepayRecordLufax> detail) {
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

	public static class RepayRecordLufax{
		@NotEmpty(message = "还款记录的主键不能为空！")
    	private String id_seq_no;
		@NotEmpty(message = "借据号不能为空！")
    	private String loan_no;
		@NotEmpty(message = "交易码不能为空！")
    	private String trans_code;//正常还款：NOM_REPAY    提前还款：ADVANCE   代偿还款：CLM_REPAY  追偿还款：RECOVERY  逾期还款：DELAY
		@NotEmpty(message = "业务类型不能为空！")
		private String product_type;	//业务类型
		@NotEmpty(message = "安硕贷款受理号不能为空！")
		private String	anshuo_loan_accept_id;	//安硕贷款受理号
		@NotEmpty(message = "借款申请ID不能为空！")
		private String	lufax_loan_req_id;	//借款申请ID
		@NotEmpty(message = "还款期数不能为空！")
		private Integer	rpterm;	//还款期数
		@NotEmpty(message = "应还款日不能为空！")
		private String	wrpdte;	//应还款日
		@BigDecimalAnnotate(isSubstring = false)
		private BigDecimal	rate;	//贷款利率
		@BigDecimalAnnotate(isSubstring = false)
		private BigDecimal	orate;	//逾期利率
		@NotNull(message = "本金不能为空！")
		private BigDecimal	capital;	//本金
		private BigDecimal	aint;	//利息
		@NotNull(message = "罚息不能为空！")
		private BigDecimal	oint;	//罚息
		private BigDecimal	fee1;	//费用1
		private BigDecimal	fee2;	//费用2
		@NotNull(message = "每期保费不能为空！")
		private BigDecimal	insureamount;	//每期保费
		@NotEmpty(message = "实际还款日不能为空！")
		private String	rrpdte;	//实际还款日
		@NotNull(message = "担保管理费不能为空！")
		private BigDecimal	insuremanagement_fee;	//担保管理费
		private BigDecimal	penal_value;	//提前还款违约金
		private BigDecimal	subrogation_fee;	//追偿款
		private BigDecimal	late_fee;	//滞纳金
		@NotNull(message = "还款总额不能为空！")
		private BigDecimal	total_amount;	//还款总额
		@NotEmpty(message = "还款类型不能为空！")
		private String	repayment_type;	//还款类型  "1":代扣还款		"2":手动还款		"3":代偿还款		"4":追偿还款		"5":准备金代垫  P2P无抵押去担保产品使用
		@NotEmpty(message = "序列号不能为空！")
		private String	serial_no;	//序列号
		private BigDecimal	other_fee_amt1;	//提前还款平台管理费
		private BigDecimal	fee_amt2; //平台管理费
		private BigDecimal	fee_amt3; //信安咨询费
		private BigDecimal	fee_amt4;	//小贷管理费
		private BigDecimal	fee_amt5;	//风险准备金
		private BigDecimal	fee_amt6;	//逾期违约金
		private String	repayment_party;	//还款来源
		private BigDecimal	reserve_advance_amt;	//准备金代偿款
		private BigDecimal	micro_loan_advance_amt;	//小贷代偿款
		@NotEmpty(message = "lufax还款请求号不能为空！")
		private String	lufax_repay_req_no;	//lufax还款请求号
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
		public Integer getRpterm() {
			return rpterm;
		}
		public void setRpterm(Integer rpterm) {
			this.rpterm = rpterm;
		}
		public String getWrpdte() {
			return wrpdte;
		}
		public void setWrpdte(String wrpdte) {
			this.wrpdte = wrpdte;
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
		public BigDecimal getInsureamount() {
			return insureamount;
		}
		public void setInsureamount(BigDecimal insureamount) {
			this.insureamount = insureamount;
		}
		public String getRrpdte() {
			return rrpdte;
		}
		public void setRrpdte(String rrpdte) {
			this.rrpdte = rrpdte;
		}
		
		public BigDecimal getInsuremanagement_fee() {
			return insuremanagement_fee;
		}
		public void setInsuremanagement_fee(BigDecimal insuremanagement_fee) {
			this.insuremanagement_fee = insuremanagement_fee;
		}
		public BigDecimal getPenal_value() {
			return penal_value;
		}
		public void setPenal_value(BigDecimal penal_value) {
			this.penal_value = penal_value;
		}
		public BigDecimal getSubrogation_fee() {
			return subrogation_fee;
		}
		public void setSubrogation_fee(BigDecimal subrogation_fee) {
			this.subrogation_fee = subrogation_fee;
		}
		public BigDecimal getLate_fee() {
			return late_fee;
		}
		public void setLate_fee(BigDecimal late_fee) {
			this.late_fee = late_fee;
		}
		public BigDecimal getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(BigDecimal total_amount) {
			this.total_amount = total_amount;
		}
		public String getRepayment_type() {
			return repayment_type;
		}
		public void setRepayment_type(String repayment_type) {
			this.repayment_type = repayment_type;
		}
		public String getSerial_no() {
			return serial_no;
		}
		public void setSerial_no(String serial_no) {
			this.serial_no = serial_no;
		}
		public BigDecimal getOther_fee_amt1() {
			return other_fee_amt1;
		}
		public void setOther_fee_amt1(BigDecimal other_fee_amt1) {
			this.other_fee_amt1 = other_fee_amt1;
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
		public String getRepayment_party() {
			return repayment_party;
		}
		public void setRepayment_party(String repayment_party) {
			this.repayment_party = repayment_party;
		}
		public BigDecimal getReserve_advance_amt() {
			return reserve_advance_amt;
		}
		public void setReserve_advance_amt(BigDecimal reserve_advance_amt) {
			this.reserve_advance_amt = reserve_advance_amt;
		}
		public BigDecimal getMicro_loan_advance_amt() {
			return micro_loan_advance_amt;
		}
		public void setMicro_loan_advance_amt(BigDecimal micro_loan_advance_amt) {
			this.micro_loan_advance_amt = micro_loan_advance_amt;
		}
		public String getLufax_repay_req_no() {
			return lufax_repay_req_no;
		}
		public void setLufax_repay_req_no(String lufax_repay_req_no) {
			this.lufax_repay_req_no = lufax_repay_req_no;
		}
		public String getLoan_no() {
			return loan_no;
		}
		public void setLoan_no(String loan_no) {
			this.loan_no = loan_no;
		}
		public String getTrans_code() {
			return trans_code;
		}
		public void setTrans_code(String trans_code) {
			this.trans_code = trans_code;
		}
		
	}
    
}
