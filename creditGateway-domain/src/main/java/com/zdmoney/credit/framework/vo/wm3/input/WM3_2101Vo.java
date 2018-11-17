package com.zdmoney.credit.framework.vo.wm3.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.ApplyLoanWm3Entity;

/**
 * 外贸3——放款批量申请vo
 * @author 10098  2017年3月16日 上午11:35:32
 */
public class WM3_2101Vo extends WM3BaseParamVo {
	private static final long serialVersionUID = -7359388212626393531L;

	/** 合作机构号**/
	@NotBlank(message = "合作机构号不能为空！")
	private String brNo;
	/** 批次号码 **/
	@NotBlank(message = "批次号码不能为空！")
	private String batNo;
	/** 记录数 **/
	@NotNull(message = "记录数不能为空！")
	private Integer dataCnt;
	/** 放款申请信息 **/
	private List<ApplyLoanWm3Entity> list = new ArrayList<>();
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
	public Integer getDataCnt() {
		return dataCnt;
	}
	public void setDataCnt(Integer dataCnt) {
		this.dataCnt = dataCnt;
	}
	public List<ApplyLoanWm3Entity> getList() {
		return list;
	}
	public void setList(List<ApplyLoanWm3Entity> list) {
		this.list = list;
	}
	
}
