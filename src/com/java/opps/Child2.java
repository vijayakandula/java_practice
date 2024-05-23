package com.java.opps;

public class Child2 extends ParentsPaerent {
	int c2 =34;
	
	public void testC2() {
		System.out.println("I'm in testC2");
	}
	

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.testC2();
		child2.testPP();
	}

}
