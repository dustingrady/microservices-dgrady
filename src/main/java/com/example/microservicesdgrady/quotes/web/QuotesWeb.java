package com.example.microservicesdgrady.quotes.web;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesdgrady.quotes.logic.QuotesLogicManager;


@RestController
public class QuotesWeb {
	//@Value("${quotesApiUrl:https://talaikis.com/api/quotes/random/}")
	//private String quotesApiUrl;
	//@Value("${quotesApiKey:123456}")
	//private String quotesApiKey;
	@Autowired
	QuotesLogicManager manager;
	@RequestMapping("/quotes")
	@ResponseBody
	ResponseEntity<String> quotes(){
		ResponseEntity<String> result = manager.obtainQuoteApiImageUrl();
		//QuotesWebResult qwRes = new QuotesWebResult();
		//qwRes.setApiUrl(quotesApiUrl);
		return result;
	}
}
