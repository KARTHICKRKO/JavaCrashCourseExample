package com.nihilent.inheritance;

public class Dog extends Animal {

	public void display() {
		System.out.println("My name is :" + name);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("I can also eat fish");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dobber = new Dog();
		dobber.name = "Geethu";
		dobber.display();
		dobber.eat();
	}

}
