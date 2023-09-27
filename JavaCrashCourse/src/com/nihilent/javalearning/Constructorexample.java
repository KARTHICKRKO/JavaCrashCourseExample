package com.nihilent.javalearning;

public class Constructorexample {
	
	//By default constructor is there. It will provide the natural default values as 0, null depending on the type
	
	String student_name;
	int rollno;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructorexample constructorexample= new Constructorexample();
		System.out.println(constructorexample.student_name);
		System.out.println(constructorexample.rollno);

	}

}
