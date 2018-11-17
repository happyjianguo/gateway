package com.zdmoney.credit.common.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;

/***
 * 实体类公共方法
 * 
 * @author Ivan
 *
 */
public class BeanUtils {
    /***
     * Domain 、 Vo 转换成Map
     * 
     * @param bean
     * @return
     */
    public static Map<String, Object> toMap(Object bean) {
        try {
            Class type = bean.getClass();
            Map<String, Object> returnMap = new HashMap<String, Object>();
            BeanInfo beanInfo = Introspector.getBeanInfo(type);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i = 0; i < propertyDescriptors.length; i++) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                if (!propertyName.equals("class")) {
                    Method readMethod = descriptor.getReadMethod();
                    Object result = readMethod.invoke(bean, new Object[0]);
                    if (result != null) {
                        returnMap.put(propertyName, result);
                    } else {
                        returnMap.put(propertyName, "");
                    }
                }
            }
            return returnMap;
        } catch (Exception ex) {
            throw new PlatformException(ResponseEnum.FULL_MSG, ex);
        }
    }
    
    public static Map<String, Object> beanToMap(Object bean) {
        Map<String, Object> map = new HashMap<String, Object>();
        if(bean == null){
            return map;
        }
        Object value = null;
        Class cls = bean.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            try {
                value = field.get(bean);
            } catch (IllegalArgumentException e) {
                value = "";
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                value = "";
                e.printStackTrace();
            }
            map.put(field.getName(), value);
        }
        return map;
    }   
}
