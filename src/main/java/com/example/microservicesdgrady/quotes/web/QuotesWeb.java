package com.example.microservicesdgrady.quotes.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesWeb {
	@Value("${quotesApiUrl:default.quotes.url}")
	private String quotesApiUrl;
	//@Value("${quotesApiKey:123456}")
	//private String quotesApiKey;
	
	@RequestMapping("/quotes")
	@ResponseBody
	QuotesWebResult quotes(){
		QuotesWebResult qwRes = new QuotesWebResult();
		qwRes.setApiUrl(quotesApiUrl);
		return qwRes;
	}
}
