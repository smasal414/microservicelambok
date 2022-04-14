package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LandInfo;
import com.example.demo.service.LandService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/land")
@RestController
@Slf4j
public class LandController {
	
	
	@Autowired
	LandService	landService;
	
	@PostMapping("/save")
	public String addDetails(@RequestBody  LandInfo lands) {
		String methodName="addDetails()";
		log.info(methodName+"called");
		
		return landService.addDetails(lands);
		
	}
	

}
