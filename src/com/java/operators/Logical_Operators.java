package com.java.operators;

public class Logical_Operators {

	public static void main(String[] args) {
		

		// Logical Operators
		// &&
		// ||
		// !
		
		int i = 5;
		int j = 5;
		int k = 6;
		
		System.out.println( (i==j) && (j > k)); // false AND false = false
		System.out.println( (i==j) && (j < k)); // true AND true = true
		System.out.println( (i==j) && (k <j)); // true AND false = false
		System.out.println( (i != j) && (j < k)); // false AND true = false
		
        
      System.out.println( (i<j) || (j > k)); // false OR false = false
      System.out.println( (i==j) || (j < k)); // true OR true = true
      System.out.println( (i==j) || (j > k)); // true OR false = true
      System.out.println( (i != j) || (j < k)); // false OR true = true
      
    //Logical NOT
      System.out.println( !(j > k) );
		                  
		                  

	}

}
