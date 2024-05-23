package com.java.list;

import java.util.ArrayList;


// General ArrayList Example
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		
		arrayList.add("ArrayList");
		arrayList.add(11);
		arrayList.add(false);
		arrayList.add(12.3f);
		
		arrayList.add("ArrayList");
		arrayList.add(11);
		arrayList.add(false);
		arrayList.add(12.3f);
		
		arrayList.add("ArrayList");
		arrayList.add(11);
		arrayList.add(false);
		arrayList.add(12.3f);
		
		System.out.println(arrayList.size());
		
		
		for(int i=0; i<arrayList.size(); i++) {
		//	System.out.println(arrayList.get(i));
		}
		
		for(Object i: arrayList) {
			System.out.println(i);
		}
		
	}

}
