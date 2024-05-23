package com.java.constructorsinjava;

public class This_Variable { //this refers to current variable/method/constructor
	
	public String name;
	public int id;
	
	This_Variable(String name,int id)
	{
		this.name=name;
		this.id=id; // refers the current variable w/o this keyword will get null values in display method
		System.out.println("name: "+name +"\n" +"id: "+id);
		
	}

	public static void main(String[] args) {
		This_Variable this_variable = new This_Variable("vijaya", 1900);
		this_variable.display();
	}

		public void display()
		{
          System.out.println("in display method also " +" " +"name: " +name +" id: " +id);
		}

	

}
