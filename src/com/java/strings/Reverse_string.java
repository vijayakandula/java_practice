package com.java.strings;

public class Reverse_string {

	public static void main(String[] args) {
		
		String str = "Vijaya";
	 
		System.out.println("given string: " +str);
		
		/*
		 * we can reverse the string in 2 ways
		 * 1. using string Buffer class
		 * 2. w/o using String Buffer class
		 */
		
		//using string Buffer class
		StringBuffer str1=new StringBuffer(str);
		String rvrs=str1.reverse().toString();
		System.out.println("reverse string is: " +rvrs);
		
		// w/o using string Buffer class
		String empty="";
		for(int i=str.length()-1;i>=0;i--)
		{
			empty=empty + str.charAt(i);
		}
		
		System.out.println("reverse string is: " +empty);
	
	}

}
