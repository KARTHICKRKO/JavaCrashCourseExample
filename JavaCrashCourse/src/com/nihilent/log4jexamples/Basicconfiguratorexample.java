package com.nihilent.log4jexamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basicconfiguratorexample {
	
	static org.apache.log4j.Logger logger1= Logger.getLogger(Basicconfiguratorexample.class);

	static Logger logger = Logger.getLogger(Basicconfiguratorexample.class); // Factory Design Pattern
	// Getlogger will create 1 object and store that in Logger.//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();

		logger1.debug("This is debug message");
		logger1.info("This is Info message");
		logger1.warn("This is Warning Message");
		logger1.error("This is error Message");
		logger1.fatal("This is fatal Message");

	}

}
