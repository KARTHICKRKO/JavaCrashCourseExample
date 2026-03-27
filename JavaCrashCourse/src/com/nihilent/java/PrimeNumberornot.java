package com.nihilent.java;

public class PrimeNumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		boolean isprime=true;
		
		if(num<=1) {
			isprime=false;
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
		}

		if(isprime)
			System.out.println(num+" Is a Prime number");
		else
			System.out.println(num+" Is not a Prime number");
	}

}
