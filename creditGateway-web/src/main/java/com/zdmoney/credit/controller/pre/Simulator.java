package com.zdmoney.credit.controller.pre;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.alibaba.fastjson.JSONObject;
import com.ifre.util.HttpKit;
import com.ifre.util.SignUtil;
import com.zdmoney.credit.common.util.BeanUtils;
import com.zdmoney.credit.framework.vo.abs.entity.BuyBackEntity;
import com.zdmoney.credit.framework.vo.abs.entity.DeduteResultEntity;
import com.zdmoney.credit.framework.vo.abs.entity.FeeReduceEntity;
import com.zdmoney.credit.framework.vo.abs.entity.PayOverEntity;
import com.zdmoney.credit.framework.vo.abs.input.Abs100004Vo;
import com.zdmoney.credit.framework.vo.abs.input.Abs100005Vo;
import com.zdmoney.credit.framework.vo.abs.input.Abs100006Vo;
import com.zdmoney.credit.framework.vo.xdcore.entity.ButBackEntity;
import com.zdmoney.credit.framework.vo.xdcore.input.Xdcore100003Vo;
import com.zdmoney.credit.framework.vo.xdcore.input.Xdcore100004Vo;

public class Simulator {
    
    //@Test
    public void test008(){
        Xdcore100004Vo vo = new Xdcore100004Vo();
        List<ButBackEntity> listBuyBack = new ArrayList<ButBackEntity>();
        ButBackEntity e = new ButBackEntity();
        e.setPactNo("ZDB234824785666");
        e.setCustName("郭睦敏");
        e.setRepAmt(new BigDecimal("1532.36"));
        e.setRepIntst(new BigDecimal("67.64"));
        e.setTxDate("20161201");
        listBuyBack.add(e);
        e = new ButBackEntity();
        e.setPactNo("ZDB234824785668");
        e.setCustName("汪宁");
        e.setRepAmt(new BigDecimal("2532.36"));
        e.setRepIntst(new BigDecimal("87.64"));
        e.setTxDate("20161202");
        listBuyBack.add(e);
        vo.setListBuyBack(listBuyBack);
        Map<String, Object> map = BeanUtils.toMap(vo);
        String jsonData = JSONObject.toJSONString(map);
        System.out.println(jsonData);
    }
    
    //@Test
    public void test007() {
        Abs100004Vo vo = new Abs100004Vo();
        List<FeeReduceEntity> list = new ArrayList<FeeReduceEntity>();
        FeeReduceEntity e = new FeeReduceEntity();
        e.setPactNo("ZDB234824785666");
        e.setRefAmt(new BigDecimal(1532.3));
        e.setRefInte(new BigDecimal(56.2));
        e.setRefOver(new BigDecimal(21.5));
        e.setRefFee(new BigDecimal(0.0));
        list.add(e);
        e = new FeeReduceEntity();
        e.setPactNo("ZDB234824785668");
        e.setRefAmt(new BigDecimal(1632.3));
        e.setRefInte(new BigDecimal(126.2));
        e.setRefOver(new BigDecimal(86.7));
        e.setRefFee(new BigDecimal(0.0));
        list.add(e);
        vo.setListFeeReduce(list);
        Map<String, Object> map = BeanUtils.toMap(vo);
        String jsonData = JSONObject.toJSONString(map);
        System.out.println(jsonData);
    }
    
    //@Test
    public void test006() {
        Abs100005Vo vo = new Abs100005Vo();
        List<PayOverEntity> list = new ArrayList<PayOverEntity>();
        PayOverEntity e = new PayOverEntity();
        e.setCnt(2);
        e.setTxPayOver(new BigDecimal(124.6));
        list.add(e);
        e = new PayOverEntity();
        e.setCnt(3);
        e.setTxPayOver(new BigDecimal(0.0));
        list.add(e);
        vo.setListPayOver(list);
        Map<String, Object> map = BeanUtils.toMap(vo);
        String jsonData = JSONObject.toJSONString(map);
        System.out.println(jsonData);
    }
    
    //@Test
    public void test005(){
        Abs100006Vo vo = new Abs100006Vo();
        List<BuyBackEntity> buyList = new ArrayList<BuyBackEntity>();
        BuyBackEntity e = new BuyBackEntity();
        e.setPactNo("ZDB20110012000025");
        e.setRepAmt(new BigDecimal(2326.8));
        buyList.add(e);
        e = new BuyBackEntity();
        e.setPactNo("ZDB20110012000028");
        e.setRepAmt(new BigDecimal(3326.2));
        buyList.add(e);
        vo.setListBuyBack(buyList);
        Map<String,Object> map = BeanUtils.toMap(vo);
        String jsonData = JSONObject.toJSONString(map);
        System.out.println(jsonData);
    }
    
