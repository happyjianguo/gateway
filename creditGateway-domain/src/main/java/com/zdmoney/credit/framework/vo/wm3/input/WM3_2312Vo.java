package com.zdmoney.credit.framework.vo.wm3.input;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.DeductMoneyListEntity;
import com.zdmoney.credit.framework.vo.wm3.entity.PaidInMoneyListEntity;
/**
 * 外贸3 线下实收[2312]
 */
public class WM3_2312Vo extends WM3BaseParamVo {

	
	private static final long serialVersionUID = -3781926134693894321L;
	
	/** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String brNo;
    
    /**批次号*/
	@NotBlank(message = "批次号不能为空！")
    private String batNo;
	
	/** 专户银行流水号 **/
    //@NotBlank(message = "专户银行流水号不能为空！")
    private String bankNo;
    
    /**记录数*/
	@NotBlank(message = "记录数不能为空！")
    private String dataCnt;
	
	List< PaidInMoneyListEntity> list = new ArrayList<PaidInMoneyListEntity>();

	public String getBrNo() {
		return brNo;
	}

	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}

	public String getBatNo() {
		return batNo;
	}

	public void setBatNo(String batNo) {
		this.batNo = batNo;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getDataCnt() {
		return dataCnt;
	}

	public void setDataCnt(String dataCnt) {
		this.dataCnt = dataCnt;
	}

	public List<PaidInMoneyListEntity> getList() {
		return list;
	}

	public void setList(List<PaidInMoneyListEntity> list) {
		this.list = list;
	}
	
	
	

}
