package com.nihilent.javalearning;

public class BankAccount {

	Long accountnumber = 1234567890l;
	String holdername = "Vasu";
	int accountbalance = 500;

	public void getbalance() {
		System.out.println("My Accountblance is " + accountbalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// classname objname= new classname();

		BankAccount account = new BankAccount();
		account.getbalance();

	}

}
