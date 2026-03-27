package com.nihilent.java;

public class Sumofnumbers_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array= {77,66,35,90,22};
		
		int sum=0;
		
		for(int num:array) {
			sum+=num;
		}
		
		System.out.println(sum + " sum of numbers");
	}

}
