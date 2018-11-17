package com.zdmoney.credit.framework.vo.lufax.input;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * 
 * @author YM10112
 *
 */
public class Lufax100019Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 5881206303062719208L;
    @NotEmpty(message = "明细数据不能为空！")
    private List<CompensateRepayRecord> detail;
    @NotNull(message = "总条数不能为空！")
    private Integer line_sum;
    private String anshuo_batch_id;
    public String getAnshuo_batch_id() {
        return anshuo_batch_id;
    }
    public void setAnshuo_batch_id(String anshuo_batch_id) {
        this.anshuo_batch_id = anshuo_batch_id;
    }
    
    public Integer getLine_sum() {
		return line_sum;
	}
	public void setLine_sum(Integer line_sum) {
		this.line_sum = line_sum;
	}
	public List<CompensateRepayRecord> getDetail() {
		return detail;
	}
	public void setDetail(List<CompensateRepayRecord> detail) {
		this.detail = detail;
	}
	public static class CompensateRepayRecord{
        @NotEmpty(message = "业务类型不能为空！")
        private String product_type;
        @NotEmpty(message = "安硕贷款受理号不能为空！")
        private String anshuo_loan_accept_id;
        @NotEmpty(message = "借款申请ID不能为空！")
        private String lufax_loan_req_id;
        @NotEmpty(message = "追偿日期不能为空！")
        private String compensated_date;//yyyyMMdd
        @NotNull(message = "追偿款总额不能为空！")
        private BigDecimal compensated_sum;//实还代偿款+实还担保费+实还滞纳金+其他费用
        @NotNull(message = "实还代偿款不能为空！")
        private BigDecimal compensated_amount;
        private BigDecimal capital;
        private BigDecimal aint;
        private BigDecimal oint;
        @NotNull(message = "实还担保费不能为空！")
        private BigDecimal insurance_fee;
        @NotNull(message = "实还滞纳金不能为空！")
        private BigDecimal late_fee;
        private BigDecimal fee_amt2;
        private BigDecimal fee_amt3;
        private BigDecimal fee_amt4;
        private BigDecimal fee_amt5;
        private BigDecimal fee_amt6;
        private BigDecimal penal_value;
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
		public String getCompensated_date() {
			return compensated_date;
		}
		public void setCompensated_date(String compensated_date) {
			this.compensated_date = compensated_date;
		}
		public BigDecimal getCompensated_sum() {
			return compensated_sum;
		}
		public void setCompensated_sum(BigDecimal compensated_sum) {
			this.compensated_sum = compensated_sum;
		}
		public BigDecimal getCompensated_amount() {
			return compensated_amount;
		}
		public void setCompensated_amount(BigDecimal compensated_amount) {
			this.compensated_amount = compensated_amount;
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
		public BigDecimal getInsurance_fee() {
			return insurance_fee;
		}
		public void setInsurance_fee(BigDecimal insurance_fee) {
			this.insurance_fee = insurance_fee;
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
		public BigDecimal getPenal_value() {
			return penal_value;
		}
		public void setPenal_value(BigDecimal penal_value) {
			this.penal_value = penal_value;
		}
        
    }
}
