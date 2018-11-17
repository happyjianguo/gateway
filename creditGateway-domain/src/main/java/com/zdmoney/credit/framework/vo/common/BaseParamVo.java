package com.zdmoney.credit.framework.vo.common;

import java.io.Serializable;

import com.zdmoney.credit.common.constant.Constant;

/**
 * 业务参数基类
 * 
 * @author Ivan
 *
 */
public class BaseParamVo implements Serializable {

    private static final long serialVersionUID = 8251939043126669854L;
    
    /** 合作方机构码 **/
    public final static String SYS_SOURCE = Constant.SYS_SOURCE;
    
    /** 信托项目编号 **/
    public final static String PROJ_NO = Constant.PROJ_NO;
    
    /** 外贸3合作机构号 **/
    public final static String SYS_SOURCE_WM3 = Constant.SYS_SOURCE_WM3;
    
    /** 外贸3 信托项目编号 **/
    public final static String PROJ_NO_WM3 = Constant.PROJ_NO_WM3;
    
    /** 陆金所机构号 **/
    public final static String DEP_NO_LUFAX = Constant.DEP_NO_LUFAX;
    
    /** 陆金所还款方式 **/
    public final static String REPAYMENT_TYPE_LUFAX = Constant.REPAYMENT_TYPE_LUFAX;
    
    public String accessSystem = "DEFAULT";

    public String getAccessSystem() {
        return accessSystem;
    }

    public void setAccessSystem(String accessSystem) {
        this.accessSystem = accessSystem;
    }
    
    
}
