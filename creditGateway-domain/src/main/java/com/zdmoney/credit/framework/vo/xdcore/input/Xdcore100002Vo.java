package com.zdmoney.credit.framework.vo.xdcore.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.framework.vo.xdcore.entity.XdFeeReduceEntity;

/**
 * 功能号Xdcore100002 Vo对象 【推送息费减免结果】
 * @author wangn
 *
 */
public class Xdcore100002Vo extends XdcoreBaseParamVo {

    private static final long serialVersionUID = -2940996637743332278L;
    
    /** 息费减免结果列表 **/
    //@NotEmpty(message = "【listFeeReduceResult】息费减免结果列表信息不能为空！")
    private List<XdFeeReduceEntity> listFeeReduceResult = new ArrayList<XdFeeReduceEntity>();
    
    @Valid
    public List<XdFeeReduceEntity> getListFeeReduceResult() {
        return listFeeReduceResult;
    }
    public void setListFeeReduceResult(List<XdFeeReduceEntity> listFeeReduceResult) {
        this.listFeeReduceResult = listFeeReduceResult;
    }
}
