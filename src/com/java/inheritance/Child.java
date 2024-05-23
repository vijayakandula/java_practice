package com.java.inheritance;

public class Child extends Parent{
	
	public void add()
	{
		 sum=a+b;
		System.out.println("addition of a and b is :" +sum);
	}

	public void sub()
	{
		sub=a-b;
		System.out.println("substraction of a and b is :" +sub);
	}
	
	public void mul()
	{
		mul=a*b;
		System.out.println("multiplication of a and b is :" +mul);
	}
	
	public void div()
	{
		div=a/b;
		System.out.println("division of a and b is :" +div);
	}
	public void mod()
	{
		mod=a%b;
		System.out.println("modular of a and b is :" +mod);
	}
}
