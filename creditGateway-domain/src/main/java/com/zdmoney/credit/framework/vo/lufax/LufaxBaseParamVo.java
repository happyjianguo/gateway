package com.zdmoney.credit.framework.vo.lufax;

import com.alibaba.fastjson.annotation.JSONField;
import com.zdmoney.credit.framework.vo.common.BaseParamVo;

/**
 * @ClassName:     LufaxBaseParamVo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月18日 下午4:38:14
 */
public class LufaxBaseParamVo  extends BaseParamVo {

	private static final long serialVersionUID = 1L;
	
	/**  接口编号 */
    @JSONField(serialize = false)
    private String interfaceId;
    
    /**  进件接口编号 */
    @JSONField(serialize = false)
    private String iCode;

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getiCode() {
        return iCode;
    }

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

}
