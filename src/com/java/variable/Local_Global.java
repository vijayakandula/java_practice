package com.java.variable;

public class Local_Global {
	int a;
	int b = 23;
	boolean flag;
	char ch;
	float ft;
	int total;

	public static void main(String[] args) {
		// className referenceVariable = new className(); 
		
		Local_Global  local_global = new Local_Global();
		
		System.out.println(local_global.total);
		local_global.add();
		
		System.out.println(local_global.a);
		System.out.println(local_global.flag);
		System.out.println(local_global.total);
		
		System.out.println("End");
	}
	
	public void add() {
		int total = a + b;
		System.out.println(total);
	}

}

