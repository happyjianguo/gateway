package com.zdmoney.credit.adapter.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.adapter.service.pub.IGatewayApiService;
import com.zdmoney.credit.callinter.HttpUtils;
import com.zdmoney.credit.common.constant.adapter.GatewayFuncIdEnum;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.BusinessException;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.util.adapter.AdapterUtils;
import com.zdmoney.credit.config.FddProperties;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100001Vo;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100002Vo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by ym10094 on 2017/3/9.
 */
@Service
public class GatewayApiServiceImpl implements IGatewayApiService{
    private static final Logger logger = LoggerFactory.getLogger(GatewayApiServiceImpl.class);

    @Value("${gateway.interface.url}")
    private String gatewayUrl;
    @Autowired
    private FddProperties fddProperties;

    public <T> JSONObject invokeGatewayApi(T reqParam,GatewayFuncIdEnum gatewayFuncIdEnum,ProjectEnum projectEnum,String secret_key ) {
        String requestInfo = "";
        String rsultStr = "";
        try{
            requestInfo = AdapterUtils.getSendGatewayRequestParam(reqParam, gatewayFuncIdEnum,projectEnum,secret_key);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
            throw new BusinessException(Strings.format("生成调用网关{0}的签名异常;异常消息为：{1}", gatewayFuncIdEnum.getValue(), e.getMessage()));
        }catch (Exception e){
            e.printStackTrace();
            throw new BusinessException(Strings.format("获取发送网关{0}的vo对象异常:异常消息为：{1}",gatewayFuncIdEnum.getValue(),e.getMessage()));
        }
        try {
            logger.info(Strings.format("请求网关--{0}--url:{1}参数：{2}",gatewayFuncIdEnum.getValue(),gatewayUrl, requestInfo));
            rsultStr = HttpUtils.doRedirectJsonPost(gatewayUrl, requestInfo);
            rsultStr = URLDecoder.decode(rsultStr, "UTF-8");
            logger.info(Strings.format("请求网关--{0}--url:{1}响应：{2}",gatewayFuncIdEnum.getValue(), gatewayUrl, rsultStr));
        }catch (Exception e){
            e.printStackTrace();
            throw new BusinessException(Strings.format("调用网关{0}异常:异常消息为：{1}",gatewayFuncIdEnum.getValue(),e.getMessage()));
        }
        JSONObject jsonObject = JSON.parseObject(rsultStr);
        String resCode =  (String)jsonObject.get("resCode");
        if (!"0000".equals(resCode)) {
            String respDesc = (String)jsonObject.get("respDesc");
            throw new PlatformException(ResponseEnum.FULL_MSG, respDesc);
        }
        JSONObject infos = jsonObject.getJSONObject("infos");
        return infos;
    }

    @Override
    public String acceptFddSynchronousExtsignResult(Xdsignature100001Vo xdsignature100001Vo) {
        JSONObject infos = this.invokeGatewayApi(xdsignature100001Vo, GatewayFuncIdEnum.手动签章同步回调, ProjectEnum.FDD, fddProperties.getMd5SignKey());
        if (infos == null) {
            throw new BusinessException("无响应！请联系证大财富");
        }
        return infos.getString("html");
    }

    @Override
    public String accepAsynchronousExtsignResult(Xdsignature100002Vo xdsignature100002Vo) {
        JSONObject infos = this.invokeGatewayApi(xdsignature100002Vo, GatewayFuncIdEnum.签章异步回调, ProjectEnum.FDD, fddProperties.getMd5SignKey());
        if (infos == null) {
            throw new BusinessException("异步回调失败，无响应值！请联系证大财富！");
        }
        String status = infos.getString("result");
        if (!"success".equals(status)) {
            String msg = (String)infos.get("msg");
            throw new PlatformException(ResponseEnum.FULL_MSG,msg);
        }
        return "success";
    }
}
