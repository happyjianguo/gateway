package com.zdmoney.credit.system.domain;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.zdmoney.credit.framework.domain.BaseDomain;

/**
 * 接口访问日志
 * @author 00236640
 *
 */
public class AccessLog extends BaseDomain {
    
    private static final long serialVersionUID = -1249431506467454531L;
    /** 主键PK **/
    private Long id;
    /** 请求号 **/
    @Size(max = 50, message = "请求号长度不能超过50个字符")
    private String reqId;
    /** 调用方系统编号 **/
    @Size(max = 20, message = "调用方长度不能超过20个字符")
    private String caller;
    /** 功能号 **/
    @Size(max = 20, message = "功能号长度不能超过20个字符")
    private String funcNo;
    /** 请求入参 **/
    private String paramIn;
    /** 响应出参 **/
    private String paramOut;
    /** 耗时（秒） **/
    private Long usedTime;
    /** 请求时间 **/
    private Date reqTime;
    /** 响应时间 **/
    private Date resTime;
    /** 调用方IP地址 **/
    private String reqIp;
    /** 扩展字段1 **/
    @Size(max = 100, message = "扩展字段1长度不能超过100个字符")
    private String ext1;
    /** 扩展字段2 **/
    @Size(max = 100, message = "扩展字段2长度不能超过100个字符")
    private String ext2;
    /** 扩展字段3 **/
    @Length(max = 100, message = "扩展字段3长度不能超过100个字符")
    private String ext3;
    /** 扩展字段4 **/
    @Length(max = 100, message = "扩展字段4长度不能超过100个字符")
    private String ext4;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getFuncNo() {
        return funcNo;
    }

    public void setFuncNo(String funcNo) {
        this.funcNo = funcNo;
    }

    public String getParamIn() {
        return paramIn;
    }

    public void setParamIn(String paramIn) {
        this.paramIn = paramIn;
    }

    public String getParamOut() {
        return paramOut;
    }

    public void setParamOut(String paramOut) {
        this.paramOut = paramOut;
    }

    public Long getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Long usedTime) {
        this.usedTime = usedTime;
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public Date getResTime() {
        return resTime;
    }

    public void setResTime(Date resTime) {
        this.resTime = resTime;
    }

    public String getReqIp() {
        return reqIp;
    }

    public void setReqIp(String reqIp) {
        this.reqIp = reqIp;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }
}