package com.zdmoney.credit.framework.vo.fdd.output;

import com.zdmoney.credit.framework.vo.fdd.FddOutputBaseParamVo;

/**
 * Created by ym10094 on 2017/3/7.
 */
public class Fdd100006OutputVo extends FddOutputBaseParamVo {
    private static final long serialVersionUID = -4145181579087895295L;

    /**
     * 下载地址
     */
    private String download_url;
    /**
     * 查看地址
     */
    private String viewpdf_url;

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
