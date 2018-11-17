package com.zdmoney.credit.common.exception;

/**
 * 返回响应状态枚举
 * @author Ivan
 *
 */
public enum ResponseEnum {
	
	/** JSON格式不正确 **/
	VALIDATE_JSON_FORMAT_ERROR("0105","JSON格式有误!{0}"),
	
	THIRD_PARTY_INTERFACE_ERROR("0222","调用第三方接口异常!{0}"),
	
	/** 请求参数不正确 **/
	VALIDATE_PARAM_VALID_ERROR("0103","{0}"),
	/** 功能号未定义 **/
	FUNC_ID_NOT_EXISTS("0104","功能号：{0} 未定义!"),
	APP_VERSION_FAIL("2101","App版本号校验失败！{0}"),
	APP_VERSION_LOW("2100","App版本号过低！{0}"),
	
	DECRYPT_FAIL("0109","解密失败! {0}"),
	REQUEST_TIMEOUT("0300","请求超时! {0}"),
	/** 签名校验不通过 **/
	SIGN_FAIL("0110","签名校验不通过! {0}"),
	FUNC_ID_CALL_ERROR("0210","功能号内部异常!{0}"),
	SYS_SUCCESS("0000","操作完成"),
	SYS_FAILD("9000","操作失败"),
	/** 未知 **/
	FULL_MSG("9001","{0}"),
	
	/** 系统编号未定义 **/
	PROJECT_NO_NOT_EXISTS("0105","系统编号：{0} 未定义!"),
	/** 没有配置IP白名单 **/
	GRANT_IP_NOT_EXISTS("0106","系统没有配置IP白名单！"),
	/** 请求IP没有授权  **/
	REQUEST_IP_NOT_GRANT("0107","请求IP：{0} 未授权！");
	
	private final String code;
	private final String desc;

	private ResponseEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
