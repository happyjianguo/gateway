package com.zdmoney.credit.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;

public class SignUtil {
    
    /**
     * 
     * @param params 参数信息
     * @param key 签名秘钥
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String md5Sign(Map<String, Object> params, String key)throws UnsupportedEncodingException {
        String string1 = createSign(params, false);
        String stringSignTemp = string1 + "&key=" + key;
        String signValue = DigestUtils.md5Hex(stringSignTemp).toUpperCase();
        return signValue;
    }

    public static String createSign(Map<String, Object> params, boolean encode) throws UnsupportedEncodingException {
        Set keysSet = params.keySet();
        Object[] keys = keysSet.toArray();
        Arrays.sort(keys);
        StringBuffer temp = new StringBuffer();
        boolean first = true;
        for (Object key : keys) {
            if (first)
                first = false;
            else {
                temp.append("&");
            }
            temp.append(key).append("=");
            Object value = params.get(key);
            String valueString = "";
            if (value != null) {
                valueString = value.toString();
            }
            if (encode)
                temp.append(URLEncoder.encode(valueString, "UTF-8"));
            else {
                temp.append(valueString);
            }
        }
        return temp.toString();
    }
}
