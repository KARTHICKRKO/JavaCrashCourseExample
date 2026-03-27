package com.nihilent.java;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array= {"apple","Fig","Banana","Pineapple","Blueberry","Orange"};
		
		// Sort using custom comparator
		// Sort by length (descending), then alphabetically
		Arrays.sort(array,Comparator.comparingInt(String::length));
		//Arrays.sort(array,Comparator.comparingInt(String::length).reversed().
			//	thenComparing(String::compareToIgnoreCase));
		
		for(String word:array) {
			System.out.println(word);
		}

	}

}
