package com.nihilent.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "SILENT";
		String str2="LISTEN";
		
		//to lowercase
		
		str1=str1.replace(""," ").toLowerCase();
		str2=str2.replace(""," ").toLowerCase();
		
		//toCharArray
		
		  char[] ch1= str1.toCharArray();
		  char[] ch2= str2.toCharArray();
		  
		  Arrays.sort(ch1);
		  Arrays.sort(ch2);
		  
		  if(Arrays.equals(ch1, ch2)) {
			  System.out.println("Both Strings are Anagram");
		  }else {
			  System.out.println("Both Strings are not an Anagram");
		  }
	}

}
