package com.project.OnlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.backend.dao.CategoryDAO;
import com.project.backend.dto.Category;

@Controller
public class MainController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("title","home");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
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
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("title","allproducts");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("UserClickAllProducts",true);
		
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
	{
		ModelAndView mv=new ModelAndView("page");
		
		Category category=null;
		
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		//passing a single object of categories i.e category
		
		mv.addObject("category",category);
		
		mv.addObject("UserClickCategoryProducts",true);
		
		return mv;
	}

}
