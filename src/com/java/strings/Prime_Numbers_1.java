package com.java.strings;

import java.util.Scanner;

public class Prime_Numbers_1 {
	
	public static void main(String[] args) {
		
		System.out.print("enter the start number: ");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
       System.out.print("enter the end number:");
		int end=sc.nextInt();
       System.out.print("prime numbers between " +start +" and" +" " +end +" are: ");
       
       int count,i,j;
       for( i=start;i<=end;i++)
       {
    	     if(i==1 || i==0)
    	       continue;
               count=1;
              
               for(j=2;j<=i/2;j++)
               {
            	   if(i%j==0)
            	   {
            		   count=0;
            	       break;
            	   }
               }   
 
              if(count==1)
    	      System.out.print(i+" ");
        		
       }
		
	}

}
