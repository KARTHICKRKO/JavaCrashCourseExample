package com.nihilent.polymorphism;

public class SonOverridingexample extends Parentsexample {
	
	public void properties() {
		System.out.println("Yes I use ur properties");
	}

	@Override
	public void templevisit() {
		System.out.println("No I wont come to the temple");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parentsexample parents= new SonOverridingexample(); //Parent class ref= new childclass() --> tis is dynamic polymorphism
		parents.properties();
		parents.templevisit();
	}

}

//Overriding happens in the different class( Parent child relationship)
//We don't know which method it will call, only after the compile time we know
//Here also we have to use same method name
//But here return type should be the same
//Here Access modifier should be equal or greater
// Private methods can't be Overridden