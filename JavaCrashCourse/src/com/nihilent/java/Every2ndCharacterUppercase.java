package com.nihilent.java;

public class Every2ndCharacterUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="karthick";
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(i%2==1) {
				result.append(Character.toUpperCase(ch));
			}else {
				result.append(ch);
			}
		}
		
		System.out.println("Output is:" +result.toString());
	}

}
