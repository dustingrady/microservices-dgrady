package com.example.microservicesdgrady.images.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.microservicesdgrady.images.logic.ImagesLogicManager;

@RestController
public class ImagesWeb {
	@Autowired
	ImagesLogicManager manager;
	@RequestMapping("/images")
	@ResponseBody
	
	ResponseEntity<String> images(){
		ResponseEntity<String> result = manager.obtainImageApiUrl();
		return result;
	}
}