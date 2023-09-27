package com.nihilent.collectionlist;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, String> hashmaps = new LinkedHashMap<String, String>();
		hashmaps.put("Manual Tester", "Karthick");
		hashmaps.put("Team Lead", "Akash");
		hashmaps.put("Cloud Developer", "Stephen");
		hashmaps.put("Solution Desginer", "Dharmarajan");
		hashmaps.put(null, "Dharmarajan2");
		hashmaps.put(null, "Dharmarajan4");
		hashmaps.put(null, null);
		System.out.println("Using LinkedHashMap :" + hashmaps);

		// using Hashmap

		/*
		 * HashMap<String, String> hashpamos = new HashMap<String, String>();
		 * hashpamos.put("Manual Tester", "Karthick"); hashpamos.put("Team Lead",
		 * "Akash"); hashpamos.put("Cloud Developer", "Stephen");
		 * hashpamos.put("Solution Desginer", "Dharmarajan"); hashpamos.put(null,
		 * "Dharmarajan"); hashpamos.put("Solution Desginer", "Saravana");
		 * hashpamos.put(null, null); System.out.println("Using HashMap :" + hashpamos);
		 */

		System.out.println("------------------------------------------");

		// Using Iterator

		for (Entry<String, String> string : hashmaps.entrySet()) {
			System.out.println(string);

		}
	}

}
