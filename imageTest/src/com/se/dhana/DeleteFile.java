package com.se.dhana;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		
		
		String path="C:\\Users\\user\\s1\\Penguins.jpg";
		
		
		/*
		File Dir=new File(path);
		File[] f=Dir.listFiles();
		
		for(int i=0;i<f.length;i++){
			
			f[i].delete();
			
			
			
		}
		*/
		
		
		File file=new File(path);
		file.delete();
		
		
		
		
		
		
		
		
		
		

	}

}
