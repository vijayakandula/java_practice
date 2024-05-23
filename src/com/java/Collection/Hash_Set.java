package com.java.Collection;

import java.util.HashSet;

public class Hash_Set {   // Implementation class of Set Interface where duplicates are not allowed and no insertion order

	public static void main(String[] args) {
			
	HashSet <String> hashset = new HashSet <String> ();
	
	hashset.add("hello");
	hashset.add("Hashset");
	hashset.add("hello");
	hashset.add("welcome to");
	
	System.out.println(hashset);
	
	hashset.remove("welcome to");
	System.out.println(hashset);

	System.out.println(hashset.size());
	

	}

}
