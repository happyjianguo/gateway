/**
 * 
 */
package com.zdmoney.credit.framework.vo.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @ClassName:     BsbRequest.java
 * @Description:   
 * @author         柳云华
 * @version        V1.0  
 * @Date           2017年1月6日 下午5:49:01
 */
public class BsbRequestVo {
	
	@NotNull
	private Comm comm;
	
	@NotEmpty
	private String data;
	
	private String requestIp;
	
	
	public Comm getComm() {
		return comm;
	}


	public void setComm(Comm comm) {
		this.comm = comm;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public static class Comm{
		@NotEmpty
		private String encodg;
		@NotEmpty
		private String invktm;
		@NotEmpty
		private String txncd;
		@NotEmpty
		private String ordrno;
		@NotEmpty
		private String chanltp;
		@NotEmpty
		private String chanlno;
		@NotEmpty
		private String encrmd;
		@NotEmpty
		private String signtp;
		@NotEmpty
		private String signtx;
		public String getEncodg() {
			return encodg;
		}
		public void setEncodg(String encodg) {
			this.encodg = encodg;
		}
		public String getInvktm() {
			return invktm;
		}
		public void setInvktm(String invktm) {
			this.invktm = invktm;
		}
		public String getTxncd() {
			return txncd;
		}
		public void setTxncd(String txncd) {
			this.txncd = txncd;
		}
		public String getOrdrno() {
			return ordrno;
		}
		public void setOrdrno(String ordrno) {
			this.ordrno = ordrno;
		}
		public String getChanltp() {
			return chanltp;
		}
		public void setChanltp(String chanltp) {
			this.chanltp = chanltp;
		}
		public String getChanlno() {
			return chanlno;
		}
		public void setChanlno(String chanlno) {
			this.chanlno = chanlno;
		}
		public String getEncrmd() {
			return encrmd;
		}
		public void setEncrmd(String encrmd) {
			this.encrmd = encrmd;
		}
		public String getSigntp() {
			return signtp;
		}
		public void setSigntp(String signtp) {
			this.signtp = signtp;
		}
		public String getSigntx() {
			return signtx;
		}
		public void setSigntx(String signtx) {
			this.signtx = signtx;
		}
	}

	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}
	
}
