package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息跟core.properties一致
 * @author 00236640
 *
 */
@Component
public class ApsProperties {

    /** HTTP接口地址（证大征审） **/
    @Value("${aps.serviceUrl}")
    private String serviceUrl;
    
    /** HTTP接口地址（新征审） **/
    @Value("${new.aps.serviceUrl}")
    private String newServiceUrl;
    
    /** 与征审系统约定的签名秘钥 **/
    @Value("${aps.md5SignKey}")
    private String md5SignKey;

    public String getServiceUrl() {
        return serviceUrl;
    }
    
    public String getNewServiceUrl() {
        return newServiceUrl;
    }

    public String getMd5SignKey() {
        return md5SignKey;
    }
}
