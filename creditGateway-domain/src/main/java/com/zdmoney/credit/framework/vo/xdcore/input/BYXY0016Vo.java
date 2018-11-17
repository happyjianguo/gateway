package com.zdmoney.credit.framework.vo.xdcore.input;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.framework.vo.xdcore.entity.PayPlanListEntity;

/**
 * @ClassName:     BYXY0016Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午1:57:03
 */
public class BYXY0016Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 3954253745454757921L;

	/**结果码 */
	@NotBlank(message="结果码不能为空")
	private String respcd;
	
	/**结果信息 */
	@NotBlank(message="结果信息不能为空")
	private String resptx;
	
	/**业务申请流水号 */
	/*@NotBlank(message="业务申请流水号不能为空")*/
	private String busNumber;
	
	/** 借据号*/
	/*@NotBlank(message="借据号不能为空")*/
	private String orderNo;
	
	/**放款日期 */
	/*@NotBlank(message="放款日期不能为空")*/
	private String loanDate;
	
	/**总期数 */
	/*@NotNull(message="总期数不能为空")*/
	private Integer totalCnt;
	
	//还款计划列表
	List<PayPlanListEntity> payPlanList = new ArrayList<PayPlanListEntity>();

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}


	public List<PayPlanListEntity> getPayPlanList() {
		return payPlanList;
	}

	public void setPayPlanList(List<PayPlanListEntity> payPlanList) {
		this.payPlanList = payPlanList;
	}

	public String getRespcd() {
		return respcd;
	}

	public void setRespcd(String respcd) {
		this.respcd = respcd;
	}

	public String getResptx() {
		return resptx;
	}

	public void setResptx(String resptx) {
		this.resptx = resptx;
	}
	
	
}
