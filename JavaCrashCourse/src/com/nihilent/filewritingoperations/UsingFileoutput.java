package com.nihilent.filewritingoperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UserFOSwriter.txt";
		String Content = "Finland is the happiest country in the world";

		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writethis = Content.getBytes();
		outputStream.write(writethis);
		outputStream.close();

	}

}
