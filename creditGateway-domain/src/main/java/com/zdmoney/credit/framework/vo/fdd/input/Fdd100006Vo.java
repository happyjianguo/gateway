package com.zdmoney.credit.framework.vo.fdd.input;

import com.zdmoney.credit.framework.vo.fdd.FddBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ym10094 on 2017/3/7.
 * 法大大 自动签署合同签章参数类 功能号 fdd100006
 */
public class Fdd100006Vo extends FddBaseParamVo {
    private static final long serialVersionUID = -4110188979015895295L;

    @NotBlank(message = "交易号（transaction_id）不能为空")
    private String transaction_id;
    /**
     * 授权交易号
     */
    private String batch_id;
    @NotBlank(message = "合同编号（contract_id）不能为空")
    private String contract_id;
    @NotBlank(message = "客户类型（client_type）不能为空")
    private String client_type;
    @NotBlank(message = "客户角色（client_role）不能为空")
    private String client_role;
    @NotBlank(message = "客户编号（customer_id）不能为空")
    private String customer_id;
    @NotBlank(message = "待签署文档标题（doc_title）不能为空")
    private String doc_title;
    @NotBlank(message = "自动签约关键字（sign_keyword）不能为空")
    private String sign_keyword;
    private String notify_url;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getClient_type() {
        return client_type;
    }

    public void setClient_type(String client_type) {
        this.client_type = client_type;
    }

    public String getClient_role() {
        return client_role;
    }

    public void setClient_role(String client_role) {
        this.client_role = client_role;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getDoc_title() {
        return doc_title;
    }

    public void setDoc_title(String doc_title) {
        this.doc_title = doc_title;
    }

    public String getSign_keyword() {
        return sign_keyword;
    }

    public void setSign_keyword(String sign_keyword) {
        this.sign_keyword = sign_keyword;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }
}
