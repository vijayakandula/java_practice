package com.java.accessmodifiers;

public class DefaultModifier {
	int a=23;

	public static void main(String[] args) {
		DefaultModifier defaultModifier = new DefaultModifier();
		System.out.println(defaultModifier.a);
		
		ProtectedExample protectedExample = new ProtectedExample();
		System.out.println(protectedExample.p);

	}
	
	public void test() {
		System.out.println(a);
	}

}
