package com.zdmoney.credit.framework.vo.xdcore.input;

import java.util.List;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

public class Lufax800020Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;
	/** 单笔交易明细*/
    private List<DebitResultLufax> detail;//
    /** lufax指令号*/
    private String  lufax_batch_id;	//
    /** 总笔数*/
    private String line_sum;	//
    /** 签名*/
    private String sign;//

	public List<DebitResultLufax> getDetail() {
        return detail;
    }

    public void setDetail(List<DebitResultLufax> detail) {
        this.detail = detail;
    }

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

    public static class DebitResultLufax{
	    /** 业务类型*/
    	private String product_type;	//
    	/** 安硕序号*/
    	private String serialno	;//
    	/** 安硕贷款受理号*/
    	private String anshuo_loan_accept_id;	//
    	/** 借款申请ID*/
    	private String lufax_loan_req_id;	//
    	/** 安硕批次号*/
    	private String anshuo_batch_id;	//
    	/** 成功冻结金额*/
    	private String frozen_amount;	//
    	/** 从哪个帐户扣款*/
    	private String pay_party;	//
    	/** lufax还款请求号*/
    	private String lufax_repay_req_no;	//
        public String getProduct_type() {
            return product_type;
        }
        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }
        public String getSerialno() {
            return serialno;
        }
        public void setSerialno(String serialno) {
            this.serialno = serialno;
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
        public String getAnshuo_batch_id() {
            return anshuo_batch_id;
        }
        public void setAnshuo_batch_id(String anshuo_batch_id) {
            this.anshuo_batch_id = anshuo_batch_id;
        }
        public String getFrozen_amount() {
            return frozen_amount;
        }
        public void setFrozen_amount(String frozen_amount) {
            this.frozen_amount = frozen_amount;
        }
        public String getPay_party() {
            return pay_party;
        }
        public void setPay_party(String pay_party) {
            this.pay_party = pay_party;
        }
        public String getLufax_repay_req_no() {
            return lufax_repay_req_no;
        }
        public void setLufax_repay_req_no(String lufax_repay_req_no) {
            this.lufax_repay_req_no = lufax_repay_req_no;
        }
    	
    	
    	
    }
	
}
