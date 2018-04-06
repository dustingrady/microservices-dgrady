package com.example.microservicesdgrady.images.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImagesWeb {
	@RequestMapping("/images")
	@ResponseBody
	ImagesWebResult images(){
		ImagesWebResult iwRes = new ImagesWebResult();
		iwRes.setId("2");
		iwRes.setName("images");
		iwRes.setUrl("stub.url");
		return iwRes;
	}
}
