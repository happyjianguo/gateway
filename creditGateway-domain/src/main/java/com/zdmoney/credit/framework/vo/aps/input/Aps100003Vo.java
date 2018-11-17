package com.zdmoney.credit.framework.vo.aps.input;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.framework.vo.aps.ApsBaseParamVo;

/**
 * 功能号aps100003 Vo对象 【单据撤销接口】
 * @author 00236640
 *
 */
public class Aps100003Vo extends ApsBaseParamVo {

    private static final long serialVersionUID = 4606376095466745388L;

    /** 申请件编号 **/
    @NotBlank(message = "申请件编号不能为空！")
    private String prePactNo;

    /** 拒单原因 **/
    @NotBlank(message = "拒单原因不能为空！")
    private String cancelReason;

    /** 拒单时间YYYYMMDD **/
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
