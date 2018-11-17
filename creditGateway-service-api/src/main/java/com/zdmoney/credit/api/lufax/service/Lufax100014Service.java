package com.zdmoney.credit.api.lufax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.config.LufaxProperties;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100014Vo;

/**
 * @ClassName:     Lufax100001Service.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:04:44
 */
@Service
public class Lufax100014Service extends LufaxBusinessService {	
	@Autowired
    private LufaxProperties lufaxProperties;
    
    @FuncIdAnnotate(value = "lufax100014", desc = "证大调用对公虚拟户充值接口", voCls = Lufax100014Vo.class)
    public FuncResult execute(Lufax100014Vo vo) {
        //TODO
        vo.setInterfaceId("110090");
        vo.setiCode("");
        vo.setApp_id(lufaxProperties.getAppId());
        vo.setCompany_usename(lufaxProperties.getCompanyUsename());
        vo.setProduct_type(lufaxProperties.getProductType());
        return super.execute(vo);
    }

}
