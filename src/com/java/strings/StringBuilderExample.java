package com.java.strings;

public class StringBuilderExample { // same as StringBuffer class except it is non synchronized

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb1 = new StringBuilder("Hello");
		
		//System.out.println(sb.append(" java")); // Concatenation of two strings
		//System.out.println(sb.reverse());  // reverse the string 
		//System.out.println(sb.replace(1, 3, "lang")); // replace the given string at given position
		//System.out.println(sb.charAt(3)); // returns value at given index
		
		
	//	String s2 = sb.toString();
		//String s3 = sb1.toString();
		
		System.out.println((sb.toString()).equals(sb1.toString()));
		
	} 

}
  