package com.nihilent.static_keyword;

public class Static_Block {

	static {
		System.out.println("Im Inside the Static block1");
	}

	static {
		System.out.println("Im Inside the Static block2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside the Main method");

	}

}

//In a block of code ,above we can able to add Static as keyword
//Under Class we can able to create multiple static blocks.
//But in a Class there should be only 1 main method
//Static blocks will execute first before the memory is loaded
//Whenever we declare Static under the class then it should execute as per the written in the order
//Here Main method will execute after the execution of the static blocks which is under the Class.
//Static blocks main usage is for Initializing the static variables.