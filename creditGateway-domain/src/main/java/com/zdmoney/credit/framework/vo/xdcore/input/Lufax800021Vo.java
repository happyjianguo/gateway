package com.zdmoney.credit.framework.vo.xdcore.input;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author YM10075
 * @desc   实时放款结果接口
 */
import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

public class Lufax800021Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;
	
	/** 业务类型 **/
	@NotEmpty(message = "业务类型不能为空！")
	private String product_type;
	
	/** 申请号 **/
	@NotEmpty(message = "申请号不能为空！")
    private String anshuo_loan_accept_id;
    
    /** 借款人申请id **/
	@NotEmpty(message = "借款人申请id不能为空！")
    private String lufax_loan_req_id;
    
    /** 放款时间 **/
	@NotEmpty(message = "放款时间不能为空！")
    private String withdraw_time;
    
    /** 放款结果 **/
	@NotEmpty(message = "放款结果不能为空！")
    private String state;
    
    /** 放款失败原因 **/
    private String granting_message;

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

    public String getWithdraw_time() {
        return withdraw_time;
    }

    public void setWithdraw_time(String withdraw_time) {
        this.withdraw_time = withdraw_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGranting_message() {
        return granting_message;
    }

    public void setGranting_message(String granting_message) {
        this.granting_message = granting_message;
    }
	
}
