package com.nihilent.exception_handling;

public class Singletrycatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int number1 = 0;
			int number2 = 3;
			int result = number2 / number1;
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("0 should not divided by any number");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Don't divide the number with String");
		}

		catch (Exception e) { // TODO: handle exception e.printStackTrace();
			System.out.println("Please do the proper arithmatic operations");
		}

	}

}
