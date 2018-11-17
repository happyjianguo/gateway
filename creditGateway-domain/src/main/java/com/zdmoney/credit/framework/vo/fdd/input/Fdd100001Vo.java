package com.zdmoney.credit.framework.vo.fdd.input;

import com.zdmoney.credit.framework.vo.fdd.FddBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ym10094 on 2017/2/23.
 * 法大大个人CA证书申请参数类 功能号 fdd100001
 */
public class Fdd100001Vo extends FddBaseParamVo{
    private static final long serialVersionUID = 1459794582461173791L;
    /**
     * 客户姓名
     */
    @NotBlank(message = "客户姓名(customer_name)不能为空")
    private String customer_name;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 证件类型
     */
    private String ident_type;
    /**
     * 手机号与证件号 3des(证件号码|手机号,app_secret)
     */
    @NotBlank(message = "手机号(mobile)的不能为空")
    private String mobile;
    /**
     * 身份证号码
     */
    @NotBlank(message = "证件号（id_card）不能为空")
    private String id_card;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdent_type() {
        return ident_type;
    }

    public void setIdent_type(String ident_type) {
        this.ident_type = ident_type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
}
