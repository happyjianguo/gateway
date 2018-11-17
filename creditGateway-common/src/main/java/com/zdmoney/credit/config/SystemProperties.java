package com.zdmoney.credit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置信息跟system.properties一致
 * 
 * @author Ivan
 *
 */
@Component
public class SystemProperties {

	/** 业务参数是否解密 **/
	@Value("${sys.isNeedDecryptParam}")
	private String isNeedDecryptParam;

	/** 是否检查APP版本 **/
	@Value("${sys.isCheckVersion}")
	private String isCheckVersion;

	/** 是否对响应结果进行加密 **/
	@Value("${sys.encryptResponse}")
	private String encryptResponse;

	/** 是否校验签名 **/
	@Value("${sys.isCheckSign}")
	private String isCheckSign;

	/** 签名Key **/
	@Value("${sys.md5SignKey}")
	private String md5SignKey;
	
	@Value("${sys.checkTime}")
	private int checkTime;

	/** 公钥文件 **/
	@Value("${sys.rsa.publicFile}")
	private String rsaPublicFile;

	/** 私钥文件 **/
	@Value("${sys.rsa.privateFile}")
	private String rsaPrivateFile;

	/** 响应报文格式及编码 **/
	@Value("${sys.responseContentType}")
	private String responseContentType;
	
	/** 图片key **/
	@Value("${sys.aesKey}")
	private String aesKey;

	public String getIsCheckSign() {
		return isCheckSign;
	}

	public String getMd5SignKey() {
		return md5SignKey;
	}

	public String getResponseContentType() {
		return responseContentType;
	}

	public String getRsaPublicFile() {
		return rsaPublicFile;
	}

	public String getRsaPrivateFile() {
		return rsaPrivateFile;
	}

	public String getIsNeedDecryptParam() {
		return isNeedDecryptParam;
	}

	public String getEncryptResponse() {
		return encryptResponse;
	}

	public String getIsCheckVersion() {
		return isCheckVersion;
	}

	public int getCheckTime() {
		return checkTime;
	}

	public String getAesKey() {
		return aesKey;
	}	
}
