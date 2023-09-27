package com.nihilent.looping;

import java.util.Iterator;

public class ForloopImposition {

	// just for an Example: We are writing an Imposition for 25 times "I can
	// Program.I can Learn!!"

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop---> (Initialization; Condition; Increment/Decrement)

		/*
		 * for (int times=0;times<25;times++) {
		 * 
		 * System.out.println("I can Program.I can Learn!!"); }
		 */

		/*
		 * int times = 0; while (times < 25) {
		 * System.out.println("I can Program.I can Learn!!"); times++;
		 * 
		 * }
		 */
		/*
		 * int times = 0; do { System.out.println("I can Program.I can Learn!!");
		 * times++; } while (times<25);
		 */

		int weeks = 2;
		int days = 7;
//Outer for loop
		for (int week = 1; week <= weeks; week++) {
			System.out.println("Total Week is " + week);
//Inner for loop
			for (int day = 1; day <= days; day++) {
				System.out.println("Total Day is " + day);
				;

			}

		}
	}

}

//While Loop--- > Entry controlled loop--->before printing the statement it should first check with the condition
//Do while Loop---> Exit Controlled Loop---> It allows to print the statement atleast once, after that it check with the condition