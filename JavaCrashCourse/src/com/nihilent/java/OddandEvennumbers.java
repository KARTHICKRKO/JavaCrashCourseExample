package com.nihilent.java;

public class OddandEvennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Even numbers from 1 to 100");
		for(int i=1;i<100;i++) {
			if(i%2==0)
				System.out.println(i+ " ");
		}
		
		System.out.println("\n\nOdd numbers from 1 to 100");
		for(int i=1;i<100;i++) {
			if(i%2!=0)
				System.out.println(i+ " ");
		}

		
	}

}
