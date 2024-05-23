package com.java.opps;

public class Child extends Parent {
	int c = 20;
	
	public void testChild() {
		System.out.println("I'm in child!!");
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		//Parent parent = new Child();
		//Child child = new Parent();
		
		child.testParent();
		child.testChild();
		child.testPP();
	}

}
