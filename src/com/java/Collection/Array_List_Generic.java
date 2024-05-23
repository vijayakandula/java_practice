package com.java.Collection;
import java.util.ArrayList;  // Array List is the Implementation Class of List Interface (child interface of Collection Interface) 
                             // allows duplicates and follows insertion order
import java.util.Iterator;

public class Array_List_Generic {  // using Wrapper Classes we can convert primitive Data types into objects

	public static void main(String[] args) {
		
		ArrayList <Integer> al=new ArrayList <Integer>(); //Integer Wrapper Class
        al.add(1);
		al.add(2);
		System.out.println("Elements in the Array List of type Integer are: " +al);
		
		ArrayList <Short> al_1=new ArrayList <Short>(); // Short Wrapper Class
		al_1.add((short) 3);
	    al_1.add((short) 4);
	    System.out.println("Elements in the Array List of type Short are: " +al_1);
	    
	    ArrayList <Long> al_2=new ArrayList <Long>();  // Long Wrapper Class
		al_2.add((long) 5);
	    al_2.add((long) 6);
	    System.out.println("Elements in the Array List of type Long are: " +al_2);
	    
	    ArrayList <Float> al_3=new ArrayList <Float>(); // Float Wrapper Class
		al_3.add((float) 7);
	    al_3.add((float) 8);
	    System.out.println("Elements in the Array List of type Float are: " +al_3);
	    
	    ArrayList <Double> al_4=new ArrayList <Double>();  // Double Wrapper Class
		al_4.add((double) 9);
	    al_4.add((double) 10);
	    System.out.println("Elements in the Array List of type Double are: " +al_4);
	    
	 
	}

}