    //@Test
    public void test004(){
        DeduteResultEntity vo = new DeduteResultEntity();
        Map<String,Object> map = BeanUtils.toMap(vo);
        String jsonData = JSONObject.toJSONString(map);
        System.out.println(jsonData);
    }

    public static void main(String[] args) {
        try {
            Simulator.ifreInterfaceTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //@Test
    public void test002(){
        Xdcore100003Vo vo = new Xdcore100003Vo();
        vo.setPactNO("ZDB20161123000001");
        vo.setAcName("郭睦敏");
        vo.setAcNo("6284587675654436");
        vo.setOpnCode("105");
        vo.setOpnName("中国建设银行");
        vo.setSerialNo("476356756");
        vo.setPayOver(new BigDecimal(124.65).setScale(2, BigDecimal.ROUND_HALF_UP));
        vo.setFeeRec(new BigDecimal(0.0));
        vo.setRepayTotal(new BigDecimal(2124.65).setScale(2, BigDecimal.ROUND_HALF_UP));
        vo.setRepayAmt(new BigDecimal(1500));
        vo.setRepayInte(new BigDecimal(500));
        vo.setRepayOver(new BigDecimal(124.65).setScale(2, BigDecimal.ROUND_HALF_UP));
        vo.setFeeTotal(new BigDecimal(0.0));
        vo.setDealSts("1");
        vo.setDealDesc("提前结清申请通过！");
        //Map<String,Object> map = BeanUtils.beanToMap(vo);
        String jsonData = JSONObject.toJSONString(vo);
        System.out.println(jsonData);
    }
    
//    @Test
    public void test001(){
        String jsonData = "{\"content\":{\"sysSource\":\"A02\",\"prePactNo\":\"000A040100000120161001000000000000000001\",\"projNo\":\"13579\",\"prdtNo\":\"C\",\"pactAmt\":\"40000\",\"lnRate\":\"0.93\",\"appArea\":\"110000\",\"appUse\":\"资金周转\",\"termMon\":\"3\",\"termDay\":\"0\",\"vouType\":\"4\",\"payType\":\"01\",\"custName\":\"许披瘦\",\"idType\":\"0\",\"idNo\":\"110224199004266593\",\"custType\":\"01\",\"sex\":\"1\",\"birth\":\"32989\",\"age\":\"26\",\"marriage\":\"21\",\"children\":\"0\",\"edu\":\"20\",\"degree\":\"2\",\"graduationTime\":\"41091\",\"telNo\":\"66613639\",\"phoneNo\":\"15141245885\",\"homeArea\":\"110000\",\"homeSts\":\"9\",\"income\":\"49842.42\",\"workYear\":\"4\",\"totalMonthlyIncome\":\"49842.42\",\"privateOwnersFlag\":\"0\",\"ifCar\":\"1\",\"ifCarCred\":\"1\",\"ifRoom\":\"1\",\"ifMort\":\"2\",\"ifCard\":\"1\",\"cardAmt\":\"0\",\"contactRelation\":\"配偶\",\"contactGender\":\"1\",\"ifKnowLoan\":\"0\",\"approvalApplyLimit\":\"40000\",\"approvalApplyTerm\":\"3\",\"approvalLimit\":\"40000\",\"approvalTerm\":\"3\",\"approvalMonthPay\":\"13706.67\",\"ifApp\":\"1\",\"ifId\":\"1\",\"ifPact\":\"1\",\"endDate\":\"\",\"payDay\":\"\",\"childrenAmount\":\"\",\"postCode\":\"\",\"postAddr\":\"\",\"homeProvine\":\"\",\"homeCity\":\"\",\"homeDistrict\":\"\",\"homePostCode\":\"\",\"homeTel\":\"\",\"homeCode\":\"\",\"homeAddr\":\"\",\"houseType\":\"\",\"houseRent\":\"\",\"familyMonthPay\":\"\",\"monthMaxRepay\":\"\",\"qqNum\":\"\",\"wechatNum\":\"\",\"email\":\"\",\"mateName\":\"\",\"mateIdtype\":\"\",\"mateIdno\":\"\",\"mateWork\":\"\",\"mateTel\":\"\",\"livePersonCount\":\"\",\"liveWith\":\"\",\"cpamount\":\"\",\"idEndDate\":\"\",\"idSource\":\"\",\"idStartDate\":\"\",\"financingComeFrom\":\"\",\"investYears\":\"\",\"investmentLore\":\"\",\"pCode\":\"\",\"realEstateLicenseCode\":\"\",\"createdDate\":\"\",\"familyBackground\":\"\",\"comeFrom\":\"\",\"otherComeFrom\":\"\",\"salaryDay\":\"\",\"numberDependanted\":\"\",\"addressPriority\":\"\",\"familyExpense\":\"\",\"hasLoan\":\"\",\"workType\":\"\",\"workName\":\"\",\"workSts\":\"\",\"workWay\":\"\",\"workCode\":\"\",\"workAddr\":\"\",\"workDuty\":\"\",\"workTitle\":\"\",\"workStartYear\":\"\",\"corpProvince\":\"\",\"corpCity\":\"\",\"corpZone\":\"\",\"corpPostcode\":\"\",\"corpStructure\":\"\",\"corpPayWay\":\"\",\"monthSalary\":\"\",\"otherIncome\":\"\",\"setupDate\":\"\",\"sharesScale\":\"\",\"registerFunds\":\"\",\"priEnterpriseType\":\"\",\"businessPlace\":\"\",\"monthRent\":\"\",\"employeeNum\":\"\",\"enterpriseRate\":\"\",\"monthAmt\":\"\",\"carType\":\"\",\"carBuyDate\":\"\",\"nakedCarBuyPrice\":\"\",\"carBuyPrice\":\"\",\"carLoanTerm\":\"\",\"carLoanPeriod\":\"\",\"carMonthPaymentAmt\":\"\",\"estateType\":\"\",\"estateState\":\"\",\"estateCity\":\"\",\"estateZone\":\"\",\"estateAmt\":\"\",\"referenceAmt\":\"\",\"estateLoanAmt\":\"\",\"estateMonthPaymentAmt\":\"\",\"hasRepaymentNum\":\"\",\"builtupArea\":\"\",\"houseOwnership\":\"\",\"equityRate\":\"\",\"ifMe\":\"\",\"estateBuyDate\":\"\",\"loanBalance\":\"\",\"hourseLoanPeriod\":\"\",\"hoursePrice\":\"\",\"unitPrice\":\"\",\"houseLoanNum\":\"\",\"ortherLoanNum\":\"\",\"loanFirstMonth\":\"\",\"creditAccounts\":\"\",\"creditFirstMonth\":\"\",\"semiCreditAccounts\":\"\",\"semiCreditFirstMonth\":\"\",\"loanOverCount\":\"\",\"loanOverMonth\":\"\",\"loanOverLtotal\":\"\",\"loanOverLmonths\":\"\",\"creditOverAccounts\":\"\",\"creditOverMonths\":\"\",\"creditOverLtotal\":\"\",\"creditOverLmonth\":\"\",\"loaningCorpOrg\":\"\",\"loaningOrgNums\":\"\",\"loaningNum\":\"\",\"loaningContractTotal\":\"\",\"loaningRemainSum\":\"\",\"loaningMeanPay\":\"\",\"existCorpOrg\":\"\",\"existOrgNum\":\"\",\"existAccount\":\"\",\"existCreditTotal\":\"\",\"existMaxAmount\":\"\",\"existUsedAmount\":\"\",\"existMeanAmount\":\"\",\"ensureCount\":\"\",\"ensureAmount\":\"\",\"ensureRemainder\":\"\",\"contactCorpPost\":\"\",\"openAccountDate\":\"\",\"depositRate\":\"\",\"monthDepositAmt\":\"\",\"depositBase\":\"\",\"providentInfo\":\"\",\"paymentUnit\":\"\",\"paymentMonthNum\":\"\",\"insuranceAmt\":\"\",\"insuranceTerm\":\"\",\"paidTerm\":\"\",\"lastPaymentDate\":\"\",\"paymentMethod\":\"\",\"policyRelation\":\"\",\"yearPaymentAmt\":\"\",\"policyCheck\":\"\",\"acctRegisterDate\":\"\",\"buyerCreditLevel\":\"\",\"buyerCreditType\":\"\",\"goodRate\":\"\",\"lastYearPayAmt\":\"\",\"sesameCreditValue\":\"\",\"payAmt3\":\"\",\"onlinePayMonthAmt\":\"\",\"setupShopDate\":\"\",\"sellerCreditLevel\":\"\",\"sellerCreditType\":\"\",\"regardedNum\":\"\",\"taobaoBillAmt1\":\"\",\"taobaoBillAmt2\":\"\",\"taobaoBillAmt3\":\"\",\"taobaoBillAmt4\":\"\",\"taobaoBillAmt5\":\"\",\"taobaoBillAmt6\":\"\",\"taobaoPayMonthAmt\":\"\",\"personalWater1\":\"\",\"personMonthAverage\":\"\",\"personalWaterTotal\":\"\",\"publicWater1\":\"\",\"publicMonthAverage\":\"\",\"publicWaterTotal\":\"\",\"waterIncomeTotal\":\"\",\"auditContactRelation\":\"\",\"auditIfKnowLoan\":\"\",\"threeMonthsCount\":\"\",\"oneMonthsCount\":\"\",\"creditTotalLimit\":\"\",\"creditUsedLimit\":\"\",\"creditDebt\":\"\",\"loanCredit\":\"\",\"creditLoanLimit\":\"\",\"creditLoanTerm\":\"\",\"creditLoanDebt\":\"\",\"creditLoanAlsoPay\":\"\",\"outDebtTotal\":\"\",\"approvalCheckIncome\":\"\",\"approvalDebtTate\":\"\",\"approvalAllDebtRate\":\"\",\"issuerDate\":\"\",\"cardCreditLimit\":\"\",\"cardBillAmt1\":\"\",\"cardBillAmt2\":\"\",\"cardBillAmt3\":\"\",\"cardBillAmt4\":\"\",\"cardPayMonthAmt\":\"\"}}";
        System.out.println("明文报文样例：" + jsonData);
        try {
            Map<String,Object> map = jsonStringToMap(jsonData);
            System.out.println(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //@Test
    public void test003(){
        String params = "{\"content\":{\"cancelDate\":\"20161101\",\"prePactNo\":\"2016042105\",\"sysSource\":\"A02\",\"projNo\":\"13579\",\"cancelReason\":\"总部审核失败\"},\"sysSign\":\"F42433FB3A6774E848D3E75A3C2A324F\",\"sysSource\":\"A02\"}";
        String url = "http://ifretest.chinacloudapp.cn:8082/abs_base_web/shared/absShared/api/cancelBiz?jsonData=";
        // 发送明文报文
        //jsonData = JSONObject.toJSONString(map);
        // 发送密文报文
        String result = null;
        try {
            result = HttpKit.post(url, params, false);
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void ifreInterfaceTest() throws Exception {
        try {
            String jsonData = "{\"content\":{\"sysSource\":\"A02\",\"prePactNo\":\"000A040100000120161001000000000000000001\",\"projNo\":\"13579\",\"prdtNo\":\"C\",\"pactAmt\":\"40000\",\"lnRate\":\"0.93\",\"appArea\":\"110000\",\"appUse\":\"资金周转\",\"termMon\":\"3\",\"termDay\":\"0\",\"vouType\":\"4\",\"payType\":\"01\",\"custName\":\"许披瘦\",\"idType\":\"0\",\"idNo\":\"110224199004266593\",\"custType\":\"01\",\"sex\":\"1\",\"birth\":\"32989\",\"age\":\"26\",\"marriage\":\"21\",\"children\":\"0\",\"edu\":\"20\",\"degree\":\"2\",\"graduationTime\":\"41091\",\"telNo\":\"66613639\",\"phoneNo\":\"15141245885\",\"homeArea\":\"110000\",\"homeSts\":\"9\",\"income\":\"49842.42\",\"workYear\":\"4\",\"totalMonthlyIncome\":\"49842.42\",\"privateOwnersFlag\":\"0\",\"ifCar\":\"1\",\"ifCarCred\":\"1\",\"ifRoom\":\"1\",\"ifMort\":\"2\",\"ifCard\":\"1\",\"cardAmt\":\"0\",\"contactRelation\":\"配偶\",\"contactGender\":\"1\",\"ifKnowLoan\":\"0\",\"approvalApplyLimit\":\"40000\",\"approvalApplyTerm\":\"3\",\"approvalLimit\":\"40000\",\"approvalTerm\":\"3\",\"approvalMonthPay\":\"13706.67\",\"ifApp\":\"1\",\"ifId\":\"1\",\"ifPact\":\"1\",\"endDate\":\"\",\"payDay\":\"\",\"childrenAmount\":\"\",\"postCode\":\"\",\"postAddr\":\"\",\"homeProvine\":\"\",\"homeCity\":\"\",\"homeDistrict\":\"\",\"homePostCode\":\"\",\"homeTel\":\"\",\"homeCode\":\"\",\"homeAddr\":\"\",\"houseType\":\"\",\"houseRent\":\"\",\"familyMonthPay\":\"\",\"monthMaxRepay\":\"\",\"qqNum\":\"\",\"wechatNum\":\"\",\"email\":\"\",\"mateName\":\"\",\"mateIdtype\":\"\",\"mateIdno\":\"\",\"mateWork\":\"\",\"mateTel\":\"\",\"livePersonCount\":\"\",\"liveWith\":\"\",\"cpamount\":\"\",\"idEndDate\":\"\",\"idSource\":\"\",\"idStartDate\":\"\",\"financingComeFrom\":\"\",\"investYears\":\"\",\"investmentLore\":\"\",\"pCode\":\"\",\"realEstateLicenseCode\":\"\",\"createdDate\":\"\",\"familyBackground\":\"\",\"comeFrom\":\"\",\"otherComeFrom\":\"\",\"salaryDay\":\"\",\"numberDependanted\":\"\",\"addressPriority\":\"\",\"familyExpense\":\"\",\"hasLoan\":\"\",\"workType\":\"\",\"workName\":\"\",\"workSts\":\"\",\"workWay\":\"\",\"workCode\":\"\",\"workAddr\":\"\",\"workDuty\":\"\",\"workTitle\":\"\",\"workStartYear\":\"\",\"corpProvince\":\"\",\"corpCity\":\"\",\"corpZone\":\"\",\"corpPostcode\":\"\",\"corpStructure\":\"\",\"corpPayWay\":\"\",\"monthSalary\":\"\",\"otherIncome\":\"\",\"setupDate\":\"\",\"sharesScale\":\"\",\"registerFunds\":\"\",\"priEnterpriseType\":\"\",\"businessPlace\":\"\",\"monthRent\":\"\",\"employeeNum\":\"\",\"enterpriseRate\":\"\",\"monthAmt\":\"\",\"carType\":\"\",\"carBuyDate\":\"\",\"nakedCarBuyPrice\":\"\",\"carBuyPrice\":\"\",\"carLoanTerm\":\"\",\"carLoanPeriod\":\"\",\"carMonthPaymentAmt\":\"\",\"estateType\":\"\",\"estateState\":\"\",\"estateCity\":\"\",\"estateZone\":\"\",\"estateAmt\":\"\",\"referenceAmt\":\"\",\"estateLoanAmt\":\"\",\"estateMonthPaymentAmt\":\"\",\"hasRepaymentNum\":\"\",\"builtupArea\":\"\",\"houseOwnership\":\"\",\"equityRate\":\"\",\"ifMe\":\"\",\"estateBuyDate\":\"\",\"loanBalance\":\"\",\"hourseLoanPeriod\":\"\",\"hoursePrice\":\"\",\"unitPrice\":\"\",\"houseLoanNum\":\"\",\"ortherLoanNum\":\"\",\"loanFirstMonth\":\"\",\"creditAccounts\":\"\",\"creditFirstMonth\":\"\",\"semiCreditAccounts\":\"\",\"semiCreditFirstMonth\":\"\",\"loanOverCount\":\"\",\"loanOverMonth\":\"\",\"loanOverLtotal\":\"\",\"loanOverLmonths\":\"\",\"creditOverAccounts\":\"\",\"creditOverMonths\":\"\",\"creditOverLtotal\":\"\",\"creditOverLmonth\":\"\",\"loaningCorpOrg\":\"\",\"loaningOrgNums\":\"\",\"loaningNum\":\"\",\"loaningContractTotal\":\"\",\"loaningRemainSum\":\"\",\"loaningMeanPay\":\"\",\"existCorpOrg\":\"\",\"existOrgNum\":\"\",\"existAccount\":\"\",\"existCreditTotal\":\"\",\"existMaxAmount\":\"\",\"existUsedAmount\":\"\",\"existMeanAmount\":\"\",\"ensureCount\":\"\",\"ensureAmount\":\"\",\"ensureRemainder\":\"\",\"contactCorpPost\":\"\",\"openAccountDate\":\"\",\"depositRate\":\"\",\"monthDepositAmt\":\"\",\"depositBase\":\"\",\"providentInfo\":\"\",\"paymentUnit\":\"\",\"paymentMonthNum\":\"\",\"insuranceAmt\":\"\",\"insuranceTerm\":\"\",\"paidTerm\":\"\",\"lastPaymentDate\":\"\",\"paymentMethod\":\"\",\"policyRelation\":\"\",\"yearPaymentAmt\":\"\",\"policyCheck\":\"\",\"acctRegisterDate\":\"\",\"buyerCreditLevel\":\"\",\"buyerCreditType\":\"\",\"goodRate\":\"\",\"lastYearPayAmt\":\"\",\"sesameCreditValue\":\"\",\"payAmt3\":\"\",\"onlinePayMonthAmt\":\"\",\"setupShopDate\":\"\",\"sellerCreditLevel\":\"\",\"sellerCreditType\":\"\",\"regardedNum\":\"\",\"taobaoBillAmt1\":\"\",\"taobaoBillAmt2\":\"\",\"taobaoBillAmt3\":\"\",\"taobaoBillAmt4\":\"\",\"taobaoBillAmt5\":\"\",\"taobaoBillAmt6\":\"\",\"taobaoPayMonthAmt\":\"\",\"personalWater1\":\"\",\"personMonthAverage\":\"\",\"personalWaterTotal\":\"\",\"publicWater1\":\"\",\"publicMonthAverage\":\"\",\"publicWaterTotal\":\"\",\"waterIncomeTotal\":\"\",\"auditContactRelation\":\"\",\"auditIfKnowLoan\":\"\",\"threeMonthsCount\":\"\",\"oneMonthsCount\":\"\",\"creditTotalLimit\":\"\",\"creditUsedLimit\":\"\",\"creditDebt\":\"\",\"loanCredit\":\"\",\"creditLoanLimit\":\"\",\"creditLoanTerm\":\"\",\"creditLoanDebt\":\"\",\"creditLoanAlsoPay\":\"\",\"outDebtTotal\":\"\",\"approvalCheckIncome\":\"\",\"approvalDebtTate\":\"\",\"approvalAllDebtRate\":\"\",\"issuerDate\":\"\",\"cardCreditLimit\":\"\",\"cardBillAmt1\":\"\",\"cardBillAmt2\":\"\",\"cardBillAmt3\":\"\",\"cardBillAmt4\":\"\",\"cardPayMonthAmt\":\"\"}}";

            System.out.println("明文报文样例：" + jsonData);

            Map<String,Object> map = jsonStringToMap(jsonData);

            /** 报文签名 */
            // 签名秘钥
            String signKey = "1234567890";
            /** 明文报文签名 */
            map.put("sysSource", "A02");

            String sign = SignUtil.md5Sign(map, signKey);
            map.put("sysSign", sign);

            String jsonDataP = JSONObject.toJSONString(map);
            System.out.println("签名后的明文报文样例：" + jsonDataP);
            /** 明文报文签名结束 */
            
            /** 组装密文报文 */
            // 加密密钥
            /*String encryptKey = "1112345abcde12345abcde";
            String encryptData = AesUtil.base64EncryptCBC(jsonData, encryptKey);
            Map<String, Object> encryptMap = new HashMap<String, Object>();
            encryptMap.put("sysSource", "A02");
            encryptMap.put("encryptData", encryptData);
            jsonData = JSONObject.toJSONString(encryptMap);
            System.out.println("密文报文样例：" + jsonData);
            *//** 组装密文报文结束 *//*

            *//** 密文报文签名 *//*
            sign = SignUtil.md5Sign(encryptMap, signKey);
            encryptMap.put("sysSign", sign);
            jsonData = JSONObject.toJSONString(encryptMap);
            System.out.println("签名后的密文报文样例：" + jsonData);*/
            /** 密文报文签名结束 */
            
            String url = "http://ifreworkflow.chinacloudapp.cn:8082/abs_base_web/shared/absShared/api/preLoanApply?jsonData=";
            //String url = "http://ifretest.chinacloudapp.cn:8082/abs_base_web/shared/absShared/api/preLoanApply?jsonData=";
            // 发送明文报文
            //jsonData = JSONObject.toJSONString(map);
            // 发送密文报文
            //jsonData = JSONObject.toJSONString(encryptMap);
            String result = HttpKit.post(url, jsonDataP, false);
            System.out.println(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static Map<String,Object> jsonStringToMap(String jsonString) throws Exception {
        Map<String,Object> map = new TreeMap<String, Object>();
        JSONObject json = (JSONObject)JSONObject.parse(jsonString);
        Set<String> set = json.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Object value = json.get(key);
            if(null != value && !"".equals(value)){
                map.put(key, value);
            }
        }
        return map;
    }
}

