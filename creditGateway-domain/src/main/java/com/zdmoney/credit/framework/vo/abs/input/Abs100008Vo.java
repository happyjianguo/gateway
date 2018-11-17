package com.zdmoney.credit.framework.vo.abs.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.DeduteResultEntity;

/**
 * 功能号Abs100008 Vo对象 【扣款结果上传接口】（不包含提前结清的扣款）
 * @author 00236640
 *
 */
public class Abs100008Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 批次号 **/
    @NotBlank(message = "批次号不能为空！")
    private String batNo;
    
    /** 扣款明细列表信息 **/
    //@NotEmpty(message = "【listDeduteResult】扣款明细列表信息不能为空！")
    private List<DeduteResultEntity> listDeduteResult = new ArrayList<DeduteResultEntity>();

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    @Valid
    public List<DeduteResultEntity> getListDeduteResult() {
        return listDeduteResult;
    }

    public void setListDeduteResult(List<DeduteResultEntity> listDeduteResult) {
        this.listDeduteResult = listDeduteResult;
    }
}
