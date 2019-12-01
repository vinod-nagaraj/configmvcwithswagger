package com.hcl.ing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET, headers = "Accept=application/json")
	public String welcomeMessage() {

		return "Live your life as you can";
	}
}
