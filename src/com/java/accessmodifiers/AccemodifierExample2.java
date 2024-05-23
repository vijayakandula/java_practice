package com.java.accessmodifiers;

public class AccemodifierExample2 extends DefaultModifier{

	public static void main(String[] args) {
		AccessModifiersExample accessModifiersExample = new  AccessModifiersExample();
		
		AccemodifierExample2 accemodifierExample2 = new AccemodifierExample2();
		//System.out.println(accessModifiersExample.a);
		System.out.println(accessModifiersExample.b);
		System.out.println(accemodifierExample2.a);
		accessModifiersExample.test();
	}

}
