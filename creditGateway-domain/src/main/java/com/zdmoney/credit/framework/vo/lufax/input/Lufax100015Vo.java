package com.zdmoney.credit.framework.vo.lufax.input;

import java.math.BigDecimal;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100015Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100015Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    private String lufax_user_name;//陆金所用户ID
    private String withdraw_req_no;//取现序列号
    private BigDecimal withdraw_amount;//取现序列号
    
	public String getLufax_user_name() {
		return lufax_user_name;
	}
	public void setLufax_user_name(String lufax_user_name) {
		this.lufax_user_name = lufax_user_name;
	}
	public String getWithdraw_req_no() {
		return withdraw_req_no;
	}
	public void setWithdraw_req_no(String withdraw_req_no) {
		this.withdraw_req_no = withdraw_req_no;
	}
	public BigDecimal getWithdraw_amount() {
		return withdraw_amount;
	}
	public void setWithdraw_amount(BigDecimal withdraw_amount) {
		this.withdraw_amount = withdraw_amount;
	}  
}
