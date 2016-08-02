package com.se.dhana;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class One {

	public static void main(String[] args) {

		
		
		
		Map m=new HashMap();
		m.put("one", 1);
		m.put("two", 1);
		m.put("three", 2);
		m.put("four", 3);
		m.put("five", 3);
		
		System.out.println(m);
		
		
		Collection c=m.values();
		
									
					Object [] s= m.keySet().toArray();
		System.out.println(s);

for(int i=0;i<s.length;i++){
	
	for(int j=i+1;j<s.length;j++){
	//System.out.println(s[i]+"......"+m.get(s[i]));
	
	if(m.get(s[i]).equals(m.get(s[j]))){
		
		
		System.out.println("dup");
	}
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
