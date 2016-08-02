package com.se.dhana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller @RequestMapping(value="/about")
public class AboutController {
	
	
	@RequestMapping(value="/about")
	public ModelAndView getHome(){
		
		
		
		return new ModelAndView("about");
	}

}
