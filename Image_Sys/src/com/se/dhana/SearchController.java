package com.se.dhana;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller 	
public class SearchController {

	
	
	@RequestMapping("/all")
	public String searchAll( @RequestParam("folder")String folder,ModelMap m){
		
		Map map=new HashMap();
		Map map1=new HashMap();
		File[] f=null;
		System.out.println(folder);
		File directory=new File(folder);
		

		if(!directory.exists()){
			
			return "fail";
		}
		
		
		
	    
	    
	    
		
	
		
		f=directory.listFiles();
		for(File file:f){
			
			
           final CharSequence s1=".jpg";
			final CharSequence s2=".png";
			if (file.isFile()&&(file.getName().contains(s1)||file.getName().contains(s2))){
                System.out.println(file.getAbsolutePath());
                map.put(file.getName(), file.getAbsoluteFile());
                
            }	
            else if (file.isDirectory()){
           	 System.out.println(file.getAbsolutePath());
           	 map1.put(file.getName(), file.getAbsoluteFile());
           	 
            }
		m.addAttribute("map", map);
		m.addAttribute("map1", map1);
		m.addAttribute("folder",folder);



		}
		
		return "success";	
	}
		
		
 }
			
					
			
			
		

	
	

	
	
	

