package com.java.access_modifiers_package_2;

import com.java.access_modifiers_package_1.Protected_Modifier_2;

public class Protected_Modifier_3 extends Protected_Modifier_2 { 
	
	//getting  protected variables/methods which are in different package with inheritance concept

	public static void main(String[] args) {
   
		Protected_Modifier_3 protected_modifier_3 = new Protected_Modifier_3();
		
		System.out.println(" iam a protected variable in another class and value is " +(protected_modifier_3.k));
		protected_modifier_3.test1();
		
	}

	

}
