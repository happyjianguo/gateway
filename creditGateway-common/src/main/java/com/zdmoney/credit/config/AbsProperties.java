package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息跟core.properties一致
 * @author 00236640
 *
 */
@Component
public class AbsProperties {

    /** HTTP接口地址（数信） **/
    @Value("${abs.serviceUrl}")
    private String serviceUrl;
    
    /** 与数信系统约定的签名秘钥 **/
    @Value("${abs.md5SignKey}")
    private String md5SignKey;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getMd5SignKey() {
        return md5SignKey;
    }
}
