package com.nihilent.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list1= Arrays.asList("Banana","Orange","Grapes");
		List<String>list2= Arrays.asList("Apple","Guava","Mango");
		List<String>list3= Arrays.asList("Pomegranate","Fig","GreenApple");
		
		// New list to store 1st index elements
		List<String> newlist = new ArrayList<>();
		
		newlist.add(list1.get(1));
		newlist.add(list2.get(1));
		newlist.add(list3.get(1));
		
		System.out.println("New list of order :"+newlist);
		
		
	}

}
