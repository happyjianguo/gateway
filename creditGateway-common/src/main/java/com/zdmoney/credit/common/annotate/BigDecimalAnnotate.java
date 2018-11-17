package com.zdmoney.credit.common.annotate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface BigDecimalAnnotate {
	/** 功能号描述  是否需要被截取**/
	boolean isSubstring() default true;
}
