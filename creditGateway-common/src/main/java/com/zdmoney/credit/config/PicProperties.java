package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName:     PicProperties.java
 * @Description:   
 * @author         qis
 * @version        V1.0  
 * @Since          JDK 1.7
 */
@Component
public class PicProperties {
	/** 与核心系统约定的签名秘钥 **/
    @Value("${pic.md5SignKey}")
    private String md5SignKey;

	public String getMd5SignKey() {
		return md5SignKey;
	}

	public void setMd5SignKey(String md5SignKey) {
		this.md5SignKey = md5SignKey;
	}

    
}
