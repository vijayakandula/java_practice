package com.java.constructors;

public class ConstructorExample {
	
	public ConstructorExample() {
		System.out.println("I'm in constructor");
	}
	
	public ConstructorExample(int i) {
		this();
		System.out.println("I'm in constructor(int i): "+i);
	}
	
	public ConstructorExample(int i, int k) {
		System.out.println("I'm in constructor(int i, k): "+i+k);
	}

	public static void main(String[] args) {
		//System.out.println("Hello!!");
		ConstructorExample constructorExample = new ConstructorExample(10);
		constructorExample.test(12);
	}
	
	public void test(int j) {
		System.out.println("i'm in test method!!");
	}

}
