package com.java.strings;

import java.util.Scanner;

public class Duplicate_Chars {

	public static void main(String[] args) {
		
		System.out.println("enter a string or number");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]= str.toCharArray();
		boolean flag=false;
		
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==(ch[j]))
				{
					System.out.println("duplicate characters are: " +ch[i] +" ");
					flag=true;
					
				}
			}
		}
		if(flag==false)
			System.out.println("no duplicates");

	}

}
