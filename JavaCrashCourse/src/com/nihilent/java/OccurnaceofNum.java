package com.nihilent.java;

import java.util.HashMap;

public class OccurnaceofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,3,2,2,2,1,4,5,3};
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int num:arr)
		{
			map.put(num, map.getOrDefault(num, 0) +1);
		}

		System.out.println(map);
	}

}
