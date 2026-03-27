package com.nihilent.java;

public class RemoveDuplicates_withoutinbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="karthick";
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(result.indexOf(ch)==-1) {
				result=result+ch;
			
			}
			
		}
		
		System.out.println("Removed Duplicates are :" +result);

	}

}
