package com.zdmoney.credit.framework.vo.bsb.entity;

public class Environment {
	
	/** MAC地址*/
	private String mac;
	
	/** Imei*/
	private String imei;
	
	/** IP地址*/
	private String ip;
	
	/** GPS经度*/
	private String longitude;
	
	/** GPS维度*/
	private String latitude;

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
}
