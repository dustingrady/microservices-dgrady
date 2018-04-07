package com.example.microservicesdgrady.images.logic;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

@Component
public class ImagesLogicManager {
	@Value("${imageApiUrl:https://jsonplaceholder.typicode.com/users}")
	private String imageApiUrl;
	@Value("${imageApiKey:123456}")
	private String imageApiKey;
	/*
	@Value("${imageApiTags:}")
	private String imageApiTags;
	*/
	/*
	public ResponseEntity<String> obtainImageApiUrl(){
		String apiUrl = imageApiUrl;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		return response;
	}
	*/
	public ResponseEntity<String> obtainImageApiKey(){
		String apiKey = imageApiKey;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiKey, String.class);
		return response;
	}
}
