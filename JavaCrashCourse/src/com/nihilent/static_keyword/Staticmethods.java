package com.nihilent.static_keyword;

public class Staticmethods {

	public static void method1() {
		System.out.println("My Method is called");
	}

	public void nonstatic() {

		System.out.println("My Method will call?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		Staticmethods methods = new Staticmethods();
		methods.nonstatic();
	}

}

//Static methods we can access without creating the objects.
//In Non Static methods we can call static method
//But in Static methods we cannot call the non static method