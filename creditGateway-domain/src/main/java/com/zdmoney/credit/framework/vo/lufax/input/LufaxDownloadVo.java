/**
 * 
 */
package com.zdmoney.credit.framework.vo.lufax.input;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     LufaxUploadVo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class LufaxDownloadVo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    @NotEmpty(message = "文件key不能为空！")
    private String fileKey;

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    
}
