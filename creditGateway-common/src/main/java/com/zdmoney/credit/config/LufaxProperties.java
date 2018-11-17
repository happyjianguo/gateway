package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName:     LufaxProperties.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月18日 下午4:32:47
 */
@Component
public class LufaxProperties {
	/** 与核心系统约定的签名秘钥 **/
    @Value("${lufax.md5SignKey}")
    private String md5SignKey;

    @Value("${lufax.clientId}")
    private String clientId;
    
    @Value("${lufax.grantType}")
    private String grantType;
    
    @Value("${lufax.clientSecret}")
    private String clientSecret;
    
    @Value("${lufax.apsClientId}")
    private String apsClientId;
    
    @Value("${lufax.apsGrantType}")
    private String apsGrantType;
    
    @Value("${lufax.apsClientSecret}")
    private String apsClientSecret;
    
    
    @Value("${lufax.keyStorePassword}")
    private String keyStorePassword;
    
    @Value("${lufax.keyStoreFileName}")
    private String keyStoreFileName;
    
    @Value("${lufax.tokenUrl}")
    private String tokenUrl;
    
    @Value("${lufax.openUrl}")
    private String openUrl;
    
    @Value("${lufax.apsTokenUrl}")
    private String apsTokenUrl;
    
    @Value("${lufax.apsOpenUrl}")
    private String apsOpenUrl;
    
    @Value("${pingan.iobs.url}")
    private String iobsUrl;
    
    @Value("${pingan.iobs.accessKey}")
    private String accessKey;
    
    @Value("${pingan.iobs.secretKey}")
    private String secretKey;
    
    @Value("${pingan.iobs.bucketName}")
    private String bucketName;
    
    @Value("${lufax.lufax100014.appId}")
    private String appId;
    
    @Value("${lufax.lufax100014.companyUsename}")
    private String companyUsename;

    @Value("${lufax.lufax100014.productType}")
    private String productType;
    
    @Value("${lufax.lufax100015.lufaxUserName}")
    private String lufaxUserName;    
    
    public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getCompanyUsename() {
		return companyUsename;
	}

	public void setCompanyUsename(String companyUsename) {
		this.companyUsename = companyUsename;
	}

	public String getLufaxUserName() {
		return lufaxUserName;
	}

	public void setLufaxUserName(String lufaxUserName) {
		this.lufaxUserName = lufaxUserName;
	}

	public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    public String getKeyStoreFileName() {
        return keyStoreFileName;
    }

    public void setKeyStoreFileName(String keyStoreFileName) {
        this.keyStoreFileName = keyStoreFileName;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getOpenUrl() {
        return openUrl;
    }

    public void setOpenUrl(String openUrl) {
        this.openUrl = openUrl;
    }

    public String getIobsUrl() {
        return iobsUrl;
    }

    public void setIobsUrl(String iobsUrl) {
        this.iobsUrl = iobsUrl;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

	public String getApsClientId() {
		return apsClientId;
	}

	public void setApsClientId(String apsClientId) {
		this.apsClientId = apsClientId;
	}

	public String getApsGrantType() {
		return apsGrantType;
	}

	public void setApsGrantType(String apsGrantType) {
		this.apsGrantType = apsGrantType;
	}

	public String getApsClientSecret() {
		return apsClientSecret;
	}

	public void setApsClientSecret(String apsClientSecret) {
		this.apsClientSecret = apsClientSecret;
	}

	public String getApsTokenUrl() {
		return apsTokenUrl;
	}

	public void setApsTokenUrl(String apsTokenUrl) {
		this.apsTokenUrl = apsTokenUrl;
	}

	public String getApsOpenUrl() {
		return apsOpenUrl;
	}

	public void setApsOpenUrl(String apsOpenUrl) {
		this.apsOpenUrl = apsOpenUrl;
	}

	public String getMd5SignKey() {
		return md5SignKey;
	}

	public void setMd5SignKey(String md5SignKey) {
		this.md5SignKey = md5SignKey;
	}
}
