package com.zdmoney.credit.framework.vo.lufax.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100004Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100004Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    /** 业务类型*/
    @NotEmpty(message = "业务类型不能为空！")
    private String product_type;
    
    /** lufax网站用户名*/
    @NotEmpty(message = "产品小类编号不能为空！")
    private String lufax_borrower_username;
    
    /** 证件类型*/
    @NotEmpty(message = "证件类型不能为空！")
    private String identitycard_type;
    
    /** 证件号码*/
    @NotEmpty(message = "证件号码不能为空！")
    private String identitycard_no;
    
    /** 手机号码*/
    @NotEmpty(message = "手机号码不能为空！")
    private String mobile_no;
    
    /** 贷款申请号*/
    @NotEmpty(message = "贷款申请号不能为空！")
    private String anshuo_loan_accept_id;
    
    /** 银行编码*/
    @NotEmpty(message = "银行编码不能为空！")
    private String loanee_bank_code;
    
    /** 银行卡号*/
    @NotEmpty(message = "银行卡号不能为空！")
    private String loanee_bank_account;

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getLufax_borrower_username() {
        return lufax_borrower_username;
    }

    public void setLufax_borrower_username(String lufax_borrower_username) {
        this.lufax_borrower_username = lufax_borrower_username;
    }

    public String getIdentitycard_type() {
        return identitycard_type;
    }

    public void setIdentitycard_type(String identitycard_type) {
        this.identitycard_type = identitycard_type;
    }

    public String getIdentitycard_no() {
        return identitycard_no;
    }

    public void setIdentitycard_no(String identitycard_no) {
        this.identitycard_no = identitycard_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAnshuo_loan_accept_id() {
        return anshuo_loan_accept_id;
    }

    public void setAnshuo_loan_accept_id(String anshuo_loan_accept_id) {
        this.anshuo_loan_accept_id = anshuo_loan_accept_id;
    }

    public String getLoanee_bank_code() {
        return loanee_bank_code;
    }

    public void setLoanee_bank_code(String loanee_bank_code) {
        this.loanee_bank_code = loanee_bank_code;
    }

    public String getLoanee_bank_account() {
        return loanee_bank_account;
    }

    public void setLoanee_bank_account(String loanee_bank_account) {
        this.loanee_bank_account = loanee_bank_account;
    }
    
}
