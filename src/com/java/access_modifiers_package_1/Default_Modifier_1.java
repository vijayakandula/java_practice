package com.java.access_modifiers_package_1;

 class Default_Modifier_1 {
	 
	 // can be used for class/method/variable--access can be in same package 
	 
	 int b=33; //default access specifier

	public static void main(String[] args) {
		Default_Modifier_1 default_modifier_1=new Default_Modifier_1();
		
     System.out.println("iam a default variable " +(default_modifier_1.b));
     default_modifier_1.display();
	}

	void display() // default method 
	{
		System.out.println("iam in default method");
	}
}
