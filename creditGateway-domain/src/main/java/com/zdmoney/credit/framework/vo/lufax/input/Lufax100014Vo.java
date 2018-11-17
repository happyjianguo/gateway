package com.zdmoney.credit.framework.vo.lufax.input;

import java.math.BigDecimal;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100014Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100014Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    private String anshuo_batch_id;//批次号
    private String company_usename;//对公账户陆金所虚拟户名称
    private BigDecimal amount;//充值金额
    private String app_id;//调用方ID
    private String apply_at;//调用发起时间
    private String product_type;//业务类型
	public String getAnshuo_batch_id() {
		return anshuo_batch_id;
	}
	public void setAnshuo_batch_id(String anshuo_batch_id) {
		this.anshuo_batch_id = anshuo_batch_id;
	}
	public String getCompany_usename() {
		return company_usename;
	}
	public void setCompany_usename(String company_usename) {
		this.company_usename = company_usename;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public String getApply_at() {
		return apply_at;
	}
	public void setApply_at(String apply_at) {
		this.apply_at = apply_at;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}    
}
