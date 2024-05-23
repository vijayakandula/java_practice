package com.java.strings;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		
		if(num==0 || num==1)
		{
		System.out.println(num +" is not a prime number");
		}
		else
		{
		   for(int i=2;i<num;i++)
		   {
			  if(num%i==0)
			  {
				count=count+1;
				break;
			  }
		   }

		   if(count==0)
			         System.out.println(num +" is a prime number");
		   else
			    System.out.println(num +" is not a prime number");
	   }
  
	
	}
}


