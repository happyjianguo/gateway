package com.zdmoney.credit.framework.vo.fdd.input;

import com.zdmoney.credit.framework.vo.fdd.FddBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ym10094 on 2017/2/27.
 * 法大大合同归档接口参数类 功能号 fdd100005
 */
public class Fdd100005Vo extends FddBaseParamVo {
    private static final long serialVersionUID = -4110186579015895295L;

    @NotBlank(message = "合同编号（contract_id）不能为空")
    private String contract_id;

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }
}
