package com.java.constructorsinjava;

public class Constructor_Exmpl {
	
	public Constructor_Exmpl() // constructor: having same name as class
	{
		System.out.println("iam a constructor");
	}

	public static void main(String[] args) {
		
		Constructor_Exmpl constructor_exmpl = new Constructor_Exmpl(); // automatically called constructor after obj creation
		
	}
;
}
