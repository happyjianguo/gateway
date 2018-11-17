package com.zdmoney.credit.framework.vo.lufax.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.framework.vo.lufax.entity.ContractConfDataInfoLufaxEntity;
import com.zdmoney.credit.framework.vo.lufax.entity.ContractConfLoanInfoLufaxEntity;

/**
 * @ClassName:     Lufax100003Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100003Vo extends LufaxBaseParamVo {

	private static final long serialVersionUID = 1394128396718890602L;
	/**进件流水号**/
    @NotBlank(message = "进件流水号不能为空！")
	private String aps_apply_no;
    /**申请单号**/
    @NotBlank(message = "申请单号不能为空！")
	private String apply_no;
    /**债权信息**/
	private ContractConfDataInfoLufaxEntity data_info;
	/**借据信息**/
	private ContractConfLoanInfoLufaxEntity loan_info;

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

	public ContractConfDataInfoLufaxEntity getData_info() {
		return data_info;
	}

	public void setData_info(ContractConfDataInfoLufaxEntity data_info) {
		this.data_info = data_info;
	}

	public ContractConfLoanInfoLufaxEntity getLoan_info() {
		return loan_info;
	}

	public void setLoan_info(ContractConfLoanInfoLufaxEntity loan_info) {
		this.loan_info = loan_info;
	}	
	
}
