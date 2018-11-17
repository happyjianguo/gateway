package com.zdmoney.credit.framework.vo.fdd;

import com.zdmoney.credit.framework.vo.common.BaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ym10094 on 2017/2/23.
 * 法大大业务接口返回参数
 */
public class FddOutputBaseParamVo extends BaseParamVo {
    private static final long serialVersionUID = -4145181579015895295L;
    /**
     * 返回结果
     */
    @NotBlank(message = "返回结果不能为空")
    private String result;
    /**
     * 结果代码
     */
    @NotBlank(message = "结果代码不能为空")
    private String code;
    /**
     * 详细信息
     */
    private String msg;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
