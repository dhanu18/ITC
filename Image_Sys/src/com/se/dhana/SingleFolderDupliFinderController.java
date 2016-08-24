package com.se.dhana;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ij.ImagePlus;
import ij.io.Opener;

@Controller
public class SingleFolderDupliFinderController {
	
	Opener opener = new Opener(); 
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/dupli")
	public String findDupli(@RequestParam("fol")String fol,ModelMap m) throws IOException{
		
		
		System.out.println(fol);
		File f=new File(fol);
		if(!f.exists()){
			
			return "fail";
		}
		
		
		File[] file=f.listFiles();
		
		
		
	
		Map map=new HashMap();
		
		Map map2=new TreeMap();
		Map map1=new TreeMap();
		Map map3=new TreeMap();
		Map map4=new TreeMap();
		
		   final CharSequence s1=".jpg";
					final CharSequence s2=".png";
		
		
		
		for(File file1:file){
			
			if(file1.isFile()&&(file1.getName().contains(s1)||file1.getName().contains(s2))){
			
			
			ImagePlus imp=opener.openImage(file1.getAbsolutePath());
			
			double d=imp.getStatistics().mode;
			//System.out.println(d);
			map.put(file1.getAbsoluteFile(), d);
	
			}
			if(file1.isDirectory()){
				
				System.out.println(file1.getAbsolutePath());
	       
				map1.put(file1.getName(), file1.getAbsolutePath());
				
			}
			
			
			if(file1.isFile() && file1.getName().endsWith(".txt")){
				
									
				
				map4.put(file1.getName(), file1.getAbsolutePath());
				
			}
			
		}
		
		
		
		
		Object[] o=map.keySet().toArray();
		
		for(int i=0;i<o.length;i++){
			
			
			for(int j=i+1;j<o.length;j++){
				

				if(map.get(o[i]).equals(map.get(o[j]))){
										
					map2.put(o[j], map.get(o[j]));
					map3.put(o[i], map.get(o[i]));
				
			}
			
			
		}
		
		System.out.println(map2);
		System.out.println(map3);
		
		m.addAttribute("map2", map2);
		m.addAttribute("map3", map3);
		m.addAttribute("map1",map1);
		m.addAttribute("map4",map4);
		m.addAttribute("folder", fol);
		
		}
				
		
		return "duplie";
	}
	
	
	
	
	

}
