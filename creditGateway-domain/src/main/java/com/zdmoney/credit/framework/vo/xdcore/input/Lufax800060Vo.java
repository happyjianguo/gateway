package com.zdmoney.credit.framework.vo.xdcore.input;

import java.util.List;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

public class Lufax800060Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	private String product_type;
	
	private List<String> file_name;

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public List<String> getFile_name() {
        return file_name;
    }

    public void setFile_name(List<String> file_name) {
        this.file_name = file_name;
    }
	
}
