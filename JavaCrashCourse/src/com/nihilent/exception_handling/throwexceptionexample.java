package com.nihilent.exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class throwexceptionexample {

	public static void findfile() throws FileNotFoundException {

		File file = new File("C:\\Users\\karthick.r\\Desktop\\Timeshift.txt");
		FileInputStream fileinput = new FileInputStream(file);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findfile();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
