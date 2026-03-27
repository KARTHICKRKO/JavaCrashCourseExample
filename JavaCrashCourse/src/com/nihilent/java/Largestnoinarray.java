package com.nihilent.java;

public class Largestnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {9,6,33,21,38};
		int max=nums[0]; // Assume first element is the largest
		
		for(int num:nums) {
			if(num>max) {
				max=num; // Update max if a larger value is found
			}
		}
		System.out.println("Largest no. in array is :"+max);
		
	}

}
