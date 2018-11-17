package com.zdmoney.credit.framework.vo.xdcore.input;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

public class Lufax800013Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	/** 陆金所用户ID*/
	private String lufax_user_name;
	
	/** 取现序列号*/
	private String withdraw_req_no;
	
	/** 取现结果*/
	private String withdraw_result;
	
	/** 取现结果说明*/
	private String withdraw_msg;

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

    public String getWithdraw_result() {
        return withdraw_result;
    }

    public void setWithdraw_result(String withdraw_result) {
        this.withdraw_result = withdraw_result;
    }

    public String getWithdraw_msg() {
        return withdraw_msg;
    }

    public void setWithdraw_msg(String withdraw_msg) {
        this.withdraw_msg = withdraw_msg;
    }
	
	
}
