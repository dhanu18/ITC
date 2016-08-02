package com.se.image;



	import java.io.IOException;
import java.nio.file.DirectoryStream;
	import java.nio.file.Files;
	import java.nio.file.FileSystems;
	import java.nio.file.Path;


	public class Folder {
		
		public static void main(String[] args) throws IOException {
			
		
	 String filePath1="C:\\Users\\user\\source1";
	 String filePath2="C:\\Users\\user\\source2";
	 
	Path dir1 = FileSystems.getDefault().getPath( filePath1 );
	Path dir2 = FileSystems.getDefault().getPath( filePath2 );
	
	DirectoryStream<Path> stream1 = Files.newDirectoryStream( dir1 );
	DirectoryStream<Path> stream2 = Files.newDirectoryStream( dir2 );
	
	for (Path path : stream1) {
	   System.out.println( path.getFileName() );
	}
	for (Path path : stream2) {
		   System.out.println( "s2...."+path.getFileName() );
		}
	stream2.close();
	
		}
}
