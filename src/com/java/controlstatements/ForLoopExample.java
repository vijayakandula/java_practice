package com.java.controlstatements;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		
			for(int i=1;i<=5;i++)
			{
				   for(int j=1;j<=i;j++)
			   {
				   System.out.print(j);
				}
				   System.out.println();
			
			 }
			
			System.out.println();
		for(int k=1;k<=5;k++)
			{
				for(int l=1;l<=5-k+1;l++)
				{
				System.out.print(l);
				
			    }
				System.out.println();
				
				 
			
			}
		
			
		/*Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		
		
		for(int i=1;i<=10;i++)
		
		{
			System.out.println(n +" * " +i +" = " +n*i);
			System.out.println();
		}

	}
		
			
	     }*/

	}
}
