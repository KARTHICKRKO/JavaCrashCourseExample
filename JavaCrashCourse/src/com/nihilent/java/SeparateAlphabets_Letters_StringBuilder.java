package com.nihilent.java;

public class SeparateAlphabets_Letters_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "12AB3C";
        StringBuilder letters= new StringBuilder();
        StringBuilder numbers= new StringBuilder();
        
        for(int i=0;i<input.length();i++) {
        	char ch=input.charAt(i);
        	if(Character.isLetter(ch)) {
        		letters.append(ch);
        	}else if(Character.isDigit(ch)) {
        		numbers.append(ch);
        	}
        	
        }
        String output= letters.toString() + numbers.toString();
        System.out.println("Seprated Alphabets and Digits is :" + output);
	}

}
