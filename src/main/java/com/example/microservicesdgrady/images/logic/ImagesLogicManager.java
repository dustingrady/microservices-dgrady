package com.example.microservicesdgrady.images.logic;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

@Component
public class ImagesLogicManager {
	@Value("${imageApiUrl:default.api.url}")
	private String imageApiUrl;
	@Value("${imageApiKey:default.api.key}")
	private String imageApiKey;
	@Value("${imageApiCategory:default.api.category}")
	private String imageApiCategory;

	/*
	public ResponseEntity<String> obtainImageApiUrl(){
		String apiUrl = imageApiUrl;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
	*/
	public ResponseEntity<String> obtainImageApiKey(){
		//String apiKey = imageApiKey;
		String apiUrl = imageApiUrl + imageApiKey + imageApiCategory;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
}
