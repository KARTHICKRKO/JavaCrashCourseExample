package com.nihilent.java;

import java.util.Scanner;

public class StringreverseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.nextLine();
		//String str="Kamali";
		String rev= new StringBuilder(str).reverse().toString();
		System.out.println("Reverse string is :" +rev);

	}

}
