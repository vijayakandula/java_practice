package com.java.constructors;

public class ChildConstructorExample extends ConstructorExample {
	
	public ChildConstructorExample(){
		super(12, 32);
		System.out.println("I'm in ChildConstructorExample()");
	}

	public static void main(String[] args) {
		ChildConstructorExample childConstructorExample = new ChildConstructorExample();
	}

}
