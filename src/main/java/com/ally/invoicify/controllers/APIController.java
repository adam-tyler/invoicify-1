package com.ally.invoicify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class APIController {

	public APIController() {}
	
	@GetMapping("/")
	public String getHome() {
		return "API is running on heroku";
	}
}
