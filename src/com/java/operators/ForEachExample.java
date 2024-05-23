package com.java.operators;

public class ForEachExample {

	public static void main(String[] args) {
		int[] a = {23, 45, 67, 32, 12, 99};
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// syntyax: for (type variable: array){}
		
		for (int k : a) {
			System.out.println(k);
		}
		
	}


}
