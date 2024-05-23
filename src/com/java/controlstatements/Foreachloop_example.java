package com.java.controlstatements;

import java.util.Scanner;

public class Foreachloop_example {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int length=s.nextInt();
		
		System.out.println("enter the elements of an array");
		int a[]=new int[length];
		
		for(int i:a)
		{
			a[i]=s.nextInt();
			System.out.println(a[i]);
		}
		 

	}

}
