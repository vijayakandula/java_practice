package com.java.encopsolation;

public class EncapsImplementation extends EncapExample {
	
	public static void main(String[] args) {
		EncapsImplementation encapsImplementation = new EncapsImplementation();
		
		encapsImplementation.setEmpNumber(100);
		encapsImplementation.setEmpname("vijaya");
		encapsImplementation.setEmpSal(100000);
		
		
		System.out.println(encapsImplementation.getEmpNumber());
		System.out.println(encapsImplementation.getEmpname());
		System.out.println(encapsImplementation.getEmpSal());
	}

}
