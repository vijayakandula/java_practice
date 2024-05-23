package com.java.constructorsinjava;

public class Super_Child extends  Super_Parent {

	public Super_Child()
	{
		super("vijaya",1900); // refers to parent class constructor 
	}

	public static void main(String[] args) {
		
		Super_Child super_child = new Super_Child();
		super_child.display();
		super_child.test();
		
	}
		public void display()
		{
            String color="white";
			System.out.println("iam a child color: "+color);
			System.out.println("iam a parent color: "+super.color); // refers to parent class variable 

		}
		public void test() {
			
			System.out.println("iam in test child");
			super.test(); // refers to parent class method
			
		}

	

}
