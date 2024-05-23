package com.java.arrays;

import java.util.Scanner;


public class Integer_Array {

	public static void main(String[] args) {
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int length=s.nextInt();
		
		System.out.println("enter the elements of an array");
		int a[]=new int[length];
		
		for(int i=0;i<a.length;i++) //using for loop
		{
			a[i]=s.nextInt();
			System.out.print(a[i]);
			
		}
		
		System.out.println();
		
		int j=0;
		while(j<a.length) //using while loop
		{
			System.out.print(a[j]);
			j++;
		}
		
		System.out.println();
		
		int k=0;
		do             //using do while loop
		{
			System.out.print(a[k]);
			k++;
			
		}
		while(k<a.length);
		
		
	
		
		
		

	}

}
