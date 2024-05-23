package com.java.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Exmpl { 

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList(); //declaring ArrayList with combination of all data types
		
		
		list.add(12);                                          // list[12]
		list.add("vijaya");                                  // list[12,vijaya]
		list.remove(0);                                    // list[vijaya]
		list.add(10f);                                   // list[vijaya,10.0]
		list.add(true);                                //list[vijaya,10.0,true]
		list.get(1);                                 // list[10.0]
		list.add(3, 12);                           // list[vijaya 10.0 true 12]
		System.out.println(list.addAll(list));   // returns true if elements are present or returns falls if no elements 
		                                       // and adds the all elements to the current array list
		
		System.out.print("elements in the Array List after operations are: ");
		
		Iterator it= list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() +" "); // list[vijaya,10.0,true,12,vijaya,10.0,true,12]
		}
		
		
		
		

	}

}
