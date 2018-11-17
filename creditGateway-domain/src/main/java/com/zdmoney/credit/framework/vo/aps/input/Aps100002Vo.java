package com.zdmoney.credit.framework.vo.aps.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;
import com.zdmoney.credit.framework.vo.aps.entity.CancelEntity;

/**
 * 功能号aps100002 Vo对象 【推送超时拒绝结果接口】
 * @author 00236640
 *
 */
public class Aps100002Vo extends ApsBaseParamVo {
    
    private static final long serialVersionUID = 4606376095466745388L;
    
    /** 超时拒绝结果信息 **/
    //@NotEmpty(message = "【listCancel】超时拒绝结果信息不能为空！")
    List<CancelEntity> listCancel = new ArrayList<CancelEntity>();

    @Valid
    public List<CancelEntity> getListCancel() {
        return listCancel;
    }

    public void setListCancel(List<CancelEntity> listCancel) {
        this.listCancel = listCancel;
    }
}
