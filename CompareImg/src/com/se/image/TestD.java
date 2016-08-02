package com.se.image;

import java.io.*;
import java.text.*;
import java.util.*;

public class TestD implements FilenameFilter {
    String dateStart;
    String dateEnd;
    SimpleDateFormat sdf;

    public TestD(String dateStart, String dateEnd) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        sdf = new SimpleDateFormat("yyyy-MM-dd");
    }

    public boolean accept(File dir, String name) {
        Date d = new Date(new File(dir, name).lastModified());
        String current = sdf.format(d);
        return ((dateStart.compareTo(current) < 0 
                && (dateEnd.compareTo(current) >= 0)));
    }

    public static void main(String[] args) {
		  
	        TestD filter = 
	            new TestD("2000-01-01", "2016-07-01");
	        File folder =  new File("C:/Users/user/Desktop");
	        File files[] = folder.listFiles(filter);
	        for (File f : files) {
	            System.out.println(f.getName() );
	        }
    }

}