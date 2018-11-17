package com.zdmoney.credit.framework.vo.xdcore.output;

import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.framework.vo.xdcore.entity.ResponseLendEntity;


/**
 * 功能号Xdcore100001 返回Vo对象 【推送放款结果接口】
 * @author 00236640
 *
 */
public class Xdcore100001OutputVo extends XdcoreBaseParamVo {

	private static final long serialVersionUID = -2611009109613587196L;
	
	/**放款结果列表**/
	private List<ResponseLendEntity> listDealRes = new ArrayList<ResponseLendEntity>();
	public List<ResponseLendEntity> getListDealRes() {
		return listDealRes;
	}
	public void setListDealRes(List<ResponseLendEntity> listDealRes) {
		this.listDealRes = listDealRes;
	}
	
}
