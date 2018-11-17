/**
 * 
 */
package com.zdmoney.credit.common.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @ClassName:     BigDecimalSerializer.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年7月5日 上午9:54:39
 */
public class BigDecimalSerializer implements ObjectSerializer{

    @Override
    public void write(JSONSerializer serializer, Object object,
            Object fieldName, Type fieldType, int features) throws IOException {
        SerializeWriter out = serializer.getWriter();

        if (object == null) {
            if (out.isEnabled(SerializerFeature.WriteNullNumberAsZero)) {
                out.write('0');
            } else {
                out.writeNull();
            }
            return;
        }

        BigDecimal val = (BigDecimal) object;
        DecimalFormat fmt = new DecimalFormat("0.00");
        out.write(fmt.format(val));

        if (out.isEnabled(SerializerFeature.WriteClassName) && fieldType != BigDecimal.class && val.scale() == 0) {
            out.write('.');
        }
        
    }

}