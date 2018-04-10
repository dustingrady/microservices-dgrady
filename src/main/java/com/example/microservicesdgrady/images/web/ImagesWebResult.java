package com.example.microservicesdgrady.images.web;

public class ImagesWebResult {
	private String url;
	private String key;
	private String category;


	public String getUrl(){
		return url;
	}
	
	public void setUrl(String url){
		this.url = url;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getCategory(){
		return category;
	}
	
	public void setCategory(String cat){
		this.category = cat;
	}
}
