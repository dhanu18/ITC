package com.se.dhana;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import ij.ImagePlus;
import ij.io.Opener;

public class TestTwo {

	
	
	public static void main(String[] args) {
		
		String path1="C:\\Users\\user\\s1";
		String path2="C:\\Users\\user\\s2";
		
		Map m1=new HashMap();
		Map m2=new HashMap();
		
			
		Opener op=new Opener();
			
		
		File f1=new File(path1);
		File f2=new File(path2);
		
		File[] fa1=f1.listFiles();
		File[] fa2=f2.listFiles();
		
		for(File file1:fa1){
			
			ImagePlus ip=op.openImage(file1.getAbsolutePath());
			double d=ip.getStatistics().dmode;
		//	System.out.println("f1.........."+d);
			
			m1.put(file1.getName(), d);
					
			
		}		
		for(File file2:fa2){
			
			ImagePlus ip2=op.openImage(file2.getAbsolutePath());
			double d2=ip2.getStatistics().dmode;
		//	System.out.println("f2......"+d2);
			m2.put(file2.getName(), d2);
				
		
		}	
		
		System.out.println(m1);
		System.out.println(m2);
	
		Object[] o1=m1.keySet().toArray();
		Object[] o2=m2.keySet().toArray();
		
		for(int i=0;i<o1.length;i++){
			
			
			for(int j=0;j<o2.length;j++){
				
				
				if(m1.get(o1[i]).equals(m2.get(o2[j]))){
					
					System.out.println("dupli");
					
					
					
				}
				
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
}
