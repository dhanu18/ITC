package com.se.dhana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller @RequestMapping(value="/home")
public class HomeController {
	
	
	@RequestMapping(value="/home")
	public ModelAndView getHome(){
		
		
		
		return new ModelAndView("home");
	}

}
