package com.java.polymorphism;

public class Method_Overloading {

	public static void main(String[] args) {
		
		Method_Overloading method_overloading=new Method_Overloading();
		
		 method_overloading.display(1,2);
		 method_overloading.display(1,2,3); //same method with different arguments
	}
		 public void display(int i, int j)
		 {
			 int sum=i+j;
		 System.out.println("sum of i and j is: " +sum);
		 }
		 
		 public void display(int i, int j,int k)
		 {
			int  sum=i+j+k;
		 System.out.println("sum of i and j and k is: " +sum );
		 }
	}


