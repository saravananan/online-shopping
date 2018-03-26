package net.sara.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring mvc web");
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
