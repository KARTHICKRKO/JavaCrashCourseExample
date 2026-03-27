package com.nihilent.java;

public class Occurenceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words="Karthick Rajendran";
		int totalcount=words.length();
		int totalcount_after_remove=words.replace("a", "").length(); //total length after removing
		
		int count= totalcount-totalcount_after_remove;
		System.out.println("Number of occurance r is :" +count);

	}

}
