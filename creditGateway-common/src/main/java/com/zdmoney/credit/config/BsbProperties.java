package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息跟core.properties一致
 * @author 00236640
 *
 */
@Component
public class BsbProperties {

    /** HTTP接口地址（包银） **/
    @Value("${bsb.serviceUrl}")
    private String serviceUrl;
    
    /** 与包银约定的签名秘钥 **/
    @Value("${bsb.md5SignKey}")
    private String md5SignKey;
    
    /** 与包银约定的aes秘钥 **/
    @Value("${bsb.aesKey}")
    private String aesKey;
    
    /** 包银消费提供的第三方渠道代码 **/
    @Value("${bsb.chanlno}")
    private String chanlno;

    public String getServiceUrl() {
        return serviceUrl;
    }

    public String getMd5SignKey() {
        return md5SignKey;
    }

	public String getAesKey() {
		return aesKey;
	}

	public String getChanlno() {
		return chanlno;
	}
}
