package com.se.dhana;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DController {
	
	
	@Autowired
	StudentModelInterface m;
	
	
	
	

	@RequestMapping(value="/displayForm")
	public String displayForm(Student student){
		
		
		return "store";
	}
	
	
	@RequestMapping(value="/storeform",method = RequestMethod.POST)
	public String storeData(@Valid @ModelAttribute("student")Student student,BindingResult result,ModelMap model){
		
		if(result.hasErrors()){
			
			
			return "store";
		}
		else{
			
			System.out.println(m);
			System.out.println(student.getName());
			m.save(student);
			
			return "success";
		}
		
	}
	
	
	
	

	@RequestMapping(value="/retriveform")
	public String getdataForm(Student student){
		
		
		return "retrive";
	}
	
	
	@RequestMapping(value="/getdata")
	public String getdata(@ModelAttribute("dto")Dto dto,ModelMap map){
		
		
		String sid=dto.getSid();
		
		ArrayList l=(ArrayList) m.retrive(sid);
		
		map.addAttribute("list", l);
		
		
		return "display";
	}
	
	
}
