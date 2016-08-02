package com.se.image;

import java.io.IOException;
import java.nio.file.*;

public class FolderCompare {

	public static void main(String[] args) throws IOException {
		
		
		 String filePath1="C:\\Users\\user\\source1";
		 
		 
		 
		Path dir = FileSystems.getDefault().getPath( filePath1 );
		
		DirectoryStream<Path> stream1 = Files.newDirectoryStream( dir );
		
		
		for (Path path : stream1) {
			
			
		   System.out.println( path.getFileName() );
		  
		}
	
		
		
		
		   
		}


}
