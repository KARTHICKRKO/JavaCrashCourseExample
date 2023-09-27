package com.nihilent.exception_handling;

public class Trycatchfinally {

	public static int dummy() {
		return 3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Inside try Block");
			System.exit(0);
			System.out.println(Trycatchfinally.dummy());
			System.out.println("Arirthmatic Operations");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside Catch Block");
		} finally {
			System.out.println("Inside Finally block");
		}

	}

}
