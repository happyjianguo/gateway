package com.zdmoney.credit.api.fdd.service;

import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.Fdd100004Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/2/27.
 */
@Service
public class Fdd100004Service extends BusinessService {
    @Autowired
    private IFddBusinessService fddBusinessService;

    @FuncIdAnnotate(value = "fdd100004",desc = "合同生成接口",voCls = Fdd100004Vo.class)
    public FuncResult excute(Fdd100004Vo fdd100004Vo){
        return fddBusinessService.invokeGenerateContract(fdd100004Vo);
    }
}
