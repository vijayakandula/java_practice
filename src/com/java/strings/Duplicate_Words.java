package com.java.strings;

import java.util.Scanner;

public class Duplicate_Words {

	public static void main(String[] args) {
		System.out.println("enter a string ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean flag=false;
		
		
		String words[] = str.split(" "); // to break the string at the separator and returns an array of sub strings
		 
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println("Duplicate words in a given String are: " +words[i]);
					flag=true;
				}
			}

		}
		
		  if(flag==false)
			  System.out.println("no duplicates in the string");
	}

}
