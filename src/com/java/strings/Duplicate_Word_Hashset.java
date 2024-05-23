package com.java.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Duplicate_Word_Hashset {

	public static void main(String[] args) {
		
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean flag=false;

		String words[] = str.split(" "); 
		
		HashSet <String> hashset = new HashSet <String> ();
		
		for(String input:words)
		{
			if(hashset.add(input)==false) // check whether true or false
			{
				System.out.println("Duplicate word in the given string is: " +input);
				flag=true;
			}
		}
		
		if(flag=false)
		{
			System.out.println("no duplicates in the given string");
		}


	}

}
