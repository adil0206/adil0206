package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	 @RequestMapping("/home") 
	public String myHome() {
		System.out.println("Hello World !!");
		return "home";
	}
}