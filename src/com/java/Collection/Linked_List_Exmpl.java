package com.java.Collection;

import java.util.Iterator;
import java.util.LinkedList;


public class Linked_List_Exmpl {  // same as ArrayList but performance is fast in terms of insertion and deletion because no shifting is required

	public static void main(String[] args) { // Allows Duplicates and follows Insertion order
		
		LinkedList<String> linked=new LinkedList<String>();
		
		linked.add("Linked");
		linked.add("List");
		linked.add("in");
		linked.add("Collections");
		

		Iterator<String> it= linked.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() +" "); 
		}
		
	}

}
