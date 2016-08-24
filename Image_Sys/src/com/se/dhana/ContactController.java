package com.se.dhana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller @RequestMapping(value="/contact")
public class ContactController {
	
	
	@RequestMapping(value="/contact")
	public ModelAndView getHome(){
		
		
		
		return new ModelAndView("contact");
	}

}
