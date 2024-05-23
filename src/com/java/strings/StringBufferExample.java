package com.java.strings;

public class StringBufferExample {  // mutable we can modify

	public static void main(String[] args) {
		StringBuffer x = new StringBuffer("Hello");
		StringBuffer y = new StringBuffer("java");
	
		System.out.println(x.append(y)); //Concatenation
		System.out.println(x.insert(1, "java")); // insert the value at given position
		System.out.println(x.reverse()); // reverse the string 
		System.out.println(y.delete(0, 2)); // delete the string at specified index
	}

}
