package com.project.OnlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("title","home");
		mv.addObject("UserClickHome",true);
		
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("title","about");
		mv.addObject("UserClickAbout",true);
		
		return mv;
	}
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("title","contact");
		mv.addObject("UserClickContact",true);
		
		return mv;
	}

}
