package com.handling.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sample2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program Started");
//		FileWriter fw = null;
		try{
			FileWriter fw = new FileWriter("Amma.py");
			//fw.write("This is the world of Java");
			//fw.write("I'm currently writing entries into the file");
			//fw.write("We will read them shortly");
			
			BufferedWriter bfw = new BufferedWriter(fw);
			bfw.write("This is the world of Java");
			bfw.newLine();
			bfw.write("I'm currently writing entries into the file");
			bfw.newLine();
			bfw.write("We will read them shortly");
			
			bfw.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}	
		System.out.println("Program Ended");
	}
}
