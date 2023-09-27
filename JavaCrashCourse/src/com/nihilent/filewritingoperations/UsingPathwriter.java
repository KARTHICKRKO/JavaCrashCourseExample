package com.nihilent.filewritingoperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "C:\\Users\\karthick.r\\Documents\\July Cycle 2023\\DT Testing\\Bug Retest Proofs\\test.txt";
		String Content = "Denmark is the Peaceful country in the world";

		Path path = Paths.get(location);
		Files.write(path, Content.getBytes());

	}

}
