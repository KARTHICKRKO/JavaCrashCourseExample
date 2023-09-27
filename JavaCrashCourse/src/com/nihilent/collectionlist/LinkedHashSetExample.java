package com.nihilent.collectionlist;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	// LinkedHashset is child class of Hashset
	// Insertion order is maintained
	// Duplicate values not allowed
	// DS---> Hashtable + Linked list
	public static <E> void linkedhashsetexample() {
		LinkedHashSet hashSet = new LinkedHashSet();
		hashSet.add("ACE");
		hashSet.add(1);
		hashSet.add("BEE");
		hashSet.add("557");
		hashSet.add("242");
		hashSet.add("Lion");
		hashSet.add("Lion");
		hashSet.add(null);

		System.out.println("Insertion preserved order Linked HashSet :" + hashSet);
		hashSet.remove("ACE");
		System.out.println("Insertion preserved order Linked HashSet :" + hashSet);
		System.out.println("Size of Linked HashSet :" + hashSet.size());

		// Using Iterator method

		Iterator<E> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSetExample set = new LinkedHashSetExample();
		set.linkedhashsetexample();

	}

}
