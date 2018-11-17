package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ym10094 on 2017/2/24.
 */
@Component
public class SignatureProperties {
    /**
     * HTTP接口（跟核心电子签章系统）
     */
    @Value("${signature.serviceUrl}")
    private String serviceUrl;
    /**
     * 加密密钥
     */
    @Value("${signature.md5SignKey}")
    private String md5SignKey;

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
}
