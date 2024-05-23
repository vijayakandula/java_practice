package com.java.Exception_Handling;

public class Try_Finally {

	public static void main(String[] args) {
		
		String str=null;
		try
		{
			System.out.println(str.length());
		}
		
		finally // always executed whether exception is handled or not followed by try block 
		{
			System.out.println("exception is not handled");
		}

	}

}
