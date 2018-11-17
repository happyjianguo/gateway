package com.zdmoney.credit.framework.vo.lufax.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100008Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100008Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    /**接口编码*/
    @NotEmpty(message = "接口编码不能为空！")
    private String iCode;
    
    /**申请人姓名*/
    @NotEmpty(message = "申请人姓名不能为空！")
    private String name;
    
    /**证件类型*/
    @NotEmpty(message = "证件类型不能为空！")
    private String identityType;
    
    /**身份证号*/
    @NotEmpty(message = "身份证号不能为空！")
    private String idNumber;
    
    /**手机号*/
    @NotEmpty(message = "手机号不能为空！")
    private String mobile;
    
    /**外部申请号*/
    @NotEmpty(message = "外部申请号不能为空！")
    private String applNoHost;
    
    /**产品大类*/
    @NotEmpty(message = "产品大类不能为空！")
    private String parentProductNo;
    
    /**产品小类*/
    @NotEmpty(message = "产品小类不能为空！")
    private String productNo;
    
    /**银行卡号*/
    @NotEmpty(message = "银行卡号不能为空！")
    private String cardNo;

	public String getiCode() {
		return iCode;
	}

	public void setiCode(String iCode) {
		this.iCode = iCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getApplNoHost() {
		return applNoHost;
	}

	public void setApplNoHost(String applNoHost) {
		this.applNoHost = applNoHost;
	}

	public String getParentProductNo() {
		return parentProductNo;
	}

	public void setParentProductNo(String parentProductNo) {
		this.parentProductNo = parentProductNo;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
    
}
