package com.zdmoney.credit.framework.vo.xdcore.input;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

public class Lufax800011Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	/** 安硕批次号*/
	private String anshuo_batch_id;
	
	/** 对公帐户陆金所虚拟户名称*/
	private String company_usename;
	
	/** 实际充值金额*/
	private String actual_amount;
	
	/** 网站反馈时间*/
	private String callback_at;
	
	/** 充值成功或失败*/
	private String recharge_status;
	
	/** 错误代码*/
	private String error_code;
	
	/** 错误详细信息*/
	private String error_message;
	
	/** 业务类型*/
	private String product_type;

    public String getAnshuo_batch_id() {
        return anshuo_batch_id;
    }

    public void setAnshuo_batch_id(String anshuo_batch_id) {
        this.anshuo_batch_id = anshuo_batch_id;
    }

    public String getCompany_usename() {
        return company_usename;
    }

    public void setCompany_usename(String company_usename) {
        this.company_usename = company_usename;
    }

    public String getActual_amount() {
        return actual_amount;
    }

    public void setActual_amount(String actual_amount) {
        this.actual_amount = actual_amount;
    }

    public String getCallback_at() {
        return callback_at;
    }

    public void setCallback_at(String callback_at) {
        this.callback_at = callback_at;
    }

    public String getRecharge_status() {
        return recharge_status;
    }

    public void setRecharge_status(String recharge_status) {
        this.recharge_status = recharge_status;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

	
}
