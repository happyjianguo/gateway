package com.zdmoney.credit.api.fdd.service;

import com.zdmoney.credit.api.framework.service.BusinessService;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.fdd.service.pub.IFddBusinessService;
import com.zdmoney.credit.framework.vo.fdd.input.Fdd100002Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ym10094 on 2017/2/27.
 * 上传合同文件接口
 */
@Service
public class Fdd100002Service extends BusinessService {
    @Autowired
    private IFddBusinessService fddBusinessService;

    @FuncIdAnnotate(value = "fdd100002",desc = "上传签章合同文件",voCls = Fdd100002Vo.class)
    public FuncResult excute(Fdd100002Vo fdd100002Vo){

        return fddBusinessService.invokeUploadDocs(fdd100002Vo);
    }
}
