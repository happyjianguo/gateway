package com.zdmoney.credit.framework.funcid;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.alibaba.fastjson.JSON;
import com.zdmoney.credit.common.constant.system.LogLevel;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.FieldUtils;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.validator.ValidatorUtil;
import com.zdmoney.credit.framework.vo.common.BaseParamVo;

/**
 * 功能号工具类
 * 
 * @author Ivan
 *
 */
public class FuncIdUtil {

    /**
     * 判断功能号是否存在
     * 
     * @param funcId
     *            功能号
     * @return
     */
    public static FuncIdMethod checkFuncIdExists(String funcId) {
        FuncIdMethod funcIdMethod = FuncIdManager.getMethod(funcId);
        if (funcIdMethod == null) {
            throw new PlatformException(ResponseEnum.FUNC_ID_NOT_EXISTS, funcId).applyLogLevel(LogLevel.WARN);
        }
        return funcIdMethod;
    }

    /**
     * 校验功能号参数格式是否异常
     * 
     * @param funcId
     *            功能号
     * @param businessParams
     *            功能号业务参数
     * @return
     */
    public static BaseParamVo checkFuncIdParams(String funcId, String businessParams) {
        businessParams = Strings.defaultValue(businessParams, "", "{}");
        FuncIdMethod funcIdMethod = checkFuncIdExists(funcId);
        Class<?> voCls = funcIdMethod.getVoCls();
        /** 将JSON字符串 转换成业务Vo **/
        BaseParamVo baseParamVo = (BaseParamVo) JSON.parseObject(businessParams, voCls);
        /** 对BigDecimal类型的数据四舍五入保留两位小数 **/
        //eidtParamVo(baseParamVo);
        /** 校验业务Vo数据格式 **/
        ValidatorUtil.valid(baseParamVo);
        return baseParamVo;
    }
    
    /**
     * 对BigDecimal类型的数据四舍五入保留两位小数
     * @param baseParamVo
     */
    private static void eidtParamVo(BaseParamVo baseParamVo) {
        Class cls = baseParamVo.getClass();
        // 获取实体类的所有属性、包括其所有父类
        Field[] fields = FieldUtils.getClassField(cls);
        for (Field field : fields) {
            String type = field.getType().getName();
            if("java.math.BigDecimal".equals(type)){
                field.setAccessible(true);
                BigDecimal value = null;
                try {
                    // 获取属性的值
                    Object obj = field.get(baseParamVo);
                    if(null != obj){
                        // 属性的值强制类型转换
                        value = (BigDecimal) field.get(baseParamVo);
                        // 数值四舍五入保留两位小数
                        value = value.setScale(2, BigDecimal.ROUND_HALF_UP);
                        // 重置属性的值
                        field.set(baseParamVo, value);
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
