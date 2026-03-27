package com.nihilent.java;

import java.util.Scanner;

public class Elementfoundornotfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element to search:");
		int SearchElement = sc.nextInt();

		boolean found = false;
		System.out.println("Element found at index is :");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == SearchElement) {
				System.out.println(i + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}

	}
}
