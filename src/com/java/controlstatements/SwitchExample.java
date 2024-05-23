package com.java.controlstatements;

public class SwitchExample {

	public static void main(String[] args) {
		// switch(expression){
		// case value1:{}
		// case value2:{}
		// case value3:{}
		// case value4:{}
		// default :{
		// default statements
		//}
		// }
		int a =4;
		
		switch(a) {
		case 1:{
			System.out.println("I'm case 1");
		}
		break;
		case 2:{
			System.out.println("I'm case 2");
		} break;
		case 3:{
			System.out.println("I'm case 3");
		} break;
		default:{
			System.out.println("Non of the cases are met");
		}
		}
	}

}
