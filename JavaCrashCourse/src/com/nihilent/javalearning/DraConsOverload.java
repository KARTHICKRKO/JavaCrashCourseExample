package com.nihilent.javalearning;

public class DraConsOverload {

	String Draw;
	Integer number;

	DraConsOverload() {
		System.out.println("Draw object is created");
	}

	DraConsOverload(String ToDraw) {
		Draw = ToDraw;
		System.out.println("Drawing is " + ToDraw);
	}

	DraConsOverload(Integer num) {
		number = 0234;
		System.out.println("Drawing number is " + num);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DraConsOverload dra = new DraConsOverload();
		DraConsOverload dra1 = new DraConsOverload("Diagonal");
		DraConsOverload dra2 = new DraConsOverload(557);

	}

}

//Constructor Overloading is nothing but the based on the parameter provided which constructor is calling then
//it will behave differently

//Having only Parmeterised constructor and calling no arg constructor...then at that time it will show the compilation error