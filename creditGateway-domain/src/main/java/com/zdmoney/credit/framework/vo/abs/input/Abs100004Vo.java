package com.zdmoney.credit.framework.vo.abs.input;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;
import com.zdmoney.credit.framework.vo.abs.entity.FeeReduceEntity;

/**
 * 功能号Abs100004 Vo对象 【息费减免申请】
 * @author 00236640
 *
 */
public class Abs100004Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 批次编号 **/
    @NotBlank(message = "批次编号不能为空！")
    private String batNo;

    /** 记录数 **/
    @NotNull(message = "记录数不能为空！")
    private Integer dataCnt;

    /** 息费减免一览信息  **/
    //@NotEmpty(message = "【listFeeReduce】息费减免信息列表不能为空！")
    private List<FeeReduceEntity> listFeeReduce;

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

    @Valid // 此注解声明需要校验对象或集合属性中的子元素
    public List<FeeReduceEntity> getListFeeReduce() {
        return listFeeReduce;
    }

    public void setListFeeReduce(List<FeeReduceEntity> listFeeReduce) {
        this.listFeeReduce = listFeeReduce;
    }
}
