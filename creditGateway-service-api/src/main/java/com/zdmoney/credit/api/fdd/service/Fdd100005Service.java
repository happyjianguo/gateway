package com.zdmoney.credit.api.fdd.service;

import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.Fdd100005Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/2/27.
 * 合同归档接口
 */
@Service
public class Fdd100005Service extends BusinessService {
    @Autowired
    private IFddBusinessService fddBusinessService;

    @FuncIdAnnotate(value = "fdd100005",desc = "合同归档接口",voCls = Fdd100005Vo.class)
    public FuncResult excute(Fdd100005Vo fdd100005Vo){
        return fddBusinessService.invokeContractFilling(fdd100005Vo);
    }
}
