package com.nihilent.java;

public class Array_nonZeroElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 0, 2, 0, 3, 0, 4 };
		int index = 0;

		//first moving non-zero elements in the beginning of array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				
				arr[index]=arr[i];
				index++;
				
			}
		}
			//fill remaining positions with zero
			
			while(index<arr.length) {
				arr[index]=0;
				index++;
			}
			
			for(int num: arr) {
				System.out.println(num + " ");
			}
		}
	}


