package com.java.accessmodifiers;

public class AccessModifiersExample {
	private int a =100;
	public int b =200;

	public static void main(String[] args) {
		AccessModifiersExample accessModifiersExample = new  AccessModifiersExample();
		System.out.println(accessModifiersExample.a);
		accessModifiersExample.test();
		
		
		int k = 20;
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);
		
	}

	private int j=200;
	public void test() {
		System.out.println("I'm in test method"+j);
	}
}
