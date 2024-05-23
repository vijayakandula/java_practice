package com.java.Exception_Handling;

public class Throw_Exmpl {    // used to throw an exception for a method

	public static void main(String[] args) {
	
		validate_age(17);
		
	}

		static void validate_age(int i)
		{
			
			if(i<18) 
			{
              throw new ArithmeticException("you are not eligible for vote "); // to create custom message
			}
			else
				System.out.println("you are eligible for vote ");

	    }

}
