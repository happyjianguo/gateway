package com.zdmoney.credit.api.aps.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.ApsProperties;
import com.zdmoney.credit.framework.vo.aps.input.Aps100001Vo;

/**
 * 证大征审推送资产挑选结果接口
 * @author 00236640
 *
 */
@Service
public class Aps100001Service extends ApsBusinessService {

    protected static Log logger = LogFactory.getLog(Aps100001Service.class);

    @Autowired
    private ApsProperties apsProperties;

    /**
     * 证大征审推送资产挑选结果接口
     * @param abs100001Vo
     * @return
     */
    @FuncIdAnnotate(value = "aps100001", desc = "证大征审推送资产挑选结果接口", voCls = Aps100001Vo.class)
    public FuncResult execute(Aps100001Vo vo) {
        /** 征审推送资产挑选结果接口url **/
        String requestUrl = "";
        switch(vo.getAccessSystem()){
            case "OLD_APS":
                requestUrl = apsProperties.getServiceUrl() + "/App/rpc/apsDataInfo/asyResult";
                break;
            case "NEW_APS":
                requestUrl = apsProperties.getNewServiceUrl() + "/api/sign/baoshangbanklimited/asyResult";
                break;
            default:
                requestUrl = apsProperties.getServiceUrl() + "/App/rpc/apsDataInfo/asyResult";
                break;
        }
        logger.info("※※※※※※※※※※※※※※※※※※※※" + requestUrl);
        return this.execute(vo, requestUrl);
    }
}
