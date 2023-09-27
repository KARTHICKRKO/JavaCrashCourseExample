package com.nihilent.collectionlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(242, "Sankar");// Entry
		maps.put(557, "Karthick");
		maps.put(547, "Akash");
		maps.put(62, "Dhamu");
		maps.put(592, "Rajendran");
		maps.put(57, "Lilly");
		maps.put(57, "Lilla");
		maps.put(null,null);
		maps.put(null,"Thala");

		System.out.println("Route maps are : " + maps);

		// To make an Exisiting copy

		HashMap<Integer, String> Duplicatemaps = new HashMap<Integer, String>();
		Duplicatemaps.putAll(maps);
		System.out.println("Duplicate Route maps are : " + Duplicatemaps);

		// To clear
		Duplicatemaps.clear();
		System.out.println("Duplicate Route maps are : " + Duplicatemaps);

		// Check particular key is present or not

		System.out.println("Does this key is present ? : " + maps.containsKey(547));

		// Check particular value is present or not

		System.out.println("Does this values is present ? : " + maps.containsValue("Sankar"));

		// Same copy but i don't want to use putall..then clone it's best

		System.out.println("Clone this Route map : " + maps.clone());

		// Check whether map is empty or not

		System.out.println("Is this Route map empty ? : " + maps.isEmpty());

		// To Retrieve all the Keyset
		System.out.println("Route Map Key set : " + maps.keySet());

		// To fetch a particular value
		System.out.println("Fetch a Particular Value : " + maps.get(57));

		//// To Retrieve all the Values
		System.out.println("Route Map Values are : " + maps.values());

		// To get EntrySet(Key,Value)
		System.out.println("Entry of Route Map : " + maps.entrySet());

		System.out.println("---------------------------------------------------");

		// Using iterator for Key/Value
		for (Entry<Integer, String> Maps1 : maps.entrySet()) {
			System.out.println(Maps1);

		}
		System.out.println("---------------------------------------------------");
		// Using Iterator only for key
		for (Integer keys : maps.keySet()) {
			System.out.println(keys);

		}
		System.out.println("---------------------------------------------------");

		// Using iterator only for Values
		for (String string : maps.values()) {

			System.out.println(string);
		}
		System.out.println("---------------------------------------------------");
	}

}
