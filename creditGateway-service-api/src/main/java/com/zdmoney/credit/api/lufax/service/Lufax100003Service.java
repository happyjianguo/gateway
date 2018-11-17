package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100003Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100003Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100003", desc = "确认合同接口", voCls = Lufax100003Vo.class)
    public FuncResult execute(Lufax100003Vo vo) {
        //TODO
        vo.setInterfaceId("");
        vo.setiCode("openapi_decrypt_confirm_contract_service");
        
        return super.apsExecute(vo);
    }

}
