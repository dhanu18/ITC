package com.se.dhana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller @RequestMapping(value="/searchall")
public class SearchAllController {

	@RequestMapping(value="/searchall")
	public ModelAndView all(){
		
		
		
		return new ModelAndView("searchAll");
	}
	
	
	
	
	
}
