package com.handling.file;

import java.io.*;
public class Sample {
	public static void main(String[] args) throws IOException {
		System.out.println("Program Started");
		File f = new File("Amma.py");
		/*boolean ret = f.mkdir();
		if(ret==true)
			System.out.println("File Created");
		else
			System.out.println("File has not been created");
		System.out.println(f.exists());*/
		//System.out.println(f.delete());
		if(f.delete()==true)
			System.out.println("File has been deleted");
		else
			System.out.println("File doesnot exist");
		
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println("Program ended");
		
		FileOutputStream fileInp = new FileOutputStream("amma.py");
		fileInp.write(200);
		fileInp.close();
	}
}
