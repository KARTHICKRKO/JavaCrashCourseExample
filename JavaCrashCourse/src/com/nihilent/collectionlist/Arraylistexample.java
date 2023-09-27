package com.nihilent.collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistexample {

	public void arraylistex() {

		List<String> arraylist = new ArrayList<String>();
		arraylist.add("BMW");
		arraylist.add("Audi");
		arraylist.add("Jaguar");
		arraylist.add("Audi");
		System.out.println(arraylist);
		System.out.println(arraylist.get(2));
		System.out.println(arraylist.indexOf("Maruti"));
		System.out.println(arraylist.lastIndexOf("Audi"));

		List<String> anotherlist = new ArrayList<String>();
		anotherlist.addAll(arraylist);
		System.out.println(anotherlist);
		anotherlist.clear();
		System.out.println(anotherlist);
		arraylist.remove(2);
		System.out.println(arraylist);
		arraylist.remove("BMW");
		System.out.println(arraylist);
		arraylist.add(null);
		System.out.println(arraylist);
		arraylist.set(0, "Hyundai");
		System.out.println(arraylist);
		System.out.println(arraylist.isEmpty());

		// Iterate
		for (String string : arraylist) {
			System.out.println("Using for each:" + string);

		}
		System.out.println("--------------------------------------");

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println("Using for loop :" + arraylist.get(i));

		}
		System.out.println("--------------------------------------");

		ListIterator<String> list_iterator = arraylist.listIterator();
		while (list_iterator.hasNext()) {
			System.out.println(list_iterator.next());

		}
		System.out.println("--------------------------------------");
		while (list_iterator.hasPrevious()) {
			System.out.println(list_iterator.previous());

		}
		System.out.println("----------------------------------------");

		Iterator<String> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arraylistexample arrex = new Arraylistexample();
		arrex.arraylistex();

	}

}
