package com.java.constructorsinjava;

public class Parametrized_Constructor_Exmpl {
	
	public Parametrized_Constructor_Exmpl(int id,String name)
	{
		System.out.println("iam a parametrized constructor:  " +"id:" +id +" " +"name:" +name);
	}
	

	public static void main(String[] args) {
		Parametrized_Constructor_Exmpl parametrized_constructor_exmpl = new Parametrized_Constructor_Exmpl(10,"vijaya");
		

	}

}
