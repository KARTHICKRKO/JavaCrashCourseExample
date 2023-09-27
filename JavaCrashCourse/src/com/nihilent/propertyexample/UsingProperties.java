package com.nihilent.propertyexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class UsingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("config.properties");

		Properties properties = new Properties();

		properties.load(reader);

		String userinput = properties.getProperty("user");
		String userpassword = properties.getProperty("password");

		if (userinput.equalsIgnoreCase("system")) {
			System.out.println(userinput);

		} else if (userinput.equalsIgnoreCase("SYSTEM")) {
			System.out.println(userinput);
		}
		if (userpassword.equalsIgnoreCase("oracle")) {
			System.out.println(userpassword);

		} else if (userinput.equalsIgnoreCase("ORACLE")) {
			System.out.println(userpassword);
		}
	}

}
