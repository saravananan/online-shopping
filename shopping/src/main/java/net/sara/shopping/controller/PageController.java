package net.sara.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.sara.shoppingback.dao.CategoryDAO;
import net.sara.shoppingback.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	//Home controller
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
		
	}
	
	
	//About controller
		@RequestMapping(value = "/about")
		public ModelAndView about() {
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "About");
			mv.addObject("userClickAbout", true);
			return mv;
			
		}
		
		
		//Contact controller method
				@RequestMapping(value = "/contact")
				public ModelAndView contact() {
					
					ModelAndView mv = new ModelAndView("page");
					mv.addObject("title", "Contact");
					mv.addObject("userClickContact", true);
					return mv;
					
				}
	
				
				
				//methods to get all products and based on category.
				@RequestMapping(value = "/show/all/products")
				public ModelAndView showAllProducts() {
					
					ModelAndView mv = new ModelAndView("page");
					mv.addObject("title", "All products");
					
					mv.addObject("categories",categoryDAO.list());
					
					mv.addObject("userClickAllProducts", true);
					return mv;
					
				}
				
				@RequestMapping(value = "/show/category/{id}/products")
				public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
					
					ModelAndView mv = new ModelAndView("page");
					
					//categoryDAO to get a single category...
					Category category = null;
					category = categoryDAO.get(id);
					
					
					mv.addObject("title",category.getName());
					
					mv.addObject("categories",categoryDAO.list());
					
					mv.addObject("category",category);
					
					mv.addObject("userClickCategoryProducts", true);
					return mv;
					
				}
				
	
	//@RequestParam() example
	@RequestMapping(value = {"/test"})
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
		
		if(greeting==null)
		{
			greeting="welcome to online shopping";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
		
	}
	
	@RequestMapping(value="path/{word}")
	public ModelAndView pathTest(@PathVariable("word")String word){
		
		if(word==null)
		{
			word="welcome to online shopping";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", word);
		return mv;		
		
	}
	
	

}
