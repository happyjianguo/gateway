package com.zdmoney.credit.api.lufax.service;

import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100013Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100013Service extends LufaxBusinessService {
    
    @FuncIdAnnotate(value = "lufax100013", desc = "文件通知接口（证大->交易核算）", voCls = Lufax100013Vo.class)
    public FuncResult execute(Lufax100013Vo vo) {
        //TODO
        vo.setInterfaceId("800070");
        vo.setiCode("");
        return super.execute(vo);
    }

}
