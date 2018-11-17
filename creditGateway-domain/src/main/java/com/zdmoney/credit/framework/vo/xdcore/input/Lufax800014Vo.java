package com.zdmoney.credit.framework.vo.xdcore.input;

import java.math.BigDecimal;
import java.util.List;

import com.zdmoney.credit.framework.vo.xdcore.XdcoreBaseParamVo;

public class Lufax800014Vo extends XdcoreBaseParamVo {
	
	private static final long serialVersionUID = 1L;

	/** 陆金所用户ID*/
	private String iCode;
	
	/** 取现序列号*/
	private List<Item> verifyMapList;

    public String getiCode() {
        return iCode;
    }

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

    public List<Item> getVerifyMapList() {
        return verifyMapList;
    }

    public void setVerifyMapList(List<Item> verifyMapList) {
        this.verifyMapList = verifyMapList;
    }

    public static class Item{
        
        private String anshuo_batch_id;
        
        private String serialno;
        
        private String suggestion;
        
        private String conclusion;
        
        private String bailRatio;
        
        private String currentBailRatio;
        
        private BigDecimal bailMargin;
        
        private BigDecimal bottomBail;
        
        private BigDecimal bailThresholdValue;
        
        private BigDecimal originalBail;

        public String getAnshuo_batch_id() {
            return anshuo_batch_id;
        }

        public void setAnshuo_batch_id(String anshuo_batch_id) {
            this.anshuo_batch_id = anshuo_batch_id;
        }

        public String getSerialno() {
            return serialno;
        }

        public void setSerialno(String serialno) {
            this.serialno = serialno;
        }

        public String getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(String suggestion) {
            this.suggestion = suggestion;
        }

        public String getConclusion() {
            return conclusion;
        }

        public void setConclusion(String conclusion) {
            this.conclusion = conclusion;
        }

        public String getBailRatio() {
            return bailRatio;
        }

        public void setBailRatio(String bailRatio) {
            this.bailRatio = bailRatio;
        }

        public String getCurrentBailRatio() {
            return currentBailRatio;
        }

        public void setCurrentBailRatio(String currentBailRatio) {
            this.currentBailRatio = currentBailRatio;
        }

        public BigDecimal getBailMargin() {
            return bailMargin;
        }

        public void setBailMargin(BigDecimal bailMargin) {
            this.bailMargin = bailMargin;
        }

        public BigDecimal getBottomBail() {
            return bottomBail;
        }

        public void setBottomBail(BigDecimal bottomBail) {
            this.bottomBail = bottomBail;
        }

        public BigDecimal getBailThresholdValue() {
            return bailThresholdValue;
        }

        public void setBailThresholdValue(BigDecimal bailThresholdValue) {
            this.bailThresholdValue = bailThresholdValue;
        }

        public BigDecimal getOriginalBail() {
            return originalBail;
        }

        public void setOriginalBail(BigDecimal originalBail) {
            this.originalBail = originalBail;
        }
        
    }
	
}
