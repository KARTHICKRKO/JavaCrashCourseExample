package com.nihilent.collectionlist;

import java.util.LinkedHashSet;

public class LinkedHashsetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> primenumbers = new LinkedHashSet<Integer>();
		primenumbers.add(2);
		primenumbers.add(3);
		System.out.println("Displayed numbers are : " + primenumbers);

		LinkedHashSet<Integer> evennumbers = new LinkedHashSet<Integer>();
		evennumbers.add(2);
		evennumbers.add(4);
		System.out.println("Displayed numbers are : " + evennumbers);

		// Intersection of 2 sets

		primenumbers.retainAll(evennumbers);
		System.out.println("Intersected numbers are :" + primenumbers);
		
	

	}

}
