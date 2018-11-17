package com.zdmoney.credit.framework.vo.wm3.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.DeductItemBaseEntity;
import com.zdmoney.credit.framework.vo.wm3.entity.DeductItemFeeEntity;
import com.zdmoney.credit.framework.vo.wm3.entity.DeductItemPayOverEntity;
import com.zdmoney.credit.framework.vo.wm3.entity.RepayPlanListEntity;

/**
 * 功能号WM3_2301Vo Vo对象
 * 扣款信息上传参数类
 * @author YM10112
 */

public class WM3_2301Vo extends WM3BaseParamVo {
    
	
	private static final long serialVersionUID = -4813552753861503279L;

	/** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String brNo;
    
    /**记录数*/
	@NotNull(message = "记录数不能为空！")
    private long dataCnt;
	
	@NotBlank(message = "批次号不能为空！")
	private String batNo;
    
	List<DeductItemBaseEntity> list = new ArrayList<DeductItemBaseEntity>();
	
	List<DeductItemFeeEntity> listFee = new ArrayList<DeductItemFeeEntity>();
	
	List<DeductItemPayOverEntity> listPayOver  = new ArrayList<DeductItemPayOverEntity>();

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

	public List<DeductItemBaseEntity> getList() {
		return list;
	}

	public void setList(List<DeductItemBaseEntity> list) {
		this.list = list;
	}

	public List<DeductItemFeeEntity> getListFee() {
		return listFee;
	}

	public void setListFee(List<DeductItemFeeEntity> listFee) {
		this.listFee = listFee;
	}

	public List<DeductItemPayOverEntity> getListPayOver() {
		return listPayOver;
	}

	public void setListPayOver(List<DeductItemPayOverEntity> listPayOver) {
		this.listPayOver = listPayOver;
	}

}
