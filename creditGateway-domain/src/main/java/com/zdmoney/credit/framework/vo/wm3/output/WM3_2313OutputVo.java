package com.zdmoney.credit.framework.vo.wm3.output;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.zdmoney.credit.framework.vo.wm3.WM3BaseParamVo;
import com.zdmoney.credit.framework.vo.wm3.entity.FalseRecordListEntity;
import com.zdmoney.credit.framework.vo.wm3.entity.ResponseListWm3Entiy;
/**
 *  外贸3
 *  扣款查询响应数据[2313]
 */
public class WM3_2313OutputVo  extends WM3BaseParamVo{

	
	private static final long serialVersionUID = -8884335903391977615L;
	/**总记录数   */
	@NotNull(message = "总记录数不能为空！")
	private long pageCounts;

	List<ResponseListWm3Entiy> list = new ArrayList<ResponseListWm3Entiy>();

	public long getPageCounts() {
		return pageCounts;
	}

	public void setPageCounts(long pageCounts) {
		this.pageCounts = pageCounts;
	}

	public List<ResponseListWm3Entiy> getList() {
		return list;
	}

	public void setList(List<ResponseListWm3Entiy> list) {
		this.list = list;
	}

	
	
}
