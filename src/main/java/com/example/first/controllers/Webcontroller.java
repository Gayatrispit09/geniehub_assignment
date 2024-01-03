package com.example.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webcontroller {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
