package com.zdmoney.credit.framework.vo.request;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 请求参数Vo
 * @author Ivan
 *
 */
public class ParamVo implements Serializable {
    
    private static final long serialVersionUID = 1136119190467013195L;

    /** 功能号 参数名：funcId **/
    @NotBlank(message = "功能号不能为空！")
    private String funcId;
    
    /** 业务参数(密文) 参数名：params **/
    @NotBlank(message = "业务参数不能为空！")
    private String params;
    
    /** 功能号业务参数 参数名：reqParam **/
    private String reqParam;
    
    /** 解密时用到的Key 参数名：key **/
    private String key;
    
    /** 签名信息 参数名：sign **/
    private String sign;

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getReqParam() {
        return reqParam;
    }

    public void setReqParam(String reqParam) {
        this.reqParam = reqParam;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
