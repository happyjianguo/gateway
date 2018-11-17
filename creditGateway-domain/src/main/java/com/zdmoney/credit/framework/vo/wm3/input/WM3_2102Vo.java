package com.zdmoney.credit.framework.vo.wm3.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;

/**
 * 外贸3——放款申请结果查询vo
 * @author 10098  2017年3月16日 上午11:35:32
 */
public class WM3_2102Vo extends WM3BaseParamVo {
	
	private static final long serialVersionUID = 1806681640243335331L;
	/** 合作机构号**/
	@NotBlank(message = "合作机构号不能为空！")
	private String brNo;
	/** 批次号码 **/
	@NotBlank(message = "批次号码不能为空！")
	private String batchNo;
	/** 合同号 **/
	private String pactNo;
	public String getBrNo() {
		return brNo;
	}
	public void setBrNo(String brNo) {
		this.brNo = brNo;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
}
