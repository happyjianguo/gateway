/**
 * 
 */
package com.zdmoney.credit.common.serializer;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import org.springframework.util.ReflectionUtils;

import com.alibaba.fastjson.serializer.ValueFilter;
import com.zdmoney.credit.common.annotate.BigDecimalAnnotate;

/**
 * @ClassName:     CustomBigDecimalSerializer.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年1月21日 下午8:02:45
 */
public class CustomBigDecimalSerializer implements  ValueFilter {

	@Override
	public Object process(Object object, String name, Object value) {
		try {
			Field field = ReflectionUtils.findField(object.getClass(), name, null);
			if (field != null) {
				BigDecimalAnnotate bigDecimalAnnotate = field.getAnnotation(BigDecimalAnnotate.class);
				if (bigDecimalAnnotate != null && !bigDecimalAnnotate.isSubstring()) {
					return value;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (value instanceof BigDecimal) {
			if (value == null) {
				return new BigDecimal("0");
			} else {
				return new BigDecimal(String.format("%.2f", new BigDecimal(value.toString())));
			}
		} else {
			return value;
		}
	}
}
