package com.nihilent.java;

public class Preservingwhitespace_Reverse {

	public static void main(String args[]) {

		String str = "ab c d ef";
		char[] arr = str.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] == ' ') {
				i++;
			} else if (arr[j] == ' ') {
				j--;
			} else {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
				j--;

			}
		}
		System.out.println(new String(arr));

	}

}
