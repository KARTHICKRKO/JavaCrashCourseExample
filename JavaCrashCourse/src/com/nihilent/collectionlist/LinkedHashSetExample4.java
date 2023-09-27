package com.nihilent.collectionlist;

import java.util.LinkedHashSet;

public class LinkedHashSetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("LinkedHashSet1: " + numbers);

		LinkedHashSet<Integer> primeNumbers = new LinkedHashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		System.out.println("LinkedHashSet2: " + primeNumbers);

		// Check if primeNumbers is a subset of numbers

		boolean result = numbers.containsAll(primeNumbers);
		System.out.println("LinkedHashset2 is a subset of LinkedHashset1 :" + result);
	}

}
