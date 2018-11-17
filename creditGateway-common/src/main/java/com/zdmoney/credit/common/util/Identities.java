package com.zdmoney.credit.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zdmoney.credit.config.BsbProperties;

@Component
public class Identities {

	private static final String RANDOM_STRING_RANGE = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    private static final String RANDOM_NUMBER_RANGE = "0123456789";
    
    @Autowired
    private BsbProperties bsbProperties;

	/**
	 * 生成指定位数的随机字符串
	 * @param length
	 * @param isNumber
	 * @return
	 */
	private String randomString(int length, boolean isNumber){
		StringBuilder builder = new StringBuilder(isNumber ? RANDOM_NUMBER_RANGE : RANDOM_STRING_RANGE);
		StringBuilder resultBuilder = new StringBuilder();
		Random r = new Random();
		int range = builder.length();
		for(int i = 0; i < length; i++){
			resultBuilder.append(builder.charAt(r.nextInt(range)));
		}
		return resultBuilder.toString();
	}
	
	/**
	 * 生成信贷核心发起的流水号
	 * @return
	 */
	public String generateNo(){
		StringBuffer buffer = new StringBuffer();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
		String date = sdf.format(new Date());
		
		buffer.append(bsbProperties.getChanlno())
			  .append(date)
			  .append(randomString(5,true));
		
		return buffer.toString();
	}
	
}
