package com.nihilent.java;

import java.util.Arrays;

public class SecondSmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {2,5,33,44,9,45,44,23,12};
		Arrays.sort(array);
		
		int secondsmallest=array[1];
		int secondLargest=array[array.length-2];
		
		System.out.println("Second Smallest no.is :"+secondsmallest );
		System.out.println("Second Largest no.is :"+secondLargest );
	}

}
