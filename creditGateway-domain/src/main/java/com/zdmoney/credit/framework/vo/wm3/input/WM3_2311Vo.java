package com.zdmoney.credit.framework.vo.wm3.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.DeductMoneyListEntity;
import com.zdmoney.credit.framework.vo.wm3.entity.RepayPlanListEntity;

/**
 * 外贸3
 * 3.1.1. 线上扣款[2311]
 */
public class WM3_2311Vo extends WM3BaseParamVo{

	private static final long serialVersionUID = -5885372427664550426L;
    
	/** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String brNo;
    
    /**记录数    取值范围[1,2000]*/
	@NotNull(message = "记录数不能为空！")
    private long dataCnt;
    /**批次号*/
	@NotBlank(message = "批次号不能为空！")
       private String batNo;
    
	List<DeductMoneyListEntity> list = new ArrayList<DeductMoneyListEntity>();

	public String getBrNo() {
		return brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

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

	public List<DeductMoneyListEntity> getList() {
		return list;
	}

	public void setList(List<DeductMoneyListEntity> list) {
		this.list = list;
	}

    
}
