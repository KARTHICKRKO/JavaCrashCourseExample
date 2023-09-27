package com.nihilent.collectionlist;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> placesnearRedhills = new TreeMap<String, String>();
		placesnearRedhills.put("Padiyanallur", "Redhills");
		placesnearRedhills.put("M A Nagar", "Redhills");
		placesnearRedhills.put("Alamathi", "Redhills");
		placesnearRedhills.put("Vijayanallur", "Redhills");
		
		//Duplicate keys will not allow,but if we have duplicate keys then at that time it will overwrite the value
		//And take the latest encountered 
		
		//In Tree map null insertion is not allowed. Even if u encounter only 1 time or more than 1 time
		//Because null cannot be comparable with any datatype.
		
		placesnearRedhills.put("Redhills", "Aerodrume");
		placesnearRedhills.put("Redhills", "Cholavaram");
		
		//placesnearRedhills.put(null, "Cholavaram");

		System.out.println(placesnearRedhills);
	}

}
