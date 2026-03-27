package com.nihilent.java;

public class UniqueAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colors= {"red","green","blue","red","yellow","pink","blue","navy","orange"};
		
		for(int i=0;i<colors.length;i++) {
			
			for(int j=i+1;j<colors.length;j++) {
				if(colors[i].equals(colors[j])) {
					System.out.println("Duplicate values are :" +colors[i]);
				}
			}
		}
		for(int i=0;i<colors.length;i++) {
			int count=0;
			for(int j=0;j<colors.length;j++) {
				if(colors[i].equals(colors[j])) {
					count++;
				}
				
			}if(count==1) {
				System.out.println("Unique values are :" +colors[i]);
			}
		}
		

	}

}
