package com.jag.spring.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {

	@RequestMapping("/")
	public String showHome(HttpSession session){
		
		session.setAttribute("name", "Jag");
		
		return "home";
	}
	
}
