package com.zdmoney.credit.api.fdd.service;

import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.Fdd100001Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/2/23.
 */
@Service
public class Fdd100001Service extends BusinessService {
    @Autowired
    private IFddBusinessService fddBusinessService;

    @FuncIdAnnotate(value = "fdd100001", desc = "个人CA证书申请接口", voCls = Fdd100001Vo.class)
    public FuncResult execute(Fdd100001Vo fdd100001Vo) {
        return fddBusinessService.invokeSyncPersonAuto(fdd100001Vo);
    }
}
