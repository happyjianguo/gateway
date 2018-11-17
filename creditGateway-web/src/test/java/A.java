import com.alibaba.fastjson.JSON;
import com.zdmoney.credit.common.fdd.util.FddEncryptTool;
import com.zdmoney.credit.common.serializer.CustomBigDecimalSerializer;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100012Vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;

public class A implements Serializable {

	@NotNull(message = "姓名不能为空！")
	private String ss = "";

/*	public static void main(String args[]) {
		StringBuffer buffer = new StringBuffer(64);// 用于存储验证后的错误信息
		A a = new A();
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

		Set<ConstraintViolation<A>> constraintViolations = validator.validate(a);// 验证某个对象,，其实也可以只验证其中的某一个属性的

		Iterator<ConstraintViolation<A>> iter = constraintViolations.iterator();
		while (iter.hasNext()) {
			String message = iter.next().getMessage();
			buffer.append(message);
		}
		System.out.println(buffer);
	}*/
	public static void  main(String[] args){
		Lufax100012Vo.RepayRecordLufax  vo  = new Lufax100012Vo.RepayRecordLufax();
		vo.setRate(new BigDecimal("0.00184000"));
		vo.setAint(new BigDecimal("0.01"));
		String jsonStr = JSON.toJSONString(vo,new CustomBigDecimalSerializer());
		System.out.println(jsonStr);
	}
}
