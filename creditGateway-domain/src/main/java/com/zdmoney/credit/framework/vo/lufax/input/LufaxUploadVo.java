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
public class LufaxUploadVo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    @NotEmpty(message = "文件名称不能为空！")
    private String fileName;
    
    @NotEmpty(message = "文件内容不能为空！")
    private byte[] fileContent;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileContent() {
      return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
      this.fileContent = fileContent;
    }

}
