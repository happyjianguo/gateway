package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100007Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100007Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100007", desc = "证大签约后推送还款计划和资金分配计划", voCls = Lufax100007Vo.class)
    public FuncResult execute(Lufax100007Vo vo) {
        //TODO
        vo.setInterfaceId("");
        vo.setiCode("");
        return super.execute(vo);
    }

}
