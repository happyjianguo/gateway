package com.zdmoney.credit.fdd.service.pub;

import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.fdd.input.*;

/**
 * Created by ym10094 on 2017/2/24.
 */
public interface IFddBusinessService {
    /**
     * 调用法大大个人CA证书申请接口
     * @param syncPersonAuto
     * @return
     */
    public FuncResult invokeSyncPersonAuto(Fdd100001Vo syncPersonAuto);

    /**
     * 上传合同文件
     * @param uploadDoces
     * @return
     */
    public FuncResult invokeUploadDocs(Fdd100002Vo uploadDoces);

    /**
     * 上传合同模板
     * @param uploadTemplate
     * @return
     */
    public FuncResult invokeUploadTemplate(Fdd100003Vo uploadTemplate);

    /**
     * 根据合同模板生成合同
     * @param contractParam
     * @return
     */
    public FuncResult invokeGenerateContract(Fdd100004Vo contractParam);

    /**
     * 合同归档
     * @param contractFilling
     * @return
     */
    public FuncResult invokeContractFilling(Fdd100005Vo contractFilling);

    /**
     * 自动签署合同
     * @param signAuto
     * @return
     */
    public FuncResult invokeExtSignAuto(Fdd100006Vo signAuto);

    /**
     * 手动签章合同
     * @param sign
     * @return
     */
    public FuncResult invokeExtSign(Fdd100007Vo sign);
}