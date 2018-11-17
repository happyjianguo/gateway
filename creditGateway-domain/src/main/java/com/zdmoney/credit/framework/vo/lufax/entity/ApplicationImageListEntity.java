package com.zdmoney.credit.framework.vo.lufax.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.annotation.JSONField;

public class ApplicationImageListEntity {
	/**文档类型*/
    @NotEmpty(message = "文档类型不能为空！")
    private String DOCUMENT_TYPE;
    
    /**图片名称*/
    @NotEmpty(message = "图片名称不能为空！")
    private String BARCODE_NO;
    
    /**文档序号*/
    @NotEmpty(message = "文档序号不能为空！")
    private String DOCUMENT_NO;
    
    /**索引*/
    @NotEmpty(message = "索引不能为空！")
    private String URL;
    
    /**内外网*/
    @NotEmpty(message = "内外网不能为空！")
    private String NET_TYPE;
    
    /**影像类型*/
    @NotEmpty(message = "影像类型不能为空！")
    private String IMAGE_TYPE;

    @JSONField(name = "DOCUMENT_TYPE")
	public String getDOCUMENT_TYPE() {
		return DOCUMENT_TYPE;
	}

	public void setDOCUMENT_TYPE(String dOCUMENT_TYPE) {
		DOCUMENT_TYPE = dOCUMENT_TYPE;
	}

	@JSONField(name = "BARCODE_NO")
	public String getBARCODE_NO() {
		return BARCODE_NO;
	}

	public void setBARCODE_NO(String bARCODE_NO) {
		BARCODE_NO = bARCODE_NO;
	}

	@JSONField(name = "DOCUMENT_NO")
	public String getDOCUMENT_NO() {
		return DOCUMENT_NO;
	}

	public void setDOCUMENT_NO(String dOCUMENT_NO) {
		DOCUMENT_NO = dOCUMENT_NO;
	}

	@JSONField(name = "URL")
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	@JSONField(name = "NET_TYPE")
	public String getNET_TYPE() {
		return NET_TYPE;
	}

	public void setNET_TYPE(String nET_TYPE) {
		NET_TYPE = nET_TYPE;
	}

	@JSONField(name = "IMAGE_TYPE")
	public String getIMAGE_TYPE() {
		return IMAGE_TYPE;
	}

	public void setIMAGE_TYPE(String iMAGE_TYPE) {
		IMAGE_TYPE = iMAGE_TYPE;
	}
    
}
