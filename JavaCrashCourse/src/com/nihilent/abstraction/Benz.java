package com.nihilent.abstraction;

public  class Benz extends Car {

	@Override
	public void engine() {
		System.out.println("Benz engine secret");
	}

	@Override
	public void Companysvoult() {
		System.out.println("Benz Company's Vault");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Benz();
		car.engine();
		car.Companysvoult();

	}

}
