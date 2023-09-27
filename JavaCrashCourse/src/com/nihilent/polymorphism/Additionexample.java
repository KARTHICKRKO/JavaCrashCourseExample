package com.nihilent.polymorphism;

public class Additionexample {

	int add(int n1, int n2) {
		return n1 + n2;
	}

	int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	float add(float n1, float n2) {
		return n1 + n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Additionexample add = new Additionexample();
		System.out.println("Addition of 2 numbers is :" + add.add(43, 43));
		System.out.println("Addition of 3 numbers is :" + add.add(23, 230, 99));

	}

}


//Overloading done in the same class
//And all the methods name should be the same
//Only inside the arguments in the method will be varying 
//This we know which method is calling at the run time
//Here no problem with the different return types
//Access modifier should be anything
//Private methods can be Overloaded
