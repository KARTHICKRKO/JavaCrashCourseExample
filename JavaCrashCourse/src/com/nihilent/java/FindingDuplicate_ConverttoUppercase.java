package com.nihilent.java;

public class FindingDuplicate_ConverttoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Poornima";
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
				result=result+ Character.toUpperCase(ch);
			}
			else {
				result=result+ch;
		}
		}

		System.out.println("Duplicated Character changed to upper case is: " +result);
	}

}
