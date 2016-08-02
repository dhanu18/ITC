package com.se.dhana;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ij.ImagePlus;
import ij.io.Opener;

@Controller
public class DoubleFolderDupliFinderController {

	@SuppressWarnings("unchecked")
	@RequestMapping(value="/ddupli")
	public String findDupli(@RequestParam("folder1")String folder1,@RequestParam("folder2")String folder2,ModelMap m){
		
		
		
		Opener opener=new Opener();
		
		File Directory1=new File(folder1);
		File Directory2=new File(folder2);
		
		
		if(!Directory1.exists()||!Directory2.exists()){
			return "fail";
		}
		
		
		
		File[] f1=	Directory1.listFiles();
		File[] f2=Directory2.listFiles();
		
		
		
		
	
		Map map =new TreeMap();
		Map map1=new TreeMap();
		Map map2=new TreeMap();
		Map map3=new TreeMap();
		Map map4=new TreeMap();
		   final CharSequence s1=".jpg";
					final CharSequence s2=".png";
		
		for(File file1:f1){
			
			if(file1.isFile()&&(file1.getName().contains(s1)||file1.getName().contains(s2))){
			
			ImagePlus ip1=opener.openImage(file1.getAbsolutePath());
			
			int d1=ip1.getStatistics().mode;
			
			map1.put(file1.getAbsolutePath(), file1.getName());
			}
			if(file1.isDirectory()){
				
			map3.put(file1.getAbsolutePath(), file1.getName());	
				
				
				
			}
			if(file1.isFile()&&file1.getName().endsWith(".txt")){
				
				map3.put(file1.getAbsolutePath(), file1.getName());	
			}
			
			
			
			
		}
		
		for(File file2:f2){
			if(file2.isFile()&&(file2.getName().contains(s1)||file2.getName().contains(s2))){
			ImagePlus ip2=opener.openImage(file2.getAbsolutePath());
			double d2=ip2.getStatistics().dmode;
			
			map2.put(file2.getAbsolutePath(), file2.getName());
			
			}
			if(file2.isDirectory()){
				
				map3.put(file2.getAbsolutePath(), file2.getName());	
					
					
					
				}
			if(file2.isFile()&&file2.getName().endsWith(".txt")){
				
				map3.put(file2.getAbsolutePath(), file2.getName());	
			}
			
						
		}
		
		
		Object[] o1=map1.keySet().toArray();
		Object[]o2=map2.keySet().toArray();
		
		
		for(int i=0;i<o1.length;i++){
			
			for(int j=0;j<o2.length;j++){
				
				if(map1.get(o1[i]).equals(map2.get(o2[j]))){
					
					
					map.put(o1[i],map1.get(o1[i]) );
					map4.put(o2[j],map1.get(o2[j]));
					
					
				}
			
				
			}
			
			
		}
		
				
		
		System.out.println(map);
		
		m.addAttribute("map", map);
		m.addAttribute("map3", map3);
		m.addAttribute("map4", map4);
		
		return "doubleDupli";
	}
	
	
	
	
	
}
