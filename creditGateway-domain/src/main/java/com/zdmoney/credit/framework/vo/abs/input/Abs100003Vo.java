package com.zdmoney.credit.framework.vo.abs.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;

/**
 * 功能号Abs100003 Vo对象 【单据撤销】
 * @author 00236640
 *
 */
public class Abs100003Vo extends AbsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 预审批ID **/
    @NotBlank(message = "预审批ID不能为空！")
    private String prePactNo;

    /** 拒单原因 **/
    @NotBlank(message = "拒单原因不能为空！")
    private String cancelReason;

    /** 拒单时间YYYY-MM-DD **/
    @NotBlank(message = "拒单时间不能为空！")
    private String cancelDate;
    
    public String getPrePactNo() {
        return prePactNo;
    }

    public void setPrePactNo(String prePactNo) {
        this.prePactNo = prePactNo;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
}
