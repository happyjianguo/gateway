package com.zdmoney.credit.framework.vo.aps.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;

/**
 * 功能号aps100001 Vo对象 【推送资产挑选结果接口】
 * @author 00236640
 *
 */
public class Aps100001Vo extends ApsBaseParamVo {
    
    private static final long serialVersionUID = 4606376095466745388L;
    
    /** 申请件编号 **/
    @NotBlank(message = "申请件编号不能为空！")
    private String prePactNo;
    
    /** 处理结果 **/
    @NotBlank(message = "处理结果不能为空！")
    private String dealSts;
    
    /** 处理描述 **/
    private String dealDesc;

    public String getPrePactNo() {
        return prePactNo;
    }

    public void setPrePactNo(String prePactNo) {
        this.prePactNo = prePactNo;
    }

    public String getDealSts() {
        return dealSts;
    }

    public void setDealSts(String dealSts) {
        this.dealSts = dealSts;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }
}
