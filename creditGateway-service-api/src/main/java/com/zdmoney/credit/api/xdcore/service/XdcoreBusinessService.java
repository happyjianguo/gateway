package com.zdmoney.credit.api.xdcore.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pingan.iobs.sdk.common.Config;
import com.pingan.iobs.sdk.model.Response;
import com.pingan.iobs.sdk.service.IobsService;
import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;
import com.zdmoney.credit.system.service.HttpUtilService;

@Service
public class XdcoreBusinessService extends BusinessService {

    @Autowired
    private HttpUtilService httpUtilService;
    
    @Autowired
    private LufaxProperties lufaxProperties;
    
    /**
     * 从陆金所IOBS系统下载文件
     * @param fileKey
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    protected JSONObject download(String fileKey) throws IllegalStateException, IOException {
        // 初始化AK、sk
        Config.ACCESS_KEY = lufaxProperties.getAccessKey();
        Config.SECRET_KEY = lufaxProperties.getSecretKey();
        // 初始化访问域名
        Config.HOST = lufaxProperties.getIobsUrl();
        
        // 下载的bucket
        String bucketName = lufaxProperties.getBucketName();
        // 2、下载-获取文件流形式
        Response response = new IobsService().downloadPrivateRs(bucketName, fileKey);
        
        JSONObject lastObj = new JSONObject();
        switch(response.code()){
            case HttpStatus.SC_OK :
                InputStream is = response.downloadFileStream();
                byte[] buff = IOUtils.toByteArray(is);
                String decryptContent = new String(Base64.decodeBase64(buff),"UTF-8");
                String fileContent = StringUtils.normalizeSpace(decryptContent);
                lastObj.put("file", fileContent);
                lastObj.put("HttpStatus", HttpStatus.SC_OK);
                lastObj.put("httpContent", "下载成功");
                break;
            case HttpStatus.SC_BAD_REQUEST :
                lastObj.put("HttpStatus", HttpStatus.SC_BAD_REQUEST);
                lastObj.put("httpContent", "请求报文格式错误");
                break;
            case HttpStatus.SC_UNAUTHORIZED :
                lastObj.put("HttpStatus", HttpStatus.SC_UNAUTHORIZED);
                lastObj.put("httpContent", "下载凭证无效");
                break;
            case HttpStatus.SC_NOT_FOUND :
                lastObj.put("HttpStatus", HttpStatus.SC_NOT_FOUND);
                lastObj.put("httpContent", "请求资源不存在，一般为bucket错误或者不存在");
                break;
            case 599 :
                lastObj.put("HttpStatus", 599);
                lastObj.put("httpContent", "服务端操作失败[如遇此错误，请将完整错误信息（包括所有HTTP响应头部）通过邮件发送给IOBS项目组]");
                break;
            case 612 :
                lastObj.put("HttpStatus", 612);
                lastObj.put("httpContent", "指定资源不存在或已被删除");
                break;
            default :
                throw new PlatformException("IOBS系统返回了未知的HttpStatus");
        }
        return lastObj;
    }

    /**
     * 调用信贷核心系统接口通用方法
     * @param vo
     * @param url
     * @return
     */
    public FuncResult execute(XdcoreBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用信贷核心接口 **/
        result = httpUtilService.postToXdcore(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用信贷核心接口异常！");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if (!json.containsKey("resCode")) {
            return FuncResult.fail("信贷核心接口返回结果参数异常！");
        }
        /** 返回状态码，000000是正常，其余都是异常 **/
        /*String resCode = json.getString("resCode");
        if (!"000000".equals(resCode)) {
            return FuncResult.fail(json.getString("resMsg"));
        }*/
        /** 核心接口返回具体结果信息 **/
        Object attachment = json.get("attachment");
        return FuncResult.success("正常", attachment);
    }
    
    /**
     * 包银调用信贷核心系统接口通用方法
     * @param vo
     * @param url
     * @return
     */
    public FuncResult execute2(XdcoreBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用信贷核心接口 **/
        result = httpUtilService.postToXdcore(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用信贷核心接口异常！","响应报文为空");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if (!json.containsKey("resCode")) {
            return FuncResult.fail("用信贷核心接口异常！","返回结果参数不对");
        }
        /** 返回状态码，000000是正常，其余都是异常 **/
        String resCode = json.getString("resCode");
        if (!"000000".equals(resCode)) {
            return FuncResult.fail(json.getString("resMsg"));
        }
        /** 核心接口返回具体结果信息 **/
        Object attachment = json.get("attachment");
        return FuncResult.success("正常", attachment);
    }
    
    /**
     * 陆金所调用信贷核心系统
     * @param jso
     * @param url
     * @return
     */
    protected FuncResult lufaxExecute(JSONObject jso, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = jso.toJSONString();
        /** 调用信贷核心接口 **/
        result = httpUtilService.postToXdcore(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用信贷核心接口异常，响应报文为空！");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        /*if (!json.containsKey("resCode")) {
            return FuncResult.fail("用信贷核心接口异常！","返回结果参数不对");
        }
        *//** 返回状态码，000000是正常，其余都是异常 **//*
        String resCode = json.getString("resCode");
        if (!"000000".equals(resCode)) {
            return FuncResult.fail(resCode,json.getString("resMsg"));
        }
        *//** 核心接口返回具体结果信息 **//*
        Object attachment = json.get("attachment");*/
        return FuncResult.success(json);
    }
    
    /**
     * 陆金所调用信贷核心系统
     * @param jso
     * @param url
     * @return
     */
    public FuncResult lufaxCoreExecute(XdcoreBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用信贷核心接口 **/
        result = httpUtilService.postToXdcore(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用信贷核心接口异常，响应报文为空！");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        return FuncResult.success(json);
    }
    
    /**
     * 陆金所调用征审
     * @param vo
     * @param url
     * @return
     */
    public FuncResult lufaxApsExecute(XdcoreBaseParamVo vo, String url) {
        /** 调用接口返回数据 **/
        String result = null;
        String jsonData = JSONObject.toJSONString(vo);
        /** 调用征审接口 **/
        result = httpUtilService.postToApsFromLufax(url, jsonData);
        if (Strings.isEmpty(result)) {
            return FuncResult.fail("调用征审接口异常，响应报文为空！");
        }
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        /** 调用征审接口返回成功 **/
        return FuncResult.success(json);
    }
}
