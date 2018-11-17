package com.zdmoney.credit.api.framework.service;

import com.zdmoney.credit.common.constant.Constant;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.framework.vo.abs.AbsBaseParamVo;

/**
 * 业务接口层Service 抽象类
 * 
 * @author Ivan
 *
 */

public abstract class BusinessService {
    
    /**
     * 接口固定参数校验
     * @param vo
     */
    public void validateAbsBaseParams(AbsBaseParamVo vo){
        // 合作机构号
        String sysSource = vo.getSysSource();
        if(Strings.isEmpty(sysSource)){
            throw new PlatformException(ResponseEnum.FULL_MSG, "合作机构号不能为空！");
        }
        if(!Constant.SYS_SOURCE.equals(sysSource)){
            throw new PlatformException(ResponseEnum.FULL_MSG, "合作机构号必须是固定值：" + Constant.SYS_SOURCE);
        }
        // 信托项目编号
        String projNo = vo.getProjNo();
        if(Strings.isEmpty(projNo)){
            throw new PlatformException(ResponseEnum.FULL_MSG, "信托项目编号不能为空！");
        }
        if(!Constant.PROJ_NO.equals(sysSource)){
            throw new PlatformException(ResponseEnum.FULL_MSG, "信托项目编号必须是固定值" + Constant.PROJ_NO);
        }
    }
}
