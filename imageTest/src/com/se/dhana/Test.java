package com.se.dhana;

import ij.io.*;
import ij.process.ImageProcessor;
import ij.*;
import java.io.*;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import javax.imageio.stream.FileImageInputStream;





public class Test {

	public static void main(String[] args) {

		Opener opener = new Opener();  
		String fileName = null;

		DirectoryChooser dc=new DirectoryChooser("image");
		//System.out.println(dc.getDirectory());
		
		String imageFilePath = dc.getDirectory();
		
		File f=new File(imageFilePath);
		
	
		
		File[] fa=f.listFiles();
	
		ArrayList al=new ArrayList();
		
		Map m=new HashMap();
		
		for(File file:fa){
			
						
		
			fileName=file.getName();
					
			ImagePlus imp=opener.openImage(file.getAbsolutePath());
			
			double d=imp.getStatistics().dmode;
			
			//System.out.println(d);
		al.add(d);
		m.put(fileName, d);
		
		}
		int count=0;
		
		System.out.println(m);
		
		NavigableMap hm=new TreeMap();
		
	Object[] o=	m.keySet().toArray();
		for(int i=0;i<o.length;i++){
			
			for(int j=i+1;j<o.length;j++){
				
				if(m.get(o[i]).equals(m.get(o[j]))){            
					
					
					//System.out.println(".......dupli......."+o[j]);
					
					hm.put(o[j], m.get(o[j]));
				}
				
				
				
			}
			
		
		}
		
		
		
		
		
	
		
	}
		
			
		
		

	/*System.out.println(al);
	 * 
	
	
	for(int i=0;i<al.size();i++){
		for(int j=i+1;j<al.size();j++){
			
		if(al.get(i).equals(al.get(j))){
			count=count+1;
			System.out.println("orgnl"+al.get(i)+"dupli"+al.get(j));
		}
		}
		
		
	}
	
	
	System.out.println(count+":....duplicates found");
	*/
	
		
		
		
		
		
		
		
		// = opener.openImage(imageFilePath);
	
	/*ImagePlus imp2=opener.openImage(imageFilePath1);
	System.out.println(imp2.getStatistics().dmode);
		
	if(imp.getStatistics().dmode==imp2.getStatistics().dmode){
		
		
		System.out.println("hi");
	}
		*/
	
	
	
}