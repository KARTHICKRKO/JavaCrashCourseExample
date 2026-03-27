package com.nihilent.java;

public class OccurancofNum_WithoutHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,3,2,2,2,1,4,5,3};
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(arr[i] + "---->" + count);
			}
			
		}

	}

}
