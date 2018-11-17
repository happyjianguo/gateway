package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息跟core.properties一致
 * @author 00236640
 *
 */
@Component
public class Wm3Properties {

    /** 外贸业务提交接口服务地址 **/
    @Value("${wm3.processServiceUrl}")
    private String processUrl;
    
    /** 外贸结果查询接口服务地址 **/
    @Value("${wm3.searchServiceUrl}")
    private String searchUrl;
    
    /** 与外贸约定的签名秘钥 **/
    @Value("${wm3.md5SignKey}")
    private String md5SignKey;

    public String getProcessUrl() {
        return processUrl;
    }

    public void setProcessUrl(String processUrl) {
        this.processUrl = processUrl;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public String getMd5SignKey() {
        return md5SignKey;
    }

    public void setMd5SignKey(String md5SignKey) {
        this.md5SignKey = md5SignKey;
    }
}
