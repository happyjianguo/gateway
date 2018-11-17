package com.zdmoney.credit.framework.vo.lufax.input;

import java.util.List;

import com.zdmoney.credit.framework.vo.lufax.LufaxBaseParamVo;

/**
 * @ClassName:     Lufax100013Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Since          JDK 1.7
 * @Date           2017年4月19日 下午2:07:36
 */
public class Lufax100013Vo extends LufaxBaseParamVo {

    private static final long serialVersionUID = 1L;
    
    private String product_type;
    
    private  List<String> file_name;

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public  List<String> getFile_name() {
        return file_name;
    }

    public void setFile_name(List<String> file_name) {
        this.file_name = file_name;
    }
    
}
