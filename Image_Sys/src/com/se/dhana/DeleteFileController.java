package com.se.dhana;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteFileController {

	
	@RequestMapping(value="/delete")
	public String deleteFile(@RequestParam("file")String file,ModelMap m){
		
		
		
		File delfile=new File(file);
	System.out.println("..........deleted........."+delfile);
		
		
		delfile.delete();
		m.addAttribute("delfile", delfile);
		
		return "delete";
	}
	
	
	
}
