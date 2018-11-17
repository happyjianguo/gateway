package com.zdmoney.credit.framework.vo.xdcore.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.framework.vo.xdcore.entity.LendResEntity;


/**
 * 功能号Xdcore100001 Vo对象 【推送放款结果接口】
 * @author wangn
 *
 */
public class Xdcore100001Vo extends XdcoreBaseParamVo {
    
    private static final long serialVersionUID = 8889961726636078709L;
    /** 放款结果列表 **/
    //@NotEmpty(message = "【listLendRes】放款结果列表信息不能为空！")
    private List<LendResEntity> listLendRes = new ArrayList<LendResEntity>();

    @Valid
    public List<LendResEntity> getListLendRes() {
        return listLendRes;
    }

    public void setListLendRes(List<LendResEntity> listLendRes) {
        this.listLendRes = listLendRes;
    }
}
