package com.zdmoney.credit.api.fdd.service;

import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.Fdd100003Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/2/27.
 * 上传合同模板接口
 */
@Service
public class Fdd100003Service extends BusinessService{
    @Autowired
    private IFddBusinessService fddBusinessService;

    @FuncIdAnnotate(value = "fdd100003" ,desc = "上传合同模板接口",voCls = Fdd100003Vo.class)
    public FuncResult excute(Fdd100003Vo fdd100003Vo){
        return fddBusinessService.invokeUploadTemplate(fdd100003Vo);
    }
}
