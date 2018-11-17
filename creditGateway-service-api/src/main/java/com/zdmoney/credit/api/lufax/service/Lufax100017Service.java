package com.zdmoney.credit.api.lufax.service;


import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.lufax.input.Lufax100017Vo;
import org.springframework.stereotype.Service;

/**
 * 证大同步正式还款计划、借据
 * Created by YM10098 on 2017/7/5.
 */
@Service
public class Lufax100017Service extends LufaxBusinessService {

    @FuncIdAnnotate(value = "lufax100017",desc = "证大同步正式还款计划借据信息", voCls = Lufax100017Vo.class)
    public FuncResult execute(Lufax100017Vo vo){
        vo.setInterfaceId("820019");
        vo.setiCode("");
        return super.execute(vo);
    }
}
