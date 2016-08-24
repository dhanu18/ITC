package com.se.dhana;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class One implements FileFilter {
	
	
	String name;
	public void filter(@RequestParam("name")String name,@RequestParam("folder")String folder){
	
		folder=folder.toString();
		File file=new File(folder);
		
		name=name.toString();
		
		System.out.println(name);
	
		}
		
	
		
	@Override
	public boolean accept(File dir) {
		CharSequence s1=name;
		System.out.println(s1);
		if(dir.getName().contains(s1)){
			
			return true;
		}
		
		
		
		return false;
	}

	
}
