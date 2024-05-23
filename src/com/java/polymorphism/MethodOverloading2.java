package com.java.polymorphism;

public class MethodOverloading2 extends MethodOverloading_Parent {

	public static void main(String[] args) {
		
		MethodOverloading_Parent methodoverloading_parent = new MethodOverloading_Parent();
        methodoverloading_parent.display(3,4);
	}
	
	public void display(int i,int j)

	{
		System.out.println("i and j values in child class: " +i +"," +j );
	}
}

