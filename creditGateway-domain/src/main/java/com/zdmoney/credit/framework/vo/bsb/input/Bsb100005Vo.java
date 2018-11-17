package com.zdmoney.credit.framework.vo.bsb.input;


import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;

/**
 * @ClassName:     Bsb100005Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:18:02
 */
public class Bsb100005Vo extends BsbBaseParamVo{

	private static final long serialVersionUID = -757416481974301885L;
	
	private String callbackUrl ;//通知回调地址
	
	@NotEmpty(message = "业务流水号不能为空！")
    private String busNumber;//业务流水号
	
	@NotEmpty(message = "产品小类编号不能为空！")
    private String prodSubNo;//产品小类编号
	
	@NotEmpty(message = "客户姓名不能为空！")
    private String custName;//客户姓名
	
	@NotEmpty(message = "证件类型不能为空！")
    private String idType;//证件类型
	
    @NotEmpty(message = "证件号码不能为空！")
    private String idNo;//证件号码
    
    @NotEmpty(message = "手机号码不能为空！")
    private String mobNo;//手机号码
    
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
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
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getProdSubNo() {
		return prodSubNo;
	}
	public void setProdSubNo(String prodSubNo) {
		this.prodSubNo = prodSubNo;
	}
	
}
