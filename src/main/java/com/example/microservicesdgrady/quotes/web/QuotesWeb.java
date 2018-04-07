package com.example.microservicesdgrady.quotes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicesdgrady.images.logic.ImagesLogicManager;

@RestController
public class QuotesWeb {
	@Value("${quotesApiUrl:https://talaikis.com/api/quotes/random/}")
	private String quotesApiUrl;
	//@Value("${quotesApiKey:123456}")
	//private String quotesApiKey;
	@Autowired
	ImagesLogicManager manager;
	@RequestMapping("/quotes")
	@ResponseBody
	QuotesWebResult quotes(){
		QuotesWebResult qwRes = new QuotesWebResult();
		qwRes.setApiUrl(quotesApiUrl);
		return qwRes;
	}
}
