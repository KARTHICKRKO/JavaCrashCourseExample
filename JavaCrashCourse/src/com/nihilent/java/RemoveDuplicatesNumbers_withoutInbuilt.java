package com.nihilent.java;

public class RemoveDuplicatesNumbers_withoutInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,1,2,3,5,6,7};
		
		
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate= true;
					break;
				}
			}
			if(!duplicate) {
				System.out.println(arr[i]+" ");
			}
		}

	}

}
