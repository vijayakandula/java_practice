package com.java.inheritance;

public class Arithmetic_Operations {

	public static void main(String[] args) {
		
		Parent parent = new Parent(); //object creation of parent class
		System.out.println("a value is :" +(parent.a));
		System.out.println("b value is :" +(parent.b));
		
		System.out.println();
		
		Child child=new Child(); //object creation of child class
		child.add();
		child.sub();
		child.mul();
		child.div();
		child.mod();
		
		System.out.println();
		System.out.println("operations are completed");

		
	}

}
