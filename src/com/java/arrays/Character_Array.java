package com.java.arrays;

import java.util.*;

import com.java.accessmodifiers.AccessModifiersExample;

public class Character_Array {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int length=s.nextInt();
		
		System.out.println("enter the character of an array");
		char a[]=new char[length];
		
		int i=0;
		while(i<a.length)
		{
			a[i]=s.next().charAt(0);
			System.out.print(a[i]);
			i++;
		}
		

	}

}
