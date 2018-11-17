package com.zdmoney.credit.framework.vo.fdd.output;

import com.zdmoney.credit.framework.vo.fdd.FddOutputBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ym10094 on 2017/2/23.
 */
public class Fdd100001Vo extends FddOutputBaseParamVo {
    private static final long serialVersionUID = 1459874582461173791L;

    /**
     * 客户编号
     */
    @NotBlank(message = "客户编号不能为空")
    private String customer_id;

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
