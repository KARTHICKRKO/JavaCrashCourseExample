package com.nihilent.abstraction;

public class BMW extends Car implements Upcomingprojects, Interafce2, Interafce3 {

	@Override
	public void engine() {
		System.out.println("BMW engine Secret");
	}

	@Override
	public void Companysvoult() {
		System.out.println("BMW Company's Vault");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new BMW();
		car.engine();
		car.Companysvoult();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method is added successfully");

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method3 is added successfully");
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("Method5 is added successfully");

	}

}
