package com.java.access_modifiers_package_2;
import com.java.access_modifiers_package_1.Public_Modifier_1;

public class Public_Modifier_2 { // using public class which is in different package without using inheritance concept
	
	
	public static  void main(String[] args) {
		
		 
		Public_Modifier_1 public_modifier_1 =new Public_Modifier_1();
		
		 System.out.println("iam a public variable " +(public_modifier_1.l)); //using public variable which is in different package in current package 
		 
		 public_modifier_1.test2(); //using public metod which is in different package in current package 
		 
	
}
}