package com.zdmoney.credit.framework.vo.fdd.input;

import com.zdmoney.credit.framework.vo.fdd.FddBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

import java.io.File;

/**
 * Created by ym10094 on 2017/2/27.
 * 法大大上传合同模板参数类 功能号 fdd100003
 */
public class Fdd100003Vo extends FddBaseParamVo{
    private static final long serialVersionUID = 1459564582781173791L;

    @NotBlank(message = "合同模板id（template_id）不能为空！")
    private String template_id;
    /**
     * 文档地址
     */
    private String doc_url;
    /**
     * 文档
     */
    private File file;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getDoc_url() {
        return doc_url;
    }

    public void setDoc_url(String doc_url) {
        this.doc_url = doc_url;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
