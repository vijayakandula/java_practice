package com.java.opps;

public class PoliExample extends PoliPatentExample {

	public static void main(String[] args) {
		PoliExample poliExample = new PoliExample();
		
		poliExample.add(12, 13);
		poliExample.test(1, 2, 3);

	}

	// static polymorphism over loaded method
	public void add(int a, int b) {
		System.out.println("In add(a, b)");
	}
	
	// static polymorphism over loaded method
	public void add(char a, int b, int c) {
		System.out.println(" Child: In add(char, b, c)");
	}
	
	
	public void test(int a, int b, int c) { //method override
		System.out.println("Child: In add(a, b, c)");
	}
}
