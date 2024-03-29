package com.oracle.oBootDBConnect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	// Prefix -> templates
	// suffix -> .html
	@RequestMapping("hello")
	public String hello(Model model) {
		logger.info("start...");
		model.addAttribute("parameter", "boot start...");
		
		return "hello";
	}
	
}
