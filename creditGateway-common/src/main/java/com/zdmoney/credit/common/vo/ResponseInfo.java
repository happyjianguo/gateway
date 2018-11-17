package com.zdmoney.credit.common.vo;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.Strings;

/**
 * 
 * 响应数据封装
 * @author Ivan
 *
 */
public class ResponseInfo<E> implements Serializable, Cloneable {

    private static final long serialVersionUID = -4112845183658483869L;

    /** 响应状态码 **/
    private String resCode;

    /** 响应内容 **/
    private String respDesc;

    /** 附件信息 **/
    private Object infos;

    public ResponseInfo() {

    }

    public ResponseInfo(ResponseEnum responseEnum, Object... arguments) {
        this.resCode = responseEnum.getCode();
        this.respDesc = Strings.format(responseEnum.getDesc(), arguments);
    }

    public ResponseInfo(String resCode, String respDesc) {
        this.resCode = resCode;
        this.respDesc = respDesc;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public Object getInfos() {
        return infos;
    }

    public void setInfos(Object infos) {
        this.infos = infos;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String toJSONText() {
        if (this.infos == null) {
            infos = new JSONObject();
        }
        return JSON.toJSONString(this);
    }
}
