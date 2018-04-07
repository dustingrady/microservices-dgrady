package com.example.microservicesdgrady.quotes.logic;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;

@Component
public class QuotesLogicManager {
	@Value("${quoteApiUrl:default.quotes.url}")
	private String quoteApiUrl;

	public ResponseEntity<String> obtainQuoteApiUrl(){
		String apiUrl = quoteApiUrl;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(apiUrl, String.class);
		//System.out.println("Response: " + response); //Testing
		return response;
	}
}
