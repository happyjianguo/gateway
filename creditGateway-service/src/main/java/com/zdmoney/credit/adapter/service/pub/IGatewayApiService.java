package com.zdmoney.credit.adapter.service.pub;

import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100001Vo;
import com.zdmoney.credit.framework.vo.xdsignature.input.Xdsignature100002Vo;

/**
 * Created by ym10094 on 2017/3/9.
 */
public interface IGatewayApiService {
    /**
     *接收法大大手动签章的同步响应结果
     * @param xdsignature100001Vo
     */
    public String acceptFddSynchronousExtsignResult(Xdsignature100001Vo xdsignature100001Vo);

    /**
     * 接收法大大签章异步响应结果
     * @param xdsignature100002Vo
     * @return
     */
    public String accepAsynchronousExtsignResult(Xdsignature100002Vo xdsignature100002Vo);
}
