package com.zdmoney.credit.framework.vo.wm3.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.RepayPlanListEntity;

/**
 * 功能号WM3_2201Vo Vo对象
 * 还款计划上传参数类
 * @author YM10112
 */

public class WM3_2201Vo extends WM3BaseParamVo {
    
	private static final long serialVersionUID = -858471197839575131L;
	/** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String brNo;
    
    /**记录数*/
	@NotNull(message = "记录数不能为空！")
    private long dataCnt;

    //还款计划列表
	List<RepayPlanListEntity> list = new ArrayList<RepayPlanListEntity>();

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

	public List<RepayPlanListEntity> getList() {
		return list;
	}

	public void setList(List<RepayPlanListEntity> list) {
		this.list = list;
	}
	
}
