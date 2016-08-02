package com.se.image;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {

	public static void main(String[] args) {
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        TestD filter = 
	            new TestD("2000-01-01", "2016-07-01");
	        File folder =  new File("C:/Users/user/Desktop");
	        File files[] = folder.listFiles(filter);
	        for (File f : files) {
	            System.out.println(f.getName() + " " + sdf.format(new Date(f.lastModified())));
	        }

	}

}
