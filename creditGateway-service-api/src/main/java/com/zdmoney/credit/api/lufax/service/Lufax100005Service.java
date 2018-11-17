package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100005Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100005Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100005", desc = "外部机构通知进件接口", voCls = Lufax100005Vo.class)
    public FuncResult execute(Lufax100005Vo vo) {
        //TODO
        vo.setInterfaceId("");
        vo.setiCode("openapi_decrypt_notify_org_service");
        return super.apsExecute(vo);
    }

}
