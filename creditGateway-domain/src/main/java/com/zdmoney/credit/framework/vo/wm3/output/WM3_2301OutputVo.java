package com.zdmoney.credit.framework.vo.wm3.output;

import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.DeductItemResponseEntity;

public class WM3_2301OutputVo extends WM3BaseParamVo{

	private static final long serialVersionUID = -9124433080481539188L;
	
	private String batNo;	//批次编号
	private long dataCnt;	//记录数

	List<DeductItemResponseEntity> list = new ArrayList<DeductItemResponseEntity>();

	public String getBatNo() {
		return batNo;
	}

	public void setBatNo(String batNo) {
		this.batNo = batNo;
	}

	public long getDataCnt() {
		return dataCnt;
	}

	public void setDataCnt(long dataCnt) {
		this.dataCnt = dataCnt;
	}

	public List<DeductItemResponseEntity> getList() {
		return list;
	}

	public void setList(List<DeductItemResponseEntity> list) {
		this.list = list;
	}
	
}
