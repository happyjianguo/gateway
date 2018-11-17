package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100002Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100002Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100002", desc = "状态查询接口", voCls = Lufax100002Vo.class)
    public FuncResult execute(Lufax100002Vo vo) {
        //TODO
        vo.setInterfaceId("");
        vo.setiCode("openapi_decrypt_status_query");
        return super.execute(vo);
    }

}
