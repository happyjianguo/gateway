package com.zdmoney.credit.api.fdd.service;

import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.Fdd100007Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/3/7.
 */
@Service
public class Fdd100007Service extends BusinessService {
    @Autowired
    private IFddBusinessService fddBusinessService;

    @FuncIdAnnotate(value = "fdd100007",desc = "手动签署接口",voCls = Fdd100007Vo.class)
    public FuncResult excute(Fdd100007Vo fdd100007Vo){
        return fddBusinessService.invokeExtSign(fdd100007Vo);
    }
}
