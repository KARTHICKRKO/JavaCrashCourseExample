package com.nihilent.filereadingoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "C:\\Users\\karthick.r\\Documents\\July Cycle 2023\\DT Testing\\Bug Retest Proofs\\test.txt";

		FileReader reader = new FileReader(location);
		BufferedReader reader1 = new BufferedReader(reader);

		String Currentline;

		while ((Currentline = reader1.readLine()) != null) {
			System.out.println(Currentline);

		}

	}

}
