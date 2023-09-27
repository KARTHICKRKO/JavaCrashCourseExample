package com.nihilent.javalearning;

public class Noargumentexample {

	int employeeid;
	String employeename;
	//Define a non argument or non paramaterized constructor
	
	Noargumentexample(){
		employeeid=1;
		employeename="Partha";
		System.out.println("Empoyee has joined successfully");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Noargumentexample noarg=new Noargumentexample();
	}

}
