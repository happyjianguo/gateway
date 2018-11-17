package com.zdmoney.credit.framework.vo.aps.output;

import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;
import com.zdmoney.credit.framework.vo.aps.entity.TimeOutRefEntity;


/**
 * 功能号Aps100002 返回Vo对象 【推送超时拒绝结果接口】
 * @author 00236640
 *
 */
public class Aps100002OutputVo extends ApsBaseParamVo {

	
	private static final long serialVersionUID = -2086551013119683926L;

	/**拒绝结果列表**/
	List<TimeOutRefEntity> listCancelRes = new ArrayList<TimeOutRefEntity>();

	public List<TimeOutRefEntity> getListCancelRes() {
		return listCancelRes;
	}

	public void setListCancelRes(List<TimeOutRefEntity> listCancelRes) {
		this.listCancelRes = listCancelRes;
	}
}
