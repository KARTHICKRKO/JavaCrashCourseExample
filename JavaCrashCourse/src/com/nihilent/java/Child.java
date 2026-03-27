package com.nihilent.java;

public class Child extends Parent{

	void stop() {
		System.out.println("Stop function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child= new Child();
		child.start();
		child.stop();

	}

}
