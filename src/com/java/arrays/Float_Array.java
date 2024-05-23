package com.java.arrays;

import java.util.Scanner;

public class Float_Array {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int length=s.nextInt();
		
		System.out.println("enter the elements of an array");
		float a[]=new float[length];
		
		int i=0;
		do        
		{
			a[i]=s.nextFloat();
			System.out.println(a[i]);
			i++;
		}
		while(i<a.length);
			

	}

}
