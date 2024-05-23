package com.java.fileios;

public class StaticExample {
	public static String name;
	public String s;
	
	static {
		System.out.println("I'm in static block");
	}
	
	public void test() {
		System.out.println("I'm in test method!"+name);
	}
	
	public static void main(String[] args) {
		
		System.out.println("I'm in main()");
		StaticExample staticExample = new StaticExample();
		staticExample.test();
		System.out.println(name);
		System.out.println(staticExample.s);

	}

}
