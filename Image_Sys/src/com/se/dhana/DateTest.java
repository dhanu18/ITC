package com.se.dhana;


	import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.*;
	import java.util.*;

	public class DateTest implements FilenameFilter {
	   
		String startDate;
	    String dateEnd;
	    SimpleDateFormat sdf;
	   
	   
	    public DateTest(String startDate,String dateEnd) {
	        this.startDate = startDate;
	        this.dateEnd = dateEnd;
		       
	        
	    }

	 
		public boolean accept(File dir, String name) {
	    	
	    	
	    	
	    	SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
	    	
	    	  Date d = new Date(new File(dir, name).lastModified());
	          String current = sdf.format(d);
	                   
	      if((startDate.compareTo(current) < 0 
                  && (dateEnd.compareTo(current) >= 0))){
	    	  
	    	  return true;
	      }
	         	          
	          return false;
	         
	         
	}
	
	
	}
	
	

