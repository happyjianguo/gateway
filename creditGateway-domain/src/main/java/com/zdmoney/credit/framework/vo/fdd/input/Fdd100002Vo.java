package com.zdmoney.credit.framework.vo.fdd.input;

import com.zdmoney.credit.framework.vo.fdd.FddBaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

import java.io.File;

/**
 * Created by ym10094 on 2017/2/27.
 * 法大大文档传输接口参数类 （上传已生成的合同文件） 功能号 fdd100002
 */
public class Fdd100002Vo extends FddBaseParamVo {
    private static final long serialVersionUID = 1459794582781173791L;
    /**
     * 合同编号
     */
    @NotBlank(message = "合同编号（contract_id）不能为空！")
    private String contract_id;
    /**
     * 合同标题
     */
    @NotBlank(message = "合同标题（doc_title）不能为空！")
    private String doc_title;
    /**
     * 文档地址
     */
    private String doc_url;
    /**
     * 文档
     */
    private  String contractContent;
    /**
     * 文档类型
     */
    private String doc_type;

    public String getContract_id() {
        return contract_id;
    }

    public void setContract_id(String contract_id) {
        this.contract_id = contract_id;
    }

    public String getDoc_title() {
        return doc_title;
    }

    public void setDoc_title(String doc_title) {
        this.doc_title = doc_title;
    }

    public String getDoc_url() {
        return doc_url;
    }

    public void setDoc_url(String doc_url) {
        this.doc_url = doc_url;
    }

    public String getContractContent() {
        return contractContent;
    }

    public void setContractContent(String contractContent) {
        this.contractContent = contractContent;
    }
    public String getDoc_type() {
        return doc_type;
    }

    public void setDoc_type(String doc_type) {
        this.doc_type = doc_type;
    }
}
