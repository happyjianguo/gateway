package com.zdmoney.credit.common.util.adapter;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.constant.adapter.GatewayFuncIdEnum;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.MD5Util;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.RequestInfo;
import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;

/**
 * Created by ym10094 on 2017/3/9.
 */
public class AdapterUtils {
    private static Logger logger = Logger.getLogger(AdapterUtils.class);
    /**
     *获取发送网关的签名串
     * @param funcId
     * @param params
     * @param key
     * @param secretKey
     * @param <T>
     * @return
     * @throws UnsupportedEncodingException
     */
    public static <T> String getSign(String funcId ,T params,String key,String secretKey ) throws UnsupportedEncodingException {
        String encryptStr = "";
        if (Strings.isEmpty(funcId)) {
            throw new PlatformException(ResponseEnum.FULL_MSG, "业务功能号不能为空");
        }
        if (Strings.isEmpty(params)) {
            throw new PlatformException(ResponseEnum.FULL_MSG, "加密参数不能为空");
        }
        if (Strings.isEmpty(key)) {
            throw new PlatformException(ResponseEnum.FULL_MSG, "加密参数不能为空");
        }
        if (Strings.isEmpty(secretKey)) {
            throw new PlatformException(ResponseEnum.FULL_MSG, "密钥不能为空");
        }
        encryptStr = funcId+ JSONObject.toJSONString(params)+key+secretKey;
        logger.debug("params:"+ JSONObject.toJSONString(params));
        logger.debug("encryptStr:"+encryptStr);
        return MD5Util.md5Hex(encryptStr);
    }

    /**
     * RequestParamVo
     * @param reqParam
     * @param gatewayFuncIdEnum
     * @param projectEnum
     * @param secret_key
     * @param <T>
     * @return
     * @throws UnsupportedEncodingException
     */
    public static<T> String getSendGatewayRequestParam(T reqParam,GatewayFuncIdEnum gatewayFuncIdEnum,ProjectEnum projectEnum,String secret_key) throws UnsupportedEncodingException {
        RequestInfo.GatewayRequest<T> gatewayRequestVo = RequestInfo.getGatewayRequest();
        gatewayRequestVo.setRequestId(projectEnum.getProjectNo() + System.currentTimeMillis());
        gatewayRequestVo.setProjectNo(projectEnum.getProjectNo());
        gatewayRequestVo.setReqParam(reqParam);
        RequestInfo requestInfoVo = new RequestInfo();
        String funcId = gatewayFuncIdEnum.getCode();
        String key = String.valueOf(System.currentTimeMillis());
        String sign = AdapterUtils.getSign(funcId, gatewayRequestVo, key,secret_key);
        System.out.println("签名串：" + sign);
        requestInfoVo.setParams(gatewayRequestVo);
        requestInfoVo.setSign(sign);
        requestInfoVo.setFuncId(funcId);
        requestInfoVo.setKey(key);
        return JSONObject.toJSONString(requestInfoVo);
    }
}
