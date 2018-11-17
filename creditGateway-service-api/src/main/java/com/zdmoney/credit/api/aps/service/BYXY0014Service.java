package com.zdmoney.credit.api.aps.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.ApsProperties;
import com.zdmoney.credit.framework.vo.aps.input.BYXY0014Vo;

/**
 * @ClassName:     BYXY0014Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:13:02
 */
@Service
public class BYXY0014Service extends ApsBusinessService {

    protected static Log logger = LogFactory.getLog(BYXY0014Service.class);

    @Autowired
    private ApsProperties apsProperties;

    /**
     * 授信结果通知
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "BYXY0014", desc = "授信结果通知", voCls = BYXY0014Vo.class)
    public FuncResult execute(BYXY0014Vo vo) {
        /*String requestUrl = "http://172.16.230.38:8080/aps-app/App/rpc/apsByDataExchange/byWindControlAuditCallBack";*/
        String requestUrl = "";
        switch(vo.getAccessSystem()){
            case "OLD_APS":
                requestUrl = apsProperties.getServiceUrl() + "/App/rpc/apsByDataExchange/byWindControlAuditCallBack";
                break;
            case "NEW_APS":
                requestUrl = apsProperties.getNewServiceUrl() + "/api/sign/baoshangbanklimited/riskManagementNotice";
                break;
            default:
                requestUrl = apsProperties.getServiceUrl() + "/App/rpc/apsByDataExchange/byWindControlAuditCallBack";
                break;
        }
        logger.info("※※※※※※※※※※※※※※※※※※※※" + requestUrl);
        return this.execute2(vo, requestUrl);
    }
}
