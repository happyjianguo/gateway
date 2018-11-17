package com.zdmoney.credit.framework.vo.request;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 接口请求参数封装
 * 
 * @author Ivan
 *
 */
public class RequestVo {
    
    /** 系统编号  projectNo**/
    @NotBlank(message = "系统编号参数不能为空！")
    private String projectNo;
    
    /** 请求号 参数名：requestId **/
    @NotBlank(message = "请求号不能为空！")
    private String requestId;
    
    /** 头部信息 **/
    private HeaderVo headerVo;
    
    /** URL 参数信息 **/
    private ParamVo paramVo;
    
    /** 调用接口的系统IP地址 **/
    private String requestIp;

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public HeaderVo getHeaderVo() {
        return headerVo;
    }

    public void setHeaderVo(HeaderVo headerVo) {
        this.headerVo = headerVo;
    }

    public ParamVo getParamVo() {
        return paramVo;
    }

    public void setParamVo(ParamVo paramVo) {
        this.paramVo = paramVo;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }
}
