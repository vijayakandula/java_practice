package com.java.exceptions;

public class ExceptionsExample {

	public static void main(String[] args) throws Exception{
		System.out.println("Hello world!");
		char ch[] = {'c', 'h', 'a'};
		int i = 10;
		String s = null;
		
		try {
			System.out.println(s.length());
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println("I'm in catch block!!");
			throw new NullPointerException("My own message");
		}finally {
			System.out.println("I'm in finally block!!");
		}
		
		System.out.println("Hello World");
	}

}
