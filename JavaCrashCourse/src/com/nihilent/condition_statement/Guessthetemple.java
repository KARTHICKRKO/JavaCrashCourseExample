package com.nihilent.condition_statement;

public class Guessthetemple {

	String mytemple = "Srisailam";

	public void guessedtemple() {
		if (mytemple.equals("Tirupati")) {
			System.out.println("you thought about Tirupati");
		} else if (mytemple.equals("Vijayawada")) {
			System.out.println("you thought about Vijayawada");

		} else if (mytemple.equals("Yaganti")) {
			System.out.println("you thought about Yaganti");
		} else if (mytemple.equalsIgnoreCase("SriSailam")) {
			System.out.println("You thought about Srisailam");
		} else {
			System.out.println("Sorry!!!! I can't guess");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guessthetemple guessingtemple = new Guessthetemple();
		guessingtemple.guessedtemple();

	}

}
