package com.nihilent.filewritingoperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFilewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "Userfilewriter.txt";
		String Content = "Java Language is easy to learn";

		FileWriter writer = new FileWriter(location);

		writer.write(Content);
		writer.close();
	}

}
