package com.nihilent.java;

public class SeparateAlphabets_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="12AB3C";
		String letters="";
		String numbers="";
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isLetter(ch)) {
				letters+=ch;
			}else if(Character.isDigit(ch)) {
				numbers+=ch;
			}
		}
		
		String output=letters + numbers;
		System.out.println(output);

	}

}
