package com.zdmoney.credit.framework.vo.xdcore.output;

import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.framework.vo.xdcore.entity.ResponseFeeReduceEntity;


/**
 * 功能号Xdcore100002 返回Vo对象 【推送息费减免结果】
 * @author 00236640
 *
 */
public class Xdcore100002OutputVo extends XdcoreBaseParamVo {

	private static final long serialVersionUID = -3966873638704168220L;
	
	/**推送息费减免结果**/
	private List<ResponseFeeReduceEntity> listDealRes = new ArrayList<ResponseFeeReduceEntity>();
	public List<ResponseFeeReduceEntity> getListDealRes() {
		return listDealRes;
	}
	public void setListDealRes(List<ResponseFeeReduceEntity> listDealRes) {
		this.listDealRes = listDealRes;
	}
}
