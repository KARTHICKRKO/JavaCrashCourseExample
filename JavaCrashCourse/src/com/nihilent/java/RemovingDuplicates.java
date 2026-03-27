package com.nihilent.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,3,4,5,6,7,7,5};
		
		  // Use LinkedHashSet to maintain insertion order and remove duplicates
		
		Set<Integer> unique= new LinkedHashSet<Integer>();
		for(int num:arr) {
			unique.add(num);
		}
		
		System.out.println("After Removing Duplicates:" +unique);

	}

}
