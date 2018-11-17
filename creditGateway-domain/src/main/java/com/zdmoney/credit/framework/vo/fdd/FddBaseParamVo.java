package com.zdmoney.credit.framework.vo.fdd;

import com.zdmoney.credit.framework.vo.common.BaseParamVo;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * Created by ym10094 on 2017/2/23.
 * 法大大业务参数基类
 */
public class FddBaseParamVo extends BaseParamVo {
    private static final long serialVersionUID = -4110181579015895295L;
    /**
     * 接入平台id
     */
/*    private String app_id;*/
    /**
     * 请求时间 yyyyMMddHHmmss
     */
/*    @NotBlank(message = "请求时间(timestamp)不能为空")
    @Pattern(regexp = "\\d{14}",message = "(timestamp)格式不正确（yyyyMMddHHmmss）")
    private String timestamp;*/
    /**
     * 消息摘要 Base64(SHA1(appid+md5(timestamp)+SHA1(appsecret)))
     */
/*    @NotBlank(message = "消息摘要(msg_digest)不能为空")
    private String msg_digest;*/
    /**
     * 版本号
     */
    private String v = "2.0";

/*    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }*/

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

}
