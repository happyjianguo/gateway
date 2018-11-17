package com.zdmoney.credit.framework.vo.xdcore.entity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 推送息费减免结果 响应信息
 * @author 10098  2016年11月15日 下午8:48:32
 */
public class ResponseFeeReduceEntity {

	/**合同号码**/
	@NotBlank(message="合同号码不能为空")
	private String pactNo;
	/**处理结果**/
	@NotBlank(message="处理结果不能为空")
	private String status;
	/**错误描述**/
	private String msg;
	
	/**
	 * 息费减免响应 构造方法
	 * @param flag true-处理成功， false-处理失败
	 * @param pactNo
	 * @param msg
	 */
	public ResponseFeeReduceEntity(boolean flag, String pactNo, String msg){
		if(flag){
			this.status = "1";
		}else{
			this.status = "2";
		}
		this.pactNo = pactNo;
		this.msg = msg;
	}
	public String getPactNo() {
		return pactNo;
	}
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
