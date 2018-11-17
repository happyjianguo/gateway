package com.zdmoney.credit.framework.vo.wm3.output;

import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.RepayPlanResponseEntity;

public class WM3_2201OutputVo extends WM3BaseParamVo{
	
	private static final long serialVersionUID = 8646887318714952137L;

	private long dataCnt;	//受理记录数

	//（失败的记录）
	List<RepayPlanResponseEntity> list = new ArrayList<RepayPlanResponseEntity>();

	public long getDataCnt() {
		return dataCnt;
	}

	public void setDataCnt(long dataCnt) {
		this.dataCnt = dataCnt;
	}

	public List<RepayPlanResponseEntity> getList() {
		return list;
	}

	public void setList(List<RepayPlanResponseEntity> list) {
		this.list = list;
	}

	
}
