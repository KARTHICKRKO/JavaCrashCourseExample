package com.nihilent.java;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="karthick";
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			result.append(str.charAt(i));
			for(int j=0;j<=i;j++) {
				result.append("*");
			}
		}
		
		System.out.println("String manipulation is :"+result);

	}

}
