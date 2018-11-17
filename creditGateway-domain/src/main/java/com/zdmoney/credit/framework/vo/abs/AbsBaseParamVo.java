package com.zdmoney.credit.framework.vo.abs;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.zdmoney.credit.common.constant.Constant;
import com.zdmoney.credit.framework.vo.common.BaseParamVo;

/**
 * 数信系统业务参数基类
 * @author 00236640
 *
 */
public class AbsBaseParamVo extends BaseParamVo {

    private static final long serialVersionUID = -4110181579015235295L;
    
    /** 合作机构号 **/
    @NotBlank(message = "合作机构号不能为空！")
    @Pattern(regexp=Constant.SYS_SOURCE,message="合作机构号必须是固定值:"+Constant.SYS_SOURCE)
    private String sysSource;
    
    /** 信托项目编号 **/
    @NotBlank(message = "信托项目编号不能为空！")
    @Pattern(regexp=Constant.PROJ_NO,message="信托项目编号必须是固定值:"+Constant.PROJ_NO)
    private String projNo;

    public String getSysSource() {
        return sysSource;
    }

    public void setSysSource(String sysSource) {
        this.sysSource = sysSource;
    }

    public String getProjNo() {
        return projNo;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo;
    }
}
