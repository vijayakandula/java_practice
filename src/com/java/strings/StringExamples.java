package com.java.strings;

public class StringExamples { // strings are immutable we cannot modify

	public static void main(String[] args) {  // we have 2 ways to create string using literal and new keyword 

		// String constant pool
		String s = " Welcome! ";
		String s2 = "Welcome!";
		String s3 = " Welcome world! ";
		
		// Heap memory
		String str = new String("Welcome!");
		String str2 = new String("Welcome!");
		String str3 = new String("Welcome world!");
		
	
		 System.out.println(s == s2);  // compare addresses and these are having different addresses 
		 System.out.println(str == str2); // diff addressed
		 
		 System.out.println("=====================================");
		 
		 System.out.println(s.equals(s2));  // compare values including spaces
		 System.out.println(str.equals(str2)); //diff addresses but values same
         System.out.println(s.equals(str)); 
		  
		s3 = s3.trim();  // remove space before and after not in between
		System.out.println(s3);
		System.out.println(s3.equals(str3));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		System.out.println(s.trim().length()); 
		System.out.println(s3.indexOf("world")); // index of first occurrence 
		System.out.println(s.concat(str3)); // joint the 2 strings
		System.out.println(s.compareTo(s2)); // if same returns 0 not same + or - value return
	}

}
