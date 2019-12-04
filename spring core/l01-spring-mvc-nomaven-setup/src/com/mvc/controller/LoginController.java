package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
