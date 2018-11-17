package com.zdmoney.credit.framework.vo.fdd.input;

import com.zdmoney.credit.framework.vo.fdd.FddBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Map;

/**
 * Created by ym10094 on 2017/2/27.
 * 法大大合同生成接口参数类 功能号 fdd100004
 */
public class Fdd100004Vo extends FddBaseParamVo {
    private static final long serialVersionUID = 1459564362781173791L;

    @NotBlank(message = "待签署文档标题（doc_title）不能为空！")
    private String doc_title;
    @NotBlank(message = "合同模板id（template_id）不能为空！")
    private String template_id;
    @NotBlank(message = "合同编号（contract_id）不能为空！")
    private String contract_id;
    /**
     * 字体大小
     */
    private String font_size;
    /**
     * 字体类型
     */
    private String font_type;

    @NotEmpty(message = "文档模板填充参数（parameter_map）不能为空！")
    private Map<String,String> parameter_map;

    public String getDoc_title() {
        return doc_title;
    }

    public void setDoc_title(String doc_title) {
        this.doc_title = doc_title;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getFont_size() {
        return font_size;
    }

    public void setFont_size(String font_size) {
        this.font_size = font_size;
    }

    public String getFont_type() {
        return font_type;
    }

    public void setFont_type(String font_type) {
        this.font_type = font_type;
    }

    public Map<String, String> getParameter_map() {
        return parameter_map;
    }

    public void setParameter_map(Map<String, String> parameter_map) {
        this.parameter_map = parameter_map;
    }
}
