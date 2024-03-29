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
	
	//@Value("${testApiKey:default.api.category}")
	//private String testApiKey;

	public ResponseEntity<String> obtainImageApiUrl(){
		//String apiKey = testApiKey;
		String apiUrl = imageApiUrl + imageApiKey + imageApiCategory;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
}
