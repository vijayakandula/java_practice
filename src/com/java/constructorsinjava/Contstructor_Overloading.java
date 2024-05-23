package com.java.constructorsinjava;

public class Contstructor_Overloading { // having same constructor name but different parameters
	
	
	public Contstructor_Overloading(String name, int id, String branch)
	{
		
		System.out.println("student name: " +name +"\n" +"id: " +id +"\n"+"branch: " +branch);
	}

	public Contstructor_Overloading(String name, int id) 
	{
		
		System.out.println("student name: " +name +"\n" +"id: " +id);
	}
	
	
	public static void main(String[] args) {
		
		Contstructor_Overloading contstructor_overloading = new Contstructor_Overloading("vijaya", 10,"ECE");
		
	}

}
