package com.example.microservicesdgrady.quotes.web;

public class QuotesWebResult {
	private String apiUrl;
	private String oAuthToken;

	public String getoAuthToken() {
		return oAuthToken;
	}
	public void setoAuthToken(String oAuthToken) {
		this.oAuthToken = oAuthToken;
	}
	
	public String getApiUrl(){
		return apiUrl;
	}
	public void setApiUrl(String apiUrl){
		this.apiUrl = apiUrl;
	}
}
