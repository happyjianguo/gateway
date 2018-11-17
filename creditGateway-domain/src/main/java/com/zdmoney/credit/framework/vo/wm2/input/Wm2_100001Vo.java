package com.zdmoney.credit.framework.vo.wm2.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.wm2.Wm2BaseParamVo;

/**
 * 功能号Wm2100001 Vo对象
 * @author 00236640
 *
 */
public class Wm2_100001Vo extends Wm2BaseParamVo {
    
    private static final long serialVersionUID = 4606376095466745388L;
    
    /** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    private String sysSource;
    
    /** 申请件编号 **/
    @NotBlank(message = "申请件编号不能为空！")
    private String prePactNo;
    
    /** 处理结果 **/
    @NotBlank(message = "处理结果不能为空！")
    private String dealSts;
    
    /** 处理描述 **/
    private String dealDesc;

    public String getSysSource() {
        return sysSource;
    }

    public void setSysSource(String sysSource) {
        this.sysSource = sysSource;
    }

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
