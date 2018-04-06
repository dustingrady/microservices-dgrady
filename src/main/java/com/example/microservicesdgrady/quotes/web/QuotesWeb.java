package com.example.microservicesdgrady.quotes.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesWeb {
	@RequestMapping("/quotes")
	@ResponseBody
	QuotesWebResult quotes(){
		QuotesWebResult qwRes = new QuotesWebResult();
		qwRes.setId("1");
		qwRes.setName("quote");
		return qwRes;
	}
}
