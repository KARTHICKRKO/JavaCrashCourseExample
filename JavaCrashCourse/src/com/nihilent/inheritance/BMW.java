package com.nihilent.inheritance;

public class BMW extends Carexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW bmw=new BMW();
		bmw.engine();

	}

}



//In Inheritance we can re-use the code many times.
//Parent class can be child class for another
//or Child Class can be parent class for another
//Both are interchangable.

//Types of Inheritance

//1. Single Inheritance : A(Base class)->B(Child Class)
//2. Multi level: A-->B---> C
//3. Multiple (Not Supported in JAVA): A+B--> C (Interface)
//Hierarichal: A-->B, A-->C, A--->D (1 Parent class but multiple child class)
//




//Access Modifier

//1. Default: when no access modifier is specified java wil considered as default
//2. Protected: within same package/sub class in different package.
           