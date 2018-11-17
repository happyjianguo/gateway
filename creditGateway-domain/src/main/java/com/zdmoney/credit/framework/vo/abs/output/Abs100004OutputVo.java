package com.zdmoney.credit.framework.vo.abs.output;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.ListErrEntity;

/**
 * 功能号Abs100004 返回Vo对象 【息费减免申请接口】
 * @author 00236640
 *
 */
public class Abs100004OutputVo extends AbsBaseParamVo {
    
    private static final long serialVersionUID = 1459794732461173791L;
    
    /** 状态  **/
    @NotBlank(message = "返回状态不能为空！")
    private String status;
    
    /** 消息 **/
    private String msg;
    
    /** 批次编号  **/
    @NotBlank(message = "批次编号不能为空！")
    private String batNo;
    
    /** 记录数 **/
    @NotNull(message = "记录数不能为空！")
    private Integer dataCnt;
    
    /** 处理失败的记录**/
    private List<ListErrEntity> listErr = new ArrayList<ListErrEntity>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    public Integer getDataCnt() {
        return dataCnt;
    }

    public void setDataCnt(Integer dataCnt) {
        this.dataCnt = dataCnt;
    }

    public List<ListErrEntity> getListErr() {
        return listErr;
    }

    public void setListErr(List<ListErrEntity> listErr) {
        this.listErr = listErr;
    }
}
