package com.zdmoney.credit.framework.vo.xdcore.input;

import org.hibernate.validator.constraints.NotEmpty;
import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

/**
 * 
 * @author YM10112
 *
 */
public class Lufax820050Vo extends XdcoreBaseParamVo {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "申请号不能为空！")
	private String apply_no;
	@NotEmpty(message = "投资时间不能为空！")
	private String invest_time;

	public String getApply_no() {
		return apply_no;
	}

	public void setApply_no(String apply_no) {
		this.apply_no = apply_no;
	}

	public String getInvest_time() {
		return invest_time;
	}

	public void setInvest_time(String invest_time) {
		this.invest_time = invest_time;
	}

}
