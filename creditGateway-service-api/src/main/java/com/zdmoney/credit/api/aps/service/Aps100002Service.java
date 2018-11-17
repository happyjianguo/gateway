package com.zdmoney.credit.api.aps.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.ApsProperties;
import com.zdmoney.credit.framework.vo.aps.input.Aps100002Vo;

/**
 * 证大征审推送超时拒绝结果接口
 * @author 00236640
 *
 */
@Service
public class Aps100002Service extends ApsBusinessService {

    protected static Log logger = LogFactory.getLog(Aps100002Service.class);

    @Autowired
    private ApsProperties apsProperties;

    /**
     * 证大征审推送超时拒绝结果接口
     * @param vo
     * @return
     */
    @FuncIdAnnotate(value = "aps100002", desc = "证大征审推送超时拒绝结果接口", voCls = Aps100002Vo.class)
    public FuncResult execute(Aps100002Vo vo) {
        /** 征审推送超时拒绝结果接口url **/
        String requestUrl = "";
        switch(vo.getAccessSystem()){
            case "OLD_APS":
                requestUrl = apsProperties.getServiceUrl() + "/App/rpc/apsDataInfo/timeOutDays";
                break;
            case "NEW_APS":
                requestUrl = apsProperties.getNewServiceUrl() + "/api/sign/baoshangbanklimited/timeOutRefuse";
                break;
            default:
                requestUrl = apsProperties.getServiceUrl() + "/App/rpc/apsDataInfo/timeOutDays";
                break;
        }
        logger.info("※※※※※※※※※※※※※※※※※※※※" + requestUrl);
        return this.execute(vo, requestUrl);
    }
}
