package com.java.Exception_Handling;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		try 
		{
			System.out.println(a[4]);
			System.out.println("rest of the code in try block");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("exception is handled");
		}
		finally
		{
			System.out.println("rest of the code");
		}
	}

}
