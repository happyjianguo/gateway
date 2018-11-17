package com.zdmoney.credit.framework.vo.bsb.input;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;


public class Bsb100019Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;
    /**
     * 原手机号码
     */
	/*changeMsgType为01时必填*/
	private String oldMobNo;
	/**
	 * 新手机号码
	 */
	/*changeMsgType为01时必填*/
	private String newMobNo;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 证件类型
	 */
	private String idType;
	/**
	 * 证件号码
	 */
	private String idNo;
	/**
	 * 修改信息类型
	 */
	/*01手机号变更*/
	private String changeMsgType;
	
	public String getOldMobNo() {
		return oldMobNo;
	}
	public void setOldMobNo(String oldMobNo) {
		this.oldMobNo = oldMobNo;
	}
	public String getNewMobNo() {
		return newMobNo;
	}
	public void setNewMobNo(String newMobNo) {
		this.newMobNo = newMobNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getChangeMsgType() {
		return changeMsgType;
	}
	public void setChangeMsgType(String changeMsgType) {
		this.changeMsgType = changeMsgType;
	}
	
}
