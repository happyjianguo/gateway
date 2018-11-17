package com.zdmoney.credit.controller.pre;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.groups.Default;

import com.zdmoney.credit.framework.vo.abs.input.Abs100004Vo;

public class ValidatorUtils {
    
    protected static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    
    protected static Validator validator = factory.getValidator();
    
    //@Test
    public void test001(){
        Object vo = new Abs100004Vo();
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(vo,Default.class);
        for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
            System.out.println(constraintViolation.getPropertyPath() + ": "+ constraintViolation.getMessage());
        }
    }

    public static void main(String[] args) {
       
    }
}
