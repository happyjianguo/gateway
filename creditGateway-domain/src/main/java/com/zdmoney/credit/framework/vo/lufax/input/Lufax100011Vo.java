package com.zdmoney.credit.framework.vo.lufax.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100011Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100011Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    @NotEmpty(message = "单笔交易明细不能为空！")
    private List<RepayDetailLufax> detail;//单笔交易明细
    private String  anshuo_batch_id;	//安硕批次号
    @NotNull(message = "总条数不能为空！")
	private BigDecimal line_sum;	//总条数
	@NotEmpty(message = "接口ID不能为空！")
    private String interface_id;	//接口ID
	@NotEmpty(message = "请求流水号不能为空！")
    private String interface_reqser;	//请求流水号
	@NotEmpty(message = "签名不能为空！")
    private String sign;	//签名
	public List<RepayDetailLufax> getDetail() {
		return detail;
	}
	public void setDetail(List<RepayDetailLufax> detail) {
		this.detail = detail;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
    
	public String getAnshuo_batch_id() {
		return anshuo_batch_id;
	}
	public void setAnshuo_batch_id(String anshuo_batch_id) {
		this.anshuo_batch_id = anshuo_batch_id;
	}
	public BigDecimal getLine_sum() {
		return line_sum;
	}
	public void setLine_sum(BigDecimal line_sum) {
		this.line_sum = line_sum;
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

	public static class RepayDetailLufax{
		@NotEmpty(message = "主键不能为空！")
    	private String id_seq_no;
		@NotEmpty(message = "借据号不能为空！")
    	private String loan_no;
		@NotEmpty(message = "借款申请ID不能为空！")
		private String lufax_loan_req_id;	//借款申请ID
		@NotEmpty(message = "借款人lufaxID不能为空！")
		private String lufax_borrower_username;	//借款人lufax ID
		private BigDecimal insureamount;	//担保费/保险费
		private BigDecimal oint;	//罚息
		private BigDecimal inte;	//利息
		private BigDecimal capital;	//本金
		private BigDecimal insuremanagement_fee;	//担保管理费
		private BigDecimal penal_value;	//提前还款违约金
		private BigDecimal subrogation_fee;	//追偿款
		private BigDecimal late_fee;//滞纳金
		private BigDecimal thaw_amount;	//解冻金额
		private BigDecimal refer_fee;	//咨询服务费
		private BigDecimal fee1;	//费用1
		private BigDecimal fee2;	//费用2
		@NotNull(message = "分配金额和不能为空！")
		private BigDecimal sumamount;	//分配金额和
		@NotEmpty(message = "安硕明细流水号不能为空！")
		private String objectno;	//安硕明细流水号
		@NotEmpty(message = "安硕发起批扣批次号不能为空！")
		private String anshuobatchid;	//安硕发起批扣批次号
		@NotNull(message = "安硕序号不能为空！")
		private String serialno;	//安硕序号
		@NotEmpty(message = "业务类型不能为空！")
		private String product_type;	//业务类型
		@NotEmpty(message = "还款明细不能为空！")
		private List<RepayDetailChildLufax> back_detail;	//还款明细
		private BigDecimal other_fee_amt1;	//提前还款P2P平台管理费
		private BigDecimal reserve_advance_amt;	//准备金代偿款
		private BigDecimal micro_loan_advance_amt;	//小贷代偿款
		@NotEmpty(message = "lufax还款请求号不能为空！")
		private String lufax_repay_req_no;	//lufax还款请求号
		private List<FeeDetail> fee_list;
		public String getId_seq_no() {
			return id_seq_no;
		}
		public void setId_seq_no(String id_seq_no) {
			this.id_seq_no = id_seq_no;
		}
		public String getLufax_loan_req_id() {
			return lufax_loan_req_id;
		}
		public void setLufax_loan_req_id(String lufax_loan_req_id) {
			this.lufax_loan_req_id = lufax_loan_req_id;
		}
		public String getLufax_borrower_username() {
			return lufax_borrower_username;
		}
		public void setLufax_borrower_username(String lufax_borrower_username) {
			this.lufax_borrower_username = lufax_borrower_username;
		}
		public BigDecimal getInsureamount() {
			return insureamount;
		}
		public void setInsureamount(BigDecimal insureamount) {
			this.insureamount = insureamount;
		}
		public BigDecimal getOint() {
			return oint;
		}
		public void setOint(BigDecimal oint) {
			this.oint = oint;
		}
		public BigDecimal getInte() {
			return inte;
		}
		public void setInte(BigDecimal inte) {
			this.inte = inte;
		}
		public BigDecimal getCapital() {
			return capital;
		}
		public void setCapital(BigDecimal capital) {
			this.capital = capital;
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
		public BigDecimal getThaw_amount() {
			return thaw_amount;
		}
		public void setThaw_amount(BigDecimal thaw_amount) {
			this.thaw_amount = thaw_amount;
		}
		public BigDecimal getRefer_fee() {
			return refer_fee;
		}
		public void setRefer_fee(BigDecimal refer_fee) {
			this.refer_fee = refer_fee;
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
		public BigDecimal getSumamount() {
			return sumamount;
		}
		public void setSumamount(BigDecimal sumamount) {
			this.sumamount = sumamount;
		}
		public String getObjectno() {
			return objectno;
		}
		public void setObjectno(String objectno) {
			this.objectno = objectno;
		}
		public String getAnshuobatchid() {
			return anshuobatchid;
		}
		public void setAnshuobatchid(String anshuobatchid) {
			this.anshuobatchid = anshuobatchid;
		}
		public String getSerialno() {
			return serialno;
		}
		public void setSerialno(String serialno) {
			this.serialno = serialno;
		}
		public String getProduct_type() {
			return product_type;
		}
		public void setProduct_type(String product_type) {
			this.product_type = product_type;
		}
		public List<RepayDetailChildLufax> getBack_detail() {
			return back_detail;
		}
		public void setBack_detail(List<RepayDetailChildLufax> back_detail) {
			this.back_detail = back_detail;
		}
		public BigDecimal getOther_fee_amt1() {
			return other_fee_amt1;
		}
		public void setOther_fee_amt1(BigDecimal other_fee_amt1) {
			this.other_fee_amt1 = other_fee_amt1;
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
		public List<FeeDetail> getFee_list() {
			return fee_list;
		}
		public void setFee_list(List<FeeDetail> fee_list) {
			this.fee_list = fee_list;
		}
		
	}
	
	public static class RepayDetailChildLufax{
		private String id_seq_no;
		@NotEmpty(message = "序列号")
		private String serial_no;	//序列号
		private String relation_key;	//与还款记录的关联主键
		private String actual_paydate;	//实际还款日
		@NotNull(message = "还款期次")
		private Integer rpterm;	//还款期次
		private BigDecimal capital;	//本金
		private BigDecimal aint;	//利息
		private BigDecimal oint;	//罚息
		private BigDecimal insureamount;	//担保费
		private BigDecimal fee1;	//费用1
		private BigDecimal fee2;	//费用2
		private BigDecimal subrogation_fee;	//代偿款
		private BigDecimal late_fee;	//延迟付款违约金(滞纳金)
		private BigDecimal	fee_amt2; //平台管理费
		private BigDecimal	fee_amt3; //信安咨询费
		private BigDecimal	fee_amt4;	//小贷管理费
		private BigDecimal	fee_amt5;	//风险准备金
		private BigDecimal	fee_amt6;	//逾期违约金
		private String money_allocation;	//代垫方
		private BigDecimal reserve_advance_amt;	//准备金代偿款
		private BigDecimal micro_loan_advance_amt;	//小贷代偿款
		public String getSerial_no() {
			return serial_no;
		}
		public void setSerial_no(String serial_no) {
			this.serial_no = serial_no;
		}
		public Integer getRpterm() {
			return rpterm;
		}
		public void setRpterm(Integer rpterm) {
			this.rpterm = rpterm;
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
		public String getMoney_allocation() {
			return money_allocation;
		}
		public void setMoney_allocation(String money_allocation) {
			this.money_allocation = money_allocation;
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
		public String getRelation_key() {
			return relation_key;
		}
		public void setRelation_key(String relation_key) {
			this.relation_key = relation_key;
		}
		public String getActual_paydate() {
			return actual_paydate;
		}
		public void setActual_paydate(String actual_paydate) {
			this.actual_paydate = actual_paydate;
		}
		public String getId_seq_no() {
			return id_seq_no;
		}
		public void setId_seq_no(String id_seq_no) {
			this.id_seq_no = id_seq_no;
		}
		
	}
	
	public static class FeeDetail{
		private String id_seq_no;
		private Integer rpterm;
		private String actual_paydate;
		private String relation_key;
		private String fee_code;
		private String actual_payamt;
		public String getId_seq_no() {
			return id_seq_no;
		}
		public void setId_seq_no(String id_seq_no) {
			this.id_seq_no = id_seq_no;
		}
		public Integer getRpterm() {
			return rpterm;
		}
		public void setRpterm(Integer rpterm) {
			this.rpterm = rpterm;
		}
		public String getActual_paydate() {
			return actual_paydate;
		}
		public void setActual_paydate(String actual_paydate) {
			this.actual_paydate = actual_paydate;
		}
		public String getRelation_key() {
			return relation_key;
		}
		public void setRelation_key(String relation_key) {
			this.relation_key = relation_key;
		}
		public String getFee_code() {
			return fee_code;
		}
		public void setFee_code(String fee_code) {
			this.fee_code = fee_code;
		}
		public String getActual_payamt() {
			return actual_payamt;
		}
		public void setActual_payamt(String actual_payamt) {
			this.actual_payamt = actual_payamt;
		}
		
		
	}
}
