package com.zdmoney.credit.framework.vo.abs.output;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.PublicAccountListErrEntity;

/**
 * 功能号Abs100007 返回对象 【对公还款接口】
 * @author 00236640
 *
 */
public class Abs100007OutputVo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 状态  **/
    @NotBlank(message = "返回状态不能为空！")
    private String status;
    
    /** 消息 **/
    private String msg;
    
    /** 记录数 **/
    @NotNull(message = "记录数不能为空！")
    private Integer dataCnt;
    
    /** 处理失败记录信息 **/
    private List<PublicAccountListErrEntity> listErr = new ArrayList<PublicAccountListErrEntity>();

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

    public Integer getDataCnt() {
        return dataCnt;
    }

    public void setDataCnt(Integer dataCnt) {
        this.dataCnt = dataCnt;
    }

    public List<PublicAccountListErrEntity> getListErr() {
        return listErr;
    }

    public void setListErr(List<PublicAccountListErrEntity> listErr) {
        this.listErr = listErr;
    }
}
