package com.java.access_modifiers_package_1;

 class Default_Modifier_2 extends Default_Modifier_1 { //default class

	public static void main(String[] args) {
		
		Default_Modifier_2 default_modifier_2 = new Default_Modifier_2();
		System.out.println("iam a default variable which is in another class but same package " +(default_modifier_2.b) ); 
		default_modifier_2.display(); //default method which is in another class but same package 
		
	}

}
