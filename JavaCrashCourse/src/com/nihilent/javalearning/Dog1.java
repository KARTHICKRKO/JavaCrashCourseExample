package com.nihilent.javalearning;

public class Dog1 extends Animal1{
	String name="Thala";
	public void Race() {
		System.out.println("Im the fast racer: Tiger");
		System.out.println(String.join("/", "28","12","1992"));
		System.out.println(name.indexOf("T",-1));
		System.out.println(name.length());
		System.out.println(name.substring(0, 3));
		System.out.println(name.replace("T", "t"));
		System.out.println(name.replaceAll("Thala", "Karthick"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 d1=new Dog1();
		d1.Race();
	}

}
