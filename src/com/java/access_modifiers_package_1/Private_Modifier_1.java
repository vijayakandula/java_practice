package com.java.access_modifiers_package_1;

// private is for inner class, methods and attributes--within the class we can access
public class Private_Modifier_1 {

  private  int a=100; // through out the class we can use 
   
   public static void main(String[] args) {
	   
	   Private_Modifier_1 private_modifier_1 = new Private_Modifier_1();
	   System.out.println(private_modifier_1.a); 
   }
   
   private void test() // private method 
   {
	   System.out.println("iam in private method");
   }
}
