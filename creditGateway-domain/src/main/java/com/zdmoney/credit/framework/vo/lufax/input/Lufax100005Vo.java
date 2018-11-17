package com.zdmoney.credit.framework.vo.lufax.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100005Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100005Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    /**进件流水号*/
    @NotEmpty(message = "进件流水号不能为空！")
    private String aps_apply_no;
    
    /**申请单号*/
    @NotEmpty(message = "申请单号不能为空！")
    private String apply_no;
    
    /**通知状态*/
    @NotEmpty(message = "通知状态不能为空！")
    private String notify_code;

	public String getAps_apply_no() {
		return aps_apply_no;
	}

	public void setAps_apply_no(String aps_apply_no) {
		this.aps_apply_no = aps_apply_no;
	}

	public String getApply_no() {
		return apply_no;
	}

	public void setApply_no(String apply_no) {
		this.apply_no = apply_no;
	}

	public String getNotify_code() {
		return notify_code;
	}

	public void setNotify_code(String notify_code) {
		this.notify_code = notify_code;
	}
    
}
