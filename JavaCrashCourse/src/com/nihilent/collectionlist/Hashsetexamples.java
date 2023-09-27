package com.nihilent.collectionlist;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexamples {

	public static void Basichashsetexamples() {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(null);
		hashSet.add("Pooja");
		hashSet.add("Vasu");
		hashSet.add("Shruthi");
		hashSet.add("Shwetha");
		hashSet.add("Pooja");

		System.out.println("Contents of the Hashset :" + hashSet);
		hashSet.remove("Pooja");
		System.out.println("Contents of the Hashset :" + hashSet);
		System.out.println("Contents of the Hashset :" + hashSet.contains("Pooja"));
		System.out.println("Contents of the Hashset :" + hashSet.isEmpty());
		System.out.println("Contents of the Hashset :" + hashSet.size());
	}

	public static void UsingIterator() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(null);
		hashSet.add("Pooja");
		hashSet.add("Vasu");
		hashSet.add("Shruthi");
		hashSet.add("Shwetha");
		hashSet.add("Pooja");

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterated Elements are displayed :" + iterator.next());

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashsetexamples hashexamples = new Hashsetexamples();
		//hashexamples.Basichashsetexamples();
		hashexamples.UsingIterator();

	}

}
