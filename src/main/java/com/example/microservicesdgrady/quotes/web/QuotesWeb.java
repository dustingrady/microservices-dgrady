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
	@Autowired
	QuotesLogicManager manager;
	@RequestMapping("/quotes")
	@ResponseBody
	ResponseEntity<String> quotes(){
		ResponseEntity<String> result = manager.obtainQuoteApiUrl();
		//QuotesWebResult qwRes = new QuotesWebResult();
		//qwRes.setApiUrl(quotesApiUrl);
		return result;
	}
}
