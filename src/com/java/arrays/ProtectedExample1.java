package com.java.arrays;

import com.java.accessmodifiers.ProtectedExample;

public class ProtectedExample1 extends ProtectedExample{

	public static void main(String[] args) {
		ProtectedExample1 protectedExample1 = new ProtectedExample1();
		
		ProtectedExample  protectedExample = new ProtectedExample();
		System.out.println(protectedExample1.p);
		System.out.println(protectedExample.pk);
		
		//System.out.println(protectedExample1.p);
	}

}
