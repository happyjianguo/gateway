package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ym10094 on 2017/2/24.
 */
@Component
public class FddProperties {
    /**
     * HTTP接口（跟法大大电子签章系统）
     */
    @Value("${fdd.serviceUrl}")
    private String serviceUrl;
    /**
     * 加密密钥
     */
    @Value("${fdd.md5SignKey}")
    private String md5SignKey;
    /**
     * 接入平台iD;
     */
    @Value("${api_id}")
    private String apiId;
    @Value("${app_secret}")
    private String appSecret;
    @Value("${api_url}")
    private String apiUrl;


    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getMd5SignKey() {
        return md5SignKey;
    }

    public void setMd5SignKey(String md5SignKey) {
        this.md5SignKey = md5SignKey;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
