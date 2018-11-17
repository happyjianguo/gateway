package com.zdmoney.credit.framework.vo.lufax.input;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;
import com.zdmoney.credit.framework.vo.lufax.entity.BuyBackTradeDetailEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YM10098 on 2017/7/12.
 */
public class Lufax100018Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 5881206303062719208L;

    @NotEmpty(message = "安硕批次号不能为空")
    private String anshuo_batch_id;
    @NotEmpty(message = "总笔数不能为空")
    private String line_sum;
    @NotEmpty(message = "签名不能为空")
    private String sign;
    @Valid
    @NotEmpty(message = "交易明细不能为空")
    private List<BuyBackTradeDetailEntity> detail = new ArrayList<>();

    public String getAnshuo_batch_id() {
        return anshuo_batch_id;
    }

    public void setAnshuo_batch_id(String anshuo_batch_id) {
        this.anshuo_batch_id = anshuo_batch_id;
    }

    public String getLine_sum() {
        return line_sum;
    }

    public void setLine_sum(String line_sum) {
        this.line_sum = line_sum;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public List<BuyBackTradeDetailEntity> getDetail() {
        return detail;
    }

    public void setDetail(List<BuyBackTradeDetailEntity> detail) {
        this.detail = detail;
    }
}
