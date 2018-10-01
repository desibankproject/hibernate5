package com.hibernate.db.cache;

public class AssertDemo {
	
	private static String message(){
		return "I am sorry,  age can not be less than 10";
	}
	
	private static int mmessage(){
		return 3938948;
	}
	
	public static void main(String[] args) {
		//assert are the statements which are not part of the program
		// and used to validate the data at runtime and used for debugging 
		//purpose and it is not enabled by default..
		int age=9;
		//assert age<10 : "Age can not be less than 10";
		//assert age<10;
		//assert age>10 :mmessage();  //AssertionError
		assert age>10 :age>10?"Hello Me":"Hi xxxxssss";
		System.out.println("age = "+age);
	}

}
