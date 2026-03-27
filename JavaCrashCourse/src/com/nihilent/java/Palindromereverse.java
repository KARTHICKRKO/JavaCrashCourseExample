package com.nihilent.java;

import java.util.Scanner;

public class Palindromereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Original, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		Original = sc.nextLine();
		int length = Original.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + Original.charAt(i);
		}
		if (Original.equals(rev)) {
			System.out.println("Entered String is Palindrome");
		} else {
			System.out.println("Entered String is not a Palindrome");
		}

	}

}


