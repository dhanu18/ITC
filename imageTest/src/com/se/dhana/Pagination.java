package com.se.dhana;

import java.util.ArrayList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Pagination {

	public static void main(String[] args) {
		
	NavigableMap m=new TreeMap();
	
	m.put(1, "one");
	m.put(2, "oone");
	m.put(3, "ooone");
	m.put(4, "oooone");
	m.put(5, "ooooooone");
	m.put(6, "ooooooooooone");
	
	Object[] o=m.keySet().toArray();
	
	int i=0;
	
	System.out.println(m.subMap(o[i], o[i+3]));
		
		
		
	
	
	/*System.out.println(m.subMap(0,3));
	System.out.println(m.subMap(3,4));
	
	*/
	
		
	}

}
