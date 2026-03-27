package com.nihilent.java;

public class First_Nonrepeating_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="karthick";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("First non-repeating character is :" +ch);
				break;
			}
		}
	}

}
