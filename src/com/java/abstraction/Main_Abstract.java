package com.java.abstraction;

public class Main_Abstract extends Abstarct_Example {

	public static void main(String[] args) {
		
		Main_Abstract main=new Main_Abstract();
		main.student_name("vijaya");
		main.student_branch("ECE");
		main.student_passedout(2018);
	}

      public  void student_name(String name) 
      {
    	 
	      System.out.println("student name is : " +name);
   	  }
      
      public void student_branch( String branch) 
      
      {
		
    	  System.out.println("student branch is : " +branch);
		
	  }

	
		
	


	
	



}

