package com.nihilent.collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistexample {

	public static void Linkedlistofoperationsexample() {

		LinkedList<Integer> Listed = new LinkedList<Integer>();
		Listed.add(1);
		Listed.add(2);
		Listed.add(4);
		Listed.add(4);
		Listed.add(5);
		Listed.add(6);

		System.out.println("Linked List is : " + Listed);

		Listed.addLast(7);
		System.out.println("After adding last Element :" + Listed);

		Listed.addFirst(0);
		System.out.println("After adding First Element :" + Listed);

		// Get the first value
		System.out.println("First value :" + Listed.getFirst());

		// Get the first value using index position
		System.out.println("First value using index :" + Listed.get(0));

		System.out.println("Third value using index :" + Listed.get(2));

		System.out.println("Remove 1st Element: " + Listed.removeFirst());

		System.out.println("After removal :" + Listed);

		// poll method and pollfirst() deletes the first element in the list

		System.out.println("Using Poll method :" + Listed.poll());
		System.out.println("After removal :" + Listed);

		System.out.println("Using Poll last method :" + Listed.pollLast());
		System.out.println("After removal :" + Listed);

		System.out.println("Using remove method :" + Listed.remove());
		System.out.println("After removal :" + Listed);

		System.out.println("Using remove method :" + Listed.removeLast());
		System.out.println("After removal :" + Listed);

		System.out.println("Using remove firstoccurancemethod :" + Listed.removeFirstOccurrence(4));
		System.out.println("After removal :" + Listed);

		System.out.println("Using remove lastoccurancemethod :" + Listed.removeLastOccurrence(5));
		System.out.println("After removal :" + Listed);
	}

	public static void linkedlistsimpleforloop() {

		LinkedList<String> lists = new LinkedList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("c");
		lists.add("d");
		lists.add("e");
		lists.add("e");

		System.out.println("Simple for Loop is");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println("Using Simple for loop is " + lists.get(i));

		}

		System.out.println("---------------------------------");

	}

	public static void linkedlistusingiterator() {
		LinkedList<String> lists = new LinkedList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("c");
		lists.add("d");
		lists.add("e");

		System.out.println("Using Iterator is");
		Iterator<String> iterator = lists.iterator();
		while (iterator.hasNext()) {
			System.out.println("Using Iterator Elements are : " + iterator.next());

		}
		System.out.println("---------------------------------");

	}

	public static void linkedlistusingforeach() {
		LinkedList<String> lists = new LinkedList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("c");
		lists.add("d");
		lists.add("e");
		lists.add("e");
		lists.add(null);
		lists.add(null);

		System.out.println("Using For Each loop is");
		for (String string : lists) {
			System.out.println("Using for each loop Elements are :" + string);

		}
		System.out.println("----------------------------------------");
	}

	public static void linkedlistusingwhileloop() {
		LinkedList<String> lists = new LinkedList<String>();
		lists.add("a");
		lists.add("b");
		lists.add("c");
		lists.add("d");
		lists.add("e");
		int number = 0;

		System.out.println("Using while loop is");
		while (lists.size() > number) {
			System.out.println("Using while loop Elements are :" + lists.get(number));

			number++;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlistexample example = new Linkedlistexample();
		// example.Linkedlistofoperationsexample();
		// example.linkedlistsimpleforloop();
		// example.linkedlistusingiterator();
		// example.linkedlistusingforeach();
		// example.linkedlistusingwhileloop();
		example.Linkedlistofoperationsexample();

	}

}
