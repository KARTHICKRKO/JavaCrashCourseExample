package com.nihilent.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt(); // 1234

		// 1. Using Algorithm
		/*
		 * int rev = 0; while (num != 0) { rev = rev * 10 + num % 10; //0+1234%10=4
		 * 40+3=43 430+2=432 4320+1=4321 num = num / 10; //1234/10=123 123/10=12 12/10=1
		 * 1/10=0
		 * 
		 * }
		 */

		// 2. Using StringBufferClass

		/*
		 * StringBuffer sb= new StringBuffer(String.valueOf(num)); //converting the num
		 * to string and storing it in string variable StringBuffer rev=sb.reverse().toString();
		 */

		// 3. Using StringBuilderClass
		StringBuilder sbuild = new StringBuilder();
		sbuild.append(num);
		StringBuilder rev = sbuild.reverse();
		System.out.println("Reverse of a number is: " + rev);
	}

}
