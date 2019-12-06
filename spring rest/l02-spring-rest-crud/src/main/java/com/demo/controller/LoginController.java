package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/employee")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/manager")
	public String loginManager() {
		return "manager";
	}
}
