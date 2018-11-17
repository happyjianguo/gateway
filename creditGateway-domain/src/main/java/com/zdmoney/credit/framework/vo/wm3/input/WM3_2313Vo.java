package com.zdmoney.credit.framework.vo.wm3.input;


import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
/**
 * 外贸3
 *  扣款查询[2313]
 */
public class WM3_2313Vo extends WM3BaseParamVo {

	
	private static final long serialVersionUID = -4438812671918986810L;
	
	/** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String brNo;
    
    /**批次号*/
	@NotBlank(message = "批次号不能为空！")
    private String batNo;
	/** 线上标示 **/
    @NotBlank(message = "线上标示 不能为空！")
    private String onLine;
    
    /**合同号*/
	//@NotNull(message = "合同号不能为空！")
    private String  pactNo;
    /**页码*/
	//@NotBlank(message = "页码不能为空！")
    private String pageNo;
	/**每页条数*/
	//@NotBlank(message = "每页条数不能为空！")   
	private String pageSize;
	
	
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
	public String getOnLine() {
		return onLine;
	}
	public void setOnLine(String onLine) {
		this.onLine = onLine;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	
	

}
