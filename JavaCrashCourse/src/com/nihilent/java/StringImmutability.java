package com.nihilent.java;

public class StringImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Karthick";
		String s2=s1;
		s1=s1+"Ishu";
		
		System.out.println("Name of the String is:" +s1);
		System.out.println("Name of the String is:" +s2);
		
	}

}
