package com.se.dhana;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller @RequestMapping("/bydate")
public class SearchByDateController {

	
	
	@RequestMapping("/bydate")
		public String searchbyDate(@RequestParam("folder") String folder,@RequestParam("date1") String date1,@RequestParam("date2") String date2,ModelMap m){
		
					
			
			DateTest t=new DateTest(date1,date2);
			File directory=new File(folder);
			if(!directory.exists()){
				
				
				return "fail";
			}
			
			
						
			
			File[] f=directory.listFiles(t);
			Map map=new HashMap();
			Map map1=new HashMap();
			 final CharSequence s1=".jpg";
				final CharSequence s2=".png";
			for(File file:f){
						
						
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
					m.addAttribute("folder", folder);



					}
					
					return "success";	
				
			}
		
	
	}
	
	
	
	
	

