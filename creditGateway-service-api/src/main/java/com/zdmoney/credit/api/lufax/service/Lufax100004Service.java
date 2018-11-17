package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100004Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100004Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100004", desc = "陆金所ID校验接口", voCls = Lufax100004Vo.class)
    public FuncResult execute(Lufax100004Vo vo) {
        vo.setInterfaceId("100010");
        vo.setiCode("openapi_decrypt_valid_lufaxid_service");
        return super.apsExecute(vo);
    }

}
