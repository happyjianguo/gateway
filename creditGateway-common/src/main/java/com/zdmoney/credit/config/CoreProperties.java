package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息跟core.properties一致
 * 
 * @author Ivan
 *
 */
@Component
public class CoreProperties {

    /** HTTP接口地址（信贷核心） **/
    @Value("${core.serviceUrl}")
    private String serviceUrl;
    
    /** 与核心系统约定的签名秘钥 **/
    @Value("${core.md5SignKey}")
    private String md5SignKey;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getMd5SignKey() {
        return md5SignKey;
    }
}
