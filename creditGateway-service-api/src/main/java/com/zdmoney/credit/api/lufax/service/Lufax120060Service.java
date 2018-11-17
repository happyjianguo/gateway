package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax120060Vo;

/**
 * @ClassName:     Lufax120060Service.java
 * @Description:   借款人信息采集
 * @author YM10184
 */
@Service
public class Lufax120060Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax120060", desc = "借款人信息采集", voCls = Lufax120060Vo.class)
    public FuncResult execute(Lufax120060Vo vo) {
        vo.setInterfaceId("120060");
        vo.setiCode("openapi_decrypt_information_acquisition_service");
        return super.apsExecute(vo);
    }

}
