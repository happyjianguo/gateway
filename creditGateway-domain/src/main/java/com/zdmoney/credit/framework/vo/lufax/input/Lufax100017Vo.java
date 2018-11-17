package com.zdmoney.credit.framework.vo.lufax.input;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.framework.vo.lufax.entity.PushLoanInfoFeeInfoEntity;
import com.zdmoney.credit.framework.vo.lufax.entity.PushLoanInfoRepayPlanEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YM10098 on 2017/7/5.
 */
public class Lufax100017Vo extends LufaxBaseParamVo {
    private static final long serialVersionUID = 1747892828403264286L;
    /** 借据号 **/
    @NotEmpty(message = "借据号不能为空！")
    private String loanNo;
    /** 申请号 **/
    @NotEmpty(message = "申请号不能为空！")
    private String applyNo;
    /** 安硕批次号 **/
    @NotEmpty(message = "安硕批次号不能为空！")
    private String anshuo_batch_id;
    /** 产品大类 **/
    @NotEmpty(message = "产品大类不能为空！")
    private String productType;
    /** 前端主机ID **/
    @NotEmpty(message = "前端主机ID不能为空！")
    private String lufaxLoanReqId;
    /** 起息日期 **/
    @NotEmpty(message = "起息日期不能为空！")
    private String putoutDate;
    /** 到期日期 **/
    @NotEmpty(message = "到期日期不能为空！")
    private String maturityDate;
    /** 借据会计日期 **/
    @NotEmpty(message = "借据会计日期不能为空！")
    private String curdeductDate;
    /** 默认还款日 **/
    @NotEmpty(message = "默认还款日不能为空！")
    private String defaultPaydate;
    /** 正常本金 **/
    @NotNull(message = "正常本金不能为空！")
    private String normalPrincipal;
    /** 下次还款日 **/
    @NotEmpty(message = "下次还款日不能为空！")
    private String nextRepaydate;
    /** 下次利率调整日期 **/
    @NotEmpty(message = "下次利率调整日期不能为空！")
    private String nextRateAdjustDate;
    @Valid
    @NotEmpty(message = "还款计划不能为空！")
    private List<PushLoanInfoRepayPlanEntity> repayPlans = new ArrayList<PushLoanInfoRepayPlanEntity>();
    /** 费用列表**/
    @Valid
    @NotEmpty(message = "费用明细不能为空")
    private List<PushLoanInfoFeeInfoEntity> feeList = new ArrayList<>();
    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getLufaxLoanReqId() {
        return lufaxLoanReqId;
    }

    public void setLufaxLoanReqId(String lufaxLoanReqId) {
        this.lufaxLoanReqId = lufaxLoanReqId;
    }

    public String getPutoutDate() {
        return putoutDate;
    }

    public void setPutoutDate(String putoutDate) {
        this.putoutDate = putoutDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getCurdeductDate() {
        return curdeductDate;
    }

    public void setCurdeductDate(String curdeductDate) {
        this.curdeductDate = curdeductDate;
    }

    public String getDefaultPaydate() {
        return defaultPaydate;
    }

    public void setDefaultPaydate(String defaultPaydate) {
        this.defaultPaydate = defaultPaydate;
    }

    public String getNormalPrincipal() {
        return normalPrincipal;
    }

    public void setNormalPrincipal(String normalPrincipal) {
        this.normalPrincipal = normalPrincipal;
    }

    public String getNextRepaydate() {
        return nextRepaydate;
    }

    public void setNextRepaydate(String nextRepaydate) {
        this.nextRepaydate = nextRepaydate;
    }

    public String getNextRateAdjustDate() {
        return nextRateAdjustDate;
    }

    public void setNextRateAdjustDate(String nextRateAdjustDate) {
        this.nextRateAdjustDate = nextRateAdjustDate;
    }

    public List<PushLoanInfoRepayPlanEntity> getRepayPlans() {
        return repayPlans;
    }

    public void setRepayPlans(List<PushLoanInfoRepayPlanEntity> repayPlans) {
        this.repayPlans = repayPlans;
    }

    public List<PushLoanInfoFeeInfoEntity> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<PushLoanInfoFeeInfoEntity> feeList) {
        this.feeList = feeList;
    }

    public String getAnshuo_batch_id() {
        return anshuo_batch_id;
    }

    public void setAnshuo_batch_id(String anshuo_batch_id) {
        this.anshuo_batch_id = anshuo_batch_id;
    }
}
