package com.zdmoney.credit.framework.vo.xdcore.entity;

import org.hibernate.validator.constraints.NotBlank;


/**
 * 超时拒绝结果信息
 * @author wangn  2016年11月10日 上午10:30:06
 *
 */
public class TimeoutCancelEntity {

	/**预审批Id**/
	@NotBlank(message = "预审批ID不能为空！")
	private String prePactNo;
	
	/**信托项目编号**/
	@NotBlank(message = "信托项目编号不能为空！")
	private String projNo;
	
	/**处理结果**/
	@NotBlank(message = "处理结果不能为空！")
	private String dealSts;
	
	/**处理描述**/
	private String dealDesc;

	public String getPrePactNo() {
		return prePactNo;
	}

	public void setPrePactNo(String prePactNo) {
		this.prePactNo = prePactNo;
	}

	public String getProjNo() {
		return projNo;
	}

	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}

	public String getDealSts() {
		return dealSts;
	}

	public void setDealSts(String dealSts) {
		this.dealSts = dealSts;
	}

	public String getDealDesc() {
		return dealDesc;
	}

	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}
	
}
