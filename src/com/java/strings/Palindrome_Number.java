package com.java.strings;
import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		System.out.println("enter a string or number");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		if(str.equals(reverse))
		   System.out.println(str +" is a palindrome");
		
		else
			System.out.println(str +" is not a palindrome");
	}
}
