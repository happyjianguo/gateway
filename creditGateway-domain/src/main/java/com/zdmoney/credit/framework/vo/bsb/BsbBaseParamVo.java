package com.zdmoney.credit.framework.vo.bsb;

import com.alibaba.fastjson.annotation.JSONField;
import com.zdmoney.credit.framework.vo.common.BaseParamVo;

/**
 * @description: 
 * @author: 柳云华
 * @version: 1.0
 * @createdate: 2016年12月23日 上午10:26:02
 * Modification  History:
 *    Date        Author        Version        Description
 * -----------------------------------------------------------------------------------
 * 2016年12月23日          柳云华                           1.0             初始化
 */
public class BsbBaseParamVo  extends BaseParamVo {

	private static final long serialVersionUID = 1L;
	
	/**  接口标识(接口唯一标识，接口id，见具体接口) */
	@JSONField(serialize = false)
	private String txncd;

	public String getTxncd() {
		return txncd;
	}

	public void setTxncd(String txncd) {
		this.txncd = txncd;
	}

}
