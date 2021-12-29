package org.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringMethods {
	
	public static void main(String[] args) {
		
		Map<Integer,String> n = new LinkedHashMap<>();
		n.put(10,"java");
		n.put(20,"sql");
		n.put(30,"sql");
		n.put(40,"selenium");
		n.put(50, "ruby");
		n.put(10,"python");
		System.out.println(n);
		int Size = n.size();
		System.out.println(Size);
		Set<Integer>keySet = n.keySet();
		System.out.println(keySet);
		Collection<String> values = n.values();
		System.out.println(values);
		boolean containkey = n.containsKey(30);
		System.out.println(containkey);
		
		boolean containsvalue = n.containsValue("sql");
		System.out.println(containsvalue);
		String string = n.get(40);
		System.out.println(string);
		
		n.remove(30);
		System.out.println(n);
		n.clear();
		System.out.println(n);
		
		
		
	
	}	
		
}
