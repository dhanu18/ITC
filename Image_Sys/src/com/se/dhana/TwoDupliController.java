package com.se.dhana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller @RequestMapping(value="/twoDupli")
public class TwoDupliController {

	
	@RequestMapping(value="/twoDupli")
	public ModelAndView twodupli(){
		
		return new ModelAndView("twoDupli");
	}
	
	
}
