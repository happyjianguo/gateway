package com.zdmoney.credit.controller.adapter;

import com.zdmoney.credit.adapter.service.pub.IGatewayApiService;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.fdd.util.FddEncryptTool;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.config.FddProperties;
import com.zdmoney.credit.framework.controller.BaseController;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100001Vo;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100002Vo;
import com.zdmoney.credit.framework.vo.xdsignature.input.XdsignatureFddBaseParamVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * Created by ym10094 on 2017/3/9.
 * 法大大访问的api
 */
@Controller
@RequestMapping(value = "/api/fdd")
public class FddApiContrller extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(FddApiContrller.class);

    @Autowired
    private IGatewayApiService gatewayApiService;
    @Autowired
    private FddProperties fddProperties;

    /**
     * 同步返回手动签章响应
     *
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/accepSynchronousExtsignResult", method = RequestMethod.GET)
    public void accepSynchronousExtsignResult(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        Xdsignature100001Vo xdsignature100001Vo = null;
        try {
            xdsignature100001Vo = this.packXdsignature100001Vo(request);
            xdsignature100001Vo.setSignatureType("03");//客户手动签章类型为 03 参照电子签章系统定义的
            if (!this.checkSign(xdsignature100001Vo)) {
                throw new PlatformException(ResponseEnum.FULL_MSG, "msg_digest参数签名不正确！");
            }
            ;
            String result = gatewayApiService.acceptFddSynchronousExtsignResult(xdsignature100001Vo);
            PrintWriter printWriter = response.getWriter();
            printWriter.write(result);
        } catch (PlatformException pe) {
            try {
                model.put("errMsg", pe.getMessage());
                request.getRequestDispatcher("/views/error/error.jsp").forward(request, response);
            } catch (Exception ec) {
                ec.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                request.getRequestDispatcher("/views/error/500.jsp").forward(request, response);
            } catch (Exception ec) {
                ec.printStackTrace();
            }
        }
    }

    public Xdsignature100001Vo packXdsignature100001Vo(HttpServletRequest request) throws Exception {
        String transaction_id = request.getParameter("transaction_id");
        String timestamp = request.getParameter("timestamp");
        String result_code = request.getParameter("result_code");
        String result_desc = request.getParameter("result_desc");
        String msg_digest = request.getParameter("msg_digest");
        String download_url = request.getParameter("download_url");
        String viewpdf_url = request.getParameter("viewpdf_url");
        download_url = URLDecoder.decode(download_url, "utf-8");
        viewpdf_url = URLDecoder.decode(viewpdf_url, "utf-8");

        logger.info(Strings.format("接收法大大传递的参数：transaction_id:{0},timestamp{1},result_code:{2},result_desc:{3},msg_digest:{4},download_url:{5},viewpdf_url:{6}",
                transaction_id, timestamp, result_code, result_desc, msg_digest, download_url, viewpdf_url));
        Xdsignature100001Vo xdsignature100001Vo = new Xdsignature100001Vo();
        xdsignature100001Vo.setTransaction_id(transaction_id);
        xdsignature100001Vo.setTimestamp(timestamp);
        xdsignature100001Vo.setResult_code(result_code);
        xdsignature100001Vo.setResult_desc(result_desc);
        xdsignature100001Vo.setMsg_digest(msg_digest);
        xdsignature100001Vo.setDownload_url(download_url);
        xdsignature100001Vo.setViewpdf_url(viewpdf_url);
        return xdsignature100001Vo;
    }

    /**
     * 异步回调
     *
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/accepAsynchronousExtsignResult/{signatureType}", method = RequestMethod.POST)
    public String accepAsynchronousExtsignResult(@PathVariable String signatureType, HttpServletRequest request, HttpServletResponse response) {
        Xdsignature100002Vo xdsignature100002Vo = null;
        String result = "failure";
        try {
            xdsignature100002Vo = this.packXdsignature100002Vo(request);
            xdsignature100002Vo.setSignatureType(signatureType);
            if (!this.checkSign(xdsignature100002Vo)) {
                logger.info("签名校验失败！");
                return result;
            }
            result = gatewayApiService.accepAsynchronousExtsignResult(xdsignature100002Vo);
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
        return result;
    }

    public Xdsignature100002Vo packXdsignature100002Vo(HttpServletRequest request) throws Exception {
        String transaction_id = request.getParameter("transaction_id");
        String timestamp = request.getParameter("timestamp");
        String result_code = request.getParameter("result_code");
        String result_desc = request.getParameter("result_desc");
        String msg_digest = request.getParameter("msg_digest");
        String download_url = request.getParameter("download_url");
        String viewpdf_url = request.getParameter("viewpdf_url");
        download_url = URLDecoder.decode(download_url, "utf-8");
        viewpdf_url = URLDecoder.decode(viewpdf_url, "utf-8");

        logger.info(Strings.format("接收法大大传递的参数：transaction_id:{0},timestamp{1},result_code:{2},result_desc:{3},msg_digest:{4},download_url:{5},viewpdf_url:{6}",
                transaction_id, timestamp, result_code, result_desc, msg_digest, download_url, viewpdf_url));
        Xdsignature100002Vo xdsignature100002Vo = new Xdsignature100002Vo();
        xdsignature100002Vo.setTransaction_id(transaction_id);
        xdsignature100002Vo.setTimestamp(timestamp);
        xdsignature100002Vo.setResult_code(result_code);
        xdsignature100002Vo.setResult_desc(result_desc);
        xdsignature100002Vo.setMsg_digest(msg_digest);
        xdsignature100002Vo.setDownload_url(download_url);
        xdsignature100002Vo.setViewpdf_url(viewpdf_url);
        return xdsignature100002Vo;
    }

    public boolean checkSign(XdsignatureFddBaseParamVo paramVo) throws Exception {
        logger.info("获取到打签名为：" + paramVo.getMsg_digest());
        String sha1 = FddEncryptTool.sha1(fddProperties.getApiId() + FddEncryptTool.md5Digest(paramVo.getTimestamp()) + FddEncryptTool.sha1(fddProperties.getAppSecret() + paramVo.getTransaction_id()));
        String msgDigest = new String(FddEncryptTool.Base64Encode(sha1.getBytes()));
        logger.debug("对应的签名串为：{}", msgDigest);
        if (msgDigest.equals(paramVo.getMsg_digest())) {
            return true;
        }
        return false;
    }
}

