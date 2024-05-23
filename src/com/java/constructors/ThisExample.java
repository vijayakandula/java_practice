package com.java.constructors;

public class ThisExample {
	public int empNo; 
	public String empName;
	
	public ThisExample (int empNo, String empName){
		this.empNo = empNo;
		this.empName = empName;
		
		System.out.println("Emp No: "+empNo);
		System.out.println("Emp name: "+empName);
	}

	public static void main(String[] args) {
		ThisExample thisExample = new ThisExample(100, "EmpName");
		thisExample.test();
		
	}
	
	public void test() {
		System.out.println("Emp No: "+empNo);
		System.out.println("Emp name: "+empName);
	}

}
