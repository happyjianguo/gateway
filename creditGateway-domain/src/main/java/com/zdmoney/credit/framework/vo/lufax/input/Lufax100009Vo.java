package com.zdmoney.credit.framework.vo.lufax.input;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100009Vo.java
 * @Description:   证大发起一般还款/提前还款指令/逾期回购指令
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100009Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    @Valid
    @NotEmpty(message="单笔交易明细不能为空！")
    private List<ItemLufax> detail;//单笔交易明细
    @NotEmpty(message = "安硕批次号不能为空！")
    private String  anshuo_batch_id;    //安硕批次号
    @NotEmpty(message = "总条数不能为空！")
    private String line_sum;    //总条数
    @NotEmpty(message = "总金额不能为空！")
    private String amount_sum;  //总金额
    @NotEmpty(message = "接口ID不能为空！")
    private String interface_id;    //接口ID
    @NotEmpty(message = "请求流水号不能为空！")
    private String interface_reqser;    //请求流水号

    public List<ItemLufax> getDetail() {
        return detail;
    }

    public void setDetail(List<ItemLufax> detail) {
        this.detail = detail;
    }

    public String getAnshuo_batch_id() {
        return anshuo_batch_id;
    }

    public void setAnshuo_batch_id(String anshuo_batch_id) {
        this.anshuo_batch_id = anshuo_batch_id;
    }

    public String getLine_sum() {
        return line_sum;
    }

    public void setLine_sum(String line_sum) {
        this.line_sum = line_sum;
    }

    public String getAmount_sum() {
        return amount_sum;
    }

    public void setAmount_sum(String amount_sum) {
        this.amount_sum = amount_sum;
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


    //单笔交易明细
    public static class ItemLufax{
        @NotEmpty(message="业务类型不能为空！")
        private String  product_type;   //业务类型 3000100010：产险     3000200010：长安     1000500010 ：证大
        @NotEmpty(message="安硕序号不能为空！")
        private String  serialno;   //安硕序号 需要在“lufax通知安硕实际扣款结果金额”中发送给安硕    网站：全局唯一
        @NotEmpty(message="安硕贷款受理号不能为空！")
        private String  anshuo_loan_accept_id;  //安硕贷款受理号
        @NotEmpty(message="借款申请ID不能为空！")
        private String  lufax_loan_req_id;  //借款申请ID
        @NotEmpty(message="金额不能为空！")
        private String  amount; //金额
        private String  pay_party;  //从哪个帐户扣款 1：借款人    2：服务公司（对公）    3：准备金    (默认为1)
        @NotEmpty(message="扣款方式不能为空！")
        private String  type;   //扣款方式 1-自动代扣    2-重试代扣    3-逾期代扣    4-追偿代扣    5-收费代扣
        /*第几期*/
        private int rpterm;
        /*本金*/
        private BigDecimal capital;
        /*利息*/
        private BigDecimal inte;
        /*罚息*/
        private BigDecimal oint;
        
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
        public String getAmount() {
            return amount;
        }
        public void setAmount(String amount) {
            this.amount = amount;
        }
        public String getPay_party() {
            return pay_party;
        }
        public void setPay_party(String pay_party) {
            this.pay_party = pay_party;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        public int getRpterm() {
            return rpterm;
        }
        public void setRpterm(int rpterm) {
            this.rpterm = rpterm;
        }
        public BigDecimal getCapital() {
            return capital;
        }
        public void setCapital(BigDecimal capital) {
            this.capital = capital;
        }
        public BigDecimal getInte() {
            return inte;
        }
        public void setInte(BigDecimal inte) {
            this.inte = inte;
        }
        public BigDecimal getOint() {
            return oint;
        }
        public void setOint(BigDecimal oint) {
            this.oint = oint;
        }
        
    }
}
