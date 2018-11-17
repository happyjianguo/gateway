package com.zdmoney.credit.framework.wrap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zdmoney.credit.common.constant.system.LogLevel;
import com.zdmoney.credit.common.constant.system.ProjectEnum;
import com.zdmoney.credit.common.exception.ForbiddenException;
import com.zdmoney.credit.common.exception.PlatformException;
import com.zdmoney.credit.common.exception.ResponseEnum;
import com.zdmoney.credit.common.util.Strings;
import com.zdmoney.credit.framework.vo.request.BsbRequestVo;
import com.zdmoney.credit.framework.vo.request.ParamVo;
import com.zdmoney.credit.framework.vo.request.RequestVo;
import com.zdmoney.credit.system.service.pub.ISysParamDefineService;

/**
 * 网关系统相关校验处理类
 * @author 00236640
 *
 */
@Component
public class ValidatorWrap {

    protected static Log logger = LogFactory.getLog(ValidatorWrap.class);

    @Autowired
    private ISysParamDefineService sysParamDefineService;
    
    /**
     * 白名单校验
     * @param requestVo
     * @return
     */
    public boolean validateRequestIp(RequestVo requestVo){
        // 调用方系统编号
        String projectNo = requestVo.getProjectNo();
        // 调用方IP地址
        String requestIp = requestVo.getRequestIp();
        // 参数信息类
        ParamVo paramVo = requestVo.getParamVo();
        // 业务功能号 
        String funcId = paramVo.getFuncId();
        // 获取被调用系统的系统编号
        String calledProjectNo = this.getBeCalledProjectNo(funcId);
        if(Strings.isEmpty(calledProjectNo)){
            logger.warn("功能号："+ funcId +"未定义！");
            throw new PlatformException(ResponseEnum.FUNC_ID_NOT_EXISTS, funcId).applyLogLevel(LogLevel.WARN);
        }
        if(projectNo.equals(calledProjectNo)){
            logger.warn("调用方系统编号不能与被调用方的系统编号一致！");
            throw new PlatformException(ResponseEnum.FULL_MSG, "调用方系统编号不能与被调用方系统编号一致！").applyLogLevel(LogLevel.WARN);
        }
        // 白名单IP
        String grantIp = sysParamDefineService.getSysParamValue(projectNo, projectNo +"_grant_ip");
        // 没有配置IP白名单
        if(Strings.isEmpty(grantIp)){
            logger.warn("没有配置IP白名单！");
            throw new PlatformException(ResponseEnum.GRANT_IP_NOT_EXISTS, requestIp).applyLogLevel(LogLevel.WARN);
        }
        // IP白名单集合
        String[] grantIpArr = grantIp.split(",");
        for(String ip : grantIpArr){
            if(requestIp.equals(ip)){
                return true;
            }
        }
        // 调用方IP地址不是白名单，则抛出异常
        throw new PlatformException(ResponseEnum.REQUEST_IP_NOT_GRANT, requestIp).applyLogLevel(LogLevel.WARN);
    }
    
    public boolean validateRequestIp(BsbRequestVo bsbRequestVo){
    	// 白名单IP
        String grantIp = sysParamDefineService.getSysParamValue("bsb", "bsb_grant_ip");
        // 没有配置IP白名单
        if(Strings.isEmpty(grantIp)){
            logger.warn("没有配置IP白名单！");
            throw new PlatformException(ResponseEnum.GRANT_IP_NOT_EXISTS, bsbRequestVo.getRequestIp()).applyLogLevel(LogLevel.WARN);
        }
        // IP白名单集合
        String[] grantIpArr = grantIp.split(",");
        for(String ip : grantIpArr){
            if(bsbRequestVo.getRequestIp().equals(ip)){
                return true;
            }
        }
        // 调用方IP地址不是白名单，则抛出异常
        throw new ForbiddenException("包银系统IP：["+bsbRequestVo.getRequestIp()+"]无权限访问网关系统");
    }
    
    /**
     * 获取被调用系统的系统编号
     * @param funcId
     * @return
     */
    private String getBeCalledProjectNo(String funcId) {
        if (Strings.isEmpty(funcId)) {
            return null;
        }
        if (funcId.indexOf(ProjectEnum.ABS.getProjectNo()) >= 0) {
            return ProjectEnum.ABS.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.APS.getProjectNo()) >= 0) {
            return ProjectEnum.APS.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.XDCORE.getProjectNo()) >= 0) {
            return ProjectEnum.XDCORE.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.BSB.getProjectNo()) >= 0) {
            return ProjectEnum.BSB.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.FDD.getProjectNo()) >= 0) {
            return ProjectEnum.FDD.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.XDSIGNATURE.getProjectNo()) >= 0) {
            return ProjectEnum.XDSIGNATURE.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.WM3.getProjectNo()) >= 0) {
            return ProjectEnum.WM3.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.WM3.getProjectNo()) >= 0) {
            return ProjectEnum.WM3.getProjectNo();
        }
        if (funcId.indexOf(ProjectEnum.LUFAX.getProjectNo()) >= 0) {
            return ProjectEnum.LUFAX.getProjectNo();
        }
        return null;
    }
}
