package com.zdmoney.credit.controller.pre;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.ifre.util.HttpKit;
import com.zdmoney.credit.callinter.HttpUrlConnection;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.MD5Util;
import com.zdmoney.credit.common.util.UrlUtil;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.config.SystemProperties;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.controller.BaseController;
import com.zdmoney.credit.framework.wrap.PreAdviceWrap;

/**
 * 外围接口前置口 测试
 * 
 * @author Ivan
 *
 */
@Controller
@RequestMapping(value = "/pre")
public class PreRquestTestController extends BaseController {

    @Autowired
    SystemProperties systemProperties;
    
    @Autowired
    LufaxProperties lufaxProperties;

    @Autowired
    HttpUrlConnection httpUrlConnection;

    /**
     * 跳转测试页面
     */
    @RequestMapping(value = "/pretest")
    public ModelAndView skipTest(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        return modelAndView;
    }

    /**
     * key 生成加密
     * 
     * @throws IOException
     * @throws InvalidKeySpecException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws ClassNotFoundException
     */
    @RequestMapping(value = "/generateKey")
    @ResponseBody
    public String getGenerateKey(HttpServletRequest request, HttpServletResponse response) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException,
            InvalidKeySpecException, IOException, ClassNotFoundException {
        ResponseInfo responseinfo = null;
        String key = System.currentTimeMillis() + "";
        // String cryptographKey = RSAUtil.rsaEncrypt(key, "");
        String cryptographKey = key;
        responseinfo = new ResponseInfo(ResponseEnum.SYS_SUCCESS);
        responseinfo.setInfos(cryptographKey);
        return toResponseJSON(responseinfo);
    }

    /**
     * 签名加密
     * 
     * @throws IOException
     * @throws InvalidKeySpecException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws ClassNotFoundException
     */
    @RequestMapping(value = "/generateSign")
    @ResponseBody
    public String getGenerateSign(HttpServletRequest request, HttpServletResponse response) throws InvalidKeyException,
            NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException,
            InvalidKeySpecException, IOException, ClassNotFoundException {
        ResponseInfo responseinfo = null;
        String func_No = request.getParameter("func_no");
        String param_In = request.getParameter("param_in");
        param_In = JSONObject.toJSONString(JSONObject.parseObject(param_In, Feature.OrderedField));
        // String key = RSAUtil.rsaDecrypt(request.getParameter("key"), "");
        String key = request.getParameter("key");
        String md5SignKey = lufaxProperties.getMd5SignKey();
        String words = func_No + param_In + key + md5SignKey;
        System.out.println(words);
        String sign = MD5Util.md5Hex(words);
        responseinfo = new ResponseInfo(ResponseEnum.SYS_SUCCESS);
        responseinfo.setInfos(sign);
        return toResponseJSON(responseinfo);
    }

    /**
     * 测试提交
     * 
     * @throws IOException
     * @throws InvalidKeySpecException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws ClassNotFoundException
     */
    @RequestMapping(value = "/preSubmitTest")
    @ResponseBody
    public String preSubmitTest(HttpServletRequest request, HttpServletResponse response) throws Exception,
            NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException,
            InvalidKeySpecException, IOException, ClassNotFoundException {
        String func_No = request.getParameter("func_no");
        String param_In = request.getParameter("param_in");
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
        String key = request.getParameter("key");
        String sign = request.getParameter("sign");
        // param_In = XXTeaUtil.xxteaEncrypt(param_In, RSAUtil.rsaDecrypt(key,
        // ""));
        JSONObject param = new JSONObject();
        param.put("funcId", UrlUtil.paramEncoder(func_No));
        param.put("params", JSONObject.parseObject(param_In, Feature.OrderedField));
        param.put("key", key);
        param.put("sign", sign);
        String result = null;
        String params = param.toJSONString();
        System.out.println("params:"+params);
        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/creditGateway-web/preRequest"; // 开发环境地址
        System.out.println(url);
//        url = "http://127.0.0.1:8080/creditGateway-web/preRequest";
        System.out.println(url);
//        result = httpUrlConnection.postForEntity(url, param,String.class);

        
        result = HttpKit.post(url, params, false);
        result = UrlUtil.paramDecoder(result);
        JSONObject param_out = JSONObject.parseObject(result);

        // String infos = param_out.getJSONObject("msgEx").getString("infos");
        // infos = XXTeaUtil.xxteaDecrypt(infos, RSAUtil.rsaDecrypt(key, ""));
        // param_out.getJSONObject("msgEx").put("infos", infos);
        // infos
        // param_out.put("preInfo", preInfo);
        param_out.put("result", param_out.toJSONString());
        return param_out.toJSONString();
    }
}
