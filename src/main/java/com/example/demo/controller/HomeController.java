package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	String fun(Model model)
	{
		
		model.addAttribute("name","Ram");
		return "test.html";
	}
	
	
	@RequestMapping("/me")
	ModelAndView fun2()
	{
		ModelAndView model=new ModelAndView("test2.html");
		model.addObject("name","Ram");
		
		return model;
	}
	
	
	

}
