package com.zdmoney.credit.controller.pre;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.HttpStatusException;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.AesUtil;
import com.zdmoney.credit.common.util.WebUtils;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.common.vo.ResponseInfo;
import com.zdmoney.credit.config.SystemProperties;
import com.zdmoney.credit.framework.RequestContext;
import com.zdmoney.credit.framework.controller.BaseController;
import com.zdmoney.credit.framework.funcid.FuncIdInstance;
import com.zdmoney.credit.framework.funcid.FuncIdMethod;
import com.zdmoney.credit.framework.vo.common.BaseParamVo;
import com.zdmoney.credit.framework.wrap.PreAdviceWrap;

/**
 * 外围接口前置口 （所有请求接口统一由此处进行过滤和拦截）
 * @author Ivan
 *
 */
@Controller
public class PreRequestController extends BaseController {
    
    @Autowired
    private SystemProperties systemProperties;

    /**
     * 请求前置 过滤和拦截 转发到业务方法
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/preRequest", method = RequestMethod.POST)
    @ResponseBody
    public void preRequest(HttpServletRequest request, HttpServletResponse response) {
        ResponseInfo<?> responseInfo = null;
        /** 从本地线程中获取请求包裹对象 **/
        PreAdviceWrap preAdviceWrap = RequestContext.getPreAdviceWrap();
        FuncIdInstance funcIdInstance = preAdviceWrap.getFuncIdInstance();
        /** 获取业务方法实例 **/
        FuncIdMethod funcIdMethod = funcIdInstance.getFuncIdMethod();
        /** 获取业务方法参数实例 **/
        BaseParamVo baseParamVo = funcIdInstance.getBaseParamVo();
        //用来判断请求新老业务系统
        if(StringUtils.isNotEmpty(request.getQueryString())){
            logger.info("※※※※※※※※※※※※※※※※※※※※"+request.getQueryString());
            switch(request.getParameter("sysSource")){
                case "oldAps":
                    baseParamVo.setAccessSystem("OLD_APS");
                    break;
                case "newAps":
                    baseParamVo.setAccessSystem("NEW_APS");
                    break;
                default :
                    throw new PlatformException("指定的业务系统不存在");
            }
        }
        ProjectEnum project = RequestContext.getPreAdviceWrap().getProjectEnum();
        switch(project){
            case LUFAX:
            case ABS:
            case APS:
            case XDCORE:
            case FDD:
            case XDSIGNATURE:
            case PIC:               
                try {
                    FuncResult funcResult = (FuncResult) funcIdMethod.runMethod(baseParamVo);
                    if (funcResult.getSuccess()) {
                        responseInfo = new ResponseInfo(ResponseEnum.SYS_SUCCESS);
                        responseInfo.setInfos(funcResult.getData());
                    } else {
                        responseInfo = new ResponseInfo(ResponseEnum.SYS_FAILD);
                        responseInfo.setRespDesc(funcResult.getMessage());
                    }
                } catch (PlatformException ex) {
                    ex.printStackTraceExt(logger);
                    responseInfo = ex.toResponseInfo();
                } catch (Exception ex) {
                    logger.error(ex, ex);
                }
                preAdviceWrap.getResponseWrap().write(responseInfo);
                break;
            case BSB:
                try {
                    FuncResult funcResult = (FuncResult) funcIdMethod.runMethod(baseParamVo);
                    if (funcResult.getSuccess()) {                      
                        responseInfo = new ResponseInfo(ResponseEnum.SYS_SUCCESS);
                        responseInfo.setInfos(funcResult.getData());
                        preAdviceWrap.getResponseWrap().write(responseInfo);                            
                    } else {
                        responseInfo = new ResponseInfo(ResponseEnum.SYS_FAILD);
                        logger.info("包银调用业务系统非正确响应==>响应码："+funcResult.getMessage()+"|响应内容："+funcResult.getData());
                        responseInfo.setInfos(funcResult.getData());
                        preAdviceWrap.getResponseWrap().write(responseInfo);
                        throw new HttpStatusException("包银调用网关系统出现异常");
                    }
                } catch (PlatformException e) {
                    responseInfo = new ResponseInfo(ResponseEnum.SYS_FAILD,e.getMessage());
                    preAdviceWrap.getResponseWrap().write(responseInfo);
                    throw new HttpStatusException("包银调用网关系统出现异常");
                }
                break;
            default :
                throw new PlatformException("根据请求报文没有解析到属于哪个系统");
        }
    }
    
    @RequestMapping(value = "/getImg", method = RequestMethod.GET)
    public void getImg(HttpServletRequest request, HttpServletResponse response) {
        InputStream is = null;
        try {
            Map<String, String> map = WebUtils.getParamMap();
            String picUrl = map.get("picUrl");
            picUrl = AesUtil.decryptAES(picUrl, systemProperties.getAesKey());//解密后的
            logger.info("☆☆☆☆☆☆☆☆☆☆☆☆解密后的图片地址："+picUrl);
            String[] subUrl = picUrl.split("\\.");
            String picType=subUrl[subUrl.length-1];//图片后缀类型
            /** 拼装图片地址 **/
//          String newPicUrl = systemProperties.getPicServerUrl()+deUrl;
//          logger.info("☆☆☆☆☆☆☆☆☆☆☆☆组装后的图片地址："+newPicUrl);         
            if("pdf".equalsIgnoreCase(picType)){
                response.setHeader("Content-Type", "application/pdf");
            }else if("png".equalsIgnoreCase(picType)){
                response.setHeader("Content-Type", "image/png");
            }else if("jpg".equalsIgnoreCase(picType)){
                response.setHeader("Content-Type", "image/jpeg");
            }else if("bmp".equalsIgnoreCase(picType)){
                response.setHeader("Content-Type", "application/x-bmp");
            }else if("jpeg".equalsIgnoreCase(picType)){
                response.setHeader("Content-Type", "image/jpeg");
            }else if("gif".equalsIgnoreCase(picType)){
                response.setHeader("Content-Type", "image/gif");
            }else{
                logger.info("☆☆☆☆☆☆☆☆☆☆☆☆图片后缀不支持");
                throw new HttpStatusException("包银调用网关系统出现异常");
            }
            is = new URL(picUrl).openStream();
            byte[] buff = IOUtils.toByteArray(is);
            response.getOutputStream().write(buff);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new HttpStatusException("包银调用网关系统出现异常");
        } finally{
            IOUtils.closeQuietly(is);
        }
        
    }
    
}
