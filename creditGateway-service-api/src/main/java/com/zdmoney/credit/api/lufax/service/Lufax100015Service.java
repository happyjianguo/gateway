package com.zdmoney.credit.api.lufax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100015Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100015Service extends LufaxBusinessService {
	@Autowired
    private LufaxProperties lufaxProperties;
	
    @FuncIdAnnotate(value = "lufax100015", desc = "证大调用对公虚拟户提现请求接口", voCls = Lufax100015Vo.class)
    public FuncResult execute(Lufax100015Vo vo) {
        //TODO
        vo.setInterfaceId("120040");
        vo.setiCode("");
        vo.setLufax_user_name(lufaxProperties.getLufaxUserName());
        return super.execute(vo);
    }

}
