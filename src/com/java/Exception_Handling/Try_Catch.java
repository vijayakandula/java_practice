package com.java.Exception_Handling;

public class Try_Catch {

	public static void main(String[] args) {
		
		int a=20;
		try       // can throw the exception
		{
		int c=20/0;
		System.out.println("iam in catch block"); // it wont execute because of exception in before line
		}
		catch(Exception e) // it will handle the exception
		{
			System.out.println(e);
			System.out.println("cannot divide by zero"); 
		}
		
		System.out.println("rest of the code");

	}

}
