package com.nihilent.java;

import java.util.Arrays;

public class Secondhighestinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,5,12,27,45};
		
		Arrays.sort(array); //now all the numbers gets sorted in ascending order
		
		//we need to find the length of array
		System.out.println("Second highest number in array is: "+array[array.length-2]);

	}

}
