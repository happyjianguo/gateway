package com.zdmoney.credit.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class AesUtil {

	// ("数据加密 plainTextData要加密的字符串")
	public static String encryptAES(String plainTextData, String key) throws Exception {
		// 加密数据
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(),"AES"));
		byte[] encryptedData = cipher.doFinal(plainTextData.getBytes("UTF-8"));
		return Base64.encodeBase64String(encryptedData);
	}

	// ("数据解密 encryptedData要解密的字符串")
	public static String decryptAES(String encryptedData, String key) throws Exception {
		// 解密数据
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes(), "AES"));
		byte[] decryptedData = cipher.doFinal(Base64.decodeBase64(encryptedData));
		return new String(decryptedData, "UTF-8");
	}

	public static void main(String[] args) throws Exception {
		
		String ss = encryptAES("http://10.100.40.19:8080/pic-app/file/aps/20170118130000472440/R/R-628f677fa0084784b2d05e659574f16c.jpg","7543210987654321");
		System.out.println(ss);
		String sss = java.net.URLEncoder.encode(ss, "utf-8");
		System.out.println();
		System.out.println(sss);
	}
}
