package com.nihilent.java;

public class ReverseString_withoutinbuiltfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sathya";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of String without inbuilt function is :" +rev);

	}

}
