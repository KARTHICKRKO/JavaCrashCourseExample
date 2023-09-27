package com.nihilent.collectionlist;

import java.util.HashSet;

public class UsingHashsetex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println("HashSet1: " + numbers);

		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(3);
		primeNumbers.add(4);
		System.out.println("HashSet2: " + primeNumbers);

		boolean result = numbers.containsAll(primeNumbers);
		System.out.println("Is HashSet2 is subset of HashSet1? " + result);

	}

}
