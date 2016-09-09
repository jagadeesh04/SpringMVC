package com.jag.spring.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

	/*@RequestMapping("/")
	public ModelAndView showHome(){
		
		ModelAndView mv = new ModelAndView("home");
		
		Map<String, Object> model = mv.getModel();
		
		model.put("name", "Den");
		
		return mv;
	}*/
	
	@RequestMapping("/")
	public String showHome(Model model){
		
		model.addAttribute("name", "Ram");
		
		return "home";
	}
	
}
