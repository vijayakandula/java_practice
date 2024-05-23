package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// short -> Short
		// boolean -> Boolean
		// byte -> Byte
		// long -> Long
		// char -> Character
		// float -> Float
		// double -> Double
		
		arrayList.add(12);
		arrayList.add(13);
		
		//for(int i:arrayList) {
		//	System.out.println(i);
		//}
		
		Iterator<Integer> it = arrayList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
