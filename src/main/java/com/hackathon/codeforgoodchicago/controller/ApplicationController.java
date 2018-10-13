package com.hackathon.codeforgoodchicago.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@RequestMapping(path ="/", method=RequestMethod.GET)
	public String index() {
		return "Welcome to the Digital Hub";
	}
	

}
