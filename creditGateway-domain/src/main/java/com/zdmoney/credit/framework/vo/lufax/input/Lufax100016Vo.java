package com.zdmoney.credit.framework.vo.lufax.input;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.framework.vo.lufax.entity.LoanDetailLufax;

/**
 * @author 10098  2017年5月12日 上午9:29:48
 */
public class Lufax100016Vo extends LufaxBaseParamVo {


	private static final long serialVersionUID = -2026984518217878641L;
	@NotEmpty(message="lufax指令号不能为空！")
	private String lufax_batch_id;
	@NotEmpty(message="总笔数不能为空！")
	private String line_sum;
	@NotEmpty(message = "接口ID不能为空！")
    private String interface_id;	//接口ID
	@NotEmpty(message="签名不能为空！")
	private String sign;
	@Valid
    @NotEmpty(message="单笔明细不能为空！")
	private List<LoanDetailLufax> detail;
	
	public String getLufax_batch_id() {
		return lufax_batch_id;
	}

	public void setLufax_batch_id(String lufax_batch_id) {
		this.lufax_batch_id = lufax_batch_id;
	}

	public String getLine_sum() {
		return line_sum;
	}

	public void setLine_sum(String line_sum) {
		this.line_sum = line_sum;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public List<LoanDetailLufax> getDetail() {
		return detail;
	}

	public void setDetail(List<LoanDetailLufax> detail) {
		this.detail = detail;
	}

	public String getInterface_id() {
		return interface_id;
	}

	public void setInterface_id(String interface_id) {
		this.interface_id = interface_id;
	}
}
