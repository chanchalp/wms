package com.wms.bean;

/**
 * 
 * @author chanchal prakash
 *
 */
public class Response {
	
	private int responseCode;
	private String message;
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
