package com.zdmoney.credit.fdd.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.constant.fdd.FddConstantCommon;
import com.zdmoney.credit.common.fdd.util.FddClientUtil;
import com.zdmoney.credit.common.fdd.util.FddEncryptTool;
import com.zdmoney.credit.common.fdd.util.SSLClient;
import com.zdmoney.credit.common.json.JSONUtil;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.FddProperties;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.*;
import com.zdmoney.credit.framework.vo.fdd.output.Fdd100007OutputVo;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ym10094 on 2017/2/24.
 */
@Service
public class FddBusinessServiceImpl implements IFddBusinessService{
    private static final Logger logger = LoggerFactory.getLogger(FddBusinessServiceImpl.class);
/*    @Value("${app_secret}")
    private String app_secret;
    @Value("${api_url}")
    private String api_url;*/
    @Autowired
    private FddProperties fddProperties;

    /**
     * 调用法大大个人CA证书申请接口
     * @param syncPersonAuto
     * @return
     */
    @Override
    public FuncResult invokeSyncPersonAuto(Fdd100001Vo syncPersonAuto) {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        try {
            String timeStamp = FddClientUtil.getTimeStamp();
            String msgDigest = "";
            String app_id = fddProperties.getApiId();
//            Base64(SHA1(appid+md5(timestamp)+SHA1(appsecret)))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest(timeStamp) + FddEncryptTool.sha1(fddProperties.getAppSecret()));
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));
            params.add(new BasicNameValuePair("app_id", app_id));
            params.add(new BasicNameValuePair("timestamp", timeStamp));
            params.add(new BasicNameValuePair("v", syncPersonAuto.getV()));
            params.add(new BasicNameValuePair("customer_name", syncPersonAuto.getCustomer_name()));
            params.add(new BasicNameValuePair("email", syncPersonAuto.getEmail()));
//            3des(“350202198802121811|18905926666”,app_secret)
            String id_mobile = FddEncryptTool.encrypt(syncPersonAuto.getId_card() + "|" + syncPersonAuto.getMobile(), fddProperties.getAppSecret());
            params.add(new BasicNameValuePair("id_mobile", id_mobile));
            params.add(new BasicNameValuePair("ident_type", syncPersonAuto.getIdent_type()));
            params.add(new BasicNameValuePair("msg_digest", msgDigest));
        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大个人CA证书申请接口的参数异常！");
        }
        logger.info("发送给法大大个CA证书申请接口的参数："+ JSON.toJSONString(params));
        String result = FddClientUtil.doPost(fddProperties.getApiUrl() + FddConstantCommon.URL_SYNCPERSON_AUTO.getValue(), params);
        logger.info("调用法大大个人CA证书申请接口响应结果："+result);
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if(!json.containsKey("result")){
            return FuncResult.fail("法大大个人CA证书申请接口返回结果参数异常！");
        }
        return FuncResult.success("正常", json);
    }

    @Override
    public FuncResult invokeUploadDocs(Fdd100002Vo uploadDoces) {
        String result = "";
        try {
            String timeStamp = FddClientUtil.getTimeStamp();
            String msgDigest = "";
            String app_id = fddProperties.getApiId();
            String contract_id = uploadDoces.getContract_id();
            //Base64(SHA1(app_id+md5(timestamp)+SHA1(app_secret+  contract_id )))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest(timeStamp)+FddEncryptTool.sha1(fddProperties.getAppSecret() + contract_id));
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));

            HttpClient httpclient = new SSLClient();
            HttpPost httppost = new HttpPost(fddProperties.getApiUrl() + FddConstantCommon.URL_UPLOADDOCS.getValue());
            MultipartEntity reqEntity = new MultipartEntity();  //对请求的表单域进行填充
            String contractContent = uploadDoces.getContractContent();
            String fileName = "temp.pdf";
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decodeBase64(contractContent));
            if(byteArrayInputStream!=null){
//                FileBody fileBody = new FileBody(file); //创建待处理的文件
                InputStreamBody inputStreamBody = new InputStreamBody(byteArrayInputStream,fileName);
                reqEntity.addPart("file", inputStreamBody);
            }
            String doc_url = uploadDoces.getDoc_url();
            if(doc_url!=null){
                doc_url= doc_url.replaceAll(" ", "%20");
                reqEntity.addPart("doc_url", new StringBody(doc_url));
            }
            reqEntity.addPart("contract_id", new StringBody(contract_id));
            reqEntity.addPart("doc_title", new StringBody(URLEncoder.encode(uploadDoces.getDoc_title(), FddClientUtil.charset)));
            reqEntity.addPart("doc_type", new StringBody(uploadDoces.getDoc_type()));

            reqEntity.addPart("app_id", new StringBody(app_id));  //创建待处理的表单域内容文本
            reqEntity.addPart("v", new StringBody(uploadDoces.getV()));
            reqEntity.addPart("timestamp", new StringBody(timeStamp));
            reqEntity.addPart("msg_digest", new StringBody(msgDigest));
            httppost.setEntity(reqEntity);
            logger.info("开始调用法大大上传文档接口");
            HttpResponse response = httpclient.execute(httppost);
            if(HttpStatus.SC_OK==response.getStatusLine().getStatusCode()){
                HttpEntity entity = response.getEntity();
                //显示内容
                if (entity != null) {
                    result = EntityUtils.toString(entity);
                    logger.info("发送给法大大上传文档接口的响应："+ JSON.toJSONString(result));
                    /** 接口返回结果转换成json对象 **/
                    JSONObject json = JSONObject.parseObject(result);
                    if(!json.containsKey("result")){
                        return FuncResult.fail("法大大上传文档接口返回结果参数异常！");
                    }
                  return FuncResult.success("正常", json);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大上传文档接口的参数异常@");
        }
        return FuncResult.fail("调用法大大上传文档接口失败！");
    }

    @Override
    public FuncResult invokeUploadTemplate(Fdd100003Vo uploadTemplate) {
        String result = "";
        try {
            String timeStamp = FddClientUtil.getTimeStamp();
            String app_id = fddProperties.getApiId();
            String template_id = uploadTemplate.getTemplate_id();
            String msgDigest = "";
            //Base64(SHA1(app_id+md5(timestamp)+SHA1(app_secret+  template_id )))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest(timeStamp) + FddEncryptTool.sha1(fddProperties.getAppSecret() + template_id));
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));

            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(fddProperties.getApiUrl() + FddConstantCommon.URL_UPLOADTEMP.getValue());
            MultipartEntity reqEntity = new MultipartEntity();  //对请求的表单域进行填充
            File file = uploadTemplate.getFile();
            if(file!=null){
                FileBody fileBody = new FileBody(file); //创建待处理的文件
                reqEntity.addPart("file", fileBody);
            }
            String doc_url = uploadTemplate.getDoc_url();
            if(doc_url!=null){
                doc_url= doc_url.replaceAll(" ", "%20");
                reqEntity.addPart("doc_url", new StringBody(doc_url));
            }
            reqEntity.addPart("app_id", new StringBody(app_id));  //创建待处理的表单域内容文本
            reqEntity.addPart("v", new StringBody(uploadTemplate.getV()));
            reqEntity.addPart("template_id", new StringBody(template_id));
            reqEntity.addPart("timestamp", new StringBody(timeStamp));
            reqEntity.addPart("msg_digest", new StringBody(msgDigest));
            httppost.setEntity(reqEntity);
            logger.info("开始调用法大大上传合同模板接口");
            HttpResponse response = httpclient.execute(httppost);
            if(HttpStatus.SC_OK==response.getStatusLine().getStatusCode()){
                HttpEntity entity = response.getEntity();
                //显示内容
                if (entity != null) {
                    result = EntityUtils.toString(entity);
                    logger.info("发送给法大大上传合同模板接口的响应结果："+ JSON.toJSONString(reqEntity));
                    /** 接口返回结果转换成json对象 **/
                    JSONObject json = JSONObject.parseObject(result);
                    if(!json.containsKey("result")){
                        return FuncResult.fail("法大大上传合同模板接口返回结果参数异常！");
                    }
                   return FuncResult.success("正常", json);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大上传合同模板的接口参数异常！");
        }
        return FuncResult.fail("调用法大大上传合同模板接口失败！");
    }

    @Override
    public FuncResult invokeGenerateContract(Fdd100004Vo contractParam) {
        String result = "";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        try {
            String timeStamp = FddClientUtil.getTimeStamp();
            String msgDigest = "";
            String app_id = fddProperties.getApiId();
            String template_id = contractParam.getTemplate_id();
            String contract_id = contractParam.getContract_id();
            String parameter_map = JSONUtil.mapToJson(contractParam.getParameter_map());
            //Base64(SHA1(app_id+md5(timestamp)+SHA1(app_secret+ template_id + contract_id ) +parameter_map))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest(timeStamp) + FddEncryptTool.sha1(fddProperties.getAppSecret() + template_id + contract_id) + parameter_map);
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));

            params.add(new BasicNameValuePair("app_id", app_id));
            params.add(new BasicNameValuePair("timestamp", timeStamp));
            params.add(new BasicNameValuePair("v",contractParam.getV()));
            params.add(new BasicNameValuePair("msg_digest", msgDigest));
            params.add(new BasicNameValuePair("doc_title", contractParam.getDoc_title()));
            params.add(new BasicNameValuePair("template_id", template_id));
            params.add(new BasicNameValuePair("contract_id", URLDecoder.decode(contract_id, FddClientUtil.charset)));
            params.add(new BasicNameValuePair("parameter_map", parameter_map));
            params.add(new BasicNameValuePair("font_size", contractParam.getFont_size()));
            params.add(new BasicNameValuePair("font_type", contractParam.getFont_type()));

        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大生成合同接口的参数异常！");
        }
        logger.info("发送给法大大生合同接口接口的参数："+ JSON.toJSONString(params));
        result = FddClientUtil.doPost(fddProperties.getApiUrl() + FddConstantCommon.URL_GENERATE_CONTRACT.getValue(), params);
        logger.info("调用法大大生成合同接口的响应结果："+result);
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if(!json.containsKey("result")){
            return FuncResult.fail("法大大生成合同接口返回结果参数异常！");
        }
        return FuncResult.success("正常", json);
    }

    @Override
    public FuncResult invokeContractFilling(Fdd100005Vo contractFilling) {
        String result = "";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        try {
            String timeStamp = FddClientUtil.getTimeStamp();
            String msgDigest = "";
            String app_id = fddProperties.getApiId();
            String contract_id = contractFilling.getContract_id();
            //Base64(SHA1(app_id+md5(timestamp)+SHA1(app_secret+  contract_id )))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest(timeStamp) + FddEncryptTool.sha1(fddProperties.getAppSecret() + contract_id));
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));
            params.add(new BasicNameValuePair("app_id", app_id));
            params.add(new BasicNameValuePair("timestamp", timeStamp));
            params.add(new BasicNameValuePair("v", contractFilling.getV()));
            params.add(new BasicNameValuePair("msg_digest", msgDigest));
            params.add(new BasicNameValuePair("contract_id", contract_id));
        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大合同归档接口的参数异常！");
        }
        logger.info("发送给法大大合同归档接口接口的参数："+ JSON.toJSONString(params));
        result = FddClientUtil.doPost(fddProperties.getApiUrl() + FddConstantCommon.URL_CONTRACTFILING.getValue(), params);
        logger.info("调用法大大合同归档接口的响应结果："+ JSON.toJSONString(result));
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if(!json.containsKey("result")){
            return FuncResult.fail("法大大合同归档接口返回结果参数异常！");
        }
        return FuncResult.success("正常", json);
    }

    @Override
    public FuncResult invokeExtSignAuto(Fdd100006Vo signAuto) {
        String result = "";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        try {
            String timeStamp = FddClientUtil.getTimeStamp();
            String msgDigest = "";
            String app_id = fddProperties.getApiId();
            String transaction_id = signAuto.getTransaction_id();
            String customer_id = signAuto.getCustomer_id();
            //Base64(SHA1(app_id+md5(transaction_id+timestamp) + SHA1(app_secret+ customer_id +doc_url)))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest( transaction_id + timeStamp ) + FddEncryptTool.sha1(fddProperties.getAppSecret() + customer_id));
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));

            params.add(new BasicNameValuePair("app_id", app_id));
            params.add(new BasicNameValuePair("timestamp", timeStamp));
            params.add(new BasicNameValuePair("v", signAuto.getV()));
            params.add(new BasicNameValuePair("msg_digest", msgDigest));
            params.add(new BasicNameValuePair("transaction_id", transaction_id));
            params.add(new BasicNameValuePair("batch_id", signAuto.getBatch_id()));
            params.add(new BasicNameValuePair("contract_id", signAuto.getContract_id()));
            params.add(new BasicNameValuePair("client_type", signAuto.getClient_type()));
            params.add(new BasicNameValuePair("client_role", signAuto.getClient_role()));
            params.add(new BasicNameValuePair("customer_id", signAuto.getCustomer_id()));
            params.add(new BasicNameValuePair("doc_title", signAuto.getDoc_title()));
            params.add(new BasicNameValuePair("sign_keyword", signAuto.getSign_keyword()));
            params.add(new BasicNameValuePair("notify_url", signAuto.getNotify_url()));
        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大合同自动签署接口的参数异常！");
        }
        logger.info("发送给法大大合同自动签署接口的参数："+ JSON.toJSONString(params));
        result = FddClientUtil.doPost( fddProperties.getApiUrl() + FddConstantCommon.URL_EXTSIGN_AUTO.getValue(), params);;
        logger.info("调用法大大合同自动签署接口的响应结果："+ JSON.toJSONString(result));
        /** 接口返回结果转换成json对象 **/
        JSONObject json = JSONObject.parseObject(result);
        if(!json.containsKey("result")){
            return FuncResult.fail("法大大合同自动签署接口返回结果参数异常！");
        }
        return FuncResult.success("正常", json);
    }

    @Override
    public FuncResult invokeExtSign(Fdd100007Vo sign) {
        String timeStamp = FddClientUtil.getTimeStamp();
        StringBuffer sb= new StringBuffer(fddProperties.getApiUrl() + FddConstantCommon.URL_EXTSIGN.getValue());
        try {
            String msgDigest = "";
            String app_id = fddProperties.getApiId();
            String transaction_id = sign.getTransaction_id();
            String customer_id = sign.getCustomer_id();
            String notify_url =  sign.getNotify_url();
            //Base64(SHA1(app_id+md5(transaction_id+timestamp)+SHA1(app_secret+ customer_id +doc_url)))
            String sha1 = FddEncryptTool.sha1(app_id + FddEncryptTool.md5Digest(transaction_id + timeStamp) + FddEncryptTool.sha1(fddProperties.getAppSecret() + customer_id));
            msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));

            sb.append("?timestamp=").append(timeStamp);
            sb.append("&app_id=").append(app_id);
            sb.append("&v=").append(sign.getV());
            sb.append("&msg_digest=").append(msgDigest);
            sb.append("&transaction_id=").append(transaction_id);
            sb.append("&contract_id=").append(sign.getContract_id());
            sb.append("&client_type=").append(sign.getClient_type());
            sb.append("&customer_id=").append(customer_id);
            sb.append("&doc_title=").append(URLEncoder.encode(sign.getDoc_title(), FddClientUtil.charset));
            sb.append("&sign_keyword=").append(URLEncoder.encode(sign.getSign_keyword(), FddClientUtil.charset));
            sb.append("&return_url=").append(URLEncoder.encode(sign.getReturn_url(), FddClientUtil.charset));
            if (!Strings.isEmpty(notify_url)) {
                sb.append("&notify_url=").append(URLEncoder.encode(notify_url, FddClientUtil.charset));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大合同手动签署接口的参数异常！");
        } catch (Exception e) {
            e.printStackTrace();
            return FuncResult.fail("发送给法大大合同手动签署接口的参数异常！");
        }
        Fdd100007OutputVo outputVo = new Fdd100007OutputVo();
        outputVo.setSign_url(sb.toString());
        outputVo.setResult("success");
        outputVo.setCode("0000");
        String result = JSON.toJSONString(outputVo);
        JSONObject json = JSONObject.parseObject(result);
        return FuncResult.success("正常", json);
    }
}
