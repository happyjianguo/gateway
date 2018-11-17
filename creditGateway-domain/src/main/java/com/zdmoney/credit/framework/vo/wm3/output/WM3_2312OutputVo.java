package com.zdmoney.credit.framework.vo.wm3.output;

import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.FalseRecordLineDownListEntity;
/**
 * 
 */
public class WM3_2312OutputVo extends WM3BaseParamVo {

	
	private static final long serialVersionUID = -397662377066738598L;
	
	private Long dataCnt;//受理记录数
	List<FalseRecordLineDownListEntity> list = new ArrayList<FalseRecordLineDownListEntity>();
	public Long getDataCnt() {
		return dataCnt;
	}
	public void setDataCnt(Long dataCnt) {
		this.dataCnt = dataCnt;
	}
	public List<FalseRecordLineDownListEntity> getList() {
		return list;
	}
	public void setList(List<FalseRecordLineDownListEntity> list) {
		this.list = list;
	}
	
	

}
