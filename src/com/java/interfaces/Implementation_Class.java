package com.java.interfaces;

public class Implementation_Class implements Interface_1, Interface_2{

	public static void main(String[] args) {
		
		Implementation_Class implementation_class = new Implementation_Class();
		implementation_class.stu_name("vijaya");
		implementation_class.stu_id(1900);
		implementation_class.stu_age(27);
		implementation_class.stu_place("Telangana");
	}
	
	public void stu_name(String name)
	{
		System.out.println("student name is : " +name);
	}

	public void stu_id(int id)
	{
		System.out.println("student id is : " +id);
	}

	public void stu_age(int  age)
	{
		System.out.println("student age is : " +age);
	}

	public void stu_place(String place)
	{
		System.out.println("student place is : " +place);
	}

	
		
	

}
