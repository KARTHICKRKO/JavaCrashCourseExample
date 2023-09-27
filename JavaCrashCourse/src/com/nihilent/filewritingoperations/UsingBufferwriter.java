package com.nihilent.filewritingoperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UserBufferwriter.txt";
		String Content = "Try to learn and achieve something";
		
		FileWriter fileWriter=new FileWriter(location);
		
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		
		bufferedWriter.write(Content);
		bufferedWriter.close();
		

	}

}
