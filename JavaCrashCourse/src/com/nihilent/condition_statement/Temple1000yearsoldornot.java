package com.nihilent.condition_statement;

public class Temple1000yearsoldornot {

	String Veryoldtemple = "Yaganti";

	public void Oldtempleornot() {

		switch (Veryoldtemple) {
		case "SriSailam":
			System.out.println("SriSailam is Old temple");
			break;
		case "Tirupati":
			System.out.println("Tirupati is Old temple");
			break;
		case "Yaganti":
			System.out.println("Yaganti is Old temple");
			break;

		default:
			System.out.println(Veryoldtemple + " Sorry!! I can't guess the very old temple");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temple1000yearsoldornot oldornot = new Temple1000yearsoldornot();
		oldornot.Oldtempleornot();

	}

}
