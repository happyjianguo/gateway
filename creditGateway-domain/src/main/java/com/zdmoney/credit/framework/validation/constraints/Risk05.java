package com.zdmoney.credit.framework.validation.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @ClassName:     Risk.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年2月7日 下午3:04:08
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {Risk05Validator.class})
public @interface Risk05 {
	String message() default "风控信息[初审审批额度]缺失";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default {};
	
	String value() default "zd_risk_jstaff_credit";
		
	/**
	 * Defines several {@link Risk05} annotations on the same element.
	 *
	 * @see com.zdmoney.credit.framework.validation.constraints.Risk05
	 */
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	@interface List {
		Risk05[] value();
	}
}