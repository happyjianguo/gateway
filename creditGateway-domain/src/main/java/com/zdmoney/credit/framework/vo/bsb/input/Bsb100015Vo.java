package com.zdmoney.credit.framework.vo.bsb.input;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.bsb.BsbBaseParamVo;
import com.zdmoney.credit.framework.vo.bsb.entity.ImgNameInfo;

/**
 * @ClassName:     Bsb100015Vo.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月7日 下午2:18:55
 */
public class Bsb100015Vo  extends BsbBaseParamVo{

	private static final long serialVersionUID = 1L;

	/** 业务申请流水号*/
	@NotEmpty(message = "业务申请流水号不能为空！")
	private String busNumber;
	
	/** 是否补件 补件时必传，02:补件*/
	private String uploadType;
	
	/** 影像资料文件地址列表*/
	@NotEmpty(message = "影像资料文件地址列表不能为空！")
	private List<ImgNameInfo> imgNameList;

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public List<ImgNameInfo> getImgNameList() {
		return imgNameList;
	}

	public void setImgNameList(List<ImgNameInfo> imgNameList) {
		this.imgNameList = imgNameList;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
	
}