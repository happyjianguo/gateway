package com.zdmoney.credit.framework.vo.lufax.output;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.zdmoney.credit.framework.vo.lufax.entity.RepayPlanLufaxEntity;

/**
 * @author 10098  2017年4月21日 下午4:01:13
 */
public class Lufax100007OutputVo implements Serializable{

	
	private static final long serialVersionUID = -6374892420531603211L;
	/**返回码**/
	private String returnCode;
	/**返回信息**/
	private String returnMsg;
	/**还款计划明细**/
	private List<RepayPlanLufaxEntity> repayPlan = new ArrayList<>();

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public List<RepayPlanLufaxEntity> getRepayPlan() {
		return repayPlan;
	}

	public void setRepayPlan(List<RepayPlanLufaxEntity> repayPlan) {
		this.repayPlan = repayPlan;
	}
	
}
