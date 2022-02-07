package com.javacollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
	
	public static void main(String[] args) {
		
		//Example with Integer as key and String as value
		Map <Integer, String> names = new HashMap<>();
		names.put(10, "Mir");
		names.put(20, "Franklin");
		names.put(25, "Kaikobad"); 
		names.put(35, "Kaikobad"); 
		names.put(30, "Maidul"); 
		names.put(30, "Maidul"); //not allowed because it has the same key
		names.put(30, "Maidul"); 
		names.put(null, null);
		names.put(50, null);
		names.put(60, null);
		names.put(null, "Maidul");
		
		System.out.println(names);
		
		
		Map <Integer, String> names2 = new LinkedHashMap<>();
		names2.put(10, "Mir");
		names2.put(20, "Franklin");
		names2.put(25, "Kaikobad"); 
		names2.put(35, "Kaikobad"); 
		names2.put(30, "Maidul"); 
		names2.put(30, "Maidul"); //not allowed because it has the same key
		names2.put(30, "Maidul"); 
		names2.put(null, null);
		names2.put(50, null);
		names2.put(60, null);
		names2.put(null, "Maidul");
		
		System.out.println(names2);
		
		Map <Integer, String> names3 = new TreeMap<>();
		names3.put(10, "Mir");
		names3.put(20, "Franklin");
		names3.put(25, "Kaikobad"); 
		names3.put(35, "Kaikobad"); 
		names3.put(30, "Maidul"); 
		names3.put(30, "Maidul"); //not allowed because it has the same key
		names3.put(30, "Maidul");
		names3.remove(10, "Mir");
		//names3.put(null, null); //Null key or values are not allowed for TreeMap
		//names3.put(50, null);
		//names3.put(60, null);
		//names3.put(null, "Maidul");
		
		System.out.println(names3);
		
		for (Map.Entry<Integer, String> m : names3.entrySet()) {
			System.out.println("Key : "+m.getKey() + "- Value : " +m.getValue());
		}
		
		//Example with String as key and String as value
		Map <String, String> names1 = new HashMap<>();
		names1.put("City", "Jackson Heights");
		names1.put("City", "Woodside");
		names1.put("City", "Flushing");
		names1.put("Zipcode", "11372");
		names1.put("Zipcode1", "11372");
		
		System.out.println(names1);
		
		

		
		
		
		
		
		
	}

}
