package com.nihilent.collectionlist;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void treesetexample() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(9);
		set.add(10);
		set.add(6);
		

		System.out.println("Elements all are sorted in ascending order :" + set);

		// first
		System.out.println("First Element :" + set.first());

		// last
		System.out.println("Last Element :" + set.last());

		// headset
		System.out.println("Headset Elements are :" + set.headSet(6));

		// Tailset
		System.out.println("Tailset Elements are :" + set.tailSet(9));

		// Subset
		System.out.println("Subset Elements are :" + set.subSet(2, 9));

		// Comparator
		System.out.println("Comparator returns null if the sorting is default natural order :" + set.comparator());
		// Null we can't add in the Treeset after (java 1.7 version)..Even if we add it
		// throws null pointer exception
		// Before 1.7 version null can be added as a first element if the treeset is
		// empty

		// Immediate Higher
		System.out.println("Higher is :" + set.higher(6));
		// Immediate Lower
		System.out.println("Lower is :" + set.lower(9));

		// Pollfirst will first retrieve the 1st element and then remove from that
		System.out.println("Polling first  :" + set.pollFirst());
		System.out.println("After Polling first  :" + set);

		// Polllast will first retrieve the last element and then remove from that
		System.out.println("Polling last  :" + set.pollLast());
		System.out.println("After Polling Last  :" + set);

		// Descending Order set
		System.out.println("Descending order of the set is  :" + set.descendingSet());

		// Using normal iterator
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("Only Forward Iterator :" + iterator.next());

		}

		// Using Descending Iterator
		Iterator<Integer> iterator1 = set.descendingIterator();
		while (iterator1.hasNext()) {
			System.out.println("Reverse Iterator : " + iterator1.next());

		}

		TreeSet<StringBuffer> set1 = new TreeSet<StringBuffer>();
		set1.add(new StringBuffer("B"));
		set1.add(new StringBuffer("A"));
		System.out.println(set1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetExample example = new TreeSetExample();
		example.treesetexample();
	}

}
