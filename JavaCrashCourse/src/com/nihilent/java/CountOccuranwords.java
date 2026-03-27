package com.nihilent.java;

public class CountOccuranwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Reshma is well talented and well organized person";
		String word="well";
		
		int count=0;
		String temp[]=str.split(" ");		//after removing spaces in original sentence
		
		for(int i=0;i<temp.length;i++) {
		if(word.equals(temp[i])) {
			count++;
		}
		}
		System.out.println("Repeated word in the sentence is:" +count);

	}

}
