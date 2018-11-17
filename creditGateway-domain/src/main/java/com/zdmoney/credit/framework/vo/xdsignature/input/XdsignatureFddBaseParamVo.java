package com.zdmoney.credit.framework.vo.xdsignature.input;

import com.zdmoney.credit.framework.vo.common.BaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by ym10094 on 2017/3/13.
 * 针对法大大系统调用的参数Vo
 */
public class XdsignatureFddBaseParamVo extends XdsignatureBaseParamVo {
    private static final long serialVersionUID = 7147783558858178321L;
    /**
     * 交易号
     */
    @NotBlank(message = "交易号(transaction_id)不能为空")
    private String transaction_id;
    /**
     * 请求时间
     */
    private String timestamp;
    /**
     * 签章结果代码
     */
    @NotBlank(message = "签章结果代码(result_code)不能为空")
    private String result_code;
    /**
     * 签章结果描述
     */
    private String result_desc;
    /**
     * 消息摘要
     */
    @NotBlank(message =  "消息摘要(msg_digest)不能为空")
    private String msg_digest;
    /**
     * 签章后文档下载地址
     */
    @NotBlank(message = "签章后文档下载地址(download_url)不能为空")
    private String download_url;
    /**
     * 在线查看已签文档的地址
     */
    @NotBlank(message = "在线查看已签文档的地址(download_url)不能为空")
    private String viewpdf_url;
    @NotBlank(message = "签章类型（signatureType）不能为空：（第三方、客户、公司）")
    private String signatureType;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getResult_desc() {
        return result_desc;
    }

    public void setResult_desc(String result_desc) {
        this.result_desc = result_desc;
    }

    public String getMsg_digest() {
        return msg_digest;
    }

    public void setMsg_digest(String msg_digest) {
        this.msg_digest = msg_digest;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getViewpdf_url() {
        return viewpdf_url;
    }

    public void setViewpdf_url(String viewpdf_url) {
        this.viewpdf_url = viewpdf_url;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }
}
