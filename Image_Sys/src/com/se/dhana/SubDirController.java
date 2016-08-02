package com.se.dhana;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubDirController {

	@RequestMapping(value="/searchdir",method=RequestMethod.GET)
	public String search(@RequestParam("folder")String folder,ModelMap m,HttpServletRequest req){
		folder=(String) req.getAttribute("folder");
		folder=folder.toString();
		
	System.out.println(folder);
			
		File directory=new File(folder);
		
		File[] f=directory.listFiles();
		Map map=new HashMap();
		for(File file:f){
			
			System.out.println(file.getAbsolutePath());
			map.put(file.getName(), file.getAbsoluteFile());
		
			}
			m.addAttribute("map", map);
		
			return "success";
		}
	
	
	
}
