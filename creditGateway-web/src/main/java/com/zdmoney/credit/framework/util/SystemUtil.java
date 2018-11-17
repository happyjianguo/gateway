package com.zdmoney.credit.framework.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.framework.RequestContext;

/**
 * @ClassName:     SystemUtil.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月6日 下午4:38:56
 */
public class SystemUtil {
	
	protected static Log logger = LogFactory.getLog(SystemUtil.class);
	
	public static ProjectEnum getProjectEnum(HttpServletRequest request){
    	String requestContent = getRequestParams(request);
    	JSONObject reqJson=JSONObject.parseObject(requestContent);
    	if("lufaxupload".equals(reqJson.get("funcId"))){
    		logger.info("★★★★★★★★★★图片系统发送过来的请求报文前500位: " + requestContent.substring(0, 500));
    	}else{
    		logger.info("★★★★★★★★★★业务系统发送过来的请求报文: " + requestContent);
    	}
//    	logger.info("★★★★★★★★★★业务系统发送过来的请求报文: " + requestContent);
    	RequestContext.getPreAdviceWrap().setRequestContent(requestContent);
    	JSONObject jsonObj = JSONObject.parseObject(requestContent);
    	for(Entry<String, Object> data:jsonObj.entrySet()){
    		if(ProjectEnum.nodeOf(data.getKey()) != null){
    			ProjectEnum projectEnum = ProjectEnum.nodeOf(data.getKey());
    			RequestContext.getPreAdviceWrap().setProjectEnum(projectEnum);
    			return projectEnum;
    		}
    	}
		return null;
    }
    
    /**
     * 获取请求字符串参数
     * @param request
     * @return
     */
    public static String getRequestParams(HttpServletRequest request) {
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        StringBuilder builder = new StringBuilder();
        try {
            inputStream = request.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bufferedReader) {
                    bufferedReader.close();
                }
                if (null != inputStream) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }

}
