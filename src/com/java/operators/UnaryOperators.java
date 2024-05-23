package com.java.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// Unary operators
		// ++
		// --
		
		int a = 3;
		a++; //post Increment
		System.out.println(a);

		int total = a + a++;
		System.out.println(total);
		System.out.println(a);
		
		int b=2;
		++b; //Pre increment
		System.out.println(b);
		
		int total1 = b + ++b;
		System.out.println(total1);
		System.out.println(b);
		    
		 
		int i=4;
		i--; //Post Decrement;
		System.out.println(i);
		
		int sum =i + i--;
		System.out.println(sum);
		System.out.println(i);
		
		int j=5;
		--j; //Pre Decrement;
		System.out.println(j);
		
		int sum1 =j + --j;
		System.out.println(sum1);
		System.out.println(j);
		

		
		
		
	}

}
