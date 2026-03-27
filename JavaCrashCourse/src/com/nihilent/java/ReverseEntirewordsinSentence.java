package com.nihilent.java;

public class ReverseEntirewordsinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sathya is more beautiful and talented girl";
		String[] words=str.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+ " ");
		}
		

	}

}
