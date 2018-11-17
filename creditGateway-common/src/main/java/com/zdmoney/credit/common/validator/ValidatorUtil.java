package com.zdmoney.credit.common.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.groups.Default;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zdmoney.credit.common.constant.system.LogLevel;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;

public class ValidatorUtil {

    protected static Log logger = LogFactory.getLog(ValidatorUtil.class);

    static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    static Validator validator = factory.getValidator();
    
    /**
     * 校验Vo数据格式
     * @param obj
     * @return
     */
    public static boolean valid(Object obj) {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(obj, Default.class);
        for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
            throw new PlatformException(ResponseEnum.VALIDATE_PARAM_VALID_ERROR, constraintViolation.getMessage())
                    .applyLogLevel(LogLevel.WARN);
        }
        return true;
    }

    /**
     * 系统编号存在性校验
     * @param projectNo
     * @return
     */
    public static boolean validateProjectNo(String projectNo) {
        for(ProjectEnum projectEnum : ProjectEnum.values()){
            if(projectEnum.getProjectNo().equals(projectNo)){
                return true;
            }
        }
        throw new PlatformException(ResponseEnum.PROJECT_NO_NOT_EXISTS, projectNo).applyLogLevel(LogLevel.WARN);
    }
}
