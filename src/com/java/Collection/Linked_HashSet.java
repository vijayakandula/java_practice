package com.java.Collection;

import java.util.LinkedHashSet;

public class Linked_HashSet {  // which extends the HashSet class and implements the Set Interface 
	                            //where elements are unique and follows insertion order

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		
		linkedhashset.add("welcome");
		linkedhashset.add("to");
		linkedhashset.add("linked Hashset");
		linkedhashset.add("welcome");
		
		System.out.println(linkedhashset);
		System.out.println(linkedhashset.size());
		

	}

}
