package com.zdmoney.credit.framework.vo.xdcore.output;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.framework.vo.xdcore.entity.DealResEntity;

/**
 * 功能号Xdcore100004 返回Vo对象 【推送待回购信息】
 * @author 00236640
 *
 */
public class Xdcore100004OutputVo extends XdcoreBaseParamVo {

    private static final long serialVersionUID = -5714651469974748978L;
    
    /** 推送待回购信息响应数据 **/
    private List<DealResEntity> listDealRes = new ArrayList<DealResEntity>();

    @Valid
    public List<DealResEntity> getListDealRes() {
        return listDealRes;
    }

    public void setListDealRes(List<DealResEntity> listDealRes) {
        this.listDealRes = listDealRes;
    }
}
