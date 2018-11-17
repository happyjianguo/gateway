package com.zdmoney.credit.framework.vo.wm3.output;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.FalseRecordListEntity;
/**
 * 外贸3 
 *  线上扣款[2311]   响应数据
 */
public class WM3_2311OutputVo  extends WM3BaseParamVo{

	
	private static final long serialVersionUID = 6627672559485455801L;
    
	 /**记录数    取值范围[1,2000]*/
	@NotNull(message = "记录数不能为空！")
	private long dataCnt;
	/**批次号*/
	@NotNull(message = "批次号不能为空！")
	private String  batNo;
	
	List<FalseRecordListEntity> list = new ArrayList<FalseRecordListEntity>();

	public long getDataCnt() {
		return dataCnt;
	}

	public void setDataCnt(long dataCnt) {
		this.dataCnt = dataCnt;
	}

	

	public String getBatNo() {
		return batNo;
	}

	public void setBatNo(String batNo) {
		this.batNo = batNo;
	}

	public List<FalseRecordListEntity> getList() {
		return list;
	}

	public void setList(List<FalseRecordListEntity> list) {
		this.list = list;
	}
	
	
}
