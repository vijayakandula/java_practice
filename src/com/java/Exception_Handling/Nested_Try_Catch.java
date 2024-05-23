package com.java.Exception_Handling;
public class Nested_Try_Catch {

public static void main(String[] args) {

		try 
		{
			try
			{
			   System.out.println("going to divide by zero");
			   int i=20/0;
		    }
		    catch(ArithmeticException e)
		    {
			   System.out.println(e);
		    }
			
			try
			{
			  int a[]=new int[5];
			  a[5]=4;
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
			   System.out.println(e);
		    }
			
		  System.out.println("other statements");
		
		}
		
		catch(Exception e) // for outer try block
		{
			System.out.println("handled the exception");
		}
		
 
		System.out.println("normal flow");
	}

}
