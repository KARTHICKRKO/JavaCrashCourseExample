package com.nihilent.java;

import java.util.LinkedHashSet;

public class RemoveDuplicates_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name= {"Sam","Pam","Sam","Ram","Beem","Ram"};
		
		LinkedHashSet<String> unique= new LinkedHashSet<String>();
		
		for(String word:name) {
			unique.add(word);
		}
		System.out.println("After Removing Duplicates:" +unique);
		

	}

}
