package com.zdmoney.credit.framework.adapter.vo.fdd;

/**
 * Created by ym10094 on 2017/3/9.
 * 手动签章返回的结果Vo
 */
public class ExtsignResultVo {
    private static final long serialVersionUID = 1459794582478173791L;
    /**
     * 交易号
     */
    private String transaction_id;
    /**
     * 请求时间
     */
    private String timestamp;
    /**
     * 签章结果代码
     */

    private String result_code;
    /**
     * 签章结果描述
     */
    private String result_desc;
    /**
     * 消息摘要
     */
    private String msg_digest;
    /**
     * 签章后文档下载地址
     */
    private String download_url;
    /**
     * 在线查看已签文档的地址
     */
    private String viewpdf_url;

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
}
