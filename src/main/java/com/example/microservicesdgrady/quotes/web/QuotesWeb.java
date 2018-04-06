package com.example.microservicesdgrady.quotes.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesWeb {
	@RequestMapping("/quotes")
	@ResponseBody
	QuotesWebResult quotes(){
		QuotesWebResult kwRes = new QuotesWebResult();
		kwRes.setId("1");
		kwRes.setName("quote");
		return kwRes;
	}
}
