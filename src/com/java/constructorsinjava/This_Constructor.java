package com.java.constructorsinjava;

public class This_Constructor { 
	
	This_Constructor()
	{
		System.out.println("student record");
		System.out.println();
	}
	
	This_Constructor(String name,int id, String branch)
	{
		this("Akhila",1800); // this is a keyword to invoke current constructor 
		System.out.println("name: " +name +"\n" +"id: " +id +"\n" +"branch: "+branch);
	}
	
	This_Constructor(String name,int id)
	{
		this();
		System.out.println("name: " +name +"\n" +"id: " +id);
		System.out.println();
	}
	

	public static void main(String[] args) {
		
	This_Constructor this_constructor = new This_Constructor("vijaya", 1900, "ECE");
		

	}

}
