package com.nihilent.java;

public class StringCharacterClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="india@123";
		String alpha="";
		String num="";
		String spl="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch)) {
				alpha+=ch;
			}else if(Character.isDigit(ch)) {
				num+=ch;
			}else {
				spl+=ch;
			}
		}
		
		System.out.println("String Classification of alpha is: " +alpha);
		System.out.println("String Classification of num is: " +num);
		System.out.println("String Classification of spl is: " +spl);

	}

}
