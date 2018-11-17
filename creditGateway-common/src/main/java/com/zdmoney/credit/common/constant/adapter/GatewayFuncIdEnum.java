package com.zdmoney.credit.common.constant.adapter;

/**
 * Created by ym10094 on 2017/3/9.
 */
public enum GatewayFuncIdEnum {
    手动签章同步回调("xdsignature100001","手动签署接口"),
    签章异步回调("xdsignature100002","签章异步回调");
    private String code;
    private String value;

    GatewayFuncIdEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
