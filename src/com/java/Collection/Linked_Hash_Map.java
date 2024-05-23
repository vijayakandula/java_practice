package com.java.Collection;

import java.util.LinkedHashMap;

public class Linked_Hash_Map { // which extends the HashMap Class and implements the Map Interface

	public static void main(String[] args) {  // no-duplicates and insertion order follows
		
		LinkedHashMap <String,String> linked_hashmap=new LinkedHashMap <String,String>();
		
		linked_hashmap.put("Name", "HashMap");
		linked_hashmap.put("Name", "LinkedHashMap");
		linked_hashmap.put("Language", "Java");
		linked_hashmap.put("Programming Language", "Java");
		linked_hashmap.put("Name","Java");

		System.out.println(linked_hashmap);
		System.out.println(linked_hashmap.size());
		System.out.println(linked_hashmap.get("Name"));
		
		
       System.out.println();
		
		for(String keys:linked_hashmap.keySet())
	    {
			System.out.println("key:" +keys +"   value:" +linked_hashmap.get(keys));
		}
		
	}

}
