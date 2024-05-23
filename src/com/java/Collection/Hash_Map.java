package com.java.Collection;

import java.util.HashMap;

public class Hash_Map {  // representing as a key-value pairs where duplicates are not allowed no insertion order 

	public static void main(String[] args) {
		
		HashMap <Integer,String> hashmap=new HashMap <Integer,String> ();
		
		hashmap.put(27,"vijaya");
		hashmap.put(25, "Akhila");
		hashmap.put(28,"vijaya");
		hashmap.put(27,"Nandika"); // duplicate key so last one it will print
		
		System.out.println(hashmap);
		System.out.println(hashmap.size());
		System.out.println(hashmap.get(27));
		
		System.out.println();
		
		for(Integer keys:hashmap.keySet())
	    {
			System.out.println("key:" +keys +" value:" +hashmap.get(keys));
		}
		
	
		
		
		
		

	}

}
