package com.java.Collection;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String str = "Hello this is java world!";

		String[] straRRY = str.split(" ");
		for (String s : straRRY) {
			System.out.println(s);
		}
		
	}

}
