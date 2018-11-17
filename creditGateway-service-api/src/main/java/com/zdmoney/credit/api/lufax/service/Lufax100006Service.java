package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100006Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100006Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100006", desc = "银行卡鉴权", voCls = Lufax100006Vo.class)
    public FuncResult execute(Lufax100006Vo vo) {
        //TODO
        vo.setInterfaceId("");
        vo.setiCode("");
        return super.execute(vo);
    }

}
